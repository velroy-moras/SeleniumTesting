import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathncss {
  public static void main(String[] args){
    System.setProperty("webdriver.chrome.driver","/Users/veljason/IdeaProjects/selenium/driver/chromedriver");
    WebDriver driver =new ChromeDriver();
    driver.get("https://www.facebook.com/");
    driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("veljason@hotmail.com");
    driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("velroy123");
    driver.findElement(By.id("u_0_2")).click();
    driver.findElement(By.tagName("//*[@id=\'js_34\']/div")).click();
    driver.findElement(By.cssSelector("#fbNotificationsJewel")).click();
    System.out.println(driver.findElement(By.xpath("//*[@id=\'fbNotificationsFlyout\']")));
    driver.close();
  }
}
