package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTests {
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }

    @Test
    public void loginTest1(){
        driver.get("https://google.com");
    }

    @Test
    public void someTest(){
        driver.get("https://amazon.com");
    }

    @Test
    public void loginTest2(){
        driver.get("https://ebay.com");
    }

    @Test
    public void loginTest3(){
        driver.get("https://wish.com");
    }

}
