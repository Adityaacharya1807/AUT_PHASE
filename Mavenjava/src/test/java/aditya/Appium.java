package aditya;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Appium {
	@Test
	public void test1() throws Exception {
		AndroidDriver driver;
		File f = new File("apk");
		File fs = new File(f, "Sun NXT_v2.1.78_apkpure.com.apk");
		DesiredCapabilities cap = new DesiredCapabilities();
		Thread.sleep(2000);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "AdityaAvd2");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);

		WebElement element00 = driver.findElement(By.xpath("//*[@resource-id='com.android.packageinstaller:id/permission_allow_button']"));
		element00.click();
		
		WebElement element011 = driver.findElement(By.xpath("//*[@resource-id='com.android.packageinstaller:id/permission_allow_button']"));
		element011.click();
	
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);


		System.out.println("Now Select Tamil");

		WebElement element = driver.findElement(By.xpath("(//*[@resource-id='com.suntv.sunnxt:id/chk1'])[1]"));
		element.click();
		System.out.println("Now Select Telugu");
		WebElement element1 = driver.findElement(By.xpath("(//*[@resource-id='com.suntv.sunnxt:id/chk1'])[2]"));
		element1.click();
		
 WebElement element2 =driver.findElement(By.xpath("//*[@text='NEXT']")); element2.click();
WebDriverWait wait1 = new WebDriverWait(driver, 10);
driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
 WebElement element3 =driver.findElement(By.xpath("//*[@resource-id='android:id/button1']"));
		  element3.click(); 
		  WebElement element4 =driver.findElement(By.xpath("	//*[@bounds='[581,529][769,570]']"));
		  element4.click(); 
		  WebElement element5 =driver.findElement(By.xpath("//*[@bounds='[446,529][634,570]']"));
		  element5.click(); WebElement element6 =
		  driver.findElement(By.xpath("//*[@bounds='[446,529][634,570]']"));
		  element6.click(); WebElement element7 =
		  driver.findElement(By.xpath("//*[@resource-id='com.suntv.sunnxt:id/root']"));
		  element7.click(); 
		  WebDriverWait wait2 = new WebDriverWait(driver, 10);
		  
		  wait2.until(ExpectedConditions.refreshed(
		  ExpectedConditions.elementToBeClickable(By.xpath(
		  "//*[@resource-id='com.suntv.sunnxt:id/root']"))));
		  WebElement element8 =
		  driver.findElement(By.xpath(" //*[@text='Log In']")); element8.click();
		  
		  WebElement element9 =
		  driver.findElement(By.xpath("//*[@text='Mobile No./Email Id']"));
		  element9.click();
		  
		  WebElement element10 =
		  driver.findElement(By.xpath("//*[@text='Mobile No./Email Id']"));
		  element10.sendKeys("yasmeen.shoeb@moolya.com");
		  
		  WebElement element12 = driver.findElement(By.xpath("//*[@resource-id='com.suntv.sunnxt:id/emailPasswordField']"));
		  element12.sendKeys("12345");
		  
		  WebElement element13 = driver.findElement(By.xpath("//*[@resource-id='com.suntv.sunnxt:id/login_button']"));
		  element13.click();
		  
		  WebElement element16 = driver.findElement(By.xpath("//*[@resource-id='com.suntv.sunnxt:id/root1']"));
		  element16.click();
		  
		  WebElement element14 = driver.findElement(By.xpath("	//*[@text='Thanks! Got It']"));
		  element14.click();
		  
		  WebElement element15 = driver.findElement(By.xpath("	//*[@text='Thanks! Got It']"));
		  element15.click();
		 
		  WebElement element17 = driver.findElement(By.xpath("	//*[@text='Thanks! Got It']"));
		  element17.click();
		  driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		  WebElement element18 = driver.findElement(By.xpath("(//*[@resource-id='com.suntv.sunnxt:id/settingsListItem'])[2]"));
		  element18.click();
		  driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		  WebElement element19 = driver.findElement(By.xpath("(//*[@resource-id='com.suntv.sunnxt:id/simpleCheckedTextView'])[3]"));
		  element19.click();
		  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		  WebElement element20 = driver.findElement(By.xpath("//*[@resource-id='com.suntv.sunnxt:id/save_button']"));
		  element20.click();
		  driver.close();
		 
		
		
		  
		
	}
}
