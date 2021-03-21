package Steps;

import Base.Base;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks extends Base {
    private Base base;

    public Hooks(Base base){
        this.base = base;
    }

    @Before
    public void InitializeTest(){
        System.out.println("Opening the browser: Chrome");

        WebDriverManager.chromedriver().version("89.0.4389.23").setup();

        //Add new properties to ChromeDriver
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--ignore-certificate-errors");

        base.driver = new ChromeDriver(options);
        base.driver.navigate().to("https://www.demoblaze.com/index.html");

    }

    @After
    public void TearDownTest(){

        base.driver.quit();
    }
}
