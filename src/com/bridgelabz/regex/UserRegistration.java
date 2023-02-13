package com.bridgelabz.regex;

import java.util.regex.*;
import java.util.*;

public class UserRegistration {

    static boolean userName(String regex, String input) {
        return Pattern.compile(regex).matcher(input).matches();
    }

    public static void main(String[] args) {
        System.out.println("welcome to User Registration program");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Last name:");
        String input = scanner.next();
        String regex = "^[A-Z]{1}+[a-z]{2,}+$";
        userName(regex, input);

        if (input.matches(regex) == true)
            System.out.println("Valid Last name");
        else
            System.out.println("Invalid Last name");

    }
}