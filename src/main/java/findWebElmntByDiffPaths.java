import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;

import javax.swing.*;

public class findWebElmntByDiffPaths {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "/home/hari/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        //Actions act=new Actions();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("input#email")).sendKeys("sulochana");
        driver.findElement(By.cssSelector("input.inputtext._58mg._5dba._2ph-")).sendKeys("bachala");
        driver.findElement(By.cssSelector("input[name$=astname]")).sendKeys("lilly");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("gudipati");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);



       // linkk2.sendKeys("bachala");
        driver.close();


    }
}

