package pages;

import helpers.PageHelper;
import models.UserModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import resources.LoginSignUpPageElements;

public class LoginSignUpPage extends PageHelper implements LoginSignUpPageElements {
    public LoginSignUpPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[text()=' Continue with Email ']")
    WebElement buttonContinueWithEmail;

    @FindBy(xpath = "//span[text()=' Sign Up ']")
    WebElement buttonDontHaveAccount_SignUp;

    @FindBy(xpath = "//div[text()=' Sign up ']")
    WebElement buttonSignUp;

    @FindBy(xpath = "//input[@aria-label='Username']")
    WebElement fieldUserName;

    @FindBy(xpath = FIELD_EMAIL_LOGIN_FORM)
    WebElement fieldEmail;

    @FindBy(xpath = "//input[@aria-label='Password']")
    WebElement fieldPassword;

    @FindBy(xpath = "//input[@aria-label='Country']")
    WebElement fieldCountry;

    @FindBy(xpath = "//input[@aria-label='State/City']")
    WebElement fieldCity;

    @FindBy(xpath = "//span[text()='Israel']")
    WebElement countryIsrael;

    @FindBy(xpath = "//div[text()=' Send me another verification email ']")
    WebElement buttonAnotherVerificationEmail;

    @FindBy(xpath = "//div[text()='Please use only small letters and numbers']")
    WebElement messageWrongUserName;

    @FindBy(xpath = BUTTON_SIGN_IN)
    WebElement buttonSignIn;

    @FindBy(xpath = ALERT_WRONG_PASSWORD)
    WebElement alertWrongPassword;

    public LoginSignUpPage clickButtonContinueWithEmail(){
        click(buttonContinueWithEmail, 3);
        return this;
    }

    public LoginSignUpPage clickButtonDontHaveAccount_SignUp(){
        click(buttonDontHaveAccount_SignUp, 3);
        return this;
    }

    public LoginSignUpPage typeFormSignUp(UserModel user) {
        type(fieldUserName, user.getUserName(), 3);
        type(fieldEmail, user.getEmail(), 3);
        type(fieldPassword, user.getPassword(), 3);
        type(fieldCountry, user.getCountry(), 3);
        click(countryIsrael, 3);
        type(fieldCity, user.getCity(), 3);
        return this;
    }

    public boolean isElementVisible_buttonAnotherVerificationEmail(){
        return isElementVisible(buttonAnotherVerificationEmail,3);
    }

    public LoginSignUpPage clickButtonSignUp() {
        click(buttonSignUp,3);
        return this;
    }

    public LoginSignUpPage clickButtonSignUpNegative_WrongUserName() {
        click(buttonSignUp, 3);
        return this;
    }

    public boolean isElementPresent_MessageWrongUserName(){
        return isElementVisible(messageWrongUserName, 3);
    }

    public boolean isElementPresent_AlertWrongPassword(){
        return isElementVisible(alertWrongPassword, 5);
    }

    public HomePage typeLoginForm(UserModel user) {
        type(fieldEmail, user.getEmail(), 3);
        type(fieldPassword, user.getPassword(), 3);
        click(buttonSignIn, 3);
        return new HomePage(driver);
    }

    public LoginSignUpPage typeLoginFormNegative(UserModel user) {
        type(fieldEmail, user.getEmail(), 3);
        type(fieldPassword, user.getPassword(), 3);
        click(buttonSignIn, 3);
        return this;
    }


}
