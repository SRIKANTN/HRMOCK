package com.HR.Test;

import org.testng.annotations.Test;

import com.HR.Generic.BaseTest;
import com.HR.Generic.windowUtility;
import com.HR.Pages.PendingRequirementListHRPage;
import com.HR.Pages.VerifyStudentsMockHRPage;
import com.HR.Pages.WelcometoHRPage;

public class TC01Test extends BaseTest
{
	@Test
	public void hr() throws Exception
	{
		WelcometoHRPage wp = new WelcometoHRPage(driver);
		PendingRequirementListHRPage pp =  new PendingRequirementListHRPage(driver);
		VerifyStudentsMockHRPage vp = new VerifyStudentsMockHRPage(driver);
		wp.EnterUserName();
		wp.EnterPassword();
		pp.clickOnVerifyStudent();
		vp.EnterMobNoOrEmail("9738383665");
		vp.clickOnEditButton();
		Thread.sleep(2000);
		String etitle= driver.getTitle();
		windowUtility.switchWindow(driver, etitle);
		
	}

}
