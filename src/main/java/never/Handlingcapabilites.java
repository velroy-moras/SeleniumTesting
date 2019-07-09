package never;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Handlingcapabilites {
  public static void main(String[] args){
    //General chrome capabilities
    DesiredCapabilities ch=DesiredCapabilities.chrome();
    ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
    //or ch.acceptInsecureCerts();

    ChromeOptions c = new ChromeOptions();
    c.merge(ch);
    WebDriver driver = new ChromeDriver(c);


  }
}
