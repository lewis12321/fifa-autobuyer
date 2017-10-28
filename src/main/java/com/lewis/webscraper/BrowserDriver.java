package com.lewis.webscraper;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class BrowserDriver {
	
	private static WebDriver driver;
	
	static {
		System.setProperty("webdriver.chrome.driver", "/home/lewis12321/IdeaProjects/webscraper/src/main/java/resources/chromedriver");
		driver = new ChromeDriver();
	}
	
	public static WebDriver getDriver() {
       return driver;
    }


}
