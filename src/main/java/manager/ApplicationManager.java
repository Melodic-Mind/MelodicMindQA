package manager;

import io.github.bonigarcia.wdm.WebDriverManager;
import melodic_mind_pages.MmHomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import lavocal_pages.LvExercisesPage;
import lavocal_pages.LvHomePage;
import lavocal_pages.LvMainPage;
import lavocal_pages.LvSignInPage;

import java.time.Duration;

public class ApplicationManager {
    WebDriver webDriver;
    LvHomePage lvHomePage;
    LvSignInPage lvSignInPage;
    LvMainPage lvMainPage;
    LvExercisesPage lvExercisesPage;
    MmHomePage mmHomePage;

    public void start() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        webDriver.navigate().to("https://la-vocal.melodic-mind.com/");
        webDriver.navigate().to("https://melodic-mind.com/");
//        webDriver.navigate().to("https://la-vocal-staging.web.app/home");

        lvHomePage = new LvHomePage(webDriver);
        lvSignInPage = new LvSignInPage(webDriver);
        lvMainPage = new LvMainPage(webDriver);
        lvExercisesPage = new LvExercisesPage(webDriver);
        mmHomePage = new MmHomePage(webDriver);
    }

    public void stop() {
        webDriver.close();
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
}
