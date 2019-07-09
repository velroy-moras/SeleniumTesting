import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Forfirefox {
  public static void main(String[] args){
    System.setProperty("webdriver.gecko.driver","/Users/veljason/IdeaProjects/selenium/driver/geckodriver");
    WebDriver driver =new FirefoxDriver();
    driver.get("http://facebook.com");
    System.out.println(driver.getTitle());

  }
}
