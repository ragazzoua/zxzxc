package com.it.steps;

import com.it.pages.BasePage;

public class CommonSteps extends BasePage {

    public void  closeApp() {
        driver.quit();
    }

}
