package Com.crmVtigerApplication.Generic;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import Com.crmVtigerApplication.Page.Login.Login;

public class Util {
	
	public static WebDriver DriverObject;
	public static Properties file;
    public static JavascriptExecutor Js;
    
	////////////////////////////////////////////////
    public static Login LaunchBrowser(String BrowserName) {
    	
    	if(BrowserName.equalsIgnoreCase("FF")) {
    		
    		System.setProperty("webdriver.geckodriver.driver","Driverss\\geckodriver.exe");
    		DriverObject=new FirefoxDriver();
    		DriverObject.manage().window().maximize();
    		DriverObject.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
    	}
    	else if(BrowserName.equalsIgnoreCase("CH")) {
    		
    		System.setProperty("webdriver.chrome.driver","Driverss\\chromedriver.exe");
    		DriverObject=new ChromeDriver();
		    DriverObject.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		    DriverObject.manage().window().maximize();
    	}
    	
    	else if(BrowserName.equalsIgnoreCase("IE")) {
    		DriverObject=new InternetExplorerDriver();
    		System.setProperty("webdriver.ie.driver","Drivers\\IEDriverServer.exe");
    		DriverObject.manage().window().maximize();
    		DriverObject.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
    	}
    	
    	else {
    		
    		
    	    System.out.println("Browser name is Incorrect");
    	}
    	
    	Login Login=PageFactory.initElements(DriverObject, Login.class);
    	return Login; 
	
       }
    //////////////////////////////////////////////////////////////
    
      public static Login OpenURL(String URL) {
    	  
    	  DriverObject.get(URL); 
    	  Login Login=PageFactory.initElements(DriverObject, Login.class);
    	  return Login;
    	 
      }
    ///////////////////////////////////////////////////////////////////
      }
    
      
