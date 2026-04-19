package com.leshilo.helloworld;

import java.util.Scanner;
// Reference: Regex validation adapted from Oracle Java Documentation
// https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html
// @author Leshilo

public class HelloWorld {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        // 1. USERNAME CHECK
        System.out.print("Enter username: ");
        String username = input.nextLine();
        
        if (username.contains("_") && username.length() <= 5) {
            System.out.println("Username successfully captured.");
        } else {
            System.out.println("Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.");
        }
        
        // 2. PASSWORD CHECK
        System.out.print("Enter password: ");
        String password = input.nextLine();
        
        boolean hasLength = password.length() >= 8;
        boolean hasCapital = password.matches(".*[A-Z].*");
        boolean hasNumber = password.matches(".*[0-9].*");
        boolean hasSpecial = password.matches(".*[!@#$%^&*()_+=<>?].*");
        
        if (hasLength && hasCapital && hasNumber && hasSpecial) {
            System.out.println("Password successfully captured.");
        } else {
            System.out.println("Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character");
        }
        
        // 3. CELL PHONE CHECK - Regex based
        System.out.print("Enter cell number with international code e.g. +27831234567: ");
        String cell = input.nextLine();
        
        // Regex: starts with +, then 1-3 digits country code, then max 10 digits
        if (cell.matches("^\\+\\d{1,3}\\d{1,10}$")) {
            System.out.println("Cell phone number successfully added.");
        } else {
            System.out.println("Cell phone number incorrectly formatted or does not contain international code.");
        }
        
        input.close();
    }
}