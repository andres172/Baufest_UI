package Pages;

import Utils.Util;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage extends Util {

    public WebDriver driver;

    public ProductPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.XPATH, using = "//a[@class='btn btn-success btn-lg'][contains(text(),'Add to cart')]")
    public WebElement AddToChart_Button;

    public void AddToChart(){

        new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(AddToChart_Button));
        AddToChart_Button.click();
    }
}
