package Pages;

import Utils.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage extends Util {

    public WebDriver driver;

    public CartPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(how = How.XPATH, using = "//td[contains(text(),'Sony vaio i5')]")
    public WebElement productTitle;
    @FindBy(how = How.XPATH, using = "//td[contains(text(),'790')]")
    public WebElement productPrice;

    public String getTitleProduct(){
        new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(productTitle));
        return  productTitle.getText();
    }

    public String getPriceProduct(){
        new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(productPrice));
        return  productPrice.getText();
    }

}
