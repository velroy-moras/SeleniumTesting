import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignmentRadius {
  public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","/Users/Krithi/IdeaProjects/selenium/driver/chromedriver");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.radiusagent.com/");
    driver.findElement(By.linkText("Log In")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Test123@gmail.com");
    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Password");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
  }
}
