package com.shinola;

import org.junit.jupiter.api.*;

public class HomePageTest extends TestMethods{

    @Test
    @DisplayName("Navigate To 'Circadian 36 Automatic' Product Page Test (as a guest)")
    void navigateToCircadian36ProductPageNoRegisterTest(){
        HomePage homePage = new HomePage(driver);
        //test method
        navigateToCircadian36ProductPageTestNoRegister(homePage);
    }
}
