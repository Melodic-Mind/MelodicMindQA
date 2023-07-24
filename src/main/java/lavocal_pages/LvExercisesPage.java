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
//    @FindBy(xpath = "//div[@class='white']//*[@class='white']")
    @FindBy(xpath = "(//div[@class='white'])[4]")
    WebElement keys;
    @FindBy(xpath = "(//div[@class='app-btn__content' and text()=' Save '])[2]")
    WebElement saveIntervalButton;
    @FindBy(xpath = "//div[text()=' Save ']")
    WebElement saveExerciseButton;
    @FindBy(xpath = "//div[@class='app-btn__content' and text()=' See all']")
    WebElement seeAllButton;
    @FindBy(xpath = "//i[@class='q-icon text-white notranslate material-icons' and text()='more_vert']")
    WebElement exerciseMenu;
    @FindBy(xpath = "//div[@class='q-item__section column q-item__section--main justify-center' and text()='Delete']")
    WebElement deleteMenuButton;
    @FindBy(xpath = "//div[@class='app-btn__content' and text()=' Delete ']")
    WebElement confirmDeleteButton;

    public void clickNewExerciseButton() {
        newExerciseButton.click();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
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
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void clickTypeManualyButton() {
        typeManualyButton.click();
    }

    public void typeIntervals(String s) {
    }

    public void clickOnKey() {
        keys.click();
    }

    public void clickOnSaveButton() {
        saveIntervalButton.click();
    }

    public void clickSaveExerciseButton() {
        saveExerciseButton.click();
    }


    public boolean isExerciseSaved(String name) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        List<WebElement> list = webDriver.findElements(By.xpath("//h6"));
        if (list.size() >= 6) {
//            if (seeAllButton.isDisplayed())
//                seeAllButton.click();
            list = webDriver.findElements(By.xpath("//h6"));
        }
        System.out.println(list.size());
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
        confirmDeleteButton.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}


