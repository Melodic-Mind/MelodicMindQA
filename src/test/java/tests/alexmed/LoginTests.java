package tests.alexmed;

import dataprovider.DataProviderForLogin;
import models.UserModel;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import tests.TestBase;

public class LoginTests extends TestBase {

    @Test(dataProvider = "DpFile_loginPositiveTest",
            dataProviderClass = DataProviderForLogin.class)
    public void LoginPositiveTest(UserModel user){
        logger.info("Test with data login --> "+user.getEmail()+" password --> "+user.getPassword());
        Assert.assertTrue(new HomePage(driver).clickDropdownField_Login()
                .clickButtonContinueWithEmail()
                .typeLoginForm(user)
                .isElementPresent_dropdownFieldProfile());
    }

    @Test(dataProvider = "DpFile_LoginNegativeTest_WrongPassword",
            dataProviderClass = DataProviderForLogin.class)
    public void LoginNegativeTest_WrongPassword(UserModel user){
        logger.info("Test with data login --> "+user.getEmail()+" password --> "+user.getPassword());
        Assert.assertTrue(new HomePage(driver).clickDropdownField_Login()
                .clickButtonContinueWithEmail()
                .typeLoginForm(user)
                .isElementPresent_dropdownFieldLogin());
    }


}
