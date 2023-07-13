package melodic_mind_pages;

import manager.BaseHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.Set;

public class MmHomePage extends BaseHelper {
    public MmHomePage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = "(//div[@class='app-btn__content'])[5]")
    public WebElement laVocalOpenButton;
    @FindBy(xpath = "(//div[@class='app-btn__content'])[3]")
    WebElement musicGuruOpenButton;
    @FindBy(xpath = "(//div[@class='app-btn__content'])[6]")
    WebElement songWriterStudioLearnMoreButton;
    @FindBy(xpath = "(//div[@class='app-btn__content'])[7]")
    WebElement earWizardLearnMoreButton;
    @FindBy(xpath = "(//div[@class='app-btn__content'])[8]")
    WebElement subscribeButton;
    @FindBy(xpath = "//span[@class='col text-left' and text()='Discord']")
    WebElement discordButton;
    @FindBy(xpath = "//span[@class='col text-left' and text()='TikTok']")
    WebElement tikTokButton;
    @FindBy(xpath = "//span[@class='col text-left' and text()='YouTube']")
    WebElement youTubeButton;
    @FindBy(xpath = "//span[@class='col text-left' and text()='Twitter']")
    WebElement twitterButton;
    @FindBy(xpath = "//span[@class='col text-left' and text()='Facebook']")
    WebElement facebookButton;
    @FindBy(xpath = "//span[@class='col text-left' and text()='Instagram']")
    WebElement instagramButton;
    @FindBy(xpath = "//span[@class='col text-left' and text()='E-Mail']")
    WebElement eMailButton;
    @FindBy(xpath = "//button[text()=' Terms of Use ']")
    WebElement termOfUseLink;
    @FindBy(xpath = "//button[text()=' Privacy Policy ']")
    WebElement privacyPilicyLink;
    @FindBy(xpath = "//button[text()=' The Story ']")
    WebElement theStoryLink;
    @FindBy(xpath = "//button[text()=' Contact us ']")
    WebElement contactUsLink;
    @FindBy(xpath = "//div[@class='text-center text-grey-5' and text()=' All rights reserved @ Melodic Mind 2023']")
    WebElement allRightsReservedFooter;

    public void openLaVocalApp() throws InterruptedException {
        scrollTo(laVocalOpenButton);
        laVocalOpenButton.click();
        Thread.sleep(5000);
        Set<String> windowHandles = webDriver.getWindowHandles();
        for (String windowHandle : windowHandles) {
            webDriver.switchTo().window(windowHandle);
        }
    }

    public void isLaVocalOpenButtonAppeared() {
        scrollTo(laVocalOpenButton);
        Assert.assertTrue(laVocalOpenButton.isDisplayed());
    }

    public void musicGuruOpenButtonAppeared() {
        scrollTo(musicGuruOpenButton);
        Assert.assertTrue(musicGuruOpenButton.isDisplayed());
    }

    public void songWriterStudioLearnMoreButtonAppeared() {
        scrollTo(songWriterStudioLearnMoreButton);
        Assert.assertTrue(songWriterStudioLearnMoreButton.isDisplayed());
    }

    public void earWizardLearnMoreButtonAppeared() {
        scrollTo(earWizardLearnMoreButton);
        Assert.assertTrue(earWizardLearnMoreButton.isDisplayed());
    }

    public void isSubscribeButtonAppeared() {
        scrollTo(subscribeButton);
        Assert.assertTrue(subscribeButton.isDisplayed());
    }

    public void isDiscordButtonAppeared() {
        scrollTo(discordButton);
        Assert.assertTrue(discordButton.isDisplayed());
    }

    public void isTikTokButtonButtonAppeared() {
        scrollTo(tikTokButton);
        Assert.assertTrue(tikTokButton.isDisplayed());
    }

    public void isYouTubeButtonAppeared() {
        scrollTo(youTubeButton);
        Assert.assertTrue(youTubeButton.isDisplayed());
    }

    public void isTwitterButtonAppeared() {
        scrollTo(twitterButton);
        Assert.assertTrue(twitterButton.isDisplayed());
    }

    public void isFacebookButtonAppeared() {
        scrollTo(facebookButton);
        Assert.assertTrue(facebookButton.isDisplayed());
    }

    public void isInstagramButtonAppeared() {
        scrollTo(instagramButton);
        Assert.assertTrue(instagramButton.isDisplayed());
    }

    public void isEMailButtonAppeared() {
        scrollTo(eMailButton);
        Assert.assertTrue(eMailButton.isDisplayed());
    }

    public void isFooterElementsAppeared() {
        scrollTo(allRightsReservedFooter);
        Assert.assertTrue(allRightsReservedFooter.isDisplayed());
        Assert.assertTrue(termOfUseLink.isDisplayed());
        Assert.assertTrue(privacyPilicyLink.isDisplayed());
        Assert.assertTrue(theStoryLink.isDisplayed());
        Assert.assertTrue(contactUsLink.isDisplayed());
    }


}
