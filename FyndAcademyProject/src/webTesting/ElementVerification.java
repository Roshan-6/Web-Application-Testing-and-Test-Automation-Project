package webTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class ElementVerification {
	// Initialize driver
		public WebDriver driver;

		/*
		 * This method launches the Chrome browser and navigates to the given URL.
		 * WebDriver location and application URL is provided into excel sheet named
		 * 'AppLink'
		 * 
		 */
		@BeforeMethod
		public void launchapp() throws Exception {

			FileInputStream f = new FileInputStream("C:\\Users\\rosha\\OneDrive\\Documents\\Notes\\Testing\\AppLink.xls");
			Workbook wb = Workbook.getWorkbook(f);
			Sheet appurl = wb.getSheet("Sheet1");
			System.setProperty(appurl.getCell(1, 0).getContents(), appurl.getCell(1, 1).getContents());
			driver = new ChromeDriver();
			driver.get(appurl.getCell(1, 2).getContents());
		}

		/*
		 * This method verifies the availability of tabs and their respective URLs and
		 * writes the results to an Excel file.
		 * 
		 * @throws Exception if any error occurs while performing the verification.
		 */
		@Test
		public void verifyelement() throws Exception {
			/*
			 * Scenario-2 : Verifying the Availability of Each Tab. Importing the Page
			 * Object Model From Different class to test the Availability of Element. Soft
			 * Assertion will proceed to next test case even if there is any element is not
			 * present. Print Method will show the availability message of tabs in Console
			 */
			PageObjectModel p = PageFactory.initElements(driver, PageObjectModel.class);
			SoftAssert soft = new SoftAssert();

			// Verify availability of Home tab
			boolean HomeAvailable = p.Home.isDisplayed();
			soft.assertEquals(HomeAvailable, true);
			System.out.println("Home Tab is Available");

			// Verify availability of Football tab
			boolean footballavailable = p.Football.isDisplayed();
			soft.assertEquals(footballavailable, true);
			System.out.println("Football Tab is Available");

			// Verify availability of Basketball tab
			boolean basketballavail = p.BasketBall.isDisplayed();
			soft.assertEquals(basketballavail, true);
			System.out.println("BasketBall Tab is Available");

			// Verify availability of Cricket tab
			boolean Cricketavail = p.Cricket.isDisplayed();
			soft.assertEquals(Cricketavail, true);
			System.out.println("Kriket Tab is Available");

			// Verify availability of CyberSport tab
			boolean cybersportavail = p.cyberSport.isDisplayed();
			soft.assertEquals(cybersportavail, true);
			System.out.println("CiberSports Tab is Available");

			/*
			 * Storing the Current URL of Each Tab in Excel Sheet. 
			 * Creating boolean object to check whether the Tabs contains specified values. 
			 * Assert Method Will check whether specified value condition is true or not. 
			 * Print method will give the the current URL in console.
			 */

			// Scenario-3: Verify URL of each tab contains the tab name.

			// Click on Home tab and verify its URL
			p.Home.click();
			Thread.sleep(2000);
			String Homeurl = driver.getCurrentUrl();
			System.out.println(Homeurl);
			boolean homecheck = Homeurl.contains("Home");
			soft.assertEquals(homecheck, true); //

			// Click on Football tab and verify its URL
			p.Football.click();
			String FootballUrl = driver.getCurrentUrl();
			System.out.println(FootballUrl);
			boolean Footballcheck = FootballUrl.contains("Football");
			soft.assertEquals(Footballcheck, true);

			// Click on Basketball tab and verify its URL
			p.BasketBall.click();
			String BasketballUrl = driver.getCurrentUrl();
			System.out.println(BasketballUrl);
			boolean Basketballcheck = BasketballUrl.contains("busketball");
			soft.assertEquals(Basketballcheck, true);

			// Click on Cricket tab and verify its URL
			p.Cricket.click();
			String CricketUrl = driver.getCurrentUrl();
			System.out.println(CricketUrl);
			boolean Cricketcheck = CricketUrl.contains("kriket");
			soft.assertEquals(Cricketcheck, true);

			// Click on CyberSport tab and verify its URL
			p.cyberSport.click();
			String CyberUrl = driver.getCurrentUrl();
			System.out.println(CyberUrl);
			boolean Cybercheck = CyberUrl.contains("Cibersport");
			soft.assertEquals(Cybercheck, true);

			// Scenario-4:Store all the current URL in excel sheet.

			// Using FileOutputStream to Set the Excel sheet location on System.
			FileOutputStream f = new FileOutputStream("C:\\Users\\rosha\\Pictures\\Testing\\Final-Link.xls");

			// Opening a Writable workbook to store Excel sheet.
			WritableWorkbook wb = Workbook.createWorkbook(f);

			// Creating a Sheet on the Opened workbook.
			WritableSheet sheet = wb.createSheet("WebPage URL ", 1);

			// Creating Cell on the opened sheet to store the specified values.
			Label cell1 = new Label(0, 0, "Home Tab Url is: " + Homeurl);
			Label cell2 = new Label(0, 2, "Football Tab URL is: " + FootballUrl);
			Label cell3 = new Label(0, 3, "Busketball Tab URL is: " + BasketballUrl);
			Label cell4 = new Label(0, 4, "Kriket Tab URL is: " + CricketUrl);
			Label cell5 = new Label(0, 5, "CiberSport URL is: " + CyberUrl);

			// Adding the cell to the Opened Sheet
			sheet.addCell(cell1);
			sheet.addCell(cell2);
			sheet.addCell(cell3);
			sheet.addCell(cell4);
			sheet.addCell(cell5);

			// Saving the writable Workbook.
			wb.write();

			// Closing the Opened Workbook
			wb.close();

		}

		@AfterMethod // Using After method to close the window after every test case Execution
		public void closeapp() {

			driver.close();
		}

}
