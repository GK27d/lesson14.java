package com.kostina;

import jdk.internal.org.objectweb.asm.tree.InsnList;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        PersonFactory factory = new PersonFactory();
        List<Person> personList = factory.generatePersons(10);
        System.out.println(personList);
        System.out.println("----------------------------------------------------------------");
       Set<Person> set = new HashSet<>(personList);
        personList = new ArrayList<>(set);
        System.out.println(personList);
    }
}