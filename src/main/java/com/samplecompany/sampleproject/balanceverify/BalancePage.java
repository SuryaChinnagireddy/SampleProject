package com.samplecompany.sampleproject.balanceverify;

import com.samplecompany.sampleproject.basefunctions.BasePage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BalancePage extends BasePage {

    @Managed
    WebDriver driver;


    @FindBy(id = "balancePage")
    public
    WebElementFacade balancePage;

    @FindBy(id = "lbl_val_1")
    public
    WebElementFacade labelValue1;

    @FindBy(id = "lbl_val_2")
    public
    WebElementFacade labelValue2;

    @FindBy(id = "lbl_val_3")
    public
    WebElementFacade labelValue3;

    @FindBy(id = "lbl_val_4")
    public
    WebElementFacade labelValue4;

    @FindBy(id = "lbl_val_5")
    public
    WebElementFacade labelValue5;

    @FindBy(id = "txt_val_1")
    public
    WebElementFacade textValue1;

    @FindBy(id = "txt_val_2")
    public
    WebElementFacade textValue2;

    @FindBy(id = "txt_val_3")
    public
    WebElementFacade textValue3;

    @FindBy(id = "txt_val_4")
    public
    WebElementFacade textValue4;

    @FindBy(id = "txt_val_5")
    public
    WebElementFacade textValue5;

    @FindBy(id = "txt_val_6")
    public
    WebElementFacade textValue6;

    @FindBy(id = "txt_ttl_val")
    public
    WebElementFacade textTotalValue;

    @FindBy(xpath = "//*[contains(@id,'lbl_val')]")
    public
    List<WebElementFacade> labelList;

    @FindBy(xpath = "//*[contains(@id,'txt_val')]")
    public
    List<WebElementFacade> valueList;


}
