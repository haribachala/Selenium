import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeSelenium {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/hari/Downloads/chromedriver");
        WebDriver webDriver = new ChromeDriver();
        openAnother(webDriver);
        getTitle(webDriver);
        getHyperLinksCount(webDriver);



    }

    private static void openAnother(WebDriver webDriver){
        webDriver.get("www.google.com");
        webDriver.findElement(By.name("q")).sendKeys("javatpoint");
        webDriver.findElement(By.name("btnK")).click();
        webDriver.quit();

    }

    private static void getTitle(WebDriver webDriver) {
        webDriver.get("http://toolsqa.com/");
        String title = webDriver.getTitle();
        System.out.println("title:" + title);

        webDriver.quit();

    }

    private static void getHyperLinksCount(WebDriver webDriver) {
        webDriver.get("http://toolsqa.com/");
        webDriver.getTitle();
        int a = webDriver.findElements(new By.ByTagName("a")).size();
        System.out.println("######## all hyper links :" + a);
        Assert.assertEquals(10, a);
        webDriver.quit();

    }
    public static void closeAllWindows(WebDriver webDriver) {
        String originalHandle = webDriver.getWindowHandle();

        //Do something to open new tabs

        for (String handle : webDriver.getWindowHandles()) {
            if (!handle.equals(originalHandle)) {
                webDriver.switchTo().window(handle);
                webDriver.close();
                webDriver.switchTo().window(originalHandle);
            }
        }
    }



}
