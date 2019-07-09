import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators2 {
  public static void main(String[] args)
  {
    System.setProperty("webdriver.chrome.driver","/Users/veljason/IdeaProjects/selenium/driver/chromedriver");
    WebDriver driver=new ChromeDriver();
    driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
    driver.findElement(By.cssSelector("input[title *= 'Sign']")).click();

  }
}
