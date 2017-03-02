package com.cosmic.cubes.utils.generic;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetData 
{
	public static String fromExcel(String fileName, String sName, int rIndex, 
			int cIndex)
	{
		String data= null;
		try
		{
			File f = new File("./test-data/"+fileName+".xlsx");
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet st = wb.getSheet(sName);
			Row r = st.getRow(rIndex);
			Cell c = r.getCell(cIndex);
			data = c.toString();
		}
		catch(Exception e)
		{
			
		}
		return data;
	}

}
