package Com.crmVtigerApplication.Page.Login;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Com.crmVtigerApplication.Generic.Util;
import Com.crmVtigerApplication.Page.HomePage.Home;



public class Login extends Util {
	public static String TestDataPath="C:\\Users\\dell\\eclipse-workspace\\workspace\\CRMVtigerApplication\\TestData\\Data.xlsx";
	//////////////////////////////////////////////////////////////
	
	@FindBy(name="user_name")
	public static WebElement Username_ED;
	
	@FindBy(name="user_password")
	public static WebElement Pwd_ED;
	
	@FindBy(linkText="Login")
	public static WebElement Login_clk;
	
	@FindBy(linkText="Home")
	public static WebElement Home_clk;
	
	@FindBy(linkText="Account")
	public static WebElement Account_clk;
	//////////////////////////////////////////////////////////////
	
	
	public static Home Verify_ValidLogin(String username,String password) {
		Username_ED.sendKeys(username);
		Pwd_ED.sendKeys(password);
		Login_clk.click();
		System.out.println("Login Sucessfully");
		String ActResult=DriverObject.getTitle();
	    String ExpResult="";
	    if(ActResult.equalsIgnoreCase(ExpResult)){
	    	
	    	System.out.println("HomePage_Title Verify");
	    }
	    
	    else {
	    	
	    	System.out.println("HomePage_Title Not Verify");
	    }
		
		Home_clk.click();
		Home Home=PageFactory.initElements(DriverObject, Home.class);
	    return Home;
		
	}
	
	public static void Verify_Logo() {
		String Acttitle=DriverObject.getTitle();
		String Exptitle="";
		if(Acttitle.equalsIgnoreCase(Exptitle)) {
			
			System.out.println("Logo_Title Matched");
		}
		
		else {
			
			System.out.println("Logo_Title not Matched");
		}
		
	}
	
}
