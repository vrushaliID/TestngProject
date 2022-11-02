package TestCasees;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Resources.BaseClass;
import pageObjectModel.LoginPagePage_Objects;
import pageObjectModel.SignupPageObjects;

public class verifySignUp extends BaseClass {
@ Test
public void signup() throws IOException, InterruptedException {	
driverInitialization();	
driver.get("https://login.salesforce.com/?locale=in");
LoginPagePage_Objects lp=new LoginPagePage_Objects(driver)	;
lp.tryForFree().click();
	
	SignupPageObjects sp=new SignupPageObjects(driver);
Thread.sleep(5000);
	
	sp.enterFirstName().sendKeys("vrushali");
	Select s=new Select(sp.selectJonTitle());
	s.selectByIndex(1);
	
	
	
	
}	
}
