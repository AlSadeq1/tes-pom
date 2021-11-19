package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserFactory {
	static WebDriver driver;
	@Test
	public static WebDriver init() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sadeq\\eclipse-workspace2021\\2021sd\\POM_Project\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://techfios.com/billing/?ng=login/after/dashboard");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;	
	}
	
	
	public static void tearDown() {
		driver.close();
		driver.quit();
	}
}
