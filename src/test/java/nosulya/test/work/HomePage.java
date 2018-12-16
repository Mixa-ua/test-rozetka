package nosulya.test.work;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class HomePage {


// url = "https://rozetka.com.ua"
    public void openHomePage(String browser, String url) {
        Configuration.browser = browser;                   // "chrome"
        open(url);   // "https://rozetka.com.ua"
    }

    public void OpenCategory(String section, String category) {
        $(By.linkText (section)).hover();   // "Ноутбуки и компьютеры"
        $(By.linkText(category)).click();                 // "Ноутбуки"
    }
}
