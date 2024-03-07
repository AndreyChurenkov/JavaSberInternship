package com.andreychurenkov.util;

import com.andreychurenkov.model.City;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class CitiesUtil {
    public static List<City> parseCitiesFromFile() {
        List<City> cities = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File("Cities.csv"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] values = line.split(";", 6);
                City city = new City(values[1], values[2], values[3], Integer.parseInt(values[4]), values[5]);
                cities.add(city);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return cities;
    }

    public static List<City> sortByName(List<City> cities) {
        cities.sort(Comparator.comparing(City::getName, String.CASE_INSENSITIVE_ORDER));

        return cities;
    }

    public static List<City> sortByFederalDistrictAndName(List<City> cities) {
        Comparator<City> byFederalDistrict = Comparator.comparing(City::getDistrict);
        Comparator<City> byName = Comparator.comparing(City::getName);

        cities.sort(byFederalDistrict.thenComparing(byName));

        return cities;
    }

    public static int[][] convertToIndexPopulationArray(List<City> cities) {
        // Создаем массив для хранения индекса города и числа жителей
        int[][] indexPopulationArray = new int[cities.size()][2];

        // Заполняем массив
        for (int i = 0; i < cities.size(); i++) {
            indexPopulationArray[i][0] = i; // Индекс города
            indexPopulationArray[i][1] = cities.get(i).getPopulation(); // Количество жителей
        }

        // Сортируем массив по количеству жителей по убыванию
        Arrays.sort(indexPopulationArray, (a, b) -> Integer.compare(b[1], a[1]));

        return indexPopulationArray;
    }



    public static Map<String, Integer> countCitiesByRegion(List<City> cities) {
        Map<String, Integer> regionCityCount = new HashMap<>();

        // Считаем количество городов в каждом регионе
        for (City city : cities) {
            String region = city.getRegion();
            regionCityCount.put(region, regionCityCount.getOrDefault(region, 0) + 1);
        }

        return regionCityCount;
    }
}
