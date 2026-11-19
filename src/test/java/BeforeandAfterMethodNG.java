import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeandAfterMethodNG {
    WebDriver driver;
    @BeforeMethod
    public void mytest(){
        driver= new ChromeDriver();
        driver.get("https://www.saucedemo.com");
    }

    @Test
    public void Logintest(){
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        Assert.assertTrue(driver.getCurrentUrl().contains("inventory"));
    }

    @AfterMethod
    public void browserclose(){
        driver.quit();
    }

}

//@Test
//public void invalidLoginTest() {
//    driver.findElement(By.id("user-name")).sendKeys("standard_user");
//    driver.findElement(By.id("password")).sendKeys("wrong123");
//    driver.findElement(By.id("login-button")).click();
//
//    String error = driver.findElement(By.cssSelector(".error-message-container.error h3")).getText();
//    Assert.assertEquals(error, "Epic sadface: Username and password do not match any user in this service");
//}
