import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {
  public static void main(String[] args){
    System.setProperty("webdriver.chrome.driver","/Users/veljason/IdeaProjects/TestBot/driver/chromedriver");
    WebDriver driver = new ChromeDriver();
    driver.get("http://www.hotelpricescompare.com/?gclid=EAIaIQobChMIsJXr1oe_3gIV2YRwCh2KYw8HEAAYAyAAEgLQIvD_BwE");
    driver.findElement(By.cssSelector("input[type='text']")).click();
    driver.findElement(By.cssSelector("input[type='text']")).sendKeys("France");
    WebDriverWait d = new WebDriverWait(driver,5);
   d.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@id='ui-id-1']/li[1]")));
   String a = driver.findElement(By.xpath("//ul[@id='ui-id-1']/li[1]")).getText();
    driver.findElement(By.xpath("//ul[@id='ui-id-1']/li[1]")).click();
    System.out.println(a);
  }
}
