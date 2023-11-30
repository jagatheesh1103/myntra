package org.Baseclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Baseclass {
	
	public static WebDriver driver;
	
	
	public  void Browser_Launch() throws IOException {
		
		FileInputStream file = new FileInputStream("src/test/resources/Properties/myntra.properties");
		Properties pro = new Properties();
		pro.load(file);
		pro.getProperty("Browser").equalsIgnoreCase("chrome");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(pro.getProperty("Url"));
		
		
		
		
		
		
		
		

	}

}
