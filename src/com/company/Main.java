package com.company;

import java.util.Scanner;

public class Main {

    public void findLargestNumber(int[] numbers){
        int number = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] > number) {
                number = numbers[i];
            }
        }
        System.out.println("The largest number is: " + number);
    }
    public void findAverageNumber(int[] numbers){
        int number = 0;
        for (int i = 0; i < numbers.length; i++){
            number += numbers[i];
        }
        System.out.println("Total of all numbers are: " + number);
        int average = (number / numbers.length);
        System.out.println("The average number is: " + average);
    }


    public static void main(String[] args) {
        Main prg = new Main();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type the amount of numbers you wish to check for:");
        int amount = sc.nextInt();

        System.out.println("Now please type the " + amount + " numbers you wish to check:");
        int[] numbers = new int[amount];
        for (int i = 0; i < amount; i++){
            numbers[i]= sc.nextInt();
        }

        prg.findLargestNumber(numbers);

        int [] avarge = new int[5];
        System.out.println("Please type 5 numbers: ");
        for (int i = 0; i < avarge.length; i++){
            avarge[i] = sc.nextInt();
        }
        prg.findAverageNumber(avarge);






        //Quick way of doing arrays
       /* String[] weekdays = {"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"};

        //use this if you want to do more than just output the full array.
        for (int i = 0; i < weekdays.length; i++){
            System.out.println(weekdays[i]);
        }

        //Just to output the full array.
        for (String days : weekdays){
            System.out.println(days);
        }*/



    }
}
