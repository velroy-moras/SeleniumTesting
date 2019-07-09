import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass1 {
  public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","/Users/veljason/IdeaProjects/selenium/driver/chromedriver");
    WebDriver driver = new ChromeDriver();
    driver.get("https://myevive.com/signin");
    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("test1049csuser18@goevive.com");
    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("evivetest");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    Thread.sleep(2000);
    driver.findElement(By.linkText("Current Status")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//button[@class='ev-cs__btn-edit-info']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//a[@class='ev-cs__account-page-edit-button']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Velroy");
    driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.chord(Keys.COMMAND,"A",Keys.DELETE));

  }

}
