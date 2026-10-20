package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {


        //we need a scanner
        Scanner nameScanner = new Scanner(System.in);

        //print please enter your name
        System.out.println("Please enter your name bellow  ");

        //use scanner we created to store the first name they provide in a variable
        System.out.print("First name: ");
        String firstName = nameScanner.nextLine().trim();

        System.out.print("Middle name: ");
        String middleName = nameScanner.nextLine().trim();

        System.out.print("Last name: ");
        String lastName = nameScanner.nextLine().trim();

        System.out.print("Suffix: ");
        String suffix = nameScanner.nextLine().trim();

        //print out the stuff
        //always print the first and last name
        //if they gave a middle name and/or suffix, print it
        String fullName = firstName;
        if (middleName.length() == 0) {
            fullName += " ";
        } else {
            fullName += " " + middleName;
        }

        fullName += " " + lastName;

        if (!suffix.isBlank()) {
            fullName += ", " + suffix;
        }
        System.out.println(fullName);
    }
}
