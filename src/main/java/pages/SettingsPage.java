package pages;

import helpers.PageHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import resources.SettingsPageElements;

public class SettingsPage extends PageHelper implements SettingsPageElements {
    public SettingsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = BUTTON_X)
    WebElement buttonX;


    public boolean isElementPresent_ButtonX() {
        return isElementVisible(buttonX, 5);
    }
}
