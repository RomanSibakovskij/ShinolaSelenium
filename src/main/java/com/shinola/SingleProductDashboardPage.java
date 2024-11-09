package com.shinola;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class SingleProductDashboardPage extends BasePage{

    //single product dashboard page web elements
    @FindBy(xpath = "//div[@data-pb-style='MYRDHRD']//h2")
    private WebElement productName;

    public SingleProductDashboardPage(WebDriver driver) {super(driver);}

    //single product name getter
    public String getProductName(){return productName.getText();}

    //single product dashboard page web element assert method
    public boolean isProductNameDisplayed(){return productName.isDisplayed();}

}
