package com.andreychurenkov;

import com.andreychurenkov.model.City;
import com.andreychurenkov.util.CitiesUtil;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<City> cities = CitiesUtil.parseCitiesFromFile();
        printCities(cities);
    }

    private static void printCities(List<City> cities) {
        for (City city : cities) {
            System.out.println(city + "\n");
        }
    }
}
