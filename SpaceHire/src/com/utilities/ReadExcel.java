package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	static XSSFWorkbook wb ;
	static XSSFSheet rExcelSheet;
	static XSSFRow row;
	static XSSFCell cell;
	public static String[][] readingExcel(String filePath, String fileName, String sheetName) throws Exception {
		String[][] arrayPerson = null;		
		File file = new File(filePath+"\\"+fileName);
		FileInputStream inputStream = new FileInputStream(file);
		wb = new XSSFWorkbook(inputStream);
		rExcelSheet = wb.getSheet(sheetName);
		int startRow = 1;
		int startColumn=0;
		int rowCount = rExcelSheet.getLastRowNum();
		int columnCount = rExcelSheet.getRow(1).getLastCellNum();
		System.out.println(rowCount+","+columnCount);
		//int columnCount = rExcelSheet.getColumnWidth(rowCount);
		arrayPerson = new String[rowCount][columnCount];
		int ci=0;
		for(int i=startRow;i<rowCount+1;i++,ci++)
		{			
			int cj=0;
			for(int j=startColumn;j<columnCount;j++,cj++)
			{		
				arrayPerson[ci][cj] = getCellData(i,j);
				//System.out.println(row.getCell(j).getStringCellValue());
			}
		}
		return arrayPerson;
	}
    public static String getCellData(int m,int n){
    	String cellData = null;
    	cell = rExcelSheet.getRow(m).getCell(n);
    	int k  = rExcelSheet.getRow(m).getCell(n).getCellType();
    	if(k==XSSFCell.CELL_TYPE_STRING){
    		cellData = cell.getStringCellValue(); 
    		return cellData;
    	}
    	else if(k==XSSFCell.CELL_TYPE_NUMERIC){
    		double d = cell.getNumericCellValue();
    		int p=(int) d;
    		cellData = Integer.toString(p);
    		
    		if (DateUtil.isCellDateFormatted(cell)) {
    			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    	       Date date = cell.getDateCellValue();
    	       String date1 = df.format(date);
    	       return date1;
    	    }
    		
    		
    		return cellData;
    	} 
    	else if(k==XSSFCell.CELL_TYPE_FORMULA){
    		cellData = cell.getCellFormula();
    		return cellData;
    	}
		return cellData;   	
    }
}
/*	System.out.println(rExcelSheet.getRow(0).getCell(0).getStringCellValue());
System.out.println(rExcelSheet.getRow(0).getCell(1).getStringCellValue());
String input = rExcelSheet.getRow(1).getCell(0).toString();
double parseDouble = Double.parseDouble(input);
System.out.println(parseDouble);
DecimalFormat df = new DecimalFormat("0");
String formatNumber = df.format(parseDouble);
System.out.println(formatNumber);*/
//int rowCount = rExcelSheet.getLastRowNum()-rExcelSheet.getFirstRowNum();
//String fileExtensionName = fileName.substring(fileName.indexOf("."));
/*	if(fileExtensionName.equals(".xlsx"))
	{
		wb = new XSSFWorkbook(inputStream);
	}
	else if(fileExtensionName.equals(".xls"))
			{
		wb = new HSSFWorkbook(inputStream);
			}*/