package com.shinola;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class SingleProductDashboardPage extends BasePage{

    //single product dashboard page web elements
    @FindBy(xpath = "//div[@data-pb-style='MYRDHRD']//h2")
    private WebElement modelName;
    @FindBy(xpath = "//div[@data-pb-style='MYRDHRD']//p")
    private WebElement modelDescription;

    public SingleProductDashboardPage(WebDriver driver) {super(driver);}

    //single product model name getter
    public String getModelName(){return modelName.getText();}
    //single product model description getter
    public String getModelDescription(){return modelDescription.getText();}

    //single product dashboard page web element assert method
    public boolean isModelNameDisplayed(){return modelName.isDisplayed();}
    public boolean isModelDescriptionDisplayed(){return modelDescription.isDisplayed();}
}
