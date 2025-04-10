package tests.runners;

public class TestNgRunner {
    public static void main(String[] args) {
        org.testng.TestNG.main(new String[] {
                "-testclass", "com.example.tests.LoginTest"
        });
    }
}
