package com.shinola;

import org.slf4j.*;
import static org.junit.jupiter.api.Assertions.*;

public class TestMethods extends BaseTest{

    protected static final Logger logger = LoggerFactory.getLogger(TestMethods.class);

    //navigate to 'Circadian 36 Automatic' page test method
    protected void navigateToCircadian36ProductDashboardPageTestNoRegister(HomePage homePage){
        //click 'accept cookies' button
        homePage.clickAcceptCookiesButton();
        //continue to shop modal button click
        homePage.clickContinueToShopButton();
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
        //homepage main content web element assert
        isHomePageMainContentDisplayed(homePage);
        //click 'Circadian 36 Automatic' product link
        homePage.clickCircadian36AutomaticProductLink();
        SingleProductDashboardPage singleProductDashboardPage = new SingleProductDashboardPage(driver);
        //assert the user gets on the right page
        assertEquals("CIRCADIAN 36", singleProductDashboardPage.getModelName(), "The product name doesn't match expectations or the user is on the wrong page.");
    }

    //homepage main content web element assert test method
    protected void isHomePageMainContentDisplayed(HomePage homePage){
        //assert 'Circadian 36 Automatic' product link is displayed
        assertTrue(homePage.isMainContentCircadian36ProductLinkDisplayed(), "The 'Circadian 36 Automatic' product link isn't displayed");
        //assert 'Fw'24 Leather' products link is displayed
        assertTrue(homePage.isMainContentFw24LeatherProductsLinkDisplayed(), "The 'Fw'24 Leather' products link isn't displayed");
        //assert 'Fine Jewelry' products link is displayed
        assertTrue(homePage.isMainContentFineJewelryProductsLinkDisplayed(), "The 'Fine Jewelry' products link isn't displayed");
        //assert 'Shinola Monster' product link is displayed
        assertTrue(homePage.isMainContentShinolaMonsterProductLinkDisplayed(), "The 'Shinola Monster' product link isn't displayed");
        //assert 'Personalized gifts' products link is displayed
        assertTrue(homePage.isMainContentPersonalizedGiftsLinkDisplayed(), "The 'Personalized gifts' products link isn't displayed");
        //assert 'Find a store' link is displayed
        assertTrue(homePage.isMainContentFindAStoreLinkDisplayed(), "The 'Find a store' link isn't displayed");
    }

    //single product dashboard page web element assert test method
    protected void isSingleProductDashboardPageWebElementDisplayed(SingleProductDashboardPage singleProductDashboardPage){
        //assert product model name is displayed
        assertTrue(singleProductDashboardPage.isModelNameDisplayed(), "The product model name isn't displayed");
        //assert product model description is displayed
        assertTrue(singleProductDashboardPage.isModelDescriptionDisplayed(), "The product model description isn't displayed");
        //assert product filter aside menu button is displayed
        assertTrue(singleProductDashboardPage.isFilterAsideMenuButtonDisplayed(), "The product filter aside menu button isn't displayed");
        //assert product sort by dropdown menu is displayed
        assertTrue(singleProductDashboardPage.isSortByDropdownMenuDisplayed(), "The product sort by dropdown menu isn't displayed");
        //assert product name links are displayed (as element list)
        assertTrue(singleProductDashboardPage.isProductNameLinkDisplayed(), "The product name links aren't displayed");
        //assert product colors are displayed (as element list)
        assertTrue(singleProductDashboardPage.isProductColorDisplayed(), "The product colors aren't displayed");
        //assert product price tags are displayed (as element list)
        assertTrue(singleProductDashboardPage.isProductPriceTagDisplayed(), "The product price tags aren't displayed");
        //assert product badge elements are displayed (as element list)
        assertTrue(singleProductDashboardPage.isProductBadgeElementDisplayed(), "The product badge elements aren't displayed");
        //assert footer links are displayed (as element list)
        assertTrue(singleProductDashboardPage.isFooterLinkDisplayed(), "The footer links aren't displayed");
    }

