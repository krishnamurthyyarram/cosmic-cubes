package com.cosmic.cubes.test.regression;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cosmic.cubes.ui.AddNewTaskPage;
import com.cosmic.cubes.ui.HomePage;
import com.cosmic.cubes.ui.LoginPage;
import com.cosmic.cubes.ui.ProjectAndTaskPage;
import com.cosmic.cubes.utils.generic.HandleDropDown;
import com.cosmic.cubes.utils.projectspec.CreateDriver;

public class TestCreateTaskSC_009 
{
	WebDriver driver;
	LoginPage login;
	HomePage home;
	ProjectAndTaskPage pAndT;
	AddNewTaskPage addNewTask;
	
	@BeforeMethod
	public void setUP()
	{
		driver = CreateDriver.getDriver();
		login = new LoginPage(driver);
		home = new HomePage(driver);
		pAndT = new ProjectAndTaskPage(driver);
		addNewTask = new AddNewTaskPage(driver);
	}
	@Test
	public void testCreateTaskTC_015()
	{
		login.waitForLoginPage();
		login.getUsernameTextbox().sendKeys("admin");
		login.getPasswordTextbox().sendKeys("manager");
		login.getLoginButton().click();
		home.waitForHomePage();
		home.getProjectAndTaskTab().click();
		pAndT.waitForProjectAndTaskPage();
		pAndT.getAddNewTaskButton().click();
		addNewTask.waitForAddNewTaskPage();
		WebElement customerddl = addNewTask.getCustomerDDDL();
		HandleDropDown.selectDDLByValue(customerddl, "0");
		addNewTask.getCustomerNameTextbox().sendKeys("Customer4");
		addNewTask.getProjectNameTextbox().sendKeys("project4");
		addNewTask.getTaskNameFirstTextbox().sendKeys("Task4");
		addNewTask.getCreateTaskButton().click();
		pAndT.waitForProjectAndTaskPage();
		WebElement successMsg = pAndT.getSuccessMsgone();
		Assert.assertEquals(successMsg.isDisplayed(), true);
	}
	@AfterMethod
	public void tearDown()
	{
		home.getLogoutButton().click();
		login.waitForLoginPage();
		driver.close();
	}
}
