
import org.apache.logging.log4j.*;

public class Logging {
private static Logger log = LogManager.getLogger(Logging.class.getName());
  public static void main(String[] args){
  log.error("I am not working");
  log.info("This is an information");
  log.warn("This is a warning");



  }
}
