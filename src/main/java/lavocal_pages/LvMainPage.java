package lavocal_pages;

import manager.BaseHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LvMainPage extends BaseHelper {
    public LvMainPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = "//button[@class='navigation-btn']")
    WebElement exercise;
    @FindBy(xpath = "//div[text()='Start a workout']")
    WebElement startAWorkout;
    @FindBy(xpath = "//div[text()='Practice a song']")
    WebElement practiceASong;
    @FindBy(xpath = "//div[text()='Record yourself']")
    WebElement recordYourself;
    @FindBy(xpath = "(//button[@type='button'])[1]")
    WebElement burgerMenu;
    @FindBy(xpath = "//div[text()='Home']")
    WebElement menuHomeButton;
    @FindBy(xpath = "//span[text()=' Sign in/up ']")
    WebElement signInUpHeaderButton;
    @FindBy(xpath = "//span[text()=' Continue with Email ']")
    WebElement continueWithEmailButton;
    @FindBy(xpath = "(//*[name()='svg'])[3]")
    WebElement userHeaderButton;
    @FindBy(xpath = "//div[text()='Logout']")
    WebElement logoutHeaderButton;

    public void smokeTest(){
        Assert.assertTrue(burgerMenu.isDisplayed());
        Assert.assertTrue(exercise.isDisplayed());
        Assert.assertTrue(startAWorkout.isDisplayed());
        Assert.assertTrue(practiceASong.isDisplayed());
        Assert.assertTrue(recordYourself.isDisplayed());
    }

    public void clickExerciseButton() {
        waitUntilClickable(exercise);
        exercise.click();
        pause(3000); // for music library loading
    }

    public void clickBurgerMenu() {
        burgerMenu.click();
    }

    public void clickMenuHomeButton() {
        menuHomeButton.click();
    }

    public void logInViaEmail() {
        waitUntilClickable(signInUpHeaderButton);
        signInUpHeaderButton.click();
        waitUntilClickable(continueWithEmailButton);
        continueWithEmailButton.click();
    }

    public void clickUserHeaderButton() {
        pause(2000);
        userHeaderButton.click();
    }

    public void clickLogoutHeaderButton() {
        waitUntilClickable(logoutHeaderButton);
        logoutHeaderButton.click();
    }

    public void isLoggedIn() {
        clickUserHeaderButton();
        waitUntilVisible(logoutHeaderButton);
        Assert.assertTrue(logoutHeaderButton.isDisplayed());
    }
}