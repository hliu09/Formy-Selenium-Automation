import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\ChromeDriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");

        WebElement name = driver.findElement(By.id("name"));

        Actions action = new Actions(driver);

        action.moveToElement(name);

        name.sendKeys("Hermes Du");

        WebElement date = driver.findElement(By.id("date"));

        date.sendKeys("09/10/2021");

        driver.quit();
    }
}
