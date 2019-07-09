import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathpro {
  public static void main(String[] args){
    System.setProperty("webdriver.chrome.driver","/Users/veljason/IdeaProjects/selenium/driver/chromedriver");
    WebDriver driver =new ChromeDriver();
    driver.get("http://www.qaclickacademy.com/interview.php");
    driver.findElement(By.xpath("//*[text()=' Selenium ']")).click();
    driver.navigate().back();
    }
}
