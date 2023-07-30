package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	public int a=10;
	public static int b=20;
	
	
	 public void getLogin(){
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		
		
		
	}
	
	public static void getPayment(){
		System.out.println("Hello");
	}
	 public void getLogin(String name){
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://magento.softwaretestingboard.com/");
			
			
			
		}
	 public void getLogin(String name,String URL){
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://magento.softwaretestingboard.com/");
			
			
			
		}
		
		public static void getPayment(int value){
			System.out.println("Hello");
		}
}
