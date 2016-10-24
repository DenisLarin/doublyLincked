package ru.larin.main;

import ru.larin.Person;
import ru.larin.twoWayList.TwoWayList;

/**
 * Created by mrden on 24.10.2016.
 */
public class Main {
    private static TwoWayList twoWayList;
    private static Person[] person;
    public static void main(String[] args) {
        twoWayList = new TwoWayList();
        person = new Person[4];
        for (int i = 0; i < person.length; i++) {
            person[i] = new Person();
            twoWayList.addEnd(person[i]);
        }
        twoWayList.printLeftToRight();
    }
}
