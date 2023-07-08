package pages;

import helpers.PageHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import resources.HomePageElements;

public class HomePage extends PageHelper implements HomePageElements {
    public HomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = HOME_DROPDOWN)
    WebElement buttonDropDown;

    @FindBy(xpath = HOME_DROPDOWN_FIELD_LOGIN)
    WebElement fieldLogin;

    @FindBy(xpath = HOME_DROPDOWN_FIELD_PROFILE)
    WebElement fieldProfile;

    public LoginSignUpPage clickDropdownField_Login() {
        click(buttonDropDown,3);
        click(fieldLogin,3);
        return new LoginSignUpPage(driver);
    }

    public boolean isElementPresent_dropdownFieldProfile() {
        pause(5);
        click(buttonDropDown,3);
        return isElementVisible(fieldProfile,5);
    }

    public boolean isElementPresent_dropdownFieldLogin() {
        click(buttonDropDown,3);
        return isElementVisible(fieldLogin,5);
    }
}
