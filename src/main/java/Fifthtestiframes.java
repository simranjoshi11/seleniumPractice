import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Fifthtestiframes {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
//        driver.get("https://the-internet.herokuapp.com/nested_frames");
//        driver.switchTo().frame("frame-bottom");
//       String text =  driver.findElement(By.tagName("body")).getText();
//        System.out.println(text);
//        driver.switchTo().defaultContent();
        driver.get("https://www.naukri.com/registration/createAccount?");
     driver.manage().window().maximize();
        WebElement a1 = driver.findElement(By.xpath("//span[.='Google']"));
        String parentId = driver.getWindowHandle();
        System.out.println(parentId);
        a1.click();

        Set<String> childId= driver.getWindowHandles();
        System.out.println(childId);

        for(String id :childId){
            if (!id.equals(parentId)) {

                driver.switchTo().window(id);
                System.out.println(driver.getTitle());
            }
        }
        driver.switchTo().window(parentId);
        System.out.println(driver.getTitle());

        driver.quit();
    }
}
