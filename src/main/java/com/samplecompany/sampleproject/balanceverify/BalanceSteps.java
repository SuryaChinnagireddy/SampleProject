package com.samplecompany.sampleproject.balanceverify;

import net.thucydides.core.annotations.Managed;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;


public class BalanceSteps {

    @Managed
    WebDriver driver;

    public double value1 = 0.00;
    public double value2 = 0.00;
    public double value3 = 0.00;
    public double value4 = 0.00;
    public double value5 = 0.00;
    public double value6 = 0.00;
    public double totalBalance = 0.00;

    @Page
    BalancePage balancePage;

    public void clickPage() {
        balancePage.balancePage.click();
    }

    public void getValues() {
        value1 = Double.parseDouble(balancePage.textValue1.getValue());
        value2 = Double.parseDouble(balancePage.textValue2.getValue());
        value4 = Double.parseDouble(balancePage.textValue4.getValue());
        value5 = Double.parseDouble(balancePage.textValue5.getValue());
        value6 = Double.parseDouble(balancePage.textValue6.getValue());
    }

    public void getTotalBalance() {
        totalBalance = Double.parseDouble(balancePage.textTotalValue.getValue());
    }

    public void verifyValues() {
        double totalCalaculatedValue = value1 + value2 + value4 + value5 + value6;
        System.out.println("The total calculated amount from all is " + totalCalaculatedValue);
        System.out.println("The total balance from the page is " + totalBalance);
        Assert.assertEquals("The calculated value and the total balance from page are not equal ", totalCalaculatedValue, totalBalance, 0.0);
    }

    public void verifyValueGreaterThanZero() {
        value1 = Double.parseDouble(balancePage.textValue1.getValue());
        isValueGreaterThanZero(value1);
        value2 = Double.parseDouble(balancePage.textValue2.getValue());
        isValueGreaterThanZero(value2);
        value3 = Double.parseDouble(balancePage.textValue3.getValue());
        isValueGreaterThanZero(value3);
        value4 = Double.parseDouble(balancePage.textValue4.getValue());
        isValueGreaterThanZero(value4);
        value5 = Double.parseDouble(balancePage.textValue5.getValue());
        isValueGreaterThanZero(value5);
        value6 = Double.parseDouble(balancePage.textValue6.getValue());
        isValueGreaterThanZero(value6);
    }

    private void isValueGreaterThanZero(double value) {
        Assert.assertTrue("The value " + value + " is not greater than zero", value > 0.00);

    }


}
