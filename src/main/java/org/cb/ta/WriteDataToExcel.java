package org.cb.ta;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class WriteDataToExcel {
  public void writeExcel(String filePath,String fileName,String sheetName, List<String[]> dataToWrite) throws IOException {

    //Create an object of File class to open xlsx file
    File file =    new File(filePath+"\\"+fileName);

    //Create an object of FileInputStream class to read excel file
    FileInputStream inputStream = new FileInputStream(file);

    Workbook guru99Workbook = null;

    //Find the file extension by splitting  file name in substring and getting only extension name
    String fileExtensionName = fileName.substring(fileName.indexOf("."));

    //Check condition if the file is xlsx file
//    if(fileExtensionName.equals(".xlsx")){
//
//      //If it is xlsx file then create object of XSSFWorkbook class
//      guru99Workbook = new XSSFWorkbook(inputStream);
//
//    }

    //Check condition if the file is xls file
    if(fileExtensionName.equals(".xls")){

      //If it is xls file then create object of XSSFWorkbook class
      guru99Workbook = new HSSFWorkbook(inputStream);

    }

    //Read excel sheet by sheet name
    Sheet sheet = guru99Workbook.getSheet(sheetName);

    //Get the current count of rows in excel file
//    int lastRowNum = sheet.getLastRowNum(); // -1
    //System.out.println("first row" + sheet.getFirstRowNum() + " context " + sheet.getRow(0).getCell(0).getStringCellValue());
//    System.out.println("ROW count : " + lastRowNum);

    //Get the first row from the sheet
    int lastRowNum = 0;
    Row newRow = sheet.createRow(0);

    //Create a new row and append it at last of sheet
//    Row newRow;
//    if (lastRowNum == -1){ // if file is empty
//      newRow = sheet.createRow(0);
//      lastRowNum = 0;
//    }else {
//      lastRowNum += 1;
//      newRow = sheet.createRow(lastRowNum);
//    }
    //Create a loop over the cell of newly created Row  data ->
    // [["Firstname", "Lastname", "Age"],["John", "Smith", "45"],["Jemma", "Jackson", "94"],["Michael", "Doe", "20"]]
    int i;
    for (i = 0; i < dataToWrite.size(); i++) { // loop for rows
      for (int j = 0; j < dataToWrite.get(i).length; j++) { // loop for columns
        //Fill data in row
        Cell cell = newRow.createCell(j);
        cell.setCellValue(dataToWrite.get(i)[j]);
      }
      lastRowNum += 1; // 4
      newRow = sheet.createRow(lastRowNum);
    }

    //Close input stream
    inputStream.close();

    //Create an object of FileOutputStream class to create write data in excel file
    FileOutputStream outputStream = new FileOutputStream(file);

    //write data in the excel file
    guru99Workbook.write(outputStream);

    //close output stream
    outputStream.close();

  }
}

