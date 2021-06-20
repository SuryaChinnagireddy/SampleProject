package com.samplecompany.sampleproject.balanceverify;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class BalanceStepDefinitions {
    @Steps
    BalanceSteps balanceSteps;

    @When("^the user clicks on the page$")
    public void the_user_clicks_on_the_page() {

        balanceSteps.clickPage();
    }

    @When("^get the values and total balance from the page$")
    public void get_the_values_and_total_balance_from_the_page() {
        balanceSteps.getValues();
        balanceSteps.getTotalBalance();

    }

    @Then("^verifies whether the values matches$")
    public void verifies_whether_the_values_matches() {
        balanceSteps.verifyValues();
    }


    @Then("^verify the value is greater than zero$")
    public void verify_the_value_is_greater_than_zero() {
        balanceSteps.verifyValueGreaterThanZero();
    }


}
