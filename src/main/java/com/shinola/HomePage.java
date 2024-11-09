package com.shinola;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    //header web elements (general page elements)
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
    //main content web elements
    @FindBy(xpath = "//div[@class='bedrock-row hp-hero']//a[@class='video-cta']")
    private WebElement circadian36ProductLink;
    @FindBy(xpath = "//div[@class='bedrock-row']/div[@class='pagebuilder-column-group']/div[1]//a[@href='https://www.shinola.com/collections/new-arrivals.html?master_product_type=Wallets~Crossbody%20Bags~Totes~Messenger%20Bags~Shoulder%20Bags~Briefcases~Backpacks~Belts~Small%20Leather%20Goods~Tote~Belt%20Bags~Duffles']")
    private WebElement fw24LeatherProductLink;
    @FindBy(xpath = "//div[@class='pagebuilder-column-group']/div[2]//a[@href='https://www.shinola.com/collection/jewelry/collections/fine-jewelry.html']")
    private WebElement fineJewelryCategoryProductLink;
    @FindBy(xpath = "//div[@class='bedrock-row']//a[@href='https://www.shinola.com/collection/watches/shop-by-model/monster-automatic.html']")
    private WebElement shinolaMonsterProductLink;
    @FindBy(xpath = "//div[@class='bedrock-row']//a[@href='https://www.shinola.com/collections/gifts/personalization.html']")
    private WebElement personalizedGiftsCategoryProductLink;
    @FindBy(xpath = "//div[@class='bedrock-row']//a[@href='https://www.shinola.com/store-locator']")
    private WebElement findAStoreLink;
    //footer web elements (general page elements)
    //customer support column
    @FindBy(xpath = "//footer/div/div[1]/div/div[1]/div[@class='block footer-content-block']/ul[@class='footer links']/li[1]")
    private WebElement customerSupportLink;
    @FindBy(xpath = "//footer/div/div[1]/div/div[1]/div[@class='block footer-content-block']/ul[@class='footer links']/li[2]")
    private WebElement trackMyOrderLink;
    @FindBy(xpath = "//footer/div/div[1]/div/div[1]/div[@class='block footer-content-block']/ul[@class='footer links']/li[3]")
    private WebElement shippingLink;
    @FindBy(xpath = "//footer/div/div[1]/div/div[1]/div[@class='block footer-content-block']/ul[@class='footer links']/li[5]")
    private WebElement repairsAndServicingLink;
    @FindBy(xpath = "//footer/div/div[1]/div/div[1]/div[@class='block footer-content-block']/ul[@class='footer links']/li[7]")
    private WebElement shinolaGuaranteeLink;
    //contact us column
    @FindBy(xpath = "//div[@class='desktop-only-contact-info']/li[2]")
    private WebElement phoneNumberLink;
    @FindBy(xpath = "//div[@class='desktop-only-contact-info']/li[3]")
    private WebElement emailLink;
    @FindBy(xpath = "//div[@class='desktop-only-contact-info']/li[5]")
    private WebElement storeLocatorLink;
    //product help column
    @FindBy(xpath = "//footer/div/div[1]/div/div[2]/div[@class='block footer-content-block']/ul[@class='footer links']/li[1]")
    private WebElement watchManualsLink;
    @FindBy(xpath = "//footer/div/div[1]/div/div[2]/div[@class='block footer-content-block']/ul[@class='footer links']/li[2]")
    private WebElement bikeManualsLink;
    @FindBy(xpath = "//footer/div/div[1]/div/div[2]/div[@class='block footer-content-block']/ul[@class='footer links']/li[3]")
    private WebElement watchRegistrationLink;
    @FindBy(xpath = "//footer/div/div[1]/div/div[2]/div[@class='block footer-content-block']/ul[@class='footer links']/li[4]")
    private WebElement bicycleRegistrationLink;
    //company column
    @FindBy(xpath = "//footer/div/div[1]/div/div[3]/div[@class='block footer-content-block']/ul[@class='footer links']/li[1]")
    private WebElement aboutUsLink;
    @FindBy(xpath = "//footer/div/div[1]/div/div[3]/div[@class='block footer-content-block']/ul[@class='footer links']/li[2]")
    private WebElement careersLink;
    @FindBy(xpath = "//footer/div/div[1]/div/div[3]/div[@class='block footer-content-block']/ul[@class='footer links']/li[3]")
    private WebElement shinolaHotelLink;
    @FindBy(xpath = "//footer/div/div[1]/div/div[3]/div[@class='block footer-content-block']/ul[@class='footer links']/li[4]")
    private WebElement corporateSalesLink;
    @FindBy(xpath = "//footer/div/div[1]/div/div[3]/div[@class='block footer-content-block']/ul[@class='footer links']/li[5]")
    private WebElement affiliateProgramLink;
    @FindBy(xpath = "//footer/div/div[1]/div/div[3]/div[@class='block footer-content-block']/ul[@class='footer links']/li[6]")
    private WebElement supplierComplianceLink;
    @FindBy(xpath = "//footer/div/div[1]/div/div[3]/div[@class='block footer-content-block']/ul[@class='footer links']/li[7]")
    private WebElement ourStoresLink;
    //stay connected column
    @FindBy(xpath = "//footer//button[@title='Subscribe']")
    private WebElement subscribeButton;
    @FindBy(xpath = "//footer//a[@type='button']")
    private WebElement changeLocationLink;
    //social links
    @FindBy(xpath = "//footer//ul[@class='footer links social']/li[1]")
    private WebElement instagramIconButton;
    @FindBy(xpath = "//footer//ul[@class='footer links social']/li[2]")
    private WebElement twitterIconButton;
    @FindBy(xpath = "//footer//ul[@class='footer links social']/li[3]")
    private WebElement facebookIconButton;
    //bottom footer links
    @FindBy(xpath = "//footer//ul[@class='footer links terms']/li[1]")
    private WebElement privacyPolicyLink;
    @FindBy(xpath = "//footer//ul[@class='footer links terms']/li[2]")
    private WebElement termsAndConditionsLink;
    @FindBy(xpath = "//footer//ul[@class='footer links terms']/li[3]")
    private WebElement accessibilityStatementsLink;
    @FindBy(xpath = "//footer//ul[@class='footer links terms']/li[4]")
    private WebElement siteMapLink;
    @FindBy(xpath = "//footer//ul[@class='footer links terms']/li[5]")
    private WebElement informationConfidentialityLink;

    //accept cookies button web element
    @FindBy(xpath = "//div[@class='CybotCookiebotDialogContentWrapper']//div[@id='CybotCookiebotDialogBodyButtons']//button[@id='CybotCookiebotDialogBodyButtonAccept']")
    private WebElement acceptCookiesButton;
    //continue to shop modal button web element
    @FindBy(xpath = "//div[@class='gePopupsContainer ltr en-GB']//div[@class='glPopupContent']//input[@type='button']")
    private WebElement continueToShopButton;

    public HomePage(WebDriver driver) {super(driver);}

    //click 'Circadian 36 Automatic' product link method
    public void clickCircadian36AutomaticProductLink(){circadian36ProductLink.click();}

    //accept cookies button click method
    public void clickAcceptCookiesButton() {acceptCookiesButton.click();}
    //continue to shop button click method
    public void clickContinueToShopButton() {continueToShopButton.click();}

    //homepage web element assert methods
    //general page web elements
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
    public boolean isFooterCustomerSupportLinkDisplayed(){return customerSupportLink.isDisplayed();}
    public boolean isFooterTrackMyOrderLinkDisplayed(){return trackMyOrderLink.isDisplayed();}
    public boolean isFooterShippingLinkDisplayed(){return shippingLink.isDisplayed();}
    public boolean isFooterRepairsAndServicingLinkDisplayed(){return repairsAndServicingLink.isDisplayed();}
    public boolean isFooterShinolaGuaranteeLinkDisplayed(){return shinolaGuaranteeLink.isDisplayed();}
    public boolean isFooterPhoneNumberLinkDisplayed(){return phoneNumberLink.isDisplayed();}
    public boolean isFooterEmailLinkDisplayed(){return emailLink.isDisplayed();}
    public boolean isFooterStoreLocatorLinkDisplayed(){return storeLocatorLink.isDisplayed();}
    public boolean isFooterWatchManualsLinkDisplayed(){return watchManualsLink.isDisplayed();}
    public boolean isFooterBikeManualsLinkDisplayed(){return bikeManualsLink.isDisplayed();}
    public boolean isFooterWatchRegistrationLinkDisplayed(){return watchRegistrationLink.isDisplayed();}
    public boolean isFooterBicycleRegistrationLinkDisplayed(){return bicycleRegistrationLink.isDisplayed();}
    public boolean isFooterAboutUsLinkDisplayed(){return aboutUsLink.isDisplayed();}
    public boolean isFooterCareersLinkDisplayed(){return careersLink.isDisplayed();}
    public boolean isFooterShinolaHotelLinkDisplayed(){return shinolaHotelLink.isDisplayed();}
    public boolean isFooterCorporateSalesLinkDisplayed(){return corporateSalesLink.isDisplayed();}
    public boolean isFooterAffiliateProgramLinkDisplayed(){return affiliateProgramLink.isDisplayed();}
    public boolean isFooterSupplierComplianceLinkDisplayed(){return supplierComplianceLink.isDisplayed();}
    public boolean isFooterOurStoresLinkDisplayed(){return ourStoresLink.isDisplayed();}
    public boolean isFooterSubscribeButtonDisplayed(){return subscribeButton.isDisplayed();}
    public boolean isFooterChangeLocationLinkDisplayed(){return changeLocationLink.isDisplayed();}
    public boolean isFooterInstagramIconButtonDisplayed(){return instagramIconButton.isDisplayed();}
    public boolean isFooterTwitterIconButtonDisplayed(){return twitterIconButton.isDisplayed();}
    public boolean isFooterFacebookIconButtonDisplayed(){return facebookIconButton.isDisplayed();}
    public boolean isFooterPrivacyPolicyLinkDisplayed(){return privacyPolicyLink.isDisplayed();}
    public boolean isFooterTermsAndConditionsLinkDisplayed(){return termsAndConditionsLink.isDisplayed();}
    public boolean isFooterAccessibilityStatementsLinkDisplayed(){return accessibilityStatementsLink.isDisplayed();}
    public boolean isFooterSiteMapLinkDisplayed(){return siteMapLink.isDisplayed();}
    public boolean isFooterInformationConfidentialityLinkDisplayed(){return informationConfidentialityLink.isDisplayed();}
    //homepage main content web element assert methods
    public boolean isMainContentCircadian36ProductLinkDisplayed(){return circadian36ProductLink.isDisplayed();}
    public boolean isMainContentFw24LeatherProductsLinkDisplayed(){return fw24LeatherProductLink.isDisplayed();}
    public boolean isMainContentFineJewelryProductsLinkDisplayed(){return fineJewelryCategoryProductLink.isDisplayed();}
    public boolean isMainContentShinolaMonsterProductLinkDisplayed(){return shinolaMonsterProductLink.isDisplayed();}
    public boolean isMainContentPersonalizedGiftsLinkDisplayed(){return personalizedGiftsCategoryProductLink.isDisplayed();}
    public boolean isMainContentFindAStoreLinkDisplayed(){return findAStoreLink.isDisplayed();}
}
