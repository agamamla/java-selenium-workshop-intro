import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
  }
}
