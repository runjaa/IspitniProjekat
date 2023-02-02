package tests;

import org.junit.Test;

import pages.CartPage;
import pages.CheckoutYourInfoPage;
import pages.HomePage;
import pages.LoginPage;
import pages.OverviewPage;

public class CheckoutYourInfoPageTest extends BaseTest{

    public LoginPage loginPage;
    public HomePage homePage;
    public CartPage cartPage;
    public CheckoutYourInfoPage checkoutYourInfoPage;
    public OverviewPage overviewPage;
    
    String cartVerification = "YOUR CART";
    String standardUsername = "standard_user";
    String password = "secret_sauce";
    String yourInformation = "CHECKOUT: YOUR INFORMATION";
    String firstName = "Dusko";
    String lastName = "Dugousko";
    String zipCode = "11999";

    @Test
    public void verifyYourInformationEntry(){
        
    loginPage = new LoginPage(driver);
    homePage = new HomePage(driver);
    cartPage = new CartPage(driver);
    checkoutYourInfoPage = new CheckoutYourInfoPage(driver);

    loginPage.baseURL();
    loginPage.login(standardUsername, password);
    homePage.clickOnShoopingCartButton();
    cartPage.clickOnCheckoutButton();

    try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    }
    
}
