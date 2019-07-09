import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lecture1 {
  public static void main(String[] args)
  {
    System.setProperty("webdriver.chrome.driver","/Users/veljason/IdeaProjects/selenium/driver/chromedriver");
    WebDriver driver=new ChromeDriver();
    driver.get("https://byjus.com/");
    System.out.println(driver.getTitle());

  }
}
