import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathpath {
  public static void main(String[] args){
    System.setProperty("webdriver.chrome.driver","/Users/veljason/IdeaProjects/selenium/driver/chromedriver");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.spicejet.com");
    System.out.println("The button checked="+driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
    System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_IndArm']")).isSelected());
    driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();
    System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());

  }
}
