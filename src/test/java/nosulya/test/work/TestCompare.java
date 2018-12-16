package nosulya.test.work;

import com.codeborne.selenide.Configuration;
import org.junit.Test;

public class TestCompare {
    @Test
    public void TestDiffCompare() {

        new HomePage().openHomePage("chrome", "https://rozetka.com.ua");
        new HomePage().OpenCategory("Ноутбуки и компьютеры", "Ноутбуки");
        new CategoryPage().OpenSubCategoryPage("Ноутбуки с SSD");
        new SubCategoryPage().AddProductsCompare(1, 2);
        new ComparePage().CountDiffParameters();
        new ComparePage().TestCompare();

        Configuration.holdBrowserOpen = true;

    }
}
