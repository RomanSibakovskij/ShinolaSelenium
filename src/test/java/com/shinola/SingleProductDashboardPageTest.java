package com.shinola;

import org.junit.jupiter.api.*;

public class SingleProductDashboardPageTest extends TestMethods{

    //Test 001a -> add 'Circadian 36' watches to shopping cart test (as a guest)
    @Test
    @DisplayName("Add 'Circadian 36' Products (watches) to Shopping Cart (as a guest)")
    @Tag("Add-Circadian_36_To_Cart_As_A_Guest")
    void addCircadian36ProductsToCartAsGuestTest(){
        HomePage homePage = new HomePage(driver);
        //navigate to 'Circadian 36' product dashboard page test method
        navigateToCircadian36ProductDashboardPageTestNoRegister(homePage);
        SingleProductDashboardPage singleProductDashboardPage = new SingleProductDashboardPage(driver);
        //add to cart test method
        addCircadian36MonsterToCartTest(singleProductDashboardPage);
    }

}
