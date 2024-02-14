package com.sgic.java.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {

    public static String validateEmail(String email) {
        // Regular expression for email validation
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        // Compile the regex pattern
        Pattern pattern = Pattern.compile(emailRegex);
        // Create matcher object
        Matcher matcher = pattern.matcher(email);

        // Check if email matches the pattern
        if (matcher.matches()) {
            return "Email is Valid";
        } else {
            return "Email is Invalid";
        }
    }

    public static void main(String[] args) {
        // Test the method
        String email1 = "test@example.com";
        String email2 = "invalid.email.com";

        System.out.println(validateEmail(email1)); // Output: Email is Valid
        System.out.println(validateEmail(email2)); // Output: Email is Invalid
    }
}
