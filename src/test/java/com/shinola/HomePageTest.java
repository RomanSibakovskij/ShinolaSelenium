package com.shinola;

import org.junit.jupiter.api.*;

public class HomePageTest extends TestMethods{

    @Test
    @DisplayName("Navigate To 'Circadian 36 Automatic' Product Dashboard Page Test (as a guest)")
    void navigateToCircadian36ProductDashboardPageNoRegisterTest(){
        HomePage homePage = new HomePage(driver);
        //test method
        navigateToCircadian36ProductDashboardPageTestNoRegister(homePage);
    }
}
