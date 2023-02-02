package tests;

import org.junit.Test;
import pages.CartPage;
import pages.HomePage;
import pages.LoginPage;

public class CartPageTest extends BaseTest {

    public LoginPage loginPage;
    public HomePage homePage;
    public CartPage cartPage;

    String cartVerification = "YOUR CART";
    String standardUsername = "standard_user";
    String password = "secret_sauce";
    String expectedPrice = "$49.99";

    @Test
    public void verifyCartEntry(){
        
    loginPage = new LoginPage(driver);
    homePage = new HomePage(driver);
    cartPage = new CartPage(driver);

    loginPage.baseURL();
    loginPage.login(standardUsername, password);
    homePage.clickOnShoopingCartButton();
    cartPage.verifyYourCartEntry(cartVerification);

    try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    }

    @Test
    public void VerifyJacketPrice(){
        
    loginPage = new LoginPage(driver);
    homePage = new HomePage(driver);
    cartPage = new CartPage(driver);

    loginPage.baseURL();
    loginPage.login(standardUsername, password);
    homePage.clickAddToJacketButton();
    homePage.clickOnShoopingCartButton();
    cartPage.validateJacketPrice(expectedPrice);

    try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    }
    

}
