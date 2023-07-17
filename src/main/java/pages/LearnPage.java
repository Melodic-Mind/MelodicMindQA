package pages;

import helpers.PageHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import resources.LearnPageElements;

public class LearnPage extends PageHelper implements LearnPageElements {
    public LearnPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = BUTTON_WHAT_IS_MUSIC_THEORY)
    WebElement buttonWhatMusicTheory;


    public boolean isElementPresent_buttonWhatMusicTheory() {
        return isElementVisible(buttonWhatMusicTheory,5);
    }
}
