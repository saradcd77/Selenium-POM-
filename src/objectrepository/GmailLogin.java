package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GmailLogin {
		
		WebDriver driver;
		String hello;

		public GmailLogin(WebDriver driver)
		{
			this.driver = driver;
		}
		
		By username = By.xpath("//input[@id='identifierId']");
		By next = By.xpath("//input[@class='CwaK9']");
		By password = By.xpath("//input[@id='password']");
		
		public WebElement username()
		{
			return driver.findElement(username);
		}
		
		public WebElement next()
		{
			return driver.findElement(next);
		}
		
		public WebElement password()
		{
			return driver.findElement(password);
		}
	}

