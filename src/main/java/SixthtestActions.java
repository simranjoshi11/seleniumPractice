import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.List;

public class SixthtestActions {

    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/droppable");
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(source,target).perform();
        System.out.println(target.getText());
       //driver.get("https://the-internet.herokuapp.com/hovers");
     //  WebElement element= driver.findElement(By.className("figure"));
     //   Actions actions = new Actions(driver);
    //    actions.moveToElement(element).perform();
//        List<WebElement> images = driver.findElements(By.className("figure"));
//
//        Actions actions1 = new Actions(driver);
//        actions1.moveToElement(images.get(1)).perform();
//        String text =  images.get(1).findElement(By.cssSelector(".figcaption h5")).getText();
//        System.out.println(text);

//driver.get("https://demoqa.com/buttons");

//WebElement element = driver.findElement(By.id("rightClickBtn"));

//actions.contextClick(element).perform();
//String text = driver.findElement(By.id("rightClickMessage")).getText();
       // System.out.println(text);




        driver.quit();
    }
}
