package com.samplecompany.sampleproject.valuescount;

import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class ValuesStepDefinitions {

    @Steps
    ValuesSteps valuesSteps;


    @Then("^verifies the total count oif values$")
    public void verifies_the_total_count_oif_values() {
      valuesSteps.countValues();
    }



}
