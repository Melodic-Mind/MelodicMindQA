package pages;

import helpers.PageHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import resources.ProfilePageElements;

public class ProfilePage extends PageHelper implements ProfilePageElements {

    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = BUTTON_DELETE_ACCOUNT)
    WebElement buttonDeleteAccount;

    public boolean isElementPresent_DeleteAccount() {
        return isElementVisible(buttonDeleteAccount,5);
    }
}
