package PropertiesProject;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

//Create a maven project 
//
//
//Create a properties file to store 
//URL = http://automationpractice.com/index.php
//User = waya@IOreak.net
//Password = password
//
//inside your test use the utility class to access URL , USER , PASSWORD
//
//Create a test for login functionlity 
//
//// NAVIGATE TO THE PAGE 
//// ENTER USER NAME AND PASSWORD
//// VERIFY YOU ARE LOGGED IN SUCCESSFULLY 
WebDriver driver;

	@BeforeClass //runs once for all tests
	public void setUp() {
		System.out.println("Setting up WebDriver in BeforeClass...");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
	}
	
	@Test
	public void logIn() {
	driver.get(ConfigLoader1.getMyValue("url"));		
	driver.findElement(By.xpath("//a[@class='login']")).click();
    	driver.findElement(By.id("email")).sendKeys(ConfigLoader1.getMyValue("User"));
    	driver.findElement(By.id("passwd")).sendKeys(ConfigLoader1.getMyValue("Password"));
    	driver.findElement(By.id("SubmitLogin")).click();
	}
	
	
}
