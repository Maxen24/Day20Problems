package com.bridgelabz;

public class UserRegistrationProblemUC1 {

    public boolean firstName(String firstname) {
        //UC1- User need to enter a valid FirstName
        // First name starts with Cap and has minimum 3 characters
        String nameRegex = "^[A-Z]{1}[a-z]{2,}$";
        return firstname.matches(nameRegex);
    }
    //UC-2 As a User need to enter a valid Last
    //Name - Last name starts with Cap and has minimum 3 characters

    public boolean lastName(String lastname) {
        String nameRegex = "^[A-Z]{1}[a-z]{2,}$";
        return lastname.matches(nameRegex);
    }

    //UC-3 As a User need to enter

    //  a valid email//- E.g. abc.xyz@bl.co.in -
    //  Email has 3 mandatory parts (abc, bl& co) and
    //  2 optional (xyz & in) with precise @ and . positions
    public boolean emailID(String emailID) {
        String emailRegex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
        return emailID.matches(emailRegex);
    }

    public static void main(String[] args) {
        UserRegistrationProblemUC1 myFirstName = new UserRegistrationProblemUC1();
        System.out.println(myFirstName.firstName("Tom"));// enter first name only 3 characters with first letter Cap
        UserRegistrationProblemUC1 myLastName = new UserRegistrationProblemUC1();
        System.out.println(myLastName.lastName("Ben"));
        UserRegistrationProblemUC1 myEmailID = new UserRegistrationProblemUC1();
        System.out.println(myEmailID.emailID("Max.123@gmail.com"));
    }
}
