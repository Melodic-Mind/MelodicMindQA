package pages;

import helpers.PageHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import resources.BlogPageElements;

public class BlogPage extends PageHelper implements BlogPageElements {

    public BlogPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = MELODIC_MIND_BLOG)
    WebElement melodicMindBlog;

    public boolean isElementPresent_MelodicMindBlog(){
        return isElementVisible(melodicMindBlog, 5);
    }

}
