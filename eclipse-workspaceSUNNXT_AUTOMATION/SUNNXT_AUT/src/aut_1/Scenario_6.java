package aut_1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class Scenario_6 {
	Properties prop= new Properties();
	@BeforeTest
	public void getdaTA() throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\Moolya\\eclipse-workspaceSUNNXT_AUTOMATION\\SUNNXT_AUT\\src\\files\\config.properties");
		prop.load(fis);
	}
	
@Test
public void setReminder() {
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(prop.getProperty("HOST"));
	WebElement element=driver.findElement(By.id("show_sign"));
	element.click();
	WebElement element1=driver.findElement(By.xpath(prop.getProperty("clickonsignin")));
	element1.click();
	
	WebDriverWait wait00 = new WebDriverWait(driver, 10);
    
    wait00.until(ExpectedConditions.refreshed(
        ExpectedConditions.elementToBeClickable(By.id("email-up"))));
	WebElement element2=driver.findElement(By.id("email-up"));
	element2.sendKeys(prop.getProperty("email"));
	WebElement element3=driver.findElement(By.id("password"));
	element3.sendKeys(prop.getProperty("pass"));
	
	WebDriverWait wait01 = new WebDriverWait(driver, 10);
    
    wait01.until(ExpectedConditions.refreshed(
        ExpectedConditions.elementToBeClickable(By.xpath(prop.getProperty("login")))));
	WebElement element4=driver.findElement(By.xpath(prop.getProperty("login")));
	element4.click();
	
	WebDriverWait wait1 = new WebDriverWait(driver, 10);
    
    wait1.until(ExpectedConditions.refreshed(
        ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='mobile-menu-wrap']/ul/li[3]/a"))));
	WebElement element5=driver.findElement(By.xpath("//div[@class='mobile-menu-wrap']/ul/li[3]/a"));
	element5.click();
	
	WebDriverWait wait101 = new WebDriverWait(driver, 10);
	 wait101.until(ExpectedConditions.refreshed(
		        ExpectedConditions.elementToBeClickable(By.xpath("//following::p[contains(text(),'Vaidheg')][4]"))));
			WebElement element66=driver.findElement(By.xpath("//following::p[contains(text(),'Vaidheg')][4]"));
			element66.click();
			
			
			WebDriverWait wait1011 = new WebDriverWait(driver, 10);
			 wait1011.until(ExpectedConditions.refreshed(
				        ExpectedConditions.elementToBeClickable(By.xpath(prop.getProperty("Done")))));
					WebElement element666=driver.findElement(By.xpath(prop.getProperty("Done")));
					element666.click();
					
			
				
	
	
			
}
}
