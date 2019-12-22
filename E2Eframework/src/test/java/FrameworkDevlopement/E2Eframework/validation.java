package FrameworkDevlopement.E2Eframework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.Homelandingpage;
import pageObjects.LoginPage;
import pageObjects.validationtitle;
import resources.base;

public class validation extends base {
	
	
	@BeforeTest
	public void geturl() throws IOException
	{
		driver=intializeDriver();
		driver.get("http://www.qaclickacademy.com");
	}
	
	@Test
	public void homePageNavigation() throws IOException
	{
		
		Homelandingpage l=new Homelandingpage(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);	
		validationtitle n= new validationtitle(driver);
		
		Assert.assertEquals(n.getTitle().getText(),"FEATURED COURSES");
		
	}
	
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
	
	

}
