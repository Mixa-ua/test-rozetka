package nosulya.test.work;

import org.junit.Test;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.*;

public class Search {
    @Test
    public void search() {

        open("https://www.google.com/");
        $(By.name("q")).setValue("Почта").pressEnter();
        $$(By.className("LC20lb")).shouldHaveSize(10);

    }
}
