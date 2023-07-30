package com.testrun;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LumaLogin {

	@Test
	public void getLogin() throws Exception {
		// check environment
		String ENV_CONFIG = System.getProperty("env.config");
		ENV_CONFIG = System.getProperty("env.config");
		System.out.println("Environment selected to run test = " + ENV_CONFIG);
		FileInputStream fis = new FileInputStream(ENV_CONFIG);
		Properties pro = new Properties();
		pro.load(fis);

		// ============== start selenium java code
		// Create a new instance of the WebDriver (ChromeDriver or FirefoxDriver)
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Open the Magento demo site
		driver.get(pro.get("APPLICATION_URL").toString());

		// Find the login link and click it
		WebElement loginLink = driver.findElement(By.linkText("Sign In"));
		loginLink.click();

		// Find the email and password fields and enter the login credentials
		WebElement emailField = driver.findElement(By.xpath("//input[@id='email']"));
		emailField.sendKeys(pro.get("USER_NAME").toString());

		WebElement passwordField = driver.findElement(By.xpath("//input[@id='pass']"));
		passwordField.sendKeys(pro.get("PASSWORD").toString());

		// Find the login button and click it
		WebElement loginButton = driver.findElement(By.xpath("//button[@id='send2']"));
		loginButton.click();

		// Close the browser
		// driver.quit();
	}
}
