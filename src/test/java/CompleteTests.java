import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CompleteTests {

  private WebDriver driver;

  private void setDriver() {
    System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
    driver = new ChromeDriver();
  }

  @Test
  public void click_dresses_success() {
    setDriver();
    driver.get("http://automationpractice.com/index.php");
    driver.findElement(By.xpath("//a[@title='Dresses']"));
  }

  @Test
  public void sendKeys_searchBox_success() {
    setDriver();
    driver.get("http://automationpractice.com/index.php");
    driver.findElement(By.xpath("//input[@name='search_query']"));
    driver.findElement(By.xpath("//button[@name='submit_search']")).click();
  }


  @Test
  public void getText_firstProduct_success() {
    setDriver();
    driver.get("http://automationpractice.com/index.php");
    driver.findElement(By.xpath("(//a[@class='product-name'])[1]"));
  }

  @Test
  public void click_offer_success() {
    setDriver();
    driver.get("http://automationpractice.com/index.php");
    // XPath to element (//a[@class="item-link"])[1]
  }


}
