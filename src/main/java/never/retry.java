package never;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class retry {

  public static void main(String[] args){
    System.setProperty("webdriver.chrome.driver","/Users/veljason/IdeaProjects/TestBot/driver/chromedriver");
    WebDriver driver = new ChromeDriver();
    String BaseUrl="https://myevive.com/signin";
    String text="";

    driver.get(BaseUrl);
    text= driver.findElement(By.name("viewport")).getText();
    System.out.println(text);
    driver.close();
    System.exit(0);

  }

}
