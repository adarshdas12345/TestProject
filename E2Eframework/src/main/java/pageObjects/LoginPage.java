package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	    WebDriver driver;
		By email=By.xpath("//input[@id='user_email']");
		By password=By.xpath("//input[@id='user_password']");
		By Login=By.xpath("//input[@value='Log In']");
		
		
		public LoginPage(WebDriver driver2) {
			this.driver=driver2;
		}


		public WebElement emailid()
		{
			return driver.findElement(email);
		}

		
		public WebElement password()
		{
			return driver.findElement(password);
		}
		

		public WebElement clickLoginButton()
		{
			return driver.findElement(Login);
		}


}
