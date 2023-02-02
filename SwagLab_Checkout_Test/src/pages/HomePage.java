package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    By shoopingCart = By.xpath("//*[@id='shopping_cart_container']/a");
    By addToCartButtonBy = By.xpath("//*[@id='add-to-cart-sauce-labs-backpack']");
    By jacketButtonBy = By.id("add-to-cart-sauce-labs-fleece-jacket");

    public HomePage clickOnShoopingCartButton(){
        click(shoopingCart);
        return this;
    }

    public HomePage clickAddToCartButton(){
        click(addToCartButtonBy);
        return this;
    }

    public HomePage clickAddToJacketButton(){
        click(jacketButtonBy);
        return this;
    }

}