    //general page web element assert (header/footer) test method
    protected void isGeneralPageWebElementDisplayed(HomePage homePage){
        //header web elements

        //assert code coupon is displayed
        assertTrue(homePage.isCodeCouponDisplayed(), "The code coupon isn't displayed");
        //assert Shinola homepage logo is displayed
        assertTrue(homePage.isShinolaHomepageLogoDisplayed(), "The Shinola homepage logo isn't displayed");
        //assert 'Shinola watches' link is displayed
        assertTrue(homePage.isShinolaWatchesLinkHeaderDisplayed(), "The 'Shinola watches' header link isn't displayed");
        //assert 'Shinola leather and bags' link is displayed
        assertTrue(homePage.isShinolaLeatherAndBagsHeaderLinkDisplayed(), "The 'Shinola leather and bags' header link isn't displayed");
        //assert 'Shinola jewelry' link is displayed
        assertTrue(homePage.isShinolaJewelryHeaderLinkDisplayed(), "The 'Shinola jewelry' header link isn't displayed");
        //assert 'Shinola lifestyle' link is displayed
        assertTrue(homePage.isShinolaLifestyleHeaderLinkDisplayed(), "The 'Shinola lifestyle' header link isn't displayed");
        //assert 'Shinola holiday gifts' link is displayed
        assertTrue(homePage.isShinolaHolidayGiftsHeaderLinkDisplayed(), "The 'Shinola holiday gifts' header link isn't displayed");
        //assert 'Shinola outlet' link is displayed
        assertTrue(homePage.isShinolaOutletHeaderLinkDisplayed(), "The 'Shinola outlet' header link isn't displayed");
        //assert header 'search' button is displayed
        assertTrue(homePage.isHeaderSearchButtonDisplayed(), "The header 'search' button isn't displayed");
        //assert header 'sign-in/register' button is displayed
        assertTrue(homePage.isHeaderSignInRegisterButtonDisplayed(), "The header 'sign-in/register' button isn't displayed");
        //assert header 'shopping cart' button is displayed
        assertTrue(homePage.isHeaderShoppingCartButtonDisplayed(), "The header 'shopping cart' button isn't displayed");

        //footer elements

        //assert footer 'customer support' link is displayed
        assertTrue(homePage.isFooterCustomerSupportLinkDisplayed(), "The footer 'customer support' link isn't displayed");
        //assert footer 'track my order' link is displayed
        assertTrue(homePage.isFooterTrackMyOrderLinkDisplayed(), "The footer 'track my order' link isn't displayed");
        //assert footer 'shipping' link is displayed
        assertTrue(homePage.isFooterShippingLinkDisplayed(), "The footer 'shipping' link isn't displayed");
        //assert footer 'repairs and servicing' link is displayed
        assertTrue(homePage.isFooterRepairsAndServicingLinkDisplayed(), "The footer 'repairs and servicing' link isn't displayed");
        //assert footer 'Shinola guarantee' link is displayed
        assertTrue(homePage.isFooterShinolaGuaranteeLinkDisplayed(), "The footer 'Shinola guarantee' link isn't displayed");
        //assert footer 'phone number' link is displayed
        assertTrue(homePage.isFooterPhoneNumberLinkDisplayed(), "The footer 'phone number' link isn't displayed");
        //assert footer 'email' link is displayed
        assertTrue(homePage.isFooterEmailLinkDisplayed(), "The footer 'email' link isn't displayed");
        //assert footer 'store locator' link is displayed
        assertTrue(homePage.isFooterStoreLocatorLinkDisplayed(), "The footer 'store locator' link isn't displayed");
        //assert footer 'watch manuals' link is displayed
        assertTrue(homePage.isFooterWatchManualsLinkDisplayed(), "The footer 'watch manuals' link isn't displayed");
        //assert footer 'bike manuals' link is displayed
        assertTrue(homePage.isFooterBikeManualsLinkDisplayed(), "The footer 'bike manuals' link isn't displayed");
        //assert footer 'watch registration' link is displayed
        assertTrue(homePage.isFooterWatchRegistrationLinkDisplayed(), "The footer 'watch registration' link isn't displayed");
        //assert footer 'bicycle registration' link is displayed
        assertTrue(homePage.isFooterBicycleRegistrationLinkDisplayed(), "The footer 'bicycle registration' link isn't displayed");
        //assert footer 'about us' link is displayed
        assertTrue(homePage.isFooterAboutUsLinkDisplayed(), "The footer 'about us' link isn't displayed");
        //assert footer 'careers' link is displayed
        assertTrue(homePage.isFooterCareersLinkDisplayed(), "The footer 'careers' link isn't displayed");
        //assert footer 'Shinola hotel' link is displayed
        assertTrue(homePage.isFooterShinolaHotelLinkDisplayed(), "The footer 'Shinola hotel' link isn't displayed");
        //assert footer 'corporate sales' link is displayed
        assertTrue(homePage.isFooterCorporateSalesLinkDisplayed(), "The footer 'corporate link' link isn't displayed");
        //assert footer 'affiliate program' link is displayed
        assertTrue(homePage.isFooterAffiliateProgramLinkDisplayed(), "The footer 'affiliate program' link isn't displayed");
        //assert footer 'supplier compliance' link is displayed
        assertTrue(homePage.isFooterSupplierComplianceLinkDisplayed(), "The footer 'supplier compliance' link isn't displayed");
        //assert footer 'our stores' link is displayed
        assertTrue(homePage.isFooterOurStoresLinkDisplayed(), "The footer 'our stores' link isn't displayed");
        //assert footer 'subscribe button' link is displayed
        assertTrue(homePage.isFooterSubscribeButtonDisplayed(), "The footer 'subscribe button' link isn't displayed");
        //assert footer 'change location' link is displayed
        assertTrue(homePage.isFooterChangeLocationLinkDisplayed(), "The footer 'change location' link isn't displayed");
        //assert footer 'Instagram' icon button is displayed
        assertTrue(homePage.isFooterInstagramIconButtonDisplayed(), "The footer 'Instagram' icon button isn't displayed");
        //assert footer 'Twitter' icon button is displayed
        assertTrue(homePage.isFooterTwitterIconButtonDisplayed(), "The footer 'Twitter' icon button isn't displayed");
        //assert footer 'Facebook' icon button is displayed
        assertTrue(homePage.isFooterFacebookIconButtonDisplayed(), "The footer 'Facebook' icon button isn't displayed");
        //assert footer 'privacy policy' link is displayed
        assertTrue(homePage.isFooterPrivacyPolicyLinkDisplayed(), "The footer 'privacy policy' link isn't displayed");
        //assert footer 'terms and conditions' link is displayed
        assertTrue(homePage.isFooterTermsAndConditionsLinkDisplayed(), "The footer 'terms and conditions' link isn't displayed");
        //assert footer 'accessibility statements' link is displayed
        assertTrue(homePage.isFooterAccessibilityStatementsLinkDisplayed(), "The footer 'accessibility statements' link isn't displayed");
        //assert footer 'site map' link is displayed
        assertTrue(homePage.isFooterSiteMapLinkDisplayed(), "The footer 'site map' link isn't displayed");
        //assert footer 'information confidentiality' link is displayed
        assertTrue(homePage.isFooterInformationConfidentialityLinkDisplayed(), "The footer 'information confidentiality' link isn't displayed");
    }

}
