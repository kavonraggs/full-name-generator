package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        String fullName = "";
        String firstName ;
        String middleName;
        String lastName;
        String suffix ;

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your first name?");
        firstName = scanner.nextLine();
        firstName = firstName.trim();
        fullName += firstName;

        System.out.println("What is your middle name?");
        middleName = scanner.nextLine();
        middleName = middleName.trim();
        fullName += " " + middleName;

        if (middleName.isBlank()){
            fullName = firstName;

        }

        System.out.println("What is your last name?");
        lastName = scanner.nextLine();
        lastName = lastName.trim();
        fullName += " " + lastName;

        System.out.println("Suffix?");
        suffix = scanner.nextLine();
        suffix = suffix.trim();

        if (!suffix.isEmpty()){
            fullName +=  ", " + suffix;
            //fullName = fullName.replaceAll("\\s+", " ");
            System.out.println(fullName);

        }

        else {
            System.out.println(fullName);

        }
    }
}
