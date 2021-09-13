import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Dropdown {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\ChromeDriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropdownMenu = driver.findElement(By.id("dropdownMenuButton"));

        dropdownMenu.click();

        WebElement autocompleteItem = driver.findElement(By.id("autocomplete"));

        autocompleteItem.click();

        //WebElement buttons = driver.findElement(By.xpath("/html/body/div/div/div/a[2]"));
        //buttons.click();

        driver.quit();
    }
}
