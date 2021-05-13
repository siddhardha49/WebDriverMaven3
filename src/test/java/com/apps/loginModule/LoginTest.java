package com.apps.loginModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	WebDriver driver=null;
	
	
	
	@Test
	void doLogin() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://www.gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("siarikondasiddhu");
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
		System.out.println("end of testing");
		System.out.println("one more check");
		
	}

}
