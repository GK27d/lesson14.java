package com.kostina;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PersonFactory {
    public static final Random RANDOM = new Random();
    public int count;
    private static final String[] FIRST_NAME = {"Alex", "Ben"};
    private static final String[] LAST_NAME = {"Petrov", "Bennet"};
    private List<Person> personList = new ArrayList<>();

    public PersonFactory() {

    }

    public List<Person> generatePersons(int count) {
        personList.clear();
        for (int i = 0; i < count; i++) {
            Person person = createPerson();
            personList.add(person);
        }
        return personList;
    }

    private Person createPerson() {
        String firstName = FIRST_NAME[RANDOM.nextInt(FIRST_NAME.length)];
        String lastName = LAST_NAME[RANDOM.nextInt(LAST_NAME.length)];
        int age = RANDOM.nextInt(61) + 20;
        double weight = RANDOM.nextInt(56) + 50;
        int height = RANDOM.nextInt(51) + 150;
        return new Person(firstName, lastName, age, weight, height);
    }
}