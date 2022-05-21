package readingDataFromExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xlutils {
	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\KENGKUMA\\Desktop\\data.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(file);//
		XSSFSheet s= wb.getSheet("sheet1");
		int row =s.getLastRowNum();
		System.out.println("rows :" +row);
		int coloumn =s.getRow(0).getLastCellNum();
		System.out.println(coloumn);
		for(int i=0;i<=row;i++) {  //read to use roows
			XSSFRow currentRow=s.getRow(i);
			for( int j=0;j<coloumn;j++) {
			String value=currentRow.getCell(j).toString();
				System.out.print(value+" ");
			}
			System.out.println();
		}
	}

}
