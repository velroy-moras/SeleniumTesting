import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdowns {
  public static void main(String[] args){
    System.setProperty("webdriver.chrome.driver","/Users/veljason/IdeaProjects/selenium/driver/chromedriver");
    WebDriver driver= new ChromeDriver();
    driver.get("https://www.flipkart.com/");
    driver.findElement(By.xpath("//span[@class='_1QZ6fC _3Lgyp8']")).click();
    driver.findElement(By.xpath("//a[@value='HYD']")).click();
    driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
    }
}
