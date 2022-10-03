package Selenium;
import java.util.concurrent.TimeUnit; 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class createAccount {
    @Test public void signup() { // TODO Auto-generated method stub 
  System.setProperty("webdriver.chrome.driver", "path of driver"); 
  WebDriver driver=new ChromeDriver(); driver.manage().window().maximize(); 
  driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account"); 

  WebElement username=driver.findElement(By.id("username")); 
  WebElement password=driver.findElement(By.id("password")); 
  WebElement signup=driver.findElement(By.xpath("//button[text()='Create an account']")); 
  username.sendKeys("example@gmail.com"); password.sendKeys("password"); 
  signup.click(); String actualUrl="http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation"; 
  String expectedUrl= driver.getCurrentUrl(); 
  Assert.assertEquals(expectedUrl,actualUrl); }   }