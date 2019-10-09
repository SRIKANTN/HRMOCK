package com.HR.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.HR.Generic.BasePage;

public class PendingRequirementListHRPage extends BasePage
{
	
	@FindBy(xpath="//strong[text()='Verify Students']")
	private WebElement vsBT;
	
	public PendingRequirementListHRPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnVerifyStudent() {
		vsBT.click();
	}
}
