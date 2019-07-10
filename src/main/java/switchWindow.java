import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchWindow {
  public static void main(String[] args) throws InterruptedException{
    System.setProperty("webdriver.chrome.driver","/Users/veljason/IdeaProjects/TestBot/driver/chromedriver");
    WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    driver.get("https://www.google.com/intl/en_in/about/?utm_source=google-IN&utm_medium=referral&utm_campaign=hp-footer&fg=1");
    System.out.print("Before switching - ");
    System.out.println(driver.getTitle());
    driver.findElement(By.linkText("Privacy")).click();
    List<WebElement> listOfLinks =  driver.findElements(By.xpath("//li[@class='ad72vb']"));
    Thread.sleep(1000);
    System.out.println(listOfLinks.size());
    listOfLinks.get(0).click();
    Set<String> id = driver.getWindowHandles();
    Iterator<String> it=id.iterator();
    String parentid=it.next();
    while(it.hasNext()){
    String childid=it.next();
    String grandchild=it.next();
    driver.switchTo().window(childid);
    System.out.print("After switching to child id - ");
    System.out.println(driver.getTitle());
    driver.switchTo().window(grandchild);
    System.out.print("Switching to grandchild - ");
    System.out.println(driver.getTitle());
    driver.switchTo().window(parentid);
    System.out.print("Back to parent");
    System.out.println(driver.getTitle());
    }
  }}
