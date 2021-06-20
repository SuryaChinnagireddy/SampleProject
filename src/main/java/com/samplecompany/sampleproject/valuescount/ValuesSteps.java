package com.samplecompany.sampleproject.valuescount;

import com.samplecompany.sampleproject.balanceverify.BalancePage;
import net.thucydides.core.annotations.Managed;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ValuesSteps {

    @Managed
    WebDriver driver;

    @Page
    BalancePage balancePage;

    public void countValues() {
        Assert.assertEquals("The count of values does not match",
                balancePage.labelList.size(), balancePage.valueList.size());

    }
}
