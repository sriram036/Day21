package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationTest {

    @Test
    public void givenNameShouldReturnCustomExceptionIfNameIsNotValid(){

        class CustomException extends Exception {
            boolean isValid;
            CustomException(boolean bool) {
                isValid = bool;
            }
            public String toString() {
                return ("The Given value is " + isValid);
            }
        }

        try {
            System.out.print("\nEnter last Name : ");
            String string = "ravichnandran";
            Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
            Matcher matcher = pattern.matcher(string);
            System.out.println(string);
            if (matcher.matches() == false) {
                throw new CustomException(matcher.matches());
            }
        }catch (CustomException e) {
            System.out.println("Custom Exception : " + "\"" + e + "\"");
        }

    }
}
