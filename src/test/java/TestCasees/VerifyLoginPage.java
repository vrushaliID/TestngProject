package TestCasees;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resources.BaseClass;
import bsh.org.objectweb.asm.Constants;
import pageObjectModel.LoginPagePage_Objects;

public class VerifyLoginPage extends BaseClass {

	@Test( data provider="testData")
	public void loginVerification(String Username,String Password) throws IOException {
	
	driver=	 driverInitialization();
	driver.get("https://login.salesforce.com/?locale=in");

	LoginPagePage_Objects Lp=new LoginPagePage_Objects(driver);
	Lp.enterusername().sendKeys(Username);
	Lp.enterpassword().sendKeys(Password);
	Lp.clickonlogin ().click();
	}
	
	 @DataProvider
	 public Object[][] testData() {
	  Object[][] data=new Object[2][2];
	  data[0][0]=Constants.username1;
	  data[0][1]=Constants.password1;
	  data[1][0]=Constants.username2;
	  data[1][1]=Constants.password2;
	  return data;
	 }
	
	
	
	
	
	
	
	
}
}