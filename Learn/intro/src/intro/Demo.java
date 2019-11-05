package intro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://accounts.google.com/signin");
	System.out.println(driver.getTitle());
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	WebElement email_phone = driver.findElement(By.xpath("//input[@id='identifierId']"));
	email_phone.sendKeys("anshu.ach18@gmail.com");
	driver.findElement(By.id("identifierNext")).click();
	WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	WebDriverWait wait = new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.elementToBeClickable(password));
	password.sendKeys("Aditya18281828");
	driver.findElement(By.id("passwordNext")).click();
	}

}
