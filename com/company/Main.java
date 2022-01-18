package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Car> cars = Arrays.asList(new Car(100000, 2015), new Car(50000, 2010), new Car(10000, 2021));
        System.out.println(cars);
        Collections.sort(cars, new CarComparator());
        System.out.println(cars);


    }
}