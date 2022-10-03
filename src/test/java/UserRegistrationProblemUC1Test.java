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
}
