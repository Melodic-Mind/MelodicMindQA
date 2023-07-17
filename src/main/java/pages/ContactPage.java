package pages;

import helpers.PageHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import resources.ContactPageElements;

public class ContactPage extends PageHelper implements ContactPageElements {

    public ContactPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = BUTTON_EMAIL)
    WebElement buttonEmail;
    public boolean isElementPresent_buttonEmail() {
        return isElementVisible(buttonEmail, 5);
    }
}
