package tests.la_vocal_tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import tests.BaseTests;

public class SmokeTests extends BaseTests {
    @BeforeClass
    public void preConditions() {
        app.mmHomePage().openLaVocalApp();
    }

    @Test
    public void mainPageSmokeTest() {
        app.lvMainPage().checkMainActivities();
        app.lvMainPage().checkMenuActivities();
    }
}
