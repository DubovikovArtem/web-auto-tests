package selenide;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.testng.annotations.*;
import static com.codeborne.selenide.Selenide.*;

public class TestSelenide {
    @Test
    public void testSeleinideFirst() {
        Configuration.holdBrowserOpen = true;
//        open("https://demoqa.com");
        open("https://the-internet.herokuapp.com");
//        $(By.name(""));
    }
}
