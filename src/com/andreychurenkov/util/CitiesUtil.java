package com.andreychurenkov.util;

import com.andreychurenkov.model.City;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
}
