package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OverviewPage extends BasePage {
    public OverviewPage(WebDriver driver) {
        super(driver);
    }

    By overviewBy = By.xpath("//span[@class='title']");
    By completeBy = By.xpath("//*[@id='checkout_complete_container']/h2");
    By finishButtonBy = By.id("finish");
    By finishPageTextBy = By.xpath("//*[@id='checkout_complete_container']/h2");
    By itemTotalBy = By.xpath("//div[@class='summary_subtotal_label']");
    
    public OverviewPage verifyOverviewEntry(String expectedText) {
        String pageTitle = readText(overviewBy);
        assertStringEquals(pageTitle, expectedText);
        return this;
    }
    
    public OverviewPage clickFinishButton(){
        click(finishButtonBy);
        return this;
    }
    
    public OverviewPage verifyCompleteEntry(String expectedText){
        String pageTitle = readText(completeBy);
        assertStringEquals(pageTitle, expectedText);
        return this;
    }

    public OverviewPage verifyFinishPageShow(String expectedText){
        String pageTitle = readText(finishPageTextBy);
        assertStringEquals(pageTitle, expectedText);
        return this;
    }

    public OverviewPage validateItemTotal(String expectedText){
        String itemTotal = readText(itemTotalBy).substring(12,18);
        System.out.println(itemTotal);
        assertStringEquals(itemTotal, expectedText);
        return this;
    }

}
    
