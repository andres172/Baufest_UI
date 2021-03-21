package Utils;

import Base.Base;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util {

    public static WebDriver driver;

    public void setUp(){

    }
    //public void Util(WebDriver driver){

      //  this.driver = driver;
        //PageFactory.initElements(driver,Util.class);
    //}

    public static void Click(WebElement element){
        new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(element));
        element.click();
    }

    public static void Input(WebElement element,String text){
        new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(text);
    }

    public static String GetElement(WebElement element){
        new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(element));
        return element.getText();
    }

    public static void AcceptAlert(){
        driver.switchTo().alert().accept();
    }
}
