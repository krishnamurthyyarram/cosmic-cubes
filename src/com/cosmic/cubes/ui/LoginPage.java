package com.cosmic.cubes.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void waitForLoginPage() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//table)[2]")));
	}

	public WebElement getUsernameTextbox() {
		WebElement element = driver.findElement(By.name("username"));
		return element;
	}

	public WebElement getPasswordTextbox() {
		return driver.findElement(By.name("pwd"));
	}

	public WebElement getLoginButton() {
		return driver.findElement(By.id("loginButton"));
	}

	public WebElement getDivisionHeaderText() {
		return driver.findElement(By.cssSelector(".loginlogo3"));
	}

	public WebElement getErrorMessageText() {
		return driver.findElement(By.xpath("(//span[@class='errormsg'])[1]"));
	}
}
