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
public class Scenario3 {
	Properties prop= new Properties();
	@BeforeTest
	public void getdata() throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\Moolya\\eclipse-workspaceSUNNXT_AUTOMATION\\SUNNXT_AUT\\src\\files\\config.properties");
		prop.load(fis);
		
	}
	@Test
	public void ContentLanguage() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("HOST"));
		WebElement element=driver.findElement(By.id("show_sign"));
		element.click();
		WebElement element1=driver.findElement(By.xpath("//ul[@class='signinicon dropdown-menu dropdown-menu-right logg']/li/a"));
		element1.click();
		WebElement element2=driver.findElement(By.id("email-up"));
		element2.sendKeys(prop.getProperty("email"));
		WebElement element3=driver.findElement(By.id("password"));
		element3.sendKeys(prop.getProperty("pass"));
		WebElement element4=driver.findElement(By.xpath("//button[@class='btn btn-red']"));
		element4.click();
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		    
		    wait.until(ExpectedConditions.refreshed(
		        ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn dropdown-toggle btn-default']"))));
		WebElement element5=driver.findElement(By.xpath("//button[@class='btn dropdown-toggle btn-default']"));
		element5.click();
		WebElement element6=driver.findElement(By.xpath("//span[@class='text']"));
		element6.click();
		driver.close();
		
		
		
		
		
	}

}
