import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeSelenium {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\U6015446\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver=new ChromeDriver();
        webDriver.get("http://toolsqa.com/");
        String title = webDriver.getTitle();
        System.out.println("title:"+ title);
        int a = webDriver.findElements(new By.ByTagName("a")).size();
        System.out.println("######## all hyper links :" + a);
        Assert.assertEquals(10,a);
        webDriver.quit();

    }

    public void  closeAllWindows(WebDriver driver){
        String originalHandle = driver.getWindowHandle();

        //Do something to open new tabs

        for(String handle : driver.getWindowHandles()) {
            if (!handle.equals(originalHandle)) {
                driver.switchTo().window(handle);
                driver.close();
            }
        }

        driver.switchTo().window(originalHandle);
    }
}
