package com.andreychurenkov;

import com.andreychurenkov.model.City;
import com.andreychurenkov.util.CitiesUtil;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*
        Создаем список городов из файла
        */
        List<City> cities = CitiesUtil.parseCitiesFromFile();
        printCities(cities);

        /*
        Сортировка списка городов по наименованию в алфавитном порядке без учета регистра

        В задании указана сортировка по убыванию, однако в примере по возрастанию, сделал согласно примеру
        */
        CitiesUtil.sortByName(cities);
        printCities(cities);

        /*
        Сортировка списка городов по федеральному округу и
        наименованию города внутри каждого федерального округа в алфавитном порядке с учетом регистра

        В задании указана сортировка по убыванию, однако в примере по возрастанию, сделал согласно примеру
        */
        CitiesUtil.sortByFederalDistrictAndName(cities);
        printCities(cities);
    }

    private static void printCities(List<City> cities) {
        for (City city : cities) {
            System.out.println(city);
        }
    }
}
