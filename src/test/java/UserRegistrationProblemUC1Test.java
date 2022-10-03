import com.bridgelabz.UserRegistrationProblemUC1;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationProblemUC1Test {
    //UC1- User need to enter a valid FirstName
    // First name starts with Cap and has minimum 3 characters
    @Test
    public void checking_for_first_Name_that_is_valid() {
        UserRegistrationProblemUC1 myFirstName = new UserRegistrationProblemUC1();
        boolean returnResult = myFirstName.firstName("Tom");
        Assert.assertTrue(returnResult);
    }

    @Test
    public void given_first_Name_When_first_Letter_is_Small_return_false() {
        UserRegistrationProblemUC1 myFirstName = new UserRegistrationProblemUC1();
        boolean returnResult = myFirstName.firstName("tom");
        Assert.assertFalse(returnResult);
    }

    @Test
    public void givenFirstName_WhenLesserThanThreeCharacters_ShouldReturnFalse() {
        UserRegistrationProblemUC1 myFirstName = new UserRegistrationProblemUC1();
        boolean returnResult = myFirstName.firstName("AJ");
        Assert.assertFalse(returnResult);
    }

    //  UC-2 As a User need to enter a valid Last
    //Name - Last name starts with Cap and has minimum 3 characters.
    @Test
    public void checking_for_last_Name_that_is_valid() {
        UserRegistrationProblemUC1 myLastName = new UserRegistrationProblemUC1();
        boolean returnResult = myLastName.lastName("Ben");
        Assert.assertTrue(returnResult);
    }

    @Test
    public void given_last_Name_When_first_Letter_is_Small_return_false() {
        UserRegistrationProblemUC1 myLastName = new UserRegistrationProblemUC1();
        boolean returnResult = myLastName.lastName("ben");
        Assert.assertFalse(returnResult);
    }

    @Test
    public void givenLastName_WhenLesserThanThreeCharacters_ShouldReturnFalse() {
        UserRegistrationProblemUC1 myLastName = new UserRegistrationProblemUC1();
        boolean returnResult = myLastName.firstName("AJ");
        Assert.assertFalse(returnResult);
    }
        //UC-3 As a User need to enter

        //  a valid email//- E.g. abc.xyz@bl.co.in -
        //  Email has 3 mandatory parts (abc, bl& co) and
        //  2 optional (xyz & in) with precise @ and . positions
        @Test
        public void check_given_email_ID() {
            UserRegistrationProblemUC1 myEmailID = new UserRegistrationProblemUC1();
            boolean returnResult = myEmailID.emailID("Max.123@gmail.com");
            Assert.assertTrue(returnResult);
        }

        @Test
        public void checking_given_email_ID_by_changing_dot_position_return_false() {
            UserRegistrationProblemUC1 myEmailID = new UserRegistrationProblemUC1();
            boolean returnResult = myEmailID.emailID("gmail.com123.max@");
            Assert.assertFalse(returnResult);
        }

        @Test
        public void checking_given_email_ID_by_changing_special_character_position_return_false() {
            UserRegistrationProblemUC1 myEmailID = new UserRegistrationProblemUC1();
            boolean returnResult = myEmailID.emailID("gmailxyz123.com@");
            Assert.assertFalse(returnResult);
        }
}
