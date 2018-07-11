package com.cybertek;

import org.openqa.selenium.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/*Test Case 1: Amazon search results1.Go to amazon.com
 * 2.Enter searchtermSelenium book
 * 3.Verify that a resultwith “Selenium Testing Tools Cookbook”is displayed anywhere in the results
 * 4.Enter search term Java OCA book
 * 5.Verify that a resultwith “Selenium Testing Tools Cookbook”is not displayed anywhere in the results
 * 
 * Test Case 2: Amazon search results
 * 1.Go to amazon.com2.Enter searchtermSelenium book
 * 3.Verify all results contain the work “selenium”case insensitive
 * 
 * Test Case 3: Amazon search results
 * 1.Go to amazon.com
 * 2.Enter searchtermSelenium book
 * 3.Verify prime check box is not selected
 * 4.Check the prime checkbox
 * 5.Verify that top 5 results are still same
 * 
 * Test Case 4: Etsy shop locations
 * 1.Go to etsy.com
 * 2.Enter anysearchterm
 * 3.Verify Shop location: Anywhere is checked
 * 4.Verify Shop location: United States is not checked
 * 5.Click on Shop location: United States
 * 6.Verify Shop location: Anywhere is checked
 * 7.Verify Shop location: United States is not checked
 */

public class SearchTests {

	  @Test
	  public void amazonSearchOne() throws InterruptedException {
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://amazon.com");
	    String str = "Selenium Testing Tools Cookbook";

	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys(str + Keys.ENTER);

	    String xpath = "//h2[@class='a-size-medium s-inline  s-access-title  a-text-normal'][.='Selenium Testing Tools Cookbook']";
	    // isDisplayed -> returns true of the element we located is displayed on the
	    // page

	    Assert.assertTrue(driver.findElement(By.xpath(xpath)).isDisplayed());
	    driver.findElement(By.id("twotabsearchtextbox")).clear();
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Java OCA book" + Keys.ENTER);

	    Thread.sleep(2000);

	    try {
	      // if the element is still in the html, this line line will handle
	      Assert.assertFalse(driver.findElement(By.xpath(xpath)).isDisplayed());
	    } catch (NoSuchElementException e) {
	      // if the element is not in the html at all, exceptoin will be thrown
	      // since are verify sth does not exist, NoSuchElementException means test should
	      // pass
	      e.printStackTrace();
	    }

	  }

	}
