package nosulya.test.work;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;


public class ComparePage {

    public static int size, counter, number;

    public void CountDiffParameters() {
        $(By.linkText("Сравнить эти товары")).click();
        size = $$(By.className("comparison-t-row")).size();
        counter = 0;
        number = size - 1;  //Номер параметра
        String p1 = "";     //Значение параметра первого товара
        String p2 = "";     //Значение параметра второго товара
        //Сравнение значений параметров
        for (; number >= 0; number--) {
            p1 = $(By.className("comparison-t-row"), number).find(By.className("comparison-t-cell"), 0).getText();
            p2 = $(By.className("comparison-t-row"), number).find(By.className("comparison-t-cell"), 1).getText();

            if (p1.equals(p2))
                counter = counter + 0;
            else
                counter++;
        }

        $(By.linkText("Только отличия")).click();
    }

    public void TestCompare(){
         $$(By.name("different")).shouldHaveSize(counter);
    }

}
