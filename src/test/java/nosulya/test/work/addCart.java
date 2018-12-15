package nosulya.test.work;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;


public class addCart {


    @Before
    public void setup() {
        Configuration.browser = "chrome";
        open("https://rozetka.com.ua/");
    }

    @Test
    public void FindProduct() {
        // Configuration.timeout = 6000;
        $(By.name("search")).shouldHave(Condition.attribute("placeholder", "Я ищу..."));
        $(By.name("search")).setValue("rx580");
        $(By.className("suggest-goods__link")).shouldHave(text ("Видеокарта ASUS MINING-RX580-4G-S SI"));
        $(By.name("search")).pressEnter();
        $(By.linkText ("Видеокарта ASUS MINING-RX580-4G-S SI")).click();
        $(By.className("detail-code-i")).shouldHave(text("60511547"));
    }

    @Test
    public void AddToCart() {
        $(By.name("search")).setValue("rx580").pressEnter();;
        $(By.linkText ("Видеокарта ASUS MINING-RX580-4G-S SI")).click();
        $(By.className("toOrder")).click();
        //$(By.className("cart-title")).shouldHave(text("Корзина пуста"));
        $(By.className("cart-title")).shouldHave(text("Вы добавили товар в корзину"));

    }

    @Test
    public void ClickLogo() {
        $(By.linkText ("Контакты")).click();
        $(By.className("logo")).click();
        $(By.className("main-auth__hading")).shouldHave(text("Добро пожаловать!"));

    }

}