import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FullTestCase {

  private WebDriver driver;

  private void setDriver() {
    System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
    driver = new ChromeDriver();
  }

  @Test
  public void writeItYourself() {
    /*
     Set driver, open homepage of http://automationpractice.com, choose first product and add it to cart
    */
    setDriver();
    driver.get("http://automationpractice.com");
    WebElement element = driver.findElement(By.xpath("(//div[@class='product-image-container'])[1]"));
    Actions builder = new Actions(driver);
    builder.moveToElement(element).perform();
    driver.findElement(By.xpath("(//div[@class='product-image-container'])[1]//..//..//a[@title='Add to cart']")).click();
  }
}
