package lavocal_pages;

import manager.BaseHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LvMainPage extends BaseHelper {
    public LvMainPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = "//button[@class='navigation-btn']")
    WebElement exercise;
    @FindBy(xpath = "//i[@class='q-icon text-white notranslate material-icons' and text()='menu']")
    WebElement burgerMenu;
    @FindBy(xpath = "//div[@class='q-item__section column q-item__section--main justify-center' and text()='Home']")
    WebElement menuHomeButton;

    public void clickExerciseButton() {
        exercise.click();
    }

    public void clickBurgerMenu() {
        burgerMenu.click();
    }

    public void clickMenuHomeButton() {
        menuHomeButton.click();
    }
}
