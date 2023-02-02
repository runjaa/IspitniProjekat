package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutYourInfoPage extends BasePage {
    public CheckoutYourInfoPage(WebDriver driver) {
        super(driver);
    }

    By checkoutInfoBy = By.xpath("//span[@class='title']");
    By firstNameBy = By.xpath("//*[@id='first-name']");
    By lastNameBy = By.xpath("//*[@id='last-name']");
    By zipCodeBy = By.xpath("//*[@id='postal-code']");
    By continueButtonBy = By.xpath("//*[@id='continue']");

    public CheckoutYourInfoPage verifyAddToCart (String expectedText){
        String checkoutInfo = readText(checkoutInfoBy);
        assertStringEquals(checkoutInfo, expectedText);
        return this;
    }

    public CheckoutYourInfoPage yourInfo (String firstName, String lastName, String zipCode ){
        writeText(firstNameBy, firstName);
        writeText(lastNameBy, lastName);
        writeText(zipCodeBy, zipCode);
        click(continueButtonBy);
        return this;
    }

    
    
}
