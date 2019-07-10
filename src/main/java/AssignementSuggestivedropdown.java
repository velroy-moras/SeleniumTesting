import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignementSuggestivedropdown {
  public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","/Users/veljason/IdeaProjects/TestBot/driver/chromedriver");
    WebDriver driver = new ChromeDriver();
    driver.get("http://www.qaclickacademy.com/practice");
    WebElement source = driver.findElement(By.id("autocomplete"));
    JavascriptExecutor js =(JavascriptExecutor) driver;
    String script = " return document.getElementById(\"autocomplete\").value";
    String newscript = (String) js.executeScript(script);
    source.sendKeys("ind");
    Thread.sleep(2000);
    source.sendKeys(Keys.ARROW_DOWN);
    int i = 0;
    String word = "INDIA";
    while(!newscript.equalsIgnoreCase(word)){
      i++;
      source.sendKeys(Keys.ARROW_DOWN);
      newscript = (String) js.executeScript(script);
      System.out.println(newscript);
      if(i>3){
        System.out.println("Cannot find the required word");
        break;
      }

      if(newscript.equalsIgnoreCase(word)){
        System.out.println("The word is found hence pressing enter");
        source.sendKeys(Keys.ENTER);
      }
    }

  }
}
