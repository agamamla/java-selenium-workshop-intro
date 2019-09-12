import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddTShirtTest {

    public static WebDriver driver;
    private WebDriverWait wait;
    private String url = "";

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

        //open main page
        //driver.get()

        //sometimes page could load slowly, so it's good place to add some wait.
        //What do you think about waiting for menu to be visible?

        //find and click on Woman tab
        //driver.findElement()...

        //find and click on Faded Short Sleeve T-shirts tile
        //driver.findElement()...

        //find and click on button 'Add to cart'
        //driver.findElement()...

        /*now it's time to click on Proceed button but it's on additional pop up.
        So let's wait for some condition! Which one would you like to use?
         */

        //ok, finally you can find and click on Proceed button
        //driver.findElement()...

        tearDown();
    }
}
