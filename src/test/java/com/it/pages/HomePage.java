package com.it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage  extends BasePage{

    @FindBy(xpath = "//div[@class='section_nav']//li[1]")
    private WebElement labelUserEmail;



    public String getLabelUserEmail() {
        return labelUserEmail.getText();
    }
}
