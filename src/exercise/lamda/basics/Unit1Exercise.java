package exercise.lamda.basics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;


public class Unit1Exercise {

    public static void main(String[] args){

        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );

        // Step 1: Sort list by last name
        Collections.sort(people, (o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));




        // Step 2: Create a method that prints all elements in the list
        System.out.print("Printing all Person:");
        performConditionally(people,p -> true,q -> System.out.println(q));





        // Step 3: Create a method that prints all people that have last name beginning with C

        System.out.println("Printing all person last name starting with C");
        performConditionally(people, p -> p.getLastName().startsWith("C"),q -> System.out.println(q.getAge()));

        //Print all elements in the list
//        System.out.println("Using Lamda For each iteration");
//
//        people.forEach(System.out::println);// same as people.forEach(p -> System.out.println(p));


    }


    private static void performConditionally(List<Person> people, Condition condition, Consumer<Person> operation) {
        for (Person p : people) {
            if (condition.test(p)) {
                operation.accept(p);
            }

        }

        //Using stream in Java8
        System.out.println("Using Stream");
        people.stream()
                .filter(p -> p.getLastName().startsWith("C"))
                .forEach(q->System.out.println(q.getAge()));

    }


}

