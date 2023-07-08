package tests.alexmed;

import models.UserModel;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import tests.TestBase;

import java.util.Random;

public class RegistrationTests extends TestBase {

    @Test
    public void RegistrationPositiveTest() {
        int i = new Random().nextInt(1000) + 1000;
        UserModel user = UserModel.builder()
                .userName("qwerty" + i)
                .email(i + "qwertyzxc1@mail.ru")
                .password("qwertyzxc123")
                .country("isr")
                .city("Haifa")
                .build();
        Assert.assertTrue(new HomePage(driver)
                .clickDropdownField_Login()
                .clickButtonContinueWithEmail()
                .clickButtonDontHaveAccount_SignUp()
                .typeFormSignUp(user)
                .clickButtonSignUp()
                .isElementVisible_buttonAnotherVerificationEmail());

    }

    @Test
    public void RegistrationNegativeTest_WrongUserName() {
        int i = new Random().nextInt(1000) + 1000;
        UserModel user = UserModel.builder()
                .userName("Qwerty123" + i)
                .email("qwertyzxc11@gmail.ru")
                .password("qwertyzxc123")
                .country("isr")
                .city("Haifa")
                .build();
        Assert.assertTrue(new HomePage(driver)
                .clickDropdownField_Login()
                .clickButtonContinueWithEmail()
                .clickButtonDontHaveAccount_SignUp()
                .typeFormSignUp(user)
                .clickButtonSignUpNegative_WrongUserName()
                .isElementPresent_MessageWrongUserName());

    }
}
