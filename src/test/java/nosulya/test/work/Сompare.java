package nosulya.test.work;

import com.codeborne.selenide.Configuration;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class Сompare {

    @Before
    public void setup() {
        Configuration.browser = "chrome";
        open("https://rozetka.com.ua/");
    }

    @Test
    public void OpenSSDNotebook() {
        $(By.linkText ("Ноутбуки и компьютеры")).hover();
        $(By.linkText ("Ноутбуки")).click();
        $(By.linkText ("Ноутбуки с SSD")).scrollTo().click();
        $(By.className("g-i-tile-i-box"),0).hover().find(By.className("g-compare")).click();
        sleep(3000);
        $(By.className("g-i-tile-i-box"),1).hover().find(By.className("g-compare")).click();
        sleep(3000);
        $(By.id("comparison")).click();
        $(By.linkText ("Сравнить эти товары")).click();
        int size = $$(By.className("comparison-t-row")).size();
        int counter = 0;
        int number = size -1;
        String p1 = "";
        String p2 = "";
        //сравнение значений таблицы
        for ( ; number >= 0; number-- ) {
            p1 = $(By.className("comparison-t-row"), number).find(By.className("comparison-t-cell"),0).getText();
            p2 = $(By.className("comparison-t-row"), number).find(By.className("comparison-t-cell"),1).getText();

            if (p1.equals(p2))
                counter = counter + 0;
            else
                counter++;

        }

        $(By.linkText("Только отличия")).click();
        $$(By.name("different")).shouldHaveSize(counter);




        Configuration.holdBrowserOpen = true;

    }
}
