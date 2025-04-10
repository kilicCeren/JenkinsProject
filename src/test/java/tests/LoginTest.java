package tests;

import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

@Epic("Login Tests")
@Feature("Valid Login")
public class LoginTest {

    @Test(description = "Geçerli bilgilerle login testi")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Geçerli kullanıcı ile giriş yapılabilmeli")
    @Description("Doğru username ve password ile giriş kontrolü")
    public void validLoginTest() {
        assertTrue(true);
    }

    @Test
    void Test1() {
        assertTrue(true);
    }

    @Test
    void Test2() {
        assertTrue(true);
    }

    @Test
    void Test3() {
        assertTrue(true);
    }

    @Test
    void Test4() {
        assertTrue(true);
    }

    @Test
    void Test5() {
        assertTrue(true);
    }

    @Test
    void Test6() {
        assertTrue(true);
    }

    @Test
    void Test7() {
        assertTrue(true);
    }

    @Test
    void Test8() {
        assertTrue(true);
    }

    @Test
    void Test9() {
        assertTrue(true);
    }

    @Test
    void Test10() {
        assertTrue(true);
    }

    @Test
    void Test11() {
        assertTrue(false);
    }

    @Test
    void Test12() {
        assertTrue(false);
    }

    @Test
    void Test13() {
        assertTrue(true);
    }

    @Test
    void Test14() {
        assertTrue(true);
    }

    @Test
    void Test15() {
        assertTrue(true);
    }

    @Test
    void Test16() {
        assertTrue(true);
    }

    @Test
    void Test17() {
        assertTrue(true);
    }

    @Test
    void Test18() {
        assertTrue(true);
    }

    @Test
    void Test19() {
        assertTrue(true);
    }

    @Test
    void Test20() {
        assertTrue(true);
    }

    @Test
    void Test21() {
        assertTrue(true);
    }

    @Test
    void Test22() {
        assertTrue(true);
    }

    @Test
    void Test23() {
        assertTrue(true);
    }

    @Test
    void Test24() {
        assertTrue(true);
    }

    @Test
    @Step("Test Search functionality on the page")
    public void test01() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.testotomasyonu.com");

        // phone için arama yapın
        WebElement aramaKutusu = driver.findElement(By.id("global-search"));
        aramaKutusu.sendKeys("phone" + Keys.ENTER);

        // arama sonucunda ürün bulunabildigini test edin
        WebElement aramaSonucuElementi = driver.findElement(By.className("product-count-text"));
        String unExpectedSonuc = "0 Products Found";
        String actualSonuc = aramaSonucuElementi.getText();

        Assert.assertNotEquals(actualSonuc, unExpectedSonuc);

        // driver'ı kapatın
        driver.quit();
    }
}