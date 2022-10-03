package com.bridgelabz;

public class UserRegistrationProblemUC1 {

    public boolean firstName(String firstname) {
        //UC1- User need to enter a valid FirstName
        // First name starts with Cap and has minimum 3 characters
        String nameRegex = "^[A-Z]{1}[a-z]{2,}$";
        return firstname.matches(nameRegex);
    }

    public static void main(String[] args) {
        UserRegistrationProblemUC1 myFirstName = new UserRegistrationProblemUC1();
        System.out.println(myFirstName.firstName("Tom"));// enter first name only 3 characters with first letter Cap
    }
}
