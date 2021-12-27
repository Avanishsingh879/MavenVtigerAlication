package Com.crmVtigerApplication.Test.Login;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Com.crmVtigerApplication.Generic.ExcelApi;
import Com.crmVtigerApplication.Generic.Util;
import Com.crmVtigerApplication.Page.Login.Login;


public class Login_TestScript extends Util {
	
	public static String URL="";
    static String sheetName="Login";
	////////////////////////////////////////////////////////////////
	
	@BeforeMethod
	public void Test_VerifyOpenURL() {
	 
		LaunchBrowser("FF");
		OpenURL("http://localhost:8888/");
		System.out.println("Verify Launch Browser");
	}
	
	
	@DataProvider
	public Object[][]TestDatasheet(){
		Object data[][]=ExcelApi.TestData(sheetName);
		return data;
		
		
}
	

	@Test(priority=1,dataProvider="TestDatasheet")
	public void Verify_LoginTest(String username, String password) {
		
		Login lp=new Login();
		lp.Verify_ValidLogin(username, password);
		System.out.println("VerifyTest_Login Page");
	
	}
	
	
	@Test(priority=2)
	public void Verify_HomeLogo() {
		Login lp=new Login();
		lp.Verify_Logo();
		System.out.println("Test Verify Home Logo");
	
	}
	
   @AfterMethod
   public void Test_VerifyCloseURL() {
	   DriverObject.quit();
	   System.out.println(" Close URL");
	   
   }
	

}
