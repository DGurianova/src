package com.company;

//TODO create a comparator, which compares two cars. The car must be of a higher priority, if it has newer year
// km and then it has less km.
public class Car {
    int km;
    int year;

    public Car(int km, int year) {
        this.km = km;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "km=" + km +
                ", year=" + year +
                '}';
    }
}
