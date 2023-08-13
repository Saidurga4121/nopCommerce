package com.qa.pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.factory.DriverFactory;


public class LoginPage extends DriverFactory
{
//	 public WebDriver classdriver;
//	
//	 public LoginPage(WebDriver localDriver) 
//	 {		
//		PageFactory.initElements(localDriver, this);
//	 }
	 
	 public LoginPage()
	 {
		 PageFactory.initElements(DriverFactory.getDriver(), this);
	 }
	
    
    @FindBy(xpath="//input[@name='username']")
	WebElement email;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement btnLogin;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[4]/p")
	WebElement forgotPwdLink;
	
    
    public String getLoginPageTitle()
	{
		return getDriver().getTitle();
	}
	
    public boolean isForgotPwdLinkExist() 
    {
		return forgotPwdLink.isDisplayed();
	}
    
    public void enterUserName(String username)
    {
    	email.sendKeys(username);
    }
    
    public void enterPassword(String pwd)
    {
    	password.sendKeys(pwd);
    }
    
    public void clickOnLogin() 
    {
		btnLogin.click();
	}
    
//    public void doLogin(String un, String pwd) 
//    {
//		System.out.println("login with: " + un + " and " + pwd);
//		driver.findElement(email).sendKeys(un);
//		driver.findElement(password).sendKeys(pwd);
//		driver.findElement(btnLogin).click();
//	}
    
	
	
	
	
}
