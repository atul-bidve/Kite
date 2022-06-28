package POJO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	public static WebDriver openBrowser(String url) {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Microsoft\\Downloads\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
	
		
		driver.manage().window().maximize();
		return driver;
		
		
	}
	

}
