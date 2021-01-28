package clase11;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ejercicioGitClase11 {

    private WebDriver getDriver(String URL) {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(URL);
        return driver;
    }
    //ejercicio 1
    @Test
    public void spotifyByPlaceHolder(){

        WebDriver driver = getDriver("https://www.spotify.com/uy/signup/");
        driver.findElement(By.cssSelector("input[placeholder='Introduce tu correo electrónico.']")).sendKeys("test@test.com");
        driver.findElement(By.cssSelector("input[placeholder='Vuelve a introducir tu correo electrónico.']")).sendKeys("test@test.com");
        driver.findElement(By.cssSelector("input[placeholder='Crea una contraseña.']")).sendKeys("contrasena");
        driver.findElement(By.cssSelector("input[placeholder='Introduce un nombre de perfil.']")).sendKeys("marimar");
        driver.findElement(By.cssSelector("input[placeholder='DD']")).sendKeys("24");

        WebElement mes = driver.findElement(By.xpath("//*[@name='month']"));
        Select mesDropDown = new Select(mes);
        mesDropDown.selectByValue("02");

        driver.findElement(By.cssSelector("input[placeholder='AAAA']")).sendKeys("1984");

        WebElement radio = driver.findElement(By.xpath("(//*[@class='Indicator-sc-16vj7o8-0 kSKYRE'])[2]"));
        radio.click();

        driver.close();
    }
}
