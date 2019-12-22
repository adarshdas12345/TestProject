package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	
	public static WebDriver driver;
	public Properties prop;
	public WebDriver intializeDriver() throws IOException
	{
		 prop=new Properties();
		FileInputStream fis= new FileInputStream("E:\\SELENIUM_PRACTICE\\Workspace\\E2Eframework\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		if(browserName.equals("Chrome")) //cant use == symbole because we are comparing attribute value
		{
			//execute chrome driver code
			
		 System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM_PRACTICE\\selenium_setup\\chrome\\chromedriver.exe");
		 driver=new ChromeDriver();
			
		}
		
		else if(browserName.equals("Firefox"))
		{
			 driver=new FirefoxDriver();
		}
		
		else if(browserName.equals("IE"))
		{
			
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		return driver;
		
	}
	
}
