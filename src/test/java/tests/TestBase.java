package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.lang.reflect.Method;
import java.time.Duration;

public class TestBase {

    private final int WAIT = 5;
    private long timeStart, timeEnd;
    public  static WebDriver driver;
    private String browser;

    protected Logger logger = LoggerFactory.getLogger(TestBase.class);

//    @BeforeSuite(alwaysRun = true)
//    public void init(){
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--remote-allow-origins=*");
//        //options.addArguments("--headless");
//        //options.addArguments("--disable-blink-features=AutomationControlled");
//        driver = new ChromeDriver(options);
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WAIT));
//        driver.get("https://melodic-mind.com/");
//    }

    @BeforeMethod(alwaysRun = true)
    public void startTest(Method method){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        //options.addArguments("--headless");
        //options.addArguments("--disable-blink-features=AutomationControlled");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WAIT));
        driver.get("https://melodic-mind.com/");
        timeStart = System.currentTimeMillis();
        logger.info("Start test --> "+method.getName());
    }

    @AfterMethod(alwaysRun = true)
    public void stopTest(Method method, ITestResult result){
        timeEnd = System.currentTimeMillis();
        if(result.isSuccess())
            logger.info("Test result --> PASSED");
        else
            logger.info("Test result --> FAILED");
        logger.info("Stop test ---> "+method.getName());
        logger.info("Method duration on milliseconds --> "+(timeEnd-timeStart)+" msec");
        logger.info("=========================================================================");
        driver.quit();
    }

//    @AfterSuite(alwaysRun = true)
//    public void tearDown(){
////        driver.quit();
//    }
}
