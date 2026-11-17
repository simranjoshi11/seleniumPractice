import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FourthTestAlerts {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//        Alert alert = driver.switchTo().alert();
//        System.out.println(alert.getText());
//        alert.accept();

//        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//        Alert confirm = driver.switchTo().alert();
//        System.out.println(confirm.getText());
//        confirm.dismiss();

        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        Alert prompt = driver.switchTo().alert();
        System.out.println(prompt.getText());
        prompt.sendKeys("hello selenium");
        prompt.accept();

        String result = driver.findElement(By.id("result")).getText();
        System.out.println(result);driver.quit();
    }

}
