package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
public WebDriver driver;
	public WebDriver  driverInitialization() throws IOException {
	
	FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\End2EndTestngProject\\src\\main\\java\\Resources\\data.properties");
	Properties prop=new Properties();
	prop.load(fis);
	
	
String browserName=	prop.getProperty("browser");
if(browserName. equalsIgnoreCase("chrome"))	{

	System.setProperty ("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe" );
	
	 driver = new ChromeDriver ()	;
	
		
		
			
}
else if(browserName.equalsIgnoreCase("firefox")) {
 
 
}
else if(browserName.equalsIgnoreCase("edge")) {
 
 //Edge code
}
else {
 
 
	
	System.out.println("please enter valid browser name"); 
	
	return driver;
	
}
return driver;	
	}
}