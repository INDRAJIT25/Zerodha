package TestClasses;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import BaseClasses.Baseclass;
import POMClasses.logInPage;
import POMClasses.watchlistPage;

//@Listeners(ListnerClasses.ListenerClass.class)
public class addTCSstockInWatchlist {

	WebDriver driver;
	logInPage lp;
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
		lp = new logInPage(driver);
		wp = new watchlistPage(driver);
	}
	
	@Test
	public void userCanLogIn()
	{
		lp.enterLogInID();
		Reporter.log("Login Id Entered", true);
		
		lp.enterPassword();
		Reporter.log("Password Entered", true);
		lp.clickLogIn();
		
		lp.enterPin();
		lp.clickContinueButton();
		Reporter.log("Pin Entered", true);
		
		String txt = wp.getDashboardWordText();
		Assert.assertEquals(txt, "Dashboard");
		
		test.log(LogStatus.PASS, "Shivaji Log In Successfull");
		
		Reporter.log("Log In Successfull", true);
		
	}
	
	@AfterClass
	public void afterMethod()
	{
		reports.endTest(test);
		reports.flush();
	}
}
