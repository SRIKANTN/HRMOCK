package com.HR.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.HR.Generic.BasePage;

public class EditEnquiryFormPage extends BasePage
{

	@FindBy(xpath="//input[contains(@id,'edit-field-mock-rating-und-add-')]")
	private WebElement addBT;
	
	public EditEnquiryFormPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

}
