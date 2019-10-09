package com.HR.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.HR.Generic.BasePage;

public class WelcometoHRPage extends BasePage
{
	@FindBy(id="edit-name") private WebElement unTB;
	@FindBy(id="edit-pass") private WebElement pwTB;

	public WelcometoHRPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void EnterUserName()
	{
		unTB.sendKeys("Umamaheshwari");
	}
	
	public void EnterPassword()
	{
		pwTB.sendKeys("umamaheshwari@123",Keys.ENTER);
	}
}
