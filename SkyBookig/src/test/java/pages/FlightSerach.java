package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlightSerach {
	
	WebDriver driver;
	By  elefrom =  By.id("select2-veiy-container");
	By  eleTo =  By.id("select2-veiy-container");
	By setcabin =By.id("select2-jb4e-container");
	
	public FlightSerach(WebDriver driver)
	{
		this.driver = driver;
		
	}
	
	public void setFrom(String 	str) {
		
		driver.findElement(elefrom).sendKeys(str);
		
	}
	public void setTo(String 	str) {
		
		driver.findElement(elefrom).sendKeys(str);
		
	}

	public void setcabin (String str)
	{
		driver.findElement(setcabin) .sendKeys(str);
		
		
	}
	

}
