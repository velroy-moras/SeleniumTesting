package never;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class formmethods1 {
  public static void main(String[] args){
    System.setProperty("webdriver.chrome.driver","/Users/veljason/IdeaProjects/selenium/driver/chromedriver");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.makemytrip.com/");
    System.out.println("Before the radio button is clicked");
    System.out.println(driver.findElement(By.xpath("//input[@id='hp-widget__return']")).isDisplayed());
    System.out.println("After the radio button is clicked");
    driver.findElement(By.xpath("//label[@for='switch__input_3']")).click();
    System.out.println(driver.findElement(By.xpath("//input[@id='hp-widget__return']")).isDisplayed());
    }
}
