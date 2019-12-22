package FrameworkDevlopement.E2Eframework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;



import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import pageObjects.Homelandingpage;
import pageObjects.LoginPage;
import resources.base;

public class Basehomepage extends base {
	
	//public static Logger log=LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void navigateToURL() throws IOException
	{
		driver=intializeDriver();
		//Log.info("driver got intilized");
		
	}
	
	@Test(dataProvider="getData")
	public void homePageNavigation(String email,String password) throws IOException
	{
		driver.get(prop.getProperty("Url"));
		Homelandingpage l=new Homelandingpage(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);	
		l.getLogin().click();
		
		LoginPage m= new LoginPage(driver);
		m.emailid().sendKeys(email);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		m.password().sendKeys(password);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		m.clickLoginButton().click();
	}
	
	
	
	@DataProvider
	public Object[][] getData()
	{ 
		//row-how many test case you have
		//column-per each test case how many data you are providng
		Object[][] data= new Object[2][2];
		data[0][0]="nonrestricteduser@gmail.com";
		data[0][1]="1234";
		
		data[1][0]="restricteduser@gmail.com";
		data[1][1]="myabc456";
		
		return data;
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}

}
