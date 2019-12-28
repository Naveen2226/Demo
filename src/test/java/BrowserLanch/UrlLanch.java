package BrowserLanch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UrlLanch {
	
	public static void Lanch() throws Exception {
		//System.setProperty("webdriver.firefox.driver","C:\\Users\\naveen\\Desktop\\Naveen\\Demo\\Driver\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		System.out.println("Hello");
		
	}

}
