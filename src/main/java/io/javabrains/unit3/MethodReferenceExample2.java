package io.javabrains.unit3;


import io.javabrains.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample2 {
    public static void main(String [] args){
        List<Person> people = Arrays.asList(
                new Person("jane", "iyer", 34),
                new Person("dharles", "carvin", 24),
                new Person("eharlette", "cinstain", 44),
                new Person("cill", "gates", 54),
                new Person("cteve", "jobs", 64)
        );


        //step 02 : create a method that print all elements in the list
        System.out.println("printing all persons");
        performConditionally(people, p -> true, System.out::println); //p -> System.out.println(p)
    }

    private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        for (Person p : people) {
            if (predicate.test(p)) {
                consumer.accept(p);
            }
        }
    }
}


