package com.shinola;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    //header web elements
    @FindBy(xpath = "//div[@class='shinola-header--promotion']//div[@data-content-type='html'][2]")
    private WebElement codeCouponText;
    @FindBy(xpath = "//div[@class='shinola-header--fixed-left']/a")
    private WebElement shinolaHomepageLogo;
    @FindBy(xpath = "//div[@id='navigation--menu']/div[1]")
    private WebElement shinolaWatchesLink;
    @FindBy(xpath = "//div[@id='navigation--menu']/div[2]")
    private WebElement shinolaLeatherAndBagsLink;
    @FindBy(xpath = "//div[@id='navigation--menu']/div[3]")
    private WebElement shinolaJewelryLink;
    @FindBy(xpath = "//div[@id='navigation--menu']/div[4]")
    private WebElement shinolaLifestyleLink;
    @FindBy(xpath = "//div[@id='navigation--menu']/div[5]")
    private WebElement shinolaHolidayGiftsLink;
    @FindBy(xpath = "//div[@id='navigation--menu']/div[6]")
    private WebElement shinolaOutletLink;
    @FindBy(xpath = "//div[@class='shinola-header--fixed-right']/button")
    private WebElement headerSearchButton;
    @FindBy(xpath = "//div[@class='shinola-header--fixed-right']/div/a[@class='user']")
    private WebElement headerSignInRegisterButton;
    @FindBy(xpath = "//div[@data-block='minicart']/a")
    private WebElement headerShoppingCartButton;

    public HomePage(WebDriver driver) {super(driver);}

    

}
