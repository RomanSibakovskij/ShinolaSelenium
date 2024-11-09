package com.shinola;

import org.junit.jupiter.api.*;

public class HomePageTest extends TestMethods{

    //Test 001 -> navigate to Circadian 36 Automatic' product dashboard page test method (as a guest)
    @Test
    @DisplayName("Navigate To 'Circadian 36 Automatic' Product Dashboard Page (as a guest)")
    void navigateToCircadian36ProductDashboardPageNoRegisterTest(){
        HomePage homePage = new HomePage(driver);
        //test method
        navigateToCircadian36ProductDashboardPageTestNoRegister(homePage);
    }
}
