package com.shinola;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

import java.util.*;

public class SingleProductDashboardPage extends BasePage{

    //single product dashboard page web elements
    @FindBy(xpath = "//div[@data-pb-style='MYRDHRD']//h2")
    private WebElement modelName;
    @FindBy(xpath = "//div[@data-pb-style='MYRDHRD']//p")
    private WebElement modelDescription;
    //main content web elements
    @FindBy(xpath = "//div[@id='algolia_instant_selector']//div[@class='pull-right']/button")
    private WebElement filterAsideMenuButton;
    @FindBy(xpath = "//div[@id='algolia_instant_selector']//div[@class='pull-right']//select")
    private WebElement sortByDropdownMenu;
    //single product dashboard page list web elements
    private List<WebElement> productNameLinkElements = driver.findElements(By.xpath("//a[@class='product']"));
    @FindBy(xpath = "//p[@class='product-attribute product-color']")
    private List<WebElement> productColorElements;
    @FindBy(xpath = "//div[@class='price-wrapper']//span")
    private List<WebElement> productPriceTagElements;
    @FindBy(xpath = "//p[@class='product-badge product-badge-new-arrival']")
    private List<WebElement> productBadgeElements;
    //single product dashboard page footer web elements
    private List<WebElement> footerLinkElements = driver.findElements(By.xpath("//footer//ul[@role='region']/li"));

    public SingleProductDashboardPage(WebDriver driver) {super(driver);}

    //single product model name getter
    public String getModelName(){return modelName.getText();}
    //single product model description getter
    public String getModelDescription(){return modelDescription.getText();}

    //single product dashboard page web element assert methods
    public boolean isModelNameDisplayed(){return modelName.isDisplayed();}
    public boolean isModelDescriptionDisplayed(){return modelDescription.isDisplayed();}
    public boolean isFilterAsideMenuButtonDisplayed(){return filterAsideMenuButton.isDisplayed();}
    public boolean isSortByDropdownMenuDisplayed(){return sortByDropdownMenu.isDisplayed();}

    public boolean isProductNameLinkDisplayed() {
        for (WebElement element : productNameLinkElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isProductColorDisplayed() {
        for (WebElement element : productColorElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isProductPriceTagDisplayed() {
        for (WebElement element : productPriceTagElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isProductBadgeElementDisplayed() {
        for (WebElement element : productBadgeElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isFooterLinkDisplayed() {
        for (WebElement element : footerLinkElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
}
