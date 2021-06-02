import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSeleniumWebDriver {
  //  public ChromeDriver chromeDriver;
    public WebDriver chromeDriver;

    @BeforeMethod
    public void start() {
        System.setProperty("webdriver.chrome.driver", "D:/chromedriver/chromedriver.exe");
        chromeDriver = new ChromeDriver();
    }

    @Test
    public void testCheckTitle() {
        chromeDriver.get("https://demoqa.com");
        String title = chromeDriver.getTitle();
        Assert.assertTrue(title.equals("ToolsQA"));
        System.out.println("------> " + title);
    }

    @Test
    public void testCheckWebElement() {
        chromeDriver.get("https://google.com");
        //WebElement
    }

    @AfterMethod
    public void finish() throws InterruptedException {
        Thread.sleep(5000);
        chromeDriver.quit();
    }
}
