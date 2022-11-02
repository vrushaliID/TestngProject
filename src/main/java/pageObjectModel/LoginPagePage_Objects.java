package pageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPagePage_Objects {

	public WebDriver driver;
By username=By.xpath("//input[@id='username']");	
By password=By.xpath("//input[@id='password']")	;
By login = By.xpath("//input[@id='Login']")	;
By tryfree=By.xpath("//a[@id='signup_link']");	
	
public LoginPagePage_Objects(WebDriver driver2) {
	this.driver=driver2;
}	
public WebElement enterusername()	{
return driver.findElement(username);	
}

public WebElement enterpassword() {
return driver.findElement(password);
}

public WebElement enterpassword1() {
return driver.findElement(login);
}

public WebElement tryForFree () {
return driver.findElement(tryfree);
}

public WebElement clickonlogin() {
	// TODO Auto-generated method stub
	return driver.findElement(login);
}



}
