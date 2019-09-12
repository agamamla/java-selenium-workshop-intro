import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddTShirtTest {

    public static WebDriver driver;
    private WebDriverWait wait;
    private String url = "http://automationpractice.com/index.php";

    //specjalnie wrzucam tutaj binarkę, aby przy mówieniu o frameworku wspomniec o drive managerze bonigarcia ;)
    private void settUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
    }

    private void tearDown() {
        driver.quit();
    }

    @Test
    public void addTShirtToCartFromWomanCategoryTest() {
        settUp();

        driver.get(url);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("block_top_menu")));
        driver.findElement(By.cssSelector("#block_top_menu > ul > li > a")).click();
        driver.findElement(By.partialLinkText("Faded Short Sleeve T-shirts")).click();
        driver.findElement(By.cssSelector("button.exclusive")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.button-container > a")));
        driver.findElement(By.cssSelector("div.button-container > a")).click();

        tearDown();
    }
}
