package nosulya.test.work;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CategoryPage {

    public void OpenSubCategoryPage(String subcategory){
        $(By.linkText (subcategory)).scrollTo().click(); // "Ноутбуки с SSD"
    }
}
