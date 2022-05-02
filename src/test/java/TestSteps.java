
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.*;

public class TestSteps {


    @Test
    public static void main(String[] args) throws InterruptedException {
        //Browser Setup
        System.setProperty("webdriver.chrome.driver","C:\\Users\\EXT02D26039\\IdeaProjects\\hepsiburada\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Url Adresi
        driver.get("https://www.hepsiburada.com/");

        //Arama Kutusu
        WebElement searchProduct = driver.findElement(By.cssSelector("input.desktopOldAutosuggestTheme-input"));
        searchProduct.click();
        searchProduct.sendKeys("Iphone 13");


        //Urun Arama Giris
        WebElement searchButton = driver.findElement(By.className("SearchBoxOld-buttonContainer"));
        searchButton.click();
            sleep(1000);

        //Urun Secme
        WebElement selectProduct = driver.findElement(By.cssSelector("li#i6>div>a.moria-ProductCard-gyqBb "));
        selectProduct.click();
            sleep(2000);

        //Yorumlara tiklama
        WebElement Comments = driver.findElement(By.className("ratings active hbus e5d86377-d1b9-43bf-8041-f38a1f5b435f"));
        Comments.click();

        //Yorum Dogrulama
        WebElement Assert = driver.findElement(By.cssSelector("div.hermes-AddReviewBox-module-1QSn8>span"));
        System.out.println(Assert.getText());
        String Expected = Assert.getText();
        String Real = "Değerlendir";
        org.junit.Assert.assertEquals(Expected,Real);

    }


}
