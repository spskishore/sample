package getExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {
 public void writeexcel(String q,int row,int col) {
	 File f= new File("C:\\software\\data.xlsx");
	 try {
		FileInputStream fis= new FileInputStream(f);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet s= wb.getSheet("bmw");
		XSSFRow r= s.getRow(row);
		XSSFCell c=r.createCell(col);
		c.setCellValue(q);
		FileOutputStream fos= new FileOutputStream(f);
		wb.write(fos);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 }
}
