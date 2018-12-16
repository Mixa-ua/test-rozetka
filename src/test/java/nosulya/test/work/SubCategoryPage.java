package nosulya.test.work;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class SubCategoryPage {

    public void AddProductsCompare(int FirstProduct, int SecondProduct){
        FirstProduct--;
        SecondProduct--;
        $(By.className("g-i-tile-i-box"),FirstProduct).hover().find(By.className("g-compare")).click();
        sleep(3000); //Ожидание для обработки выбора товара
        $(By.className("g-i-tile-i-box"), SecondProduct).hover().find(By.className("g-compare")).click();
        sleep(3000); //Ожидание для обработки выбора товара
        $(By.id("comparison")).click();
    }

}
