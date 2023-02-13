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
        System.out.println("Enter your E-mail :");
        String input = scanner.next();
         String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
        //String regex = "[A-Z]+[a-zA-z0-9]{5,}+[0-9]+[@$*_-]{1}+$";
        userName(regex, input);

        if (input.matches(regex) == true)
            System.out.println("Valid E-mail");
        else
            System.out.println("Invalid E-mail");

    }
}