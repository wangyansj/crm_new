package com.atguigu.poi;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class POITest{
	
	public static void main1(String[] args) throws IOException {
		//1.创建HSSFWorkBook对象
		HSSFWorkbook workbook = new HSSFWorkbook();
		
		//2.创建HSSFSheet对象
		HSSFSheet sheet = workbook.createSheet("我的第一个工作表");
		
		//3.创建HSSFRow对象
		//索引从0开始
		HSSFRow row = sheet.createRow(0);
		
		//4.创建HSSFCell对象
		HSSFCell cell = row.createCell(0);

		//5.为单元格设置值
		cell.setCellValue("Hello POI……");
		cell = row.createCell(1);
		cell.setCellValue(1233);
		//6.将工作表数据写入文件
		FileOutputStream out = new FileOutputStream("good.xls");
		workbook.write(out);
	}
	public static void main(String[] args) throws IOException {
		
		FileInputStream fileInputStream = new FileInputStream("D:/MyWork/workspace5/POITest/good.xls");
		
		HSSFWorkbook workbook = new HSSFWorkbook(fileInputStream);
		
		HSSFSheet sheetAt = workbook.getSheetAt(0);
	  
		Iterator<Row> rowIterator = sheetAt.rowIterator();
	 
		while (rowIterator.hasNext()) {
			Row next = rowIterator.next();
			Iterator<Cell> cellIterator = next.cellIterator();
			while (cellIterator.hasNext()) {
				HSSFCell next2 = (HSSFCell) cellIterator.next();
		        if (next2.getCellType() == HSSFCell.CELL_TYPE_STRING)  
		        {  
		          System.out.print(next2.getStringCellValue() + " ");  
		        }  
		        else if (next2.getCellType() == HSSFCell.CELL_TYPE_NUMERIC)  
		        {  
		          System.out.print(next2.getNumericCellValue() + " ");  
		        }  
		        else  
		        {  
		        }  
		      }  
		      System.out.println();  
			}
		}
		
	}

