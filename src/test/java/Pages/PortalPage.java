package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import Utils.Util;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PortalPage extends Util{

    public WebDriver driver;

    public PortalPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    //Link Elements
    @FindBy(how = How.ID, using = "signin2")
    public WebElement SinUp_Link;

    @FindBy(how = How.ID, using = "login2")
    public WebElement LogIn_Link;

    @FindBy(how = How.ID, using = "cartur")
    public WebElement Car_Link;

    //SingUp Modal Elements
    @FindBy(how = How.ID, using = "sign-username")
    public WebElement UserName_SinUp_Text;

    @FindBy(how = How.ID, using = "sign-password")
    public WebElement Password_SinUp_Text;

    @FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary'][contains(text(),'Sign up')]")
    public WebElement SingUp_Button;

    //Login Modal Elements
    @FindBy(how = How.ID, using = "loginusername")
    public WebElement UserName_LogIn_Text;

    @FindBy(how = How.ID, using = "loginpassword")
    public WebElement Password_LogIn_Text;

    @FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary'][contains(text(),'Log in')]")
    public WebElement LogIn_Button;

    @FindBy(how = How.ID, using = "logout2")
    public WebElement LogOut_Link;

    //Category Elements
    @FindBy(how = How.XPATH, using = "//a[@id='itemc'][contains(text(),'Laptops')]")
    public WebElement LaptopCategory_Link;

    //Product List Elements
    @FindBy(how = How.XPATH, using = "//div[@id='tbodyid']/div[1]/div/a")
    public WebElement FirstProduct_Link;

    public void SingUpUser(String userName, String password) {

        SinUp_Link.click();
        new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(UserName_SinUp_Text));
        UserName_SinUp_Text.clear();
        UserName_SinUp_Text.sendKeys(userName);
        new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(Password_SinUp_Text));
        Password_SinUp_Text.clear();
        Password_SinUp_Text.sendKeys(password);
        waitSeconds(4);
        SingUp_Button.click();
    }

    public void LoginUser(String userName, String password){

        LogIn_Link.click();
        new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(UserName_LogIn_Text));
        UserName_LogIn_Text.clear();
        UserName_LogIn_Text.sendKeys(userName);

        new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(Password_LogIn_Text));
        Password_LogIn_Text.clear();
        Password_LogIn_Text.sendKeys(password);
        LogIn_Button.click();
    }

    public void Logout(){
        new WebDriverWait(driver, 8).until(ExpectedConditions.visibilityOf(LogOut_Link));
        LogOut_Link.click();
    }

    public boolean SinUpLinKIsLoaded(){

        new WebDriverWait(driver, 8).until(ExpectedConditions.visibilityOf(SinUp_Link));
       return SinUp_Link.isDisplayed();
    }

    public void SelectLaptopCategory(){

        new WebDriverWait(driver, 8).until(ExpectedConditions.visibilityOf(LaptopCategory_Link));
        LaptopCategory_Link.click();
    }

    public void SelectFirstProductOnTheList(){

        new WebDriverWait(driver, 8).until(ExpectedConditions.visibilityOf(FirstProduct_Link));
        FirstProduct_Link.click();
    }

    public String GetAlertMessage(){
        new WebDriverWait(driver, 8).until(ExpectedConditions.alertIsPresent());
        return driver.switchTo().alert().getText();
    }
    public void GoToCarSection(){
        new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(Car_Link));
        Car_Link.click();
    }

    public void CloseAlertMessage(){
        new WebDriverWait(driver, 8).until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }

    public void waitSeconds(int milliseconds){
        try{
            driver.wait(milliseconds*1000);
        }catch (Throwable a){

        }
    }
}
