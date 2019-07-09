import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentDropdowns {
  public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","/Users/veljason/IdeaProjects/TestBot/driver/chromedriver");
    WebDriver driver = new ChromeDriver();
    WebDriverWait w = new WebDriverWait(driver,10);
    driver.get("https://www.cleartrip.com/");
    Select sel1= new Select(driver.findElement(By.id("Adults")));
    sel1.selectByValue("6");
    Select sel2= new Select(driver.findElement(By.id("Childrens")));
    sel2.selectByValue("2");
    driver.findElement(By.cssSelector(".icon.ir.datePicker")).click();
    driver.findElement(By.xpath("//a[contains(@class,'ui-state-default')]")).click();
    driver.findElement(By.id("MoreOptionsLink")).click();
    driver.findElement(By.cssSelector("input[name='airline']")).sendKeys("Indigo");
    driver.findElement(By.id("SearchBtn")).click();
    String error = w.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("homeErrorMessage")))).getText();
    System.out.println(error);
    }
}
