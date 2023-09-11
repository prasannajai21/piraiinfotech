package org.pirai;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;

public class Allpages extends BaseClass {
	public static void main(String[] args) throws InterruptedException, AWTException {
	
		launchbrowser();
		launchurl("https://piraiinfo.com/");
	    windowmaximize();
	    
	    pogoclass p = new pogoclass();
	    p.clickbutton(p.getAboutus());
	    p.clickbutton(p.getService());
	    Thread.sleep(3000);
	    p.clickbutton(p.getDev());
	    Thread.sleep(3000);
	    p.clickbutton(p.getEnquiry());
	    
	    passText("prasanna",p.getFirstname());
	    passText("s",p.getLastname());
	    passText("prasanna123@gmail.com",p.getEmail());
	    passText("9078652314",p.getPhnno());
	    Thread.sleep(3000);
	    JavascriptExecutor jse = (JavascriptExecutor)driver;
	    jse.executeScript("window.scrollBy(0,250)");
	    
	    p.clickbutton(p.getSubject());
	    passText("How to develop",p.getMsg());
	    
	    p.clickbutton(p.getSubmit());
	    
	    System.out.println("Application Run Successfully");
	
}
	
	
}
