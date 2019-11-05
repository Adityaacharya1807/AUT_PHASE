package intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.yahoo.com/");
		System.out.println(driver.getTitle());//validating the title of the page.
		System.out.println(driver.getCurrentUrl());//validation as landed over correct url
		//System.out.println(driver.getPageSource());//method to get the page source.
		driver.get("https://www.google.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.close();//It closes current driver or child window
		driver.quit();//It closes all the browsers or parent and child.
		
	}

}
