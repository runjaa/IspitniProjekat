package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }

    By yourCartTitleBy = By.xpath("//span[@class='title']");
    By checkoutButtonBy = By.xpath("//*[@id='checkout']");
    By jacketPriceBy = By.xpath("//*[@class='inventory_item_price']");
    

    public CartPage verifyYourCartEntry(String expectedText) {
        String pageTitle = readText(yourCartTitleBy);
        assertStringEquals(pageTitle, expectedText);
        return this;
    }

    public CartPage clickOnCheckoutButton(){
        click(checkoutButtonBy);
        return this;
    }

    public CartPage validateJacketPrice(String expectedPrice){
        String jacketPrice = readText(jacketPriceBy);
        assertStringEquals(expectedPrice, jacketPrice);
        return this;
    }

}
