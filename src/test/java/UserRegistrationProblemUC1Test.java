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
}
