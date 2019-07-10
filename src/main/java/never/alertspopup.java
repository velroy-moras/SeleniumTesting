package never;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertspopup {
  public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","/Users/veljason/IdeaProjects/selenium/driver/chromedriver");
    WebDriver driver=new ChromeDriver();
    driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
    driver.findElement(By.cssSelector("input[value='Confirmation Alert']")).click();
    Thread.sleep(1000);
    System.out.println(driver.switchTo().alert().getText());
    driver.switchTo().alert().dismiss();
    driver.quit();
  }
}
