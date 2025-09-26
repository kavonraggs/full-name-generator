package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String firstName = getInput(scanner, "What is your first name?");
        String middleName = getInput(scanner, "What is your middle name?");
        String lastName = getInput(scanner,"What is your last name?");
        String suffix = getInput(scanner, "Suffix?");

        String fullName = firstName;

        if (!middleName.isBlank()){
            fullName += " " + middleName;
        }

        if (!lastName.isBlank()) {
            fullName += " " + lastName;
        }

        if (!suffix.isEmpty()){
            fullName +=  ", " + suffix;
        }

        System.out.println(fullName);

    }

    public static String getInput(Scanner scanner, String prompt){
        System.out.println(prompt);
        return scanner.nextLine().trim();
    }
}
