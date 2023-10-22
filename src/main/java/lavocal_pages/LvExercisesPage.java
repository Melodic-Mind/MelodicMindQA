package lavocal_pages;

import manager.BaseHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LvExercisesPage extends BaseHelper {
    public LvExercisesPage(WebDriver webDriver) {
        super(webDriver);
    }


    @FindBy(xpath = "//button[@label='New exercise']")
    WebElement newExerciseButton;
    @FindBy(xpath = "//input[@placeholder='Exercise name']")
    WebElement exerciseName;
    @FindBy(xpath = "//i[@class='q-icon notranslate material-icons q-btn-dropdown__arrow q-btn-dropdown__arrow-container' and @role='presentation']")
    WebElement harmonyDropDownList;
    @FindBy(xpath = "//*[@class='q-item__label' and text()='Unison']")
    WebElement harmonyDropDownListUnison;
    @FindBy(xpath = "//*[@class='q-item__label' and text()='Major Triad']")
    WebElement harmonyDropDownListMajorTriad;
    @FindBy(xpath = "//*[@class='q-item__label' and text()='Minor Triad']")
    WebElement harmonyDropDownListMinorTriad;
    @FindBy(xpath = "//*[@class='q-item__label' and text()='Perfect Fifth']")
    WebElement harmonyDropDownListPerfectFifth;
    @FindBy(xpath = "//div[text()=' Add Notes ']")
    WebElement addNotesButton;
    @FindBy(xpath = "//div[@class='app-btn__content' and text()=' Type manually ']")
    WebElement typeManualyButton;
    @FindBy(xpath = "(//div[@class='white'])[6]")
    WebElement keyF;
    @FindBy(xpath = "(//div[@class='white'])[8]")
    WebElement keyA;
    @FindBy(xpath = "(//div[@class='white'])[11]")
    WebElement keyC;
    @FindBy(xpath = "(//div[@class='app-btn__content' and text()=' Save '])[2]")
    WebElement saveIntervalButton;
    @FindBy(xpath = "//div[text()=' Save ']")
    WebElement saveExerciseButton;
    @FindBy(xpath = "//div[@class='app-btn__content' and text()=' See all']")
    WebElement seeAllButton;
    @FindBy(xpath = "(//button[@tabindex='0' and @type='button'])[4]")
    WebElement exerciseMenu;
    @FindBy(xpath = "//div[@class='q-item__section column q-item__section--main justify-center' and text()='Delete']")
    WebElement deleteMenuButton;
    @FindBy(xpath = "//div[@class='app-btn__content' and text()=' Delete ']")
    WebElement confirmDeleteButton;

    public void clickNewExerciseButton() {
        waitUntilClickable(newExerciseButton);
        newExerciseButton.click();
        waitUntilVisible(exerciseName);
    }

    public void fillExerciseName(String text) {
        type(exerciseName, text);
    }

    public void clickHarmonyDropDownList() {
        harmonyDropDownList.click();
    }

    public void clickHarmonyDropDownListUnison() {
        harmonyDropDownListUnison.click();
    }

    public void clickHarmonyDropDownListMajorTriad() {
        harmonyDropDownListMajorTriad.click();
    }

    public void clickHarmonyDropDownListMinorTriad() {
        harmonyDropDownListMinorTriad.click();
    }

    public void clickHarmonyDropDownListPerfectFifth() {
        harmonyDropDownListPerfectFifth.click();
    }

    public void clickAddNotesButton() {
        addNotesButton.click();
        waitUntilClickable(keyF);
    }

    public void clickTypeManualyButton() {
        typeManualyButton.click();
    }

    public void typeIntervals(String s) {
    }

    public void clickOnKeys() {
        keyF.click();
        pause(500);
        keyA.click();
        pause(500);
        keyC.click();
    }

    public void clickOnSaveButton() {
        saveIntervalButton.click();
    }

    public void clickSaveExerciseButton() {
        waitUntilClickable(saveExerciseButton);
        saveExerciseButton.click();
    }


    public boolean isExerciseSaved(String name) {
        pause(5000);
        List<WebElement> list = webDriver.findElements(By.xpath("//h6"));
        for (WebElement x : list) {
            if (x.getText().equals(name)) {
                System.out.println(x.getText());
                return true;
            }
        }
        return false;
    }

    public void maxNumberOfItems(int maxNumberOfItems) {
        List<WebElement> list = webDriver.findElements(By.xpath("//h6"));
        if (maxNumberOfItems < list.size()) {
            int difference = list.size() - maxNumberOfItems;
            for (int i = 0; i < difference; i++) {
                deleteExercise();
            }
        }
    }

    public void deleteExercise() {
        exerciseMenu.click();
        deleteMenuButton.click();
        waitUntilClickable(confirmDeleteButton);
        confirmDeleteButton.click();
        pause(2000);
    }
}


