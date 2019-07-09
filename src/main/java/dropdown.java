import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
  public static void main(String[] args) {
      System.setProperty("webdriver.chrome.driver","/Users/veljason/IdeaProjects/selenium/driver/chromedriver");
    WebDriver driver= new ChromeDriver();
    driver.get("https://www.spicejet.com");
    Select s=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
    //s.selectByValue("USD");
    s.selectByIndex(5);
    s.selectByVisibleText("Select");
    driver.close();
  }
}
