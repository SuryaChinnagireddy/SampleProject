package com.samplecompany.SampleRunners;


import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(
        features = ("classpath:com/samplecompany/sampleproject"),
        glue = ("classpath:com/samplecompany/sampleproject"),
        tags = ("@BalanceVerify")
)


public class SampleRunner {

}

