package never;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tablexcercies {
  public static void main(String[] args){
    System.setProperty("webdriver.chrome.driver","/Users/veljason/IdeaProjects/TestBot/driver/chromedriver");
    WebDriver driver = new ChromeDriver();
    int sum=0;
    driver.get("https://www.cricbuzz.com/live-cricket-scorecard/21576/syl-vs-chittagong-7th-match-bangladesh-premier-league-2019");
    WebElement completetable = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
    int count=completetable.findElements(By.cssSelector("div[class='cb-col cb-col-8 text-right text-bold']")).size();
    System.out.println("Number of elements seen ="+count);
    List<String> allelement =new ArrayList<String>();
    for(int i=0;i<count;i++){
      allelement.add(completetable.findElements(By.cssSelector("div[class='cb-col cb-col-8 text-right text-bold']")).get(i).getText());
      }
   for(int i=1;i<count;i++){
     int newone =Integer.parseInt(allelement.get(i));
     sum=sum+newone;
     }
    String different=completetable.findElement(By.cssSelector("div[class='cb-col cb-col-8 text-bold cb-text-black text-right']")).getText();
    int newone2=Integer.parseInt(different);
    int finalvalue = sum+newone2;
    System.out.println("This is the final added value of scores including extras ="+finalvalue);
    String total=completetable.findElement(By.cssSelector("div[class='cb-col cb-col-8 text-bold text-black text-right']")).getText();
    int totalvalue=Integer.parseInt(total);
    System.out.println("The total of score board ="+totalvalue);
    if(totalvalue == finalvalue)
    {
      System.out.println("The added value matches equal value");
    }
    else{
      System.out.println("The values are not equal");
    }

}}
