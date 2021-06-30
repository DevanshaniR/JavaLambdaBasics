package io.javabrains.unit3;

import io.javabrains.Person;

import java.util.Arrays;
import java.util.List;

public class CollectionIterationExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("jane", "iyer", 34),
                new Person("dharles", "carvin", 24),
                new Person("eharlette", "cinstain", 44),
                new Person("cill", "gates", 54),
                new Person("cteve", "jobs", 64)
        );

        //using for loop
        System.out.println("using for loop");
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
        }

        System.out.println("using for in loop");
        for (Person p : people) {
            System.out.println(p);
        }

        System.out.println("using internal iterator lambda foreach");
//        people.forEach(p -> System.out.println(p));
        people.forEach(System.out::println);
    }
}
