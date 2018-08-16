package com.it;

import com.it.steps.CommonSteps;
import com.it.steps.HomeSteps;
import com.it.steps.LoginSteps;

public class App {
 public    CommonSteps common;
 public    HomeSteps home;
 public    LoginSteps login;

    public App() {
        common =  new CommonSteps();
        home =  new HomeSteps();
        login = new LoginSteps();
    }
}
