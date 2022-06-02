package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StartWebDriver {

    @Test
    public void testStartWebDriver(){
        /**
         *             <groupId>io.github.bonigarcia</groupId>
         *             <artifactId>webdrivermanager</artifactId>
         *             скачивает вэб драйвер и запускает его
         * */
        WebDriverManager.chromedriver().setup();
        /**
         * Скачивает хром драйвер
         * -----------------------------------------
         * WebDriverManager.firefoxdriver().setup();
         * если нужен фаерфокс
         * */
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        driver.quit();
    }
}
