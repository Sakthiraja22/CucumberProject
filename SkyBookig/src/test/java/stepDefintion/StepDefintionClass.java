package stepDefintion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.FlightSerach;

public class StepDefintionClass {
	
	WebDriver driver;
	
	@Given("^Broswer Launch and Enrter URl$")
	public void broswer_Launch_and_Enrter_URl() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAKTHIRAJA\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		
		driver.get("https://www.templatemonster.com/demo/61270.html");
		
		driver.manage().window().maximize();
	}

	@When("^Select Trip, Enter From and To Location, Select Class, Depature Date, Click on Seacrch flight$")
	public void select_Trip_Enter_From_and_To_Location_Select_Class_Depature_Date_Click_on_Seacrch_flight() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		FlightSerach obj =  new FlightSerach(driver);
		obj.setFrom("");
	}

	@Then("^Search Result Show$")
	public void search_Result_Show() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}


}
