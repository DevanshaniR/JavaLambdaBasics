package io.javabrains;

import java.util.Arrays;
import java.util.List;

public class Unit1Exercise {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("jane", "iyer", 34),
                new Person("charles", "Darvin", 24),
                new Person("charlette", "Einstain", 44),
                new Person("bill", "gates", 54),
                new Person("steve", "jobs", 64)
        );
    }
}
