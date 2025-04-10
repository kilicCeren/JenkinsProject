package tests.runners;

import org.testng.TestNG;

public class TestNgRunner {
    public static void main(String[] args) {
        TestNG testNG = new TestNG();
        testNG.setTestClasses(new Class[] { tests.LoginTest.class });

        // Allure Reports için bir parametre set edelim
        System.setProperty("allure.results.directory", "target/allure-results");

        // TestNG'yi başlatıyoruz
        testNG.run();
    }

}
