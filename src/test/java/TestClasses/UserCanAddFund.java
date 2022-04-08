package TestClasses;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import BaseClasses.Baseclass;
import POMClasses.logInPage;
import POMClasses.watchlistPage;

public class UserCanAddFund {

	WebDriver driver;
	watchlistPage wp;
	ExtentReports reports;
	ExtentTest test;
	
	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String a)
	{
		reports = new ExtentReports("ExtentReports.html", true);
		test = reports.startTest("addTCSstockInWatchlist");
		
		driver = Baseclass.getDriver(a);
	}
	
	
	@BeforeMethod
	public void beforeMethod()
	{
		wp = new watchlistPage(driver);
	}
	
	@Test
	public void addFund()
	{
		
	}
	
	@AfterClass
	public void afterMethod()
	{
		reports.endTest(test);
		reports.flush();
	}
}
