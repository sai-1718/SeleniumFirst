package SDET_QA_YT;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.swing.text.Style;
import java.io.*;

public class UtiltityFileExcel
{

    public static FileInputStream fis;
    public static FileOutputStream fos;
    public static XSSFWorkbook wb;
    public static XSSFSheet sh;
    public static XSSFRow row;
    public static XSSFCell cell;
    public static Style Style;


    public static  int getNoOfRows(String file,String sheetName ) throws IOException
    {
        fis = new FileInputStream(file);
        wb = new XSSFWorkbook(fis);
        sh = wb.getSheet(sheetName);
        int NoOfRows = sh.getLastRowNum();
        fis.close();
        wb.close();

        return NoOfRows;

    }

    public static  int getNoOfCells(String file,String sheetName,int rowNo ) throws IOException
    {
        fis = new FileInputStream(file);
        wb = new XSSFWorkbook(fis);
        sh = wb.getSheet(sheetName);
        row = sh.getRow(rowNo);
        int NoOfCells=row.getLastCellNum();
        fis.close();
        wb.close();

        return NoOfCells;

    }

    public static  String getCellValue(String file,String sheetName,int rowNo ,int cellNo) throws IOException
    {
        fis = new FileInputStream(file);
        wb = new XSSFWorkbook(fis);
        sh = wb.getSheet(sheetName);
        row = sh.getRow(rowNo);
        cell = row.getCell(cellNo);

        String cellValue;
        try
        {
            //String cellValue=cell.getStringCellValue();   // by getStringCellValue()
            //String cellValue=cell.toString();            // by toString
            DataFormatter formatter=new DataFormatter();   // by data formatter
            cellValue=formatter.formatCellValue(cell);
        }
        catch (Exception e)
        {
             cellValue="";
        }
        fis.close();
        wb.close();

        return cellValue;
    }


    public static  void setCellData(String file,String sheetName,int rowNo ,int cellNo,String data) throws IOException
    {
        fis = new FileInputStream(file);
        wb = new XSSFWorkbook(fis);
        sh = wb.getSheet(sheetName);
        row = sh.getRow(rowNo);

        cell=row.createCell(cellNo);
        cell.setCellValue(data);

        fos=new FileOutputStream(file);
        wb.write(fos);

        fos.close();
        fis.close();
        wb.close();

    }






}
