package org.pirai;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static void launchbrowser() {
		System.setProperty("webdriver.gecko.driver","F:\\prasanna\\Automation\\eclipse\\piraiinfo\\Driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public static void windowmaximize() {
		driver.manage().window().maximize();
	}
	
	public static void launchurl(String url) {
		driver.get(url);
	}
	
	public static void pageTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	public static void pageurl() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}
	public static void passText(String text, WebElement ele) {
		ele.sendKeys(text);
	}
	public static void closethebrowser() {
		driver.quit();
	}
	public static void clickbutton(WebElement ele) {
		ele.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
