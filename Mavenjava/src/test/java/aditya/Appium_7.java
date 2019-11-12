package aditya;


import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Appium_7 {
@Test
public void rAAGA_TEST() throws MalformedURLException {
	AndroidDriver driver;
	File f = new File("apk");
	File fs = new File(f, "RAAGA.apk");
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
	cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
	cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
	driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
	driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	
	
	

	WebElement element00 = driver.findElement(By.xpath("//*[@resource-id='com.raaga.android:id/skip_btn'] | //*[@text='SKIP']"));
	element00.click();
	
	driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	

	WebElement element01 = driver.findElement(By.xpath("//*[@resource-id='android:id/button2'] | //*[@class='android.widget.Button']"));
	element01.click();
	
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	WebElement element02 = driver.findElement(By.xpath("//*[@class='android.widget.LinearLayout'][3]"));
	element02.click();
	
	driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	
	WebElement element03 = driver.findElement(By.xpath("//*[@resource-id='com.raaga.android:id/skip_login_btn']"));
	element03.click();
	
	WebElement elementgooglebutton = driver.findElement(By.xpath("//*[@resource-id='com.raaga.android:id/google_login_btn']"));
	elementgooglebutton.click();

	
	
	driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	
	WebElement elementloginclick = driver.findElement(By.xpath("(//*[@class='android.widget.LinearLayout'])[10]"));
	elementloginclick.click();
	
	driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	
	WebElement elementclose = driver.findElement(By.xpath("//*[@resource-id='com.raaga.android:id/btn_close']"));
	elementclose.click();
	
	
	
	
	/*WebElement element04 = driver.findElement(By.xpath("//*[@resource-id='com.raaga.android:id/image_select_lang'] | //*[@id='image_select_lang']"));
	element04.click();
	
	driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	
	WebElement element05 = driver.findElement(By.xpath("//*[@resource-id='com.raaga.android:id/btn_cancel'] | //*[@id='btn_cancel']"));
	element05.click();
	
	driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	
	WebElement element06 = driver.findElement(By.xpath("(//*[@resource-id='com.raaga.android:id/artist_name'])[3] "));
	element06.click();
	
	WebElement element07 = driver.findElement(By.xpath("//*[@resource-id='com.raaga.android:id/mood_continue_txt'] "));
	element07.click();
	
	WebElement element08 = driver.findElement(By.xpath("(//*[@resource-id='com.raaga.android:id/adapter_artists_image'])[7] "));
	element08.click();
	driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	
	WebElement element09 = driver.findElement(By.xpath("//*[@resource-id='com.raaga.android:id/save_boarding'] "));
	element09.click();
	*/driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	
	WebElement element10 = driver.findElement(By.xpath("(//*[@class='androidx.appcompat.app.ActionBar$Tab'])[2] "));
	element10.click();
	
	driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	
	WebElement element11 = driver.findElement(By.xpath("//*[@resource-id='com.raaga.android:id/iv_song_more_menu']"));
	element11.click();
	
	driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	
	WebElement element12 = driver.findElement(By.xpath("//*[@resource-id='com.raaga.android:id/play_song_icon']"));
	element12.click();
	
	driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	
	WebElement element13 = driver.findElement(By.xpath("//*[@resource-id='com.raaga.android:id/collapsed_btn_play_pause']"));
	element13.click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
}
}
