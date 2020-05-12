package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import objectrepository.GmailLogin;

public class Logintogmail {
  
	WebDriver driver = new FirefoxDriver();
	@Test
	  public void hubLogin() 
  {
	  WebDriver driver = new FirefoxDriver();
	  driver.get("https://accounts.google.com/ServiceLogin?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1#identifier");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  GmailLogin gl = new GmailLogin(driver);
	  gl.username().sendKeys("test123@gmail.com");
	  driver.close();
	  //gl.next().click();
	  //gl.password().sendKeys("pass");	 
	 
  }
	@Test
	  public void nodeLogin() 
	  {
		  WebDriver driver = new FirefoxDriver();
		  driver.get("https://accounts.google.com/ServiceLogin?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1#identifier");
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  GmailLogin gl = new GmailLogin(driver);
		  gl.username().sendKeys("testing123@gmail.comm");
		  driver.close();
		//  gl.next().click();
		 // gl.password().sendKeys("pass");	 
		 
	  }
	
}