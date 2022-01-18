package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarComparatorTest {
    CarComparator comparator = new CarComparator();

    @Test
    public void testCompare_1() {
        Car firstCarToCompare = new Car(700000, 1992);
        Car secondCarToCompare = new Car(50000, 1990);

        assertEquals(-1, comparator.compare(firstCarToCompare, secondCarToCompare));
        assertEquals(1, comparator.compare(secondCarToCompare, firstCarToCompare));
    }

    @Test
    public void testCompare_sameYear() {
        Car firstCarToCompare = new Car(700000, 1992);
        Car secondCarToCompare = new Car(50000, 1992);

        assertEquals(-1, comparator.compare(firstCarToCompare, secondCarToCompare));
        assertEquals(1, comparator.compare(secondCarToCompare, firstCarToCompare));
    }

    @Test
    public void testCompare_sameKm() {
        Car firstCarToCompare = new Car(700000, 1980);
        Car secondCarToCompare = new Car(700000, 1992);

        assertEquals(1, comparator.compare(firstCarToCompare, secondCarToCompare));
        assertEquals(-1, comparator.compare(secondCarToCompare, firstCarToCompare));
    }

    public void testCompare_sameAll() {
        Car firstCarToCompare = new Car(700000, 1992);
        Car secondCarToCompare = new Car(700000, 1992);

        assertEquals(0, comparator.compare(firstCarToCompare, secondCarToCompare));
        assertEquals(0, comparator.compare(secondCarToCompare, firstCarToCompare));
    }

}

