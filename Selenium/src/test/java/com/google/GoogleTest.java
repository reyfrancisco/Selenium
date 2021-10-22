package com.google;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class GoogleTest {
	
	@Test
	public void f() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // This is an object that would change its form like polymorphism behavior //
											   // And is an object kind of Web Driver, named driver,
										       // It would take many different forms like polymorphism definition.
//		driver = new FirefoxDriver();          // The object Driver would have many forms in the constructor definition,  it is possible using the Selenum Dependecies already Charged. 
//  	driver.get("https://www.zurich.com/");
		driver.get("https://www.google.com/");	// lunch Browser
		driver.manage().window().maximize();    // Handle the window. 
												//  And all is based WebDrive object called driver and handled by any constructor 
		
		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  //  Zinchronization 
		
		System.out.println();

		// Explicit wait    
		WebDriverWait wait = new WebDriverWait(driver, 20);      //  waiting until search explicit element in the DOM file
//	    wait.until(ExpectedConditions.titleContains("Zurich"));
		wait.until(ExpectedConditions.titleContains("Google"));
		System.out.println("Google is FOUND IT !!");
		
/*		
		String getTitle = "Google";		            // To declare a variable String kind  to use for prospective
		
		//   HARD Assertion || Validation           // Help us to do specific Test Case VALIDATIONS !!
	//	Assert.assertEquals(getTitle, "Google");    // This assertion is a variables comparison  "Hard Assertion"  just if the affirmation its ok will finish successfully 
		
		// SOFT Assertion || Validation     	   // Help us to prescind from additional validations out of focus.
		SoftAssert soft = new SoftAssert();        // Assertion that does not stop the program execution. Is allowed to continue
		soft.assertEquals(getTitle, "Google");   // Despite does not found the correct word as validation		 
												   // all the program will run without issues, obligatory !!
		System.out.println("The word Google was looked correctly");		
		
		soft.assertAll();
*/
		
	}

	@BeforeTest
	public void beforeTest() {
	}

	@AfterTest
	public void afterTest() {
	}

}
