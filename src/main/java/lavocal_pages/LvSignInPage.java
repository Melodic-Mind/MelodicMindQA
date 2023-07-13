package lavocal_pages;

import manager.BaseHelper;
import manager.UserLogin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LvSignInPage extends BaseHelper {
    public LvSignInPage(WebDriver webDriver) {
        super(webDriver);
    }


    @FindBy(xpath = "//input[@aria-label='Email']")
    WebElement emailField;
    @FindBy(xpath = "//input[@aria-label='Password']")
    WebElement passwordField;
    @FindBy(xpath = "//div[@class='app-btn__content' and text()=' Sign in ']")
    WebElement signInButton;

    public void login(UserLogin user) {
        type(emailField, user.getEmail());
        type(passwordField, user.getPassword());
        signInButton.click();
    }
}
