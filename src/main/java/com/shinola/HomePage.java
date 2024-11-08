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

    //accept cookies button web element
    @FindBy(xpath = "//div[@class='CybotCookiebotDialogContentWrapper']//div[@id='CybotCookiebotDialogBodyButtons']//button[@id='CybotCookiebotDialogBodyButtonAccept']")
    private WebElement acceptCookiesButton;
    //continue to shop modal button web element
    @FindBy(xpath = "//div[@class='gePopupsContainer ltr en-GB']//div[@class='glPopupContent']//input[@type='button']")
    private WebElement continueToShopButton;

    public HomePage(WebDriver driver) {super(driver);}

    //accept cookies button click method
    public void clickAcceptCookiesButton() {acceptCookiesButton.click();}
    //continue to shop button click method
    public void clickContinueToShopButton() {continueToShopButton.click();}

    //homepage web element assert methods
    public boolean isCodeCouponDisplayed(){return codeCouponText.isDisplayed();}
    public boolean isShinolaHomepageLogoDisplayed(){return shinolaHomepageLogo.isDisplayed();}
    public boolean isShinolaWatchesLinkHeaderDisplayed(){return shinolaWatchesLink.isDisplayed();}
    public boolean isShinolaLeatherAndBagsHeaderLinkDisplayed(){return shinolaLeatherAndBagsLink.isDisplayed();}
    public boolean isShinolaJewelryHeaderLinkDisplayed(){return shinolaJewelryLink.isDisplayed();}
    public boolean isShinolaLifestyleHeaderLinkDisplayed(){return shinolaLifestyleLink.isDisplayed();}
    public boolean isShinolaHolidayGiftsHeaderLinkDisplayed(){return shinolaHolidayGiftsLink.isDisplayed();}
    public boolean isShinolaOutletHeaderLinkDisplayed(){return shinolaOutletLink.isDisplayed();}
    public boolean isHeaderSearchButtonDisplayed(){return headerSearchButton.isDisplayed();}
    public boolean isHeaderSignInRegisterButtonDisplayed(){return headerSignInRegisterButton.isDisplayed();}
    public boolean isHeaderShoppingCartButtonDisplayed(){return headerShoppingCartButton.isDisplayed();}

}
