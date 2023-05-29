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
            System.out.print("\nEnter Mobile Number : ");
            String mobileNumber = "91234567890";
            Pattern pattern = Pattern.compile("^91[0-9]{10}$");
            Matcher matcher = pattern.matcher(mobileNumber);
            System.out.println(mobileNumber);
            if (matcher.matches() == false) {
                throw new CustomException(matcher.matches());
            }
        }catch (CustomException e) {
            System.out.println("Custom Exception : " + "\"" + e + "\"");
        }

    }
}
