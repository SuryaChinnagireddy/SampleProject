package com.samplecompany.sampleproject.basefunctions;

import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;

public class BaseStepDefinitions {



    @Steps
    BaseSteps baseSteps;

    @Given("^the user is logged into the application$")
    public void the_user_is_logged_into_the_application() {
        baseSteps.login();
    }


}
