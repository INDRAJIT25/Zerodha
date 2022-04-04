package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilClasses.UtilClass;

public class watchlistPage extends UtilClass {

	WebDriver driver;
	
	@FindBy(xpath = "//span[text()='Dashboard']")
	private WebElement dashboardWord;
	

	public watchlistPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public String getDashboardWordText()
	{
		isElementVisible(driver,dashboardWord );
		return dashboardWord.getText();	
	}
}
