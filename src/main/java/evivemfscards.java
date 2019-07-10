import java.time.Clock;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class evivemfscards extends Evivecredentials {
  public static void main(String[] args) throws InterruptedException {

    Evivecredentials e = new Evivecredentials();

    System.setProperty("webdriver.chrome.driver", "/Users/veljason/IdeaProjects/TestBot/driver/chromedriver");
    WebDriver driver = new ChromeDriver();
    driver.get("https://myevive.com/signin");
    driver.findElement(By.xpath("//input[@name='username']")).sendKeys(e.getusername());
    driver.findElement(By.xpath("//input[@name='password']")).sendKeys(e.getpassword());
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    Thread.sleep(10000);
    List<WebElement> item = driver.findElements(By.cssSelector(".ui.centered.spaced.middle.aligned.image"));
    System.out.println(item.size());
    Actions a = new Actions(driver);
    a.dragAndDropBy(item.get(2),-500,0).build().perform();

  }

}
