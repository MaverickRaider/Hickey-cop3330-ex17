
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Hickey
 */

package oop.example;
import java.util.Scanner;
import java.lang.Math;

public class Ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your weight? ");
        double weight = scanner.nextDouble();
        System.out.println("What is your gender? (0 for male, 1 for female) ");
        double gender = scanner.nextDouble();
        System.out.println("How much alcohol did you consumed (in ounces)? ");
        double consumed = scanner.nextDouble();
        System.out.println("How long since your last drink (hours)? ");
        double hours = scanner.nextDouble();

        double r = (gender == 0) ? 0.73 : 0.66;
        double bac = (((consumed * 5.14) / weight * r) - (0.015 * hours));
        double roundedBAC = Math.round(bac * 100.0) / 100.0;

        System.out.println("Your BAC is " + roundedBAC);
        String statement = (bac >= 0.08) ?  "It is not legal for you to drive." : "It is legal for you to drive.";
        System.out.println(statement);
    }
}