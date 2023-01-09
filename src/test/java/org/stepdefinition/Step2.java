package org.stepdefinition;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.BaseClass;

public class Step2 extends BaseClass {
	public static Properties prop;
	@Given("user should launch the chrome and load thr url and maximize the windows")
	public void user_should_launch_the_chrome_and_load_thr_url_and_maximize_the_windows() throws Throwable {
		prop = new Properties();
		 FileInputStream read = new FileInputStream("C:\\Users\\d.jayasurya\\eclipse-workspace\\MavenProject\\Property\\Testdata.properties"); 
		 prop.load(read);
		 launchChrome();
	    maximize();
	   loadUrl(prop.getProperty("url"));   
	   WebElement log = driver.findElement(By.xpath(prop.getProperty("loginxpath")));
	   click(log);
	   Thread.sleep(2000);
	 allWindow();
	 Thread.sleep(2000);
	}

	@When("user should enter the valid username and password")
	public void user_should_enter_the_valid_username_and_password() throws Throwable {
		    WebElement use = driver.findElement(By.xpath(prop.getProperty("usexpath")));
		    sendKeys(use,prop.getProperty("username"));
		    WebElement pas = driver.findElement(By.xpath(prop.getProperty("passxpath")));
		    sendKeys(pas,prop.getProperty("password")); 
		   doScreenShot("login", ".png");
	}

	@Then("user should navigate to home page")
	public void user_should_navigate_to_home_page() {
	   // driver.close();
	}
}
