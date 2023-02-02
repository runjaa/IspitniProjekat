package tests;

import org.junit.Test;

import pages.CartPage;
import pages.CheckoutYourInfoPage;
import pages.HomePage;
import pages.LoginPage;
import pages.OverviewPage;

public class OverviewPageTest extends BaseTest{

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
    String overview = "CHECKOUT: OVERVIEW";
    String finishPageText = "THANK YOU FOR YOUR ORDER";
    String expectedItemTotal = "$49.99";

    @Test
    public void verifyOverviewPageEntry(){

    loginPage = new LoginPage(driver);
    homePage = new HomePage(driver);
    cartPage = new CartPage(driver);
    checkoutYourInfoPage = new CheckoutYourInfoPage(driver);
    overviewPage = new OverviewPage(driver);

    loginPage.baseURL();
    loginPage.login(standardUsername, password);
    homePage.clickOnShoopingCartButton();
    cartPage.clickOnCheckoutButton();
    checkoutYourInfoPage.yourInfo(firstName, lastName, zipCode);
    overviewPage.verifyOverviewEntry(overview);

    try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    }

    @Test
    public void verifyCheckoutComplete(){

    loginPage = new LoginPage(driver);
    homePage = new HomePage(driver);
    cartPage = new CartPage(driver);
    checkoutYourInfoPage = new CheckoutYourInfoPage(driver);
    overviewPage = new OverviewPage(driver);

    loginPage.baseURL();
    loginPage.login(standardUsername, password);
    homePage.clickOnShoopingCartButton();
    cartPage.clickOnCheckoutButton();
    checkoutYourInfoPage.yourInfo(firstName, lastName, zipCode);
    overviewPage.clickFinishButton();
    overviewPage.verifyFinishPageShow(finishPageText);

    try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    }

    @Test
    public void VerifyItemPrice(){
        
    loginPage = new LoginPage(driver);
    homePage = new HomePage(driver);
    cartPage = new CartPage(driver);
    checkoutYourInfoPage = new CheckoutYourInfoPage(driver);
    overviewPage = new OverviewPage(driver);

    loginPage.baseURL();
    loginPage.login(standardUsername, password);
    homePage.clickAddToJacketButton();
    homePage.clickOnShoopingCartButton();
    cartPage.clickOnCheckoutButton();
    checkoutYourInfoPage.yourInfo(firstName, lastName, zipCode );
    overviewPage.validateItemTotal(expectedItemTotal);

    try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    }

}
