package com.it.tests;

import com.it.utils.UserFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest extends BaseTest {
    @Test
    public void testMyTest() throws Exception {
        app.login.login(validUser.getLogin(),validUser.getPassword());
        UserFactory.getValidUsers(10)
                .forEach(System.out::println);

        String email = app.home.getLabelUserEmail();
        Assert.assertEquals(email,validUser.getEmail());

    }
}
