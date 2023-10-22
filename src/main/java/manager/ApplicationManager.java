package manager;

import io.github.bonigarcia.wdm.WebDriverManager;
import lavocal_pages.*;
import melodic_mind_pages.MmHomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ApplicationManager {
    WebDriver webDriver;
    LvHomePage lvHomePage;
    LvSignInPage lvSignInPage;
    LvMainPage lvMainPage;
    LvExercisesPage lvExercisesPage;
    MmHomePage mmHomePage;
    SignInUpPage signInUpPage;

    public void start() {
//        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        webDriver.navigate().to("https://melodic-mind.com/");

        lvHomePage = new LvHomePage(webDriver);
        lvSignInPage = new LvSignInPage(webDriver);
        lvMainPage = new LvMainPage(webDriver);
        lvExercisesPage = new LvExercisesPage(webDriver);
        mmHomePage = new MmHomePage(webDriver);
        signInUpPage = new SignInUpPage(webDriver);
    }

    public void stop() {
        webDriver.quit();
    }

    public LvHomePage lvHomePage() {
        return lvHomePage;
    }

    public LvSignInPage lvSignInPage() {
        return lvSignInPage;
    }

    public LvMainPage lvMainPage() {
        return lvMainPage;
    }

    public LvExercisesPage lvExercisesPage() {
        return lvExercisesPage;
    }

    public MmHomePage mmHomePage() {
        return mmHomePage;
    }

    public SignInUpPage signInUpPage() {
        return signInUpPage;
    }
}
