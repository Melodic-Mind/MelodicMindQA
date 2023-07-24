package tests.alexmed;

import lombok.ToString;
import models.UserModel;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import tests.TestBase;

public class FunctionalTests extends TestBase {

    @Test
    public void openPageTheStory(){
        Assert.assertTrue(new HomePage(driver)
                .clickButtonCookiesIUnderstand()
                .clickDropDownField_TheStory()
                .isElementPresent_buttonBackToHome());
    }

    @Test
    public void openPageLearn(){
        Assert.assertTrue(new HomePage(driver)
                .clickButtonCookiesIUnderstand()
                .clickDropDownField_Learn()
                .isElementPresent_buttonWhatMusicTheory());
    }

    @Test
    public void openPageBlog(){
        Assert.assertTrue(new HomePage(driver)
                .clickButtonCookiesIUnderstand()
                .clickDropDownField_Blog()
                .isElementPresent_MelodicMindBlog());
    }

    @Test
    public void openPageContact(){
        Assert.assertTrue(new HomePage(driver)
                .clickButtonCookiesIUnderstand()
                .clickDropDownField_Contact()
                .isElementPresent_buttonEmail());
    }

    @Test
    public void openPageQA(){
        Assert.assertTrue(new HomePage(driver)
                .clickButtonCookiesIUnderstand()
                .clickDropDownField_QA()
                .isElementPresent_WhatMelodicMind());
    }

    @Test
    public void openPageProfile(){ //not profile LOGIN!!
        UserModel user = UserModel.builder()
                .email("alexmedqwerty@gmail.com")
                .password("zxc12345")
                .build();
        Assert.assertTrue(new HomePage(driver)
                .clickButtonCookiesIUnderstand()
                .clickDropdownField_Login()
                .clickButtonContinueWithEmail()
                .typeLoginForm(user)
                .clickDropDownField_Profile()
                .isElementPresent_DeleteAccount());
    }


}
