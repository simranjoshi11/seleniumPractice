import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ThirdtestWaits {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));                                                 //implicit wait
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

         // driver.findElement(By.name("username")).sendKeys("Admin");
//        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username"))).sendKeys("Admin");

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username"))).sendKeys("Admin");         //explici twait

        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.tagName("button")).click();
 Thread.sleep(3000);
       String text =  driver.findElement(By.tagName("h6")).getText();
        System.out.println(text);
        //  driver.quit();
    }
}
