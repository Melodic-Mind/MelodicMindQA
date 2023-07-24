package pages;

import helpers.PageHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import resources.TheStoryPageElements;

public class TheStoryPage extends PageHelper implements TheStoryPageElements {

    public TheStoryPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = TITLE_THE_STORY)
    WebElement titleTheStory;

    @FindBy(xpath = BUTTON_BACK_TO_HOME)
    WebElement buttonBackToHome;



    public boolean isElementPresent_titleTheStory(){
        return isElementVisible(titleTheStory,10);
    }

    public boolean isElementPresent_buttonBackToHome(){
        return  isElementVisible(buttonBackToHome, 5);
    }

}
