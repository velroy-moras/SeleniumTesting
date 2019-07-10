import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {
  public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","/Users/veljason/IdeaProjects/TestBot/driver/chromedriver");
    WebDriver driver = new ChromeDriver();
    driver.get("http://qaclickacademy.com/practice.php");
    WebElement checkbox = driver.findElement(By.id("checkbox-example"));
    WebElement check = checkbox.findElement(By.xpath("//label[@for='honda']"));
    String checkboxtext = check.getText();
    System.out.println("Selected option in Checkbox example = " + checkboxtext);
    int selection = checkbox.findElements(By.xpath("//input[@type='checkbox']")).size();
    for (int i = 0; i < selection; i++) {
      if (i == 2) {
        checkbox.findElements(By.xpath("//input[@type='checkbox']")).get(i).click();
      }
    }
    Select s = new Select(driver.findElement(By.xpath("//select[contains(@id,'dropdown')]")));
    s.selectByVisibleText(checkboxtext);
    WebElement option = s.getFirstSelectedOption();
    String dropdowntext=option.getText();
    System.out.println("Selected option in Dropdown = "+dropdowntext);
    if(dropdowntext.equals(checkboxtext))
    {
      System.out.println("Checkbox and dropdown text matched.");
    }
    Thread.sleep(1000);
    driver.findElement(By.cssSelector("input[id='name']")).sendKeys(checkboxtext);
    driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
    String alerttext=driver.switchTo().alert().getText();
    System.out.println("Popup text = "+alerttext);
    if(alerttext.contains(checkboxtext)){
      System.out.println("Popup contains checkbox text");
    }
     else System.out.println("Popup does not contain checkbox text");
    driver.switchTo().alert().accept();
    driver.close();
  }
}


