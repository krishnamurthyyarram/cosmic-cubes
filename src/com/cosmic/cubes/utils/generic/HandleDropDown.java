package com.cosmic.cubes.utils.generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown 
{
	// Select drop down by index value
	public static void selectDDLByIndex(WebElement ddl, int index)
	{
		Select sct = new Select(ddl);
		sct.selectByIndex(index);
	}
	// Select drop down by value
	public static void selectDDLByValue(WebElement ddl, String value)
	{
		Select sct = new Select(ddl);
		sct.selectByValue(value);
	}
	// Select drop down by VisiableText
	public static void selectDDLByVisiableText(WebElement ddl, String text)
	{
		Select sct = new Select(ddl);
		sct.selectByVisibleText(text);
	}
	// Verify Drop down is multi or single Select
	public static boolean verifyDropDown(WebElement ddl) 
	{
		Select sct =  new Select(ddl);
		boolean status = sct.isMultiple();
		return status;
	}
	// De-select Drop down by Index
	public static void deSelectByIndex(WebElement ddl, int index)
	{
		Select sct = new Select(ddl);
		try
		{
			sct.deselectByIndex(index);
		}
		catch(Exception e)
		{
			System.out.println("Invalid Operation");
		}
	}
	// De-select all options from drop down
	public static void deSelectAllOptions(WebElement ddl)
	{
		Select sct = new Select(ddl);
		try
		{
			sct.deselectAll();
		}
		catch(Exception e)
		{
			System.out.println("Invalid Operation");
		}
	}
	// Develop de-select functionalities for value and visible text 
	
	
	
	
	
	
	
	
	
	
	
	
}
