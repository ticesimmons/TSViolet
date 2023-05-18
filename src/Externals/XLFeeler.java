package Externals;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * used to access excel stuffs
 * 
 * 
 * @author SimmonsTice
 *
 */
public class XLFeeler {

	public static String fileName = "!";
	public static String fileName2 = "!";

	
	// Java Program to Illustrate Reading
	// Data to Excel File Using Apache POI
	// Main driver method
		public void read() {

			// Try block to check for exceptions
			try {

				
		
				
				// Reading file from local directory
				FileInputStream file = new FileInputStream(fileName);
				
				FileInputStream file2 = new FileInputStream(fileName2);

				// Create Workbook instance holding reference to
				// .xlsx file
				XSSFWorkbook workbook = new XSSFWorkbook(file);
				
				XSSFWorkbook wk2 = new XSSFWorkbook(file);
				
				XSSFWorkbook wk3 = new XSSFWorkbook(file2);
				
				if (workbook.equals(wk2)) {
					System.out.println("true");
				}
				
				if (workbook.equals(wk3)) {
					System.out.println("true");
				}

				// Get first/desired sheet from the workbook
				XSSFSheet sheet = workbook.getSheetAt(0);

				// Iterate through each rows one by one
				Iterator<Row> rowIterator = sheet.iterator();

				// Till there is an element condition holds true
				while (rowIterator.hasNext()) {

					Row row = rowIterator.next();

					// For each row, iterate through all the
					// columns
					Iterator<Cell> cellIterator
						= row.cellIterator();

					while (cellIterator.hasNext()) {

						Cell cell = cellIterator.next();

						// Checking the cell type and format
						// accordingly
						switch (cell.getCellType()) {

						// Case 1
						case NUMERIC:
							System.out.print(
								cell.getNumericCellValue()
								+ "t");
							break;

						// Case 2
						case STRING:
							System.out.print(
								cell.getStringCellValue()
								+ "t");
							break;
							
						default:
							break;
						}
							
					}

					System.out.println("");
				}

				// Closing file output streams
				file.close();
				workbook.close();
			}

			// Catch block to handle exceptions
			catch (Exception e) {

				// Display the exception along with line number
				// using printStackTrace() method
				e.printStackTrace();
			}
		}
	}
