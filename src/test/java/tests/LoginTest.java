package tests;

import io.qameta.allure.*;
import org.testng.annotations.Test;

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
    }

    @Test
    void Test1(){ assertTrue(true);}
    @Test
    void Test2(){ assertTrue(true);}
    @Test
    void Test3(){ assertTrue(true);}
    @Test
    void Test4(){ assertTrue(true);}
    @Test
    void Test5(){ assertTrue(true);}
    @Test
    void Test6(){assertTrue(true);}
    @Test
    void Test7(){ assertTrue(true);}
    @Test
    void Test8(){ assertTrue(true);}
    @Test
    void Test9(){assertTrue(true);}
    @Test
    void Test10(){ assertTrue(true);}
    @Test
    void Test11(){ assertFalse(false);}
    @Test
    void Test12(){ assertFalse(false);}
    @Test
    void Test13(){ assertTrue(true);}
    @Test
    void Test14(){ assertTrue(true);}
    @Test
    void Test15() { assertTrue(true);}
    @Test
    void Test16() { assertTrue(true);}
    @Test
    void Test17() { assertTrue(true);}
    @Test
    void Test18() { assertTrue(true);}
    @Test
    void Test19() { assertTrue(true);}
    @Test
    void Test20() { assertTrue(true);}
    @Test
    void Test21() { assertTrue(true);}
    @Test
    void Test22() { assertTrue(true);}
    @Test
    void Test23() { assertTrue(true);}
    @Test
    void Test24() { assertTrue(true);}
    }

