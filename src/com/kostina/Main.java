package com.kostina;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        PersonFactory factory = new PersonFactory();
        List<Person> personList = factory.generatePersons(10);
        System.out.println(personList);
    }
}