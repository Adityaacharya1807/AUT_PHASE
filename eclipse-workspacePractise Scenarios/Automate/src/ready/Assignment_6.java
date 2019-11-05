package ready;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Assignment_6 {
	@Test
	public void dream() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/nested_frames");
		System.out.println(driver.getTitle());//validating the title of the page.
		System.out.println(driver.getCurrentUrl());//validation as landed over correct url
		//System.out.println(driver.getPageSource());//method to get the page source.
		WebElement element=driver.findElement(By.xpath("/html/frameset/frame[1]"));
		element.findElement(By.xpath("/html/frameset/frame[1]")).click();
		System.out.println(element.getText());
		
		
		
		
				
		
	}

	
}
