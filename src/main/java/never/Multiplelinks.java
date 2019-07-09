package never;

import java.util.*;
import java.util.stream.Collectors;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplelinks {
  public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "/Users/veljason/IdeaProjects/TestBot/driver/chromedriver");
    WebDriver driver = new ChromeDriver();
    driver.get("http://qaclickacademy.com/practice.php");
    WebElement footercontent = driver.findElement(By.id("gf-BIG"));
    WebElement Discountcontent = footercontent.findElement(By.xpath("//table[@class='gf-t']/tbody/tr/td[1]"));
    int links=Discountcontent.findElements(By.tagName("a")).size();
    ArrayList<String> jane = new ArrayList<String>();
    System.out.println(links);
    for(int i=1;i<links;i++)
    {
      String clickontab= Keys.chord(Keys.COMMAND,Keys.ENTER);
      Discountcontent.findElements(By.tagName("a")).get(i).sendKeys(clickontab);
      Thread.sleep(5000);
    }
    Set<String> it = driver.getWindowHandles();
    Iterator<String> abc = it.iterator();
    while(abc.hasNext()) {
      driver.switchTo().window(abc.next());
      String a = driver.getTitle();
      jane.add(a);
      }
     System.out.println(jane);
      if(jane.contains("Practice ")) {

        System.out.println("Im here ");
      }
      else System.out.println("Doesnt work");


  }
}
