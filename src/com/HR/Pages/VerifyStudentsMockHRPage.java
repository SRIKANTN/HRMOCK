package com.HR.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.HR.Generic.BasePage;

public class VerifyStudentsMockHRPage extends BasePage
{
	@FindBy(id="edit-field-mob-no-number") private WebElement mbTB;
	@FindBy(id="edit-field-email-id-email") private WebElement emTB;
	
	@FindBy(xpath="//a[text()='Edit']") private WebElement edBT;

	public VerifyStudentsMockHRPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void EnterMobNoOrEmail(String mobilNo)
	{
			mbTB.sendKeys(mobilNo,Keys.ENTER);
	}
	
	public void clickOnEditButton()
	{
		edBT.click();
	}

}
