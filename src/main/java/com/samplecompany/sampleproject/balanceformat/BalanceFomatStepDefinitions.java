package com.samplecompany.sampleproject.balanceformat;

import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class BalanceFomatStepDefinitions {

    @Steps
    BalanceFormatSteps balanceFormatSteps;

    @Then("^verify the format of the balance$")
    public void verify_the_format_of_the_balance() {
        balanceFormatSteps.verifyBalanceFormat();
    }

}
