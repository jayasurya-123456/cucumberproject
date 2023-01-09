package org.stepdefinition;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.BaseClass;
import util.PojoClass;

public class StepDefinition extends BaseClass {
	@Given("user should launch the chrome and load thr url and maximize the window")
	public void user_should_launch_the_chrome_and_load_thr_url_and_maximize_the_window() throws InterruptedException, IOException {
		
		launchChrome();
	    maximize();
	    loadUrl("https://www.globalsqa.com/demo-site/datepicker/");
	   
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("user should click the the datepicker functionality")
	public void user_should_click_the_the_datepicker_functionality() throws InterruptedException {
	    PojoClass p = new PojoClass();
	   
	    frameWebElement(p.getTxtuser());
	    
	    
	    click(p.getTxtdate());
	    
	    
	}
	@Then("user should select the date in the datepicker page")
	public void user_should_select_the_date_in_the_datepicker_page() throws InterruptedException, IOException {
	  datePicker("January","2023","30");
	
	///String s1 = s.getName();
	//String name = s1.replace(" ", "_");
//screenShot(name);
	  
	}
	



}
