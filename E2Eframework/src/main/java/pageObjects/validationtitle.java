package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class validationtitle {
	
	    WebDriver driver;
		By title=By.xpath("//h2[contains(text(),'Featured Courses')]");
		
		
		public validationtitle(WebDriver driver2) {
			this.driver=driver2;
		}


		

		public WebElement getTitle()
		{
			return driver.findElement(title);
		}


}
