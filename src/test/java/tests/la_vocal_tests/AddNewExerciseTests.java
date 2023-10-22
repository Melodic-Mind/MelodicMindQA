package tests.la_vocal_tests;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import tests.BaseTests;

public class AddNewExerciseTests extends BaseTests {
    String exerciseName = Faker.instance().animal().name();

    @Test(enabled = true, invocationCount = 1)
    public void addNewExerciseUnisonSuccess() {
        app.lvMainPage().clickExerciseButton();
        app.lvExercisesPage().clickNewExerciseButton();
        app.lvExercisesPage().fillExerciseName(exerciseName);
        app.lvExercisesPage().clickHarmonyDropDownList();
        app.lvExercisesPage().clickHarmonyDropDownListUnison();
        app.lvExercisesPage().clickAddNotesButton();
        app.lvExercisesPage().clickOnKeys();
        app.lvExercisesPage().clickOnSaveButton();
        app.lvExercisesPage().clickSaveExerciseButton();
        Assert.assertTrue(app.lvExercisesPage().isExerciseSaved(exerciseName));
    }

    @Test(enabled = true, invocationCount = 1)
    public void addNewExerciseMajorTriadSuccess() {
        app.lvMainPage().clickExerciseButton();
        app.lvExercisesPage().clickNewExerciseButton();
        app.lvExercisesPage().fillExerciseName(exerciseName);
        app.lvExercisesPage().clickHarmonyDropDownList();
        app.lvExercisesPage().clickHarmonyDropDownListMajorTriad();
        app.lvExercisesPage().clickAddNotesButton();
        app.lvExercisesPage().clickOnKeys();
        app.lvExercisesPage().clickOnSaveButton();
        app.lvExercisesPage().clickSaveExerciseButton();
        Assert.assertTrue(app.lvExercisesPage().isExerciseSaved(exerciseName));
    }

    @Test(enabled = true, invocationCount = 1)
    public void addNewExerciseMinorTriadSuccess() {
        app.lvMainPage().clickExerciseButton();
        app.lvExercisesPage().clickNewExerciseButton();
        app.lvExercisesPage().fillExerciseName(exerciseName);
        app.lvExercisesPage().clickHarmonyDropDownList();
        app.lvExercisesPage().clickHarmonyDropDownListMinorTriad();
        app.lvExercisesPage().clickAddNotesButton();
        app.lvExercisesPage().clickOnKeys();
        app.lvExercisesPage().clickOnSaveButton();
        app.lvExercisesPage().clickSaveExerciseButton();
        Assert.assertTrue(app.lvExercisesPage().isExerciseSaved(exerciseName));
    }

    @Test(enabled = true, invocationCount = 1)
    public void addNewExercisePerfectFifthSuccess() {
        app.lvMainPage().clickExerciseButton();
        app.lvExercisesPage().clickNewExerciseButton();
        app.lvExercisesPage().fillExerciseName(exerciseName);
        app.lvExercisesPage().clickHarmonyDropDownList();
        app.lvExercisesPage().clickHarmonyDropDownListPerfectFifth();
        app.lvExercisesPage().clickAddNotesButton();
        app.lvExercisesPage().clickOnKeys();
        app.lvExercisesPage().clickOnSaveButton();
        app.lvExercisesPage().clickSaveExerciseButton();
        Assert.assertTrue(app.lvExercisesPage().isExerciseSaved(exerciseName));
    }

    @AfterMethod
    public void returnToMainPage() {
        app.lvExercisesPage().maxNumberOfItems(3);
        app.lvMainPage().clickBurgerMenu();
        app.lvMainPage().clickMenuHomeButton();
    }
}

