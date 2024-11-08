package com.shinola;

import org.junit.jupiter.api.*;

public class HomePageTest extends TestMethods{

    @Test
    @DisplayName("Navigate To 'Circadian 36 Automatic' Product Page Test")
    void navigateToCircadian36ProductPageTest(){
        HomePage homePage = new HomePage(driver);
        //test method
        navigateToCircadian36ProductPageTestNoRegister(homePage);
    }
}
