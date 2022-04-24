package com.yjcHousing.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase 
{
	public static WebDriver driver;
	public  static Properties prop;
		
	public TestBase()
	{
	try
	{

		prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\reddy\\workspace\\YjcHousing\\src\\main\\java\\com\\yjcHousing\\qa\\config\\config.properties");
		prop.load(ip);
		
	}
	catch(FileNotFoundException e)
	{
		e.printStackTrace();
	}
	catch(IOException e1)
	{
		e1.printStackTrace();
	}

	}



public static void initialization()
{
	String browserName = prop.getProperty("browser");
	if(browserName.contentEquals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\reddy\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	
	driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get(prop.getProperty("url"));
}


}




