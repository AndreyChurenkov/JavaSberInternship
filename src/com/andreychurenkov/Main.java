package com.andreychurenkov;

import com.andreychurenkov.model.City;
import com.andreychurenkov.util.CitiesUtil;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*
        Создаем список городов из файла
        */
        List<City> cities = CitiesUtil.parseCitiesFromFile();
        printCitiesList(cities);

        /*
        Сортировка списка городов по наименованию в алфавитном порядке без учета регистра

        В задании указана сортировка по убыванию, однако в примере по возрастанию, сделал согласно примеру
        */
        printCitiesList(CitiesUtil.sortByName(cities));

        /*
        Сортировка списка городов по федеральному округу и
        наименованию города внутри каждого федерального округа в алфавитном порядке с учетом регистра

        В задании указана сортировка по убыванию, однако в примере по возрастанию, сделал согласно примеру
        */
        printCitiesList(CitiesUtil.sortByFederalDistrictAndName(cities));

        /*
        Преобразование список городов в массив.
        Поиск путем перебора массива индекса элемента и значения с наибольшим количеством жителей города
        */
        printCitiesArray(CitiesUtil.convertToIndexPopulationArray(cities));

    }

    private static void printCitiesList(List<City> cities) {
        for (City city : cities) {
            System.out.println(city);
        }
    }

    private static void printCitiesArray(int[][] indexPopulationArray) {
        for (int[] pair : indexPopulationArray) {
            System.out.println("[" + pair[0] + "] = " + pair[1]);
        }
    }
}
