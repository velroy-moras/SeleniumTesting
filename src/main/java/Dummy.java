import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dummy {
  public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","/Users/veljason/IdeaProjects/selenium/driver/chromedriver");
    WebDriver driver= new ChromeDriver();
    driver.get("https://ehealthreminders.net/validate");
    WebElement inputField = driver.findElement(By.cssSelector("input.input.span3"));
    WebElement submitButton= driver.findElement(By.cssSelector("button.medium.button.center.expand.black-button"));
    Thread.sleep(500);
    submitButton.click();
    Thread.sleep(500);
//    JavascriptExecutor js = (JavascriptExecutor)driver;
//    String popUp = (String) js.executeScript("return arguments[0].required.value;",inputField);
    String popUp = inputField.getAttribute("validationMessage");
    System.out.println(popUp);

  }
}
