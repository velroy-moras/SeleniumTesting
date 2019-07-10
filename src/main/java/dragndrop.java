import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragndrop {
  public static void main(String[] args){
    System.setProperty("webdriver.chrome.driver","/Users/veljason/IdeaProjects/TestBot/driver/chromedriver");
    WebDriver driver = new ChromeDriver();
    driver.get("https://jqueryui.com/droppable/");
    driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
    WebElement source= driver.findElement(By.id("draggable"));
    WebElement destination=driver.findElement(By.id("droppable"));
    Actions a= new Actions(driver);
    a.dragAndDrop(source,destination).build().perform();
  }
}
