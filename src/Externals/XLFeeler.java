package Externals;

import application.MainPageController;
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
	
	MainPageController v = new MainPageController();

	public final String XLDataFile = v.getCurrentPath();
	public final String XLComparisonFile = "!";

		public void read() {

			// Try block to check for exceptions
			try {
		
				// Reading file from local directory
				FileInputStream XLDataInput = new FileInputStream(XLDataFile);
				
				FileInputStream XLComparisonInput = new FileInputStream(XLComparisonFile);

				// Create Workbook instance holding reference to
				// .xlsx file
				XSSFWorkbook workbook = new XSSFWorkbook(XLDataFile);
				
				XSSFWorkbook wk2 = new XSSFWorkbook(XLDataFile);
				
				XSSFWorkbook wk3 = new XSSFWorkbook(XLComparisonFile);
				
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
				XLDataInput.close();
				workbook.close();
				XLComparisonInput.close();
				wk2.close();
				wk3.close();
			}

			// Catch block to handle exceptions
			catch (Exception e) {

				// Display the exception along with line number
				// using printStackTrace() method
				e.printStackTrace();
			}
		}
	}
