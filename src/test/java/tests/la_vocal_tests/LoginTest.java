package tests.la_vocal_tests;

import manager.TestDataProvider;
import manager.UserLogin;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import tests.BaseTests;

public class LoginTest extends BaseTests {
    @BeforeClass
    public void preConditions() {
        app.mmHomePage().openLaVocalApp();
    }

    @Test(dataProvider = "loginDataProvider", dataProviderClass = TestDataProvider.class)
    public void loginSuccess(UserLogin user) {
        app.lvMainPage().logInViaEmail();
        app.signInUpPage().fillAndSubmitSignInForm(user);
        app.lvMainPage().clickUserHeaderButton();
        app.lvMainPage().isLoggedIn();
    }
}
