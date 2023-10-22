package lavocal_pages;

import manager.BaseHelper;
import manager.UserLogin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInUpPage extends BaseHelper {
    public SignInUpPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = "//div[text()='Sign in']")
    WebElement signInUpperButton;
    @FindBy(xpath = "//input[@aria-label='Email']")
    WebElement emailInputField;
    @FindBy(xpath = "//input[@aria-label='Password']")
    WebElement passwordInputField;
    @FindBy(xpath = "//div[text()=' Sign in ']")
    WebElement signInBigButton;

    public void fillAndSubmitSignInForm(UserLogin user) {
        waitUntilClickable(signInUpperButton);
        signInUpperButton.click();
        waitUntilVisible(signInBigButton);
        pause(1500);
        type(emailInputField, user.getEmail());
        type(passwordInputField, user.getPassword());
        signInBigButton.click();
    }

}
