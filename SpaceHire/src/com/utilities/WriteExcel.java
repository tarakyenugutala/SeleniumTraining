package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {
	
	public static void writeExcel(String filePath,String fileName,String sheetName,String[] dataToWrite,int h) throws IOException{

        //Create a object of File class to open xlsx file

        File file =    new File(filePath+"\\"+fileName);

        //Create an object of FileInputStream class to read excel file

        FileInputStream inputStream = new FileInputStream(file);

        Workbook wb = null;

        //Find the file extension by spliting file name in substing and getting only extension name

        String fileExtensionName = fileName.substring(fileName.indexOf("."));

        //Check condition if the file is xlsx file

        if(fileExtensionName.equals(".xlsx")){

        //If it is xlsx file then create object of XSSFWorkbook class

        	wb = new XSSFWorkbook(inputStream);

        }

        //Check condition if the file is xls file

        else if(fileExtensionName.equals(".xls")){

            //If it is xls file then create object of XSSFWorkbook class

        	wb = new HSSFWorkbook(inputStream);

        }

    int length1 = dataToWrite.length;

    //Read excel sheet by sheet name    

    Sheet sheet = wb.getSheet(sheetName);

    //Get the current count of rows in excel file

    //int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
    
    /*int startRow = 0;
    int startColumn=0;*/
    

    //Get the first row from the sheet

    //Row row = sheet.getRow(0);

    //Create a new row and append it at last of sheet

     Row newRow = sheet.createRow(h);

    //Create a loop over the cell of newly created Row
   
    for(int j=0;j<length1;j++){

        //Fill data in row
    	//Row newRow = sheet.createRow(k);

        Cell cell = newRow.createCell(j);

        cell.setCellValue(dataToWrite[j]);

    }

    inputStream.close();

    //Create an object of FileOutputStream class to create write data in excel file

    FileOutputStream outputStream = new FileOutputStream(file);

    //write data in the excel file

    wb.write(outputStream);

    //close output stream

    outputStream.close();

    

    }

    

  /*  public static void main(String...strings) throws IOException{

        //Create an array with the data in the same order in which you expect to be filled in excel file

        String[] valueToWrite = {"Mr. E","Noida"};

        //Create an object of current class

        WriteGuru99ExcelFile objExcelFile = new WriteGuru99ExcelFile();

        //Write the file using file name , sheet name and the data to be filled

        objExcelFile.writeExcel(System.getProperty("user.dir")+"\\src\\excelExportAndFileIO","ExportExcel.xlsx","ExcelGuru99Demo",valueToWrite);

    }*/
}
