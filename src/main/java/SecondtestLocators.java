
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;

public class SecondtestLocators {

    public static void main(String[] args){

      WebDriver driver = new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        driver.get("https://www.saucedemo.com");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        String title = driver.getTitle();
        System.out.println(title);
        //String error = driver.findElement(By.cssSelector(".error-message-container.error h3")).getText();
        //System.out.println(error);
       driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();

        String count = driver.findElement(By.cssSelector("#shopping_cart_container > a > span")).getText();
        System.out.println(count);
   Select sort = new Select(driver.findElement(By.cssSelector("#header_container > div.header_secondary_container > div > span > select")));
        sort.selectByVisibleText("Price (low to high)");

        String url = driver.getCurrentUrl();
        if (url.contains("inventory")){
            System.out.println("pass");

        }else {System.out.println("fail");}


      driver.quit();

    }

}
