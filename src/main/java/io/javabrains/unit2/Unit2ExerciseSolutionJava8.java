package io.javabrains.unit2;

import io.javabrains.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Unit2ExerciseSolutionJava8 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("jane", "iyer", 34),
                new Person("dharles", "carvin", 24),
                new Person("eharlette", "cinstain", 44),
                new Person("cill", "gates", 54),
                new Person("cteve", "jobs", 64)
        );

        //step 01 : sort the list by last name
        Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

        //step 02 : create a method that print all elements in the list
        System.out.println("printing all persons");
        performConditionally(people, p -> true, p -> System.out.println(p));

        //step 03 : create a method that print all people that have last name beginning with c
        System.out.println("printing all persons last name begin with c");
        performConditionally(people, p -> p.getLastName().startsWith("c"), p -> System.out.println(p));

        System.out.println("printing all persons first name begin with c");
        performConditionally(people, p -> p.getFirstName().startsWith("c"), p -> System.out.println(p.getFirstName()));
    }

    private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        for (Person p : people) {
            if (predicate.test(p)) {
                consumer.accept(p);
            }
        }
    }
}

