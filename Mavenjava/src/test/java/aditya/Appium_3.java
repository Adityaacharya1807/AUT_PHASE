package aditya;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Appium_3 {
	@Test
	public void forget() throws MalformedURLException {
		AndroidDriver driver;
		File f = new File("apk");
		File fs = new File(f, "Sun NXT_v2.1.78_apkpure.com.apk");
		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0.1");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);

		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

		WebElement element00 = driver
				.findElement(By.xpath("//*[@resource-id='com.android.packageinstaller:id/permission_allow_button']"));
		element00.click();

		WebElement element011 = driver
				.findElement(By.xpath("//*[@resource-id='com.android.packageinstaller:id/permission_allow_button']"));
		element011.click();

		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

		System.out.println("Now Select Tamil");

		WebElement element = driver.findElement(By.xpath("(//*[@resource-id='com.suntv.sunnxt:id/chk1'])[1]"));
		element.click();
		System.out.println("Now Select Telugu");
		WebElement element1 = driver.findElement(By.xpath("(//*[@resource-id='com.suntv.sunnxt:id/chk1'])[2]"));
		element1.click();

		WebElement element2 = driver.findElement(By.xpath("//*[@text='NEXT']"));
		element2.click();
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement element3 = driver.findElement(By.xpath("//*[@resource-id='android:id/button1']"));
		element3.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		WebElement element4 = driver.findElement(By.xpath("	//*[@text='Thanks! Got It']"));
		element4.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement element5 = driver.findElement(By.xpath("//*[@text='Thanks! Got It']"));
		element5.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement element6 =

				driver.findElement(By.xpath("//*[@text='Thanks! Got It']"));
		element6.click();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		WebElement element7 = driver.findElement(By.xpath("//*[@resource-id='com.suntv.sunnxt:id/root']"));
		element7.click();
		WebDriverWait wait2 = new WebDriverWait(driver, 10);

		wait2.until(ExpectedConditions.refreshed(
				ExpectedConditions.elementToBeClickable(By.xpath("//*[@resource-id='com.suntv.sunnxt:id/root']"))));
		WebElement element8 = driver.findElement(By.xpath(" //*[@text='Log In']"));
		element8.click();

		WebElement element9 = driver.findElement(By.xpath("//*[@text='Mobile No./Email Id']"));
		element9.click();

		WebElement element10 = driver.findElement(By.xpath("//*[@text='Mobile No./Email Id']"));
		element10.sendKeys("7023541194");
		WebElement element11 = driver.findElementByXPath("//*[@resource-id='com.suntv.sunnxt:id/forgotPwd']");
		element11.click();
		WebElement element12 = driver
				.findElementByXPath("//*[@resource-id='com.suntv.sunnxt:id/buttonSubmitResetPassword']");
		element12.click();
	}
}
