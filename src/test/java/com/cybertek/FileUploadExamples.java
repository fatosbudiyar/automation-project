package com.cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadExamples {

  @Test
  public void testFileUpload() {
    
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.get("https://the-internet.herokuapp.com/upload");
    
    WebElement input = driver.findElement(By.id("file-upload"));
    String filePath = "/Users/fatosbudiyar/Downloads/unnamed.jpg";
    //provide the full path to the file
    input.sendKeys(filePath);
    
    WebElement upload = driver.findElement(By.id("file-submit"));
    //click on the button
    upload.click();
  }
}
