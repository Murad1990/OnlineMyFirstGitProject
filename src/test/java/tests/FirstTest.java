package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static io.github.bonigarcia.wdm.WebDriverManager.*;

public class FirstTest {

         WebDriver driver;

         @Test
         public void test1(){
             WebDriverManager.chromedriver().setup();
             driver=new ChromeDriver();
             driver.manage().window().maximize();
             driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
             driver.get("http://practice.cybertekschool.com/login");
             JavascriptExecutor js=(JavascriptExecutor)driver;
             String[] str=new String [10];
                     str[0]=(String)js.executeScript("return document.querySelector(\"[name='username']\").innerHTML");
             System.out.println(str[0]);
         }

}
