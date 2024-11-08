package com.shinola;

import org.slf4j.*;
import static org.junit.jupiter.api.Assertions.*;

public class TestMethods extends BaseTest{

    protected static final Logger logger = LoggerFactory.getLogger(TestMethods.class);

    //navigate to 'Circadian 36 Automatic' page test method
    protected void navigateToCircadian36ProductPageTestNoRegister(HomePage homePage){
        //click 'accept cookies' button
        homePage.clickAcceptCookiesButton();
        //continue to shop modal button click
        homePage.clickContinueToShopButton();
        //general web element assert
        isGeneralPageWebElementDisplayed(homePage);
    }

    //general page web element assert (header/footer)
    protected void isGeneralPageWebElementDisplayed(HomePage homePage){
        //header web elements

        //assert code coupon is displayed
        assertTrue(homePage.isCodeCouponDisplayed(), "The code coupon isn't displayed");
        //assert Shinola homepage logo is displayed
        assertTrue(homePage.isShinolaHomepageLogoDisplayed(), "The Shinola homepage logo isn't displayed");
        //assert Shinola watches link is displayed
        assertTrue(homePage.isShinolaWatchesLinkHeaderDisplayed(), "The Shinola watches header link isn't displayed");
        //assert Shinola leather and bags link is displayed
        assertTrue(homePage.isShinolaLeatherAndBagsHeaderLinkDisplayed(), "The Shinola leather and bags header link isn't displayed");
        //assert Shinola jewelry link is displayed
        assertTrue(homePage.isShinolaJewelryHeaderLinkDisplayed(), "The Shinola jewelry header link isn't displayed");
        //assert Shinola lifestyle link is displayed
        assertTrue(homePage.isShinolaLifestyleHeaderLinkDisplayed(), "The Shinola lifestyle header link isn't displayed");
        //assert Shinola holiday gifts link is displayed
        assertTrue(homePage.isShinolaHolidayGiftsHeaderLinkDisplayed(), "The Shinola holiday gifts header link isn't displayed");
        //assert Shinola outlet link is displayed
        assertTrue(homePage.isShinolaOutletHeaderLinkDisplayed(), "The Shinola outlet header link isn't displayed");
        //assert header search button is displayed
        assertTrue(homePage.isHeaderSearchButtonDisplayed(), "The header search button isn't displayed");
        //assert header sign-in/register button is displayed
        assertTrue(homePage.isHeaderSignInRegisterButtonDisplayed(), "The header sign-in/register button isn't displayed");
        //assert header shopping cart button is displayed
        assertTrue(homePage.isHeaderShoppingCartButtonDisplayed(), "The header shopping cart button isn't displayed");
    }

}
