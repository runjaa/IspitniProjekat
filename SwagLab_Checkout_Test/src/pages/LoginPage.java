package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    By usernameBy = By.id("user-name");
    By passwordBy = By.id("password");
    By loginButtonBy = By.id("login-button");

    String baseURL = "https://www.saucedemo.com";

    public LoginPage baseURL(){
        driver.get(baseURL);
        return this;
    }
    public LoginPage login (String username, String password){
        writeText(usernameBy, username);
        writeText(passwordBy, password);
        click(loginButtonBy);
        return this;
    }

}
