package never;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator{
public static void main(String[] args){
    System.setProperty("webdriver.chrome.driver","/Users/veljason/IdeaProjects/TestBot/driver/chromedriver");
    WebDriver driver = new ChromeDriver();
    String BaseUrl="http://www.facebook.com";
    String className= "";


      driver.get(BaseUrl);
      className = driver.findElement(By.id("login_form")).getText();
     System.out.println(className);
      driver.close();
      System.exit(0);
      }
}
