package com.Xyphias.Schneider.testbase;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public  FileInputStream file;
	
	public static Properties prop;
	
	public static  WebDriver driver;
	
	
	public TestBase() {
		
		
		try {
			
			file = new FileInputStream ("D:\\Eclipse Workspace\\MyPageObjectModelHybridproject\\src\\main"
					+ ""
					+ "\\java\\com\\Xyphias\\Schneider\\src\\test\\java\\Properties\\ObjectRepository.properties");
			
			prop = new Properties();
			
			prop.load(file);
		
		}
		
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
	}
		
	
	public  void InitializeProject() {
			
			String BrowserName = prop.getProperty("Browser");
			
			if(BrowserName.equals("chrome")) {
				
				
				System.setProperty("webdriver.chrome.driver", "D:\\Chrome Driver 76\\chromedriver.exe");
				
				
				driver = new ChromeDriver();
				
				
				
		}
			
			driver.get(prop.getProperty("url"));
	}

}
