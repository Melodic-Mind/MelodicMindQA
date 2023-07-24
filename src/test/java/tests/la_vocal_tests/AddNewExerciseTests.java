package tests.la_vocal_tests;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import tests.BaseTests;

public class AddNewExerciseTests extends BaseTests {
    @BeforeClass
    public void preConditions() throws InterruptedException {
        app.mmHomePage().openLaVocalApp();
    }

    @Test(invocationCount = 1)
    public void test1() {
        String exerciseName = Faker.instance().animal().name();

        app.lvMainPage().clickExerciseButton();
        app.lvExercisesPage().clickNewExerciseButton();
        app.lvExercisesPage().fillExerciseName(exerciseName);
        app.lvExercisesPage().clickHarmonyDropDownList();
        app.lvExercisesPage().clickHarmonyDropDownListUnison();
        app.lvExercisesPage().clickHarmonyDropDownList();
        app.lvExercisesPage().clickHarmonyDropDownListMajorTriad();
        app.lvExercisesPage().clickHarmonyDropDownList();
        app.lvExercisesPage().clickHarmonyDropDownListMinorTriad();
        app.lvExercisesPage().clickHarmonyDropDownList();
        app.lvExercisesPage().clickHarmonyDropDownListPerfectFifth();
        app.lvExercisesPage().clickAddNotesButton();
        app.lvExercisesPage().clickOnKey();
        app.lvExercisesPage().clickOnSaveButton();
        app.lvExercisesPage().clickSaveExerciseButton();
        Assert.assertTrue(app.lvExercisesPage().isExerciseSaved(exerciseName));
        app.lvExercisesPage().maxNumberOfItems(2);
    }
}
