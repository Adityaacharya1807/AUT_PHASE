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
import io.appium.java_client.remote.MobileCapabilityType;

public class Appium_2 {
	@Test
	public void test1() throws Exception {
		AndroidDriver driver;
		File f = new File("apk");
		File fs = new File(f, "Sun NXT_v2.1.78_apkpure.com.apk");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
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
		WebElement element4 = driver.findElement(By.xpath("	//*[@text='Thanks! Got It']"));
		element4.click();
		WebElement element5 = driver.findElement(By.xpath("//*[@text='Thanks! Got It']"));
		element5.click();
		WebElement element6 = driver.findElement(By.xpath("//*[@text='Thanks! Got It']"));
		element6.click();
		WebElement element7 = driver.findElement(By.xpath("//*[@resource-id='com.suntv.sunnxt:id/root']"));
		element7.click();
		WebDriverWait wait2 = new WebDriverWait(driver, 10);

		wait2.until(ExpectedConditions.refreshed(
				ExpectedConditions.elementToBeClickable(By.xpath("//*[@resource-id='com.suntv.sunnxt:id/root']"))));
		WebElement element8 = driver.findElement(By.xpath(" //*[@text='Log In']"));
		element8.click();

		WebElement element9 = driver.findElement(By.xpath(" //*[@resource-id='com.suntv.sunnxt:id/signUpText']"));
		element9.click();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		WebElement element10 = driver
				.findElement(By.xpath(" //*[@resource-id='com.suntv.sunnxt:id/userIDEditTextLoginPage']"));
		element10.click();
		element10.sendKeys("abhi.ach18@gmail.com");
		driver.hideKeyboard();

		WebElement element11 = driver.findElement(By.xpath(" //*[@resource-id='com.suntv.sunnxt:id/passwordField']"));
		element11.click();
		element11.sendKeys("123456");
		driver.hideKeyboard();

		WebElement element13 = driver.findElement(By.xpath(" //*[@resource-id='com.suntv.sunnxt:id/fullName']"));
		element13.click();
		element13.sendKeys("Moolya");
		driver.hideKeyboard();

		WebElement element14 = driver.findElement(By.xpath("//*[@resource-id='com.suntv.sunnxt:id/ageSpinner']"));
		element14.click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement element18 = driver.findElement(By.xpath("//*[@text='18-25 Years']"));
		element18.click();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		WebElement element15 = driver.findElement(By.xpath("//*[@resource-id='com.suntv.sunnxt:id/maleIcon']"));
		element15.click();

		WebElement element16 = driver.findElement(By.xpath("//*[@resource-id='com.suntv.sunnxt:id/countrySpinner']"));
		element16.click();

		WebElement element99 = driver.findElement(By.xpath("//*[@text='India']"));
		element99.click();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		WebElement element17 = driver.findElement(By.xpath("//*[@resource-id='com.suntv.sunnxt:id/stateSpinner']"));
		element17.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(\"Karnataka\"));").click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"SUBMIT\"));");
		//// *[@text='SIGN IN' and @id='signUpText']
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@class='android.widget.Button'] | //*[@id='submitSignUp_button']")).click();
		Thread.sleep(4000);
		/// WebElement element22 =
		/// driver.findElement(By.xpath("//*[@resource-id='com.suntv.sunnxt:id/submitSignUp_button']"));
		// element22.click();

	}
}
