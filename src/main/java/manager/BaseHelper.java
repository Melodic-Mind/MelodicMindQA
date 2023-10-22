package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseHelper {
    public WebDriver webDriver;

    public BaseHelper(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this); // Class initialisation
        this.webDriver = webDriver;
    }

    public void type(WebElement webElement, String text) {
        waitUntilClickable(webElement);
        webElement.click();
        webElement.clear();
        if (text != null) {
            webElement.sendKeys(text);
        }
    }


    public void scrollTo(WebElement webElement) {
        new Actions(webDriver).scrollToElement(webElement).perform();
        pause(250);
    }

    public void pause(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void waitUntilClickable(WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

    public void waitUntilVisible(WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }
}
