import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class geturl {
  public static void main(String[] args){
    System.setProperty("webdriver.chrome.driver","/Users/veljason/IdeaProjects/selenium/driver/chromedriver");
    WebDriver driver= new ChromeDriver();
    driver.get("https://www.facebook.com/");
    System.out.println(driver.getCurrentUrl());
    // System.out.println(driver.getPageSource());
    driver.findElement(By.xpath("//input[@type='email']")).sendKeys("veljason@hotmail.com");
    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("velroy");
    driver.quit();


  }
}
