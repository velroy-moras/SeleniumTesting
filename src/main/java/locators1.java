import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators1 {
  public static void main(String[] args){
    System.setProperty("webdriver.chrome.driver","/Users/veljason/IdeaProjects/selenium/driver/chromedriver");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.facebook.com");
    driver.findElement(By.id("email")).sendKeys("veljason@hotmail.com");
    driver.findElement(By.id("pass")).sendKeys("wrong");
    driver.findElement(By.linkText("Forgotten account?")).click();
    driver.close();
    }
}
