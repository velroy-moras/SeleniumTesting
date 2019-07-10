package never;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobuttons {
  public static void main(String[] args){
      System.setProperty("webdriver.chrome.driver","/Users/veljason/IdeaProjects/selenium/driver/chromedriver");
                         WebDriver driver=new ChromeDriver();
                         driver.get("http://www.echoecho.com/htmlforms10.htm");
                         int count = driver.findElements(By.xpath("//input[@name='group1']")).size();
                         for(int i=0;i<count;i++)
                         {
                          String text= driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
                          if(text.equalsIgnoreCase("Cheese"))
                          {
                            driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
                            }
                           }

  }
}
