package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homelandingpage {
	
	    WebDriver driver;
		By login=By.xpath("//span[contains(text(),'Login')]");
		By crosssign=By.xpath("//div[@class='sumome-react-svg-image-container']");
		
		
		public Homelandingpage(WebDriver driver2) {
			this.driver=driver2;
		}


		public WebElement clickcross()
		{
			return driver.findElement(crosssign);
		}

		
		public WebElement getLogin()
		{
			return driver.findElement(login);
		}


}
