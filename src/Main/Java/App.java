package radix.q5;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;

public class App 
{
    	  public static String userName = "YOUR_USERNAME";
    	  public static String accessKey = "YOUR_ACCESS_KEY";
    	  public static void main(String args[]) throws InterruptedException {

    		    
    		    String baseUrl = "https://www.facebook.com/";
    		    
    		    
    		    
    		    FirefoxDriver driver = new FirefoxDriver();
    		    JavascriptExecutor js = (JavascriptExecutor) driver;
    		    
    		    driver.get(baseUrl);
    		    driver.findElementById("Login").sendKeys(userName);
    		    //1000 milisegundos
    		    driver.wait(1000);
    		    driver.findElementById("Menu").click();
    		    driver.wait(1000);
    		    driver.findElementById("myPerfil").click();
    		    driver.wait(1000);
    		    driver.findElementById("Sobre").click();
    		    driver.wait(1000);
    		    driver.findElementById("Relacionamento").click();
    		    js.executeScript("window.scrollBy(0,-350)", "");
    		    driver.findElementByName("Relacionamento sério").click();
    		    driver.findElementById("Save").click();
    		    driver.wait(1000);
    		    driver.getScreenshotAs(OutputType.FILE);
    		    driver.close();
    		  }
    
}
