package com.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginPage  {
	@Test
	public void login() throws InterruptedException { 
System.setProperty("webdriver.chrome.driver","D:\\\\Selenium\\\\Chrome\\\\chromedriver.exe");
WebDriver driver =  new ChromeDriver();
//driver.get("https://www.google.co.in/");
//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("https://www.phptravels.net/login");
Thread.sleep(5000);
driver.manage().window().maximize();
//WebElement userEmail = driver.findElement(By.name("email"));
//userEmail.sendKeys("user@phptravels.com");
//WebElement password = driver.findElement(By.name("password"));
//password.sendKeys("demouser");
//WebElement LoginButton = driver.findElement(By.id("submitBTN"));
//LoginButton.click();
}
}