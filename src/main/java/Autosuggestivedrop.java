import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestivedrop {
  public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","/Users/veljason/IdeaProjects/TestBot/driver/chromedriver");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.ksrtc.in/oprs-web/guest/home.do?h=1");
    String tofind="AIPORT";
    WebElement source=driver.findElement(By.cssSelector("#fromPlaceName"));
    source.sendKeys("BEN");
    Thread.sleep(2000);
    source.sendKeys(Keys.ARROW_DOWN);
    JavascriptExecutor jse= (JavascriptExecutor)driver;
    String script="return document.getElementById(\"fromPlaceName\").value";
    String inputbox = (String)jse.executeScript(script);
    System.out.println(inputbox);
    while(!inputbox.contains(tofind)){
    source.sendKeys(Keys.ARROW_DOWN);
    Thread.sleep(2000);
    inputbox = (String)jse.executeScript(script);
    System.out.println(inputbox);
    if(inputbox.contains(tofind)){
      source.sendKeys(Keys.ENTER);
    }
    }
}}
