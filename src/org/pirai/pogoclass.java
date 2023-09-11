package org.pirai;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pogoclass extends BaseClass{
	
	public pogoclass() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//a[text()='About Us'])[2]")
	private WebElement aboutus;
	
	
	@FindBy(xpath="(//a[text()='Services'])[2]")
	private WebElement service;
	
	@FindBy(id="devOps")
	private WebElement dev;
	
	@FindBy(xpath="//button[text()='Enquire Now']")
	private WebElement enquiry;
	
	@FindBy(xpath="(//input[contains(@type,'text')])[1]")
	private WebElement firstname;
	
	@FindBy(xpath="(//input[contains(@type,'text')])[2]")
	private WebElement lastname;
	
	@FindBy(xpath="//input[contains(@type,'email')]")
	private WebElement email;
	
	@FindBy(xpath="//input[contains(@type,'tel')]")
	private WebElement phnno;
	
	@FindBy(xpath="(//input[@name='toclick'])[3]")
	private WebElement subject;
	
	@FindBy(xpath="//*[@name='message']")
	private WebElement msg;
	
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submit;


	public WebElement getAboutus() {
		return aboutus;
	}


	public WebElement getService() {
		return service;
	}


	public WebElement getDev() {
		return dev;
	}


	public WebElement getEnquiry() {
		return enquiry;
	}


	public WebElement getFirstname() {
		return firstname;
	}


	public WebElement getLastname() {
		return lastname;
	}


	public WebElement getEmail() {
		return email;
	}


	public WebElement getPhnno() {
		return phnno;
	}


	public WebElement getSubject() {
		return subject;
	}


	public WebElement getMsg() {
		return msg;
	}


	public WebElement getSubmit() {
		return submit;
	}
	
	
	
}
