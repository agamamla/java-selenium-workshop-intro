import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddTShirtTest {

    public static WebDriver driver;
    
    private void settUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        driver = new ChromeDriver();
    }

    private void tearDown() {
        driver.quit();
    }

    @Test
    public void addTShirtToCartFromWomanCategoryTest() {
        settUp();


        tearDown();
    }
}
