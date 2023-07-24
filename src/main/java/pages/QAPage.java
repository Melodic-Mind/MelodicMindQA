package pages;

import helpers.PageHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import resources.QAPageElements;

public class QAPage extends PageHelper implements QAPageElements {

    public QAPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = WHAT_MELODIC_MIND)
    WebElement whatMelodicMind;


    public boolean isElementPresent_WhatMelodicMind() {
        return isElementVisible(whatMelodicMind,5);
    }
}
