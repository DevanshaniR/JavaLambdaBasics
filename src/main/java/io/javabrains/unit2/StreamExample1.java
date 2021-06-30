package io.javabrains.unit2;

import io.javabrains.Person;

import java.util.Arrays;
import java.util.List;

public class StreamExample1 {
    public static void main(String [] args){
        List<Person> people = Arrays.asList(
                new Person("jane", "iyer", 34),
                new Person("dharles", "carvin", 24),
                new Person("eharlette", "cinstain", 44),
                new Person("cill", "gates", 54),
                new Person("cteve", "jobs", 64)
        );

        people.stream()
                .filter(p -> p.getLastName().startsWith("c"))
                .forEach(p -> System.out.println(p.getFirstName()));

        long count = people.parallelStream()
                .filter(p -> p.getLastName().startsWith("c"))
                .count();

        System.out.println(count);
    }
}
