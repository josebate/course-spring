package com.in28minutes.learnspringframework.others;

import java.util.List;

public class FPExercises {

    public static void main(String[] args){
        // Exercise 1
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9);
        //printOddNumbers(numbers);
        
        // Exercise 2
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
        //printCoursesIndividually(courses);

        // Exercise 3 - Print courses with "Spring" in it
        //printSpringCourses(courses);

        // Exercise 4 - Print courses whose name has at least 4 letters
        //printCoursesMoreThan4Letters(courses);

        // Exercise 5 - Print cubes of even numbers
        printCubesOfEvenNumbersInListFunctional(numbers);
    }

    public static void printOddNumbers(List<Integer> numbers){
        numbers.stream().filter(number -> number%2 != 0).forEach(System.out::println);
    }

    public static void printCoursesIndividually(List<String> courses){
        courses.stream().forEach(System.out::println);
    }

    public static void printSpringCourses(List<String> courses){
        courses.stream().filter(course -> course.contains("Spring")).forEach(System.out::println);
    }

    public static void printCoursesMoreThan4Letters(List<String> courses){
        courses.stream().filter(course -> course.length()>=4).forEach(System.out::println);
    }

    public static void printCubesOfEvenNumbersInListFunctional(List<Integer> numbers){
        numbers.stream().filter(number -> number%2 == 0).map(number -> number * number * number).forEach(System.out::println);
    }

    public static void printLenghtOfCourses(List<String> courses){
        courses.stream().map(course -> course + " " + course.length()).forEach(System.out::println);
    }

}
