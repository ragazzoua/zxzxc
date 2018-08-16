package com.it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//input[@name='login']")
    private WebElement inputLogin;

    @FindBy(xpath = "//input[@name='pass']")
    private WebElement inputPassword;

    @FindBy(xpath = "//form[@name='lform']//input[@type='submit']")
    private WebElement btnSubmit;



    public void login (String name,String password) {
        System.out.println(driver.getWindowHandles());
        System.out.println(driver.getWindowHandle());
        inputLogin.sendKeys(name);
        inputPassword.sendKeys(password);
        btnSubmit.click();
    }


}
