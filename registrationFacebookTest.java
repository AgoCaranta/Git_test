package clase2;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class registrationFacebookTest {

    //crear cuenta en facebook con los siguientes datos
    // First Name: “John”
    //Last Name: “Smith”
    //Mobile: “5555555”
    //New Password: “123456789”
    //Birthday: Jun 26 1980
    //Gender: Male


    private WebDriver getDriver(String URL) {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(URL);
        return driver;
    }

    @Test
    public void fullRegistrationTest() throws InterruptedException {
        WebDriver driver = getDriver("https://www.facebook.com");
        driver.findElement(By.linkText("Crear cuenta nueva")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("firstname")).sendKeys("John");
        driver.findElement(By.name("lastname")).sendKeys("Smith");
        driver.findElement(By.name("reg_email__")).sendKeys("5555555");
        driver.findElement(By.id("password_step_input")).sendKeys("123456789");

        WebElement dias = driver.findElement(By.id("day"));
        Select comboDias = new Select(dias);
        comboDias.selectByValue("26");

        WebElement mes = driver.findElement(By.name("birthday_month"));
        Select comboMes = new Select(mes);
        comboMes.selectByValue("6");

        WebElement año = driver.findElement(By.id("year"));
        Select comboAño = new Select(año);
        comboAño.selectByValue("1980");

        Thread.sleep(3000);

        WebElement radio2 = driver.findElement(By.id("u_1_5"));
        radio2.click();

        driver.close();


    }
}
