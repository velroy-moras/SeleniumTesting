import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class actionsclass {
  public static void main(String[] args){
    System.setProperty("webdriver.chrome.driver","/Users/veljason/IdeaProjects/TestBot/driver/chromedriver");
    WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    driver.get("https://www.amazon.com/");
    Actions d = new Actions(driver);
    d.moveToElement(driver.findElement(By.xpath("//input[@type='text']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
    WebElement move = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
    d.moveToElement(move).build().perform();
    WebDriverWait w=new WebDriverWait(driver,5);
    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='nav-text']")));
    String s= driver.findElement(By.xpath("//span[@class='nav-text']")).getText();
    System.out.println(s);

  }
}
