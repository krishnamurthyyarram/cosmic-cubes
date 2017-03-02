package com.cosmic.cubes.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProjectAndTaskPage
{
	WebDriver driver;
	public ProjectAndTaskPage(WebDriver driver)
	{
		this.driver = driver;
	}
	public void waitForProjectAndTaskPage()
	{
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("container")));
	}
	public WebElement getAddNewTaskButton()
	{
		return driver.findElement(By.xpath("//input[@value='Add New Tasks']"));
	}
	public WebElement getSuccessMsgone()
	{
		return driver.findElement(By.xpath("(//span[@class='successmsg'])[1]"));
	}
}
