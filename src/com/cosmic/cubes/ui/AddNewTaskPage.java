package com.cosmic.cubes.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddNewTaskPage
{
	WebDriver driver;
	public AddNewTaskPage(WebDriver driver)
	{
		this.driver = driver;
	}
	public void waitForAddNewTaskPage()
	{
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("container")));
	}
	public WebElement getCustomerDDDL()
	{
		return driver.findElement(By.name("customerId"));
	}
	public WebElement getCustomerNameTextbox()
	{
		return driver.findElement(By.name("customerName"));
	}
	public WebElement getProjectNameTextbox()
	{
		return driver.findElement(By.name("projectName"));
	}
	public WebElement getTaskNameFirstTextbox()
	{
		return driver.findElement(By.name("task[0].name"));
	}
	public WebElement getCreateTaskButton()
	{
		return driver.findElement(By.xpath("//input[@value='Create Tasks']"));
	}
}
