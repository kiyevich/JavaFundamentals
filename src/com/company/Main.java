package com.company;

import java.awt.desktop.QuitEvent;
import java.lang.reflect.Array;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        // 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your name: ");
        System.out.printf("Hello %s\n", scanner.nextLine());



        // 2

        for(int i = args.length - 1; i >= 0; i--){
            System.out.println( "Аргумент: " + args[i]);
        }

        // 3

        while(!scanner.hasNextInt()){
            System.out.println("You have to enter valid number");
            scanner.next();
        }

        int numberOfRandomNumbers = scanner.nextInt();

        Random random = new Random();
        for(int i = 0; i < numberOfRandomNumbers; i++) {
            System.out.print(random.nextInt(1000) + " ");
        }

        System.out.println();

        for(int i = 0; i < numberOfRandomNumbers; i++) {
            System.out.println(random.nextInt(1000));
        }

        //4

        int sumOfAgrsNumbers = 0;
        int compositionOfAgrsNumbers = 1;

        for(int i = args.length - 1; i >= 0; i--){
            sumOfAgrsNumbers = sumOfAgrsNumbers + Integer.parseInt(args[i]);
            compositionOfAgrsNumbers = compositionOfAgrsNumbers*Integer.parseInt(args[i]);
        }

        System.out.printf("Sum is %d", sumOfAgrsNumbers);
        System.out.println();
        System.out.printf("Composition is %d", compositionOfAgrsNumbers);

        //5

        System.out.println("Enter the month number from 1 to 12");
        int month = 1;

        while(!scanner.hasNextInt()){
            System.out.println("\nYou have to enter valid number");
            scanner.next();
        }

        month = scanner.nextInt();

        switch (month){
            case 1: System.out.println("January");
                break;
            case 2: System.out.println("February");
                break;
            case 3: System.out.println("March");
                break;
            case 4: System.out.println("April");
                break;
            case 5: System.out.println("May");
                break;
            case 6: System.out.println("June");
                break;
            case 7: System.out.println("July");
                break;
            case 8: System.out.println("August");
                break;
            case 9: System.out.println("September");
                break;
            case 10: System.out.println("October");
                break;
            case 11: System.out.println("November");
                break;
            case 12: System.out.println("December");
                break;
            default: System.out.println("A month with this index doesn't exist");
                break;
        }



    }
}
