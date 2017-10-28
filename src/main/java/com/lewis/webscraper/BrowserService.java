package com.lewis.webscraper;

import org.omg.CORBA.TIMEOUT;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserService {

	private WebDriver driver = BrowserDriver.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, 5);
	
	public BrowserService(String url) {
		try{
			driver.navigate().to(url);
            By XPath = By.xpath("//*[@id=\"ps-lowest-1\"]");
            wait.until(ExpectedConditions.presenceOfElementLocated(XPath));
		}catch(TimeoutException e){
			System.out.println("Waited to long!");
		}

	}

	public String getPlayerName() {
		try{
            By XPath = By.xpath("//*[@id=\"info_content\"]/table/tbody/tr[1]/td");
            String playerName = wait.until(ExpectedConditions.presenceOfElementLocated(XPath)).getText();
			return playerName;
		}catch (Exception e){
			System.err.println("Page failed to load!");
			e.printStackTrace();
		}
		return "";
	}
	
	public String getPlayerPrice() {
		try{
		    By XPath = By.xpath("//*[@id=\"ps-lowest-1\"]");
		    String playerPrice = wait.until(ExpectedConditions.presenceOfElementLocated(XPath)).getText();
		    return playerPrice;
		}catch (Exception e){
			System.err.println("Page failed to load!");
			e.printStackTrace();
		}
		return "";
	}
	
	public String getPlayerPosition() {
		try {
		    By XPath = By.xpath("//*[@id=\"Player-card\"]/div[3]");
		    String playerPos = wait.until(ExpectedConditions.presenceOfElementLocated(XPath)).getText();
		    return playerPos;
		}catch (Exception e){
			System.err.println("Page failed to load!");
			e.printStackTrace();
		}
		return "";
	}
	
	public String getPlayerLeague() {
		try{
		    By XPath = By.xpath("//*[@id=\"info_content\"]/table/tbody/tr[4]/td/a");
			String playerLeague = wait.until(ExpectedConditions.presenceOfElementLocated(XPath)).getText();
			return playerLeague;
		}catch (Exception e){
			System.err.println("Page failed to load!");
			e.printStackTrace();
		}
		return "";

	}
	
	public String getPlayerType() {
		try{
		    By XPath = By.xpath("//*[@id=\"Player-card\"]");
			String playerType = wait.until(ExpectedConditions.presenceOfElementLocated(XPath)).getAttribute("data-level");
			playerType = playerType.substring(0, 1).toUpperCase() + playerType.substring(1);
			return playerType;
		}catch (Exception e){
			System.err.println("Page failed to load!");
			e.printStackTrace();
		}
		return "";

	}
	
	public String getLastUpdated() {
	    By XPath = By.xpath("//*[@id=\"ps-updated\"]");
		String lastUpdated = wait.until(ExpectedConditions.presenceOfElementLocated(XPath)).getText();
		try {
			lastUpdated = lastUpdated.substring(0, 1).toUpperCase() + lastUpdated.substring(1);
		}catch(Exception e) {
			e.printStackTrace();
			lastUpdated = "UNKNOWN";
		}
		return lastUpdated;
	}

}


