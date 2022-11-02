package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignupPageObjects {

	public WebDriver driver;
	
	By FirstName=By.xpath("//input[@name='UserFirstName']");
	By JobTitle=By.xpath("//select[@name='UserTitle']");

	
	
	
	public SignupPageObjects(WebDriver driver2) {
		this.driver=driver2;
	}

	public WebElement enterFirstName() {
	return driver.findElement(FirstName);
	}
	
	public WebElement selectJonTitle() {
	return driver.findElement(JobTitle);
	
	}
	
	
	
}
