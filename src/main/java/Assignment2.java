import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
  public static void main(String[] args){
    System.setProperty("webdriver.chrome.driver","/Users/veljason/IdeaProjects/TestBot/driver/chromedriver");
    WebDriver driver = new ChromeDriver();
    driver.get("http://qaclickacademy.com/practice.php");
    driver.findElement(By.id("checkBoxOption1")).click();
    if(driver.findElement(By.id("checkBoxOption1")).isSelected())
    {
        System.out.println("Checkbox is sucessfully selected");
        driver.findElement(By.id("checkBoxOption1")).click();
    }
    if(!driver.findElement(By.id("checkBoxOption1")).isSelected())
    {
      System.out.println("Checkbox is sucessfully unselected");
    }
    int count = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
    System.out.println("The number of checkboxes present = "+count);
  }
}
