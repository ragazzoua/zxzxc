package com.it.tests;

import com.it.App;
import com.it.utils.User;
import com.it.utils.UserFactory;
import org.testng.annotations.AfterSuite;

public class BaseTest {
    static App app = new App();
    static User validUser= UserFactory.getValidUser();

    @AfterSuite
    public void tearDown() throws Exception {
        app.common.closeApp();
    }
}
