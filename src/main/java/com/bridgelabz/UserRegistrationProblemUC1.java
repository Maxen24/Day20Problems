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

    // UC-4 As a User need to follow pre-defined
    //Mobile Format - E.g. 91 9919819801 - Country code follow by space and 10 digit number

    public boolean phoneNumber(String phoneNumber){
        String PhoneNumberRegex="^(\\d{2}[- ]?){3}\\d{6}$";
        return phoneNumber.matches(PhoneNumberRegex);
    }

    //UC-5 As a User need to follow pre-defined Password rules.
    //Rule1– minimum 8 Characters - NOTE – All rules must be passed
    public boolean password(String password) {
        String passwordRegex = "[a-z]{8}";
        return password.matches(passwordRegex);
    }

    // UC-6 Should have at least 1
    ///Upper Case - NOTE – All rules must be passed
    public boolean passwordRule2(String passwordRule2) {
        String passwordRuleRegex = "^(?=.*?[A-Z])[a-zA-Z]{8}";
        return passwordRule2.matches(passwordRuleRegex);
    }
    //UC7 Rule3– Should have at least 1 numeric number in
    //the password - NOTE – All rules must be passed
    public boolean passwordRule3(String passwordRule3){
        String passwordRule3Regex="^(?=.*?[A-Z])[a-zA-Z]{8}[0-9]{1}";
        return passwordRule3.matches(passwordRule3Regex);
    }

    public static void main(String[] args) {
        UserRegistrationProblemUC1 myFirstName = new UserRegistrationProblemUC1();
        System.out.println(myFirstName.firstName("Tom"));// enter first name only 3 characters with first letter Cap
        UserRegistrationProblemUC1 myLastName = new UserRegistrationProblemUC1();
        System.out.println(myLastName.lastName("Ben"));
        UserRegistrationProblemUC1 myEmailID = new UserRegistrationProblemUC1();
        System.out.println(myEmailID.emailID("Max.123@gmail.com"));
        UserRegistrationProblemUC1 myPhoneNumber=new UserRegistrationProblemUC1();
        System.out.println(myPhoneNumber.phoneNumber("91-9689865476"));
        UserRegistrationProblemUC1 myPassword=new UserRegistrationProblemUC1();
        System.out.println(myPassword.password("validate"));
        UserRegistrationProblemUC1 myPasswordRule=new UserRegistrationProblemUC1();
        System.out.println(myPasswordRule.passwordRule2("Validate"));
        UserRegistrationProblemUC1 myPasswordRule3=new UserRegistrationProblemUC1();
        System.out.println(myPasswordRule3.passwordRule3("Validate1"));
    }
}
