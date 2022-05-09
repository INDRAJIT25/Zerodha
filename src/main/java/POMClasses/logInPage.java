package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//check
import UtilClasses.UtilClass;

public class logInPage extends UtilClass {

	WebDriver driver;
	
	@FindBy(xpath = "//input[@id='userid']")
	private WebElement logInID;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath = "//button[@class='button-orange wide']")
	private WebElement logInButton;
	
	@FindBy(xpath = "//input[@id='pin']")
	private WebElement pin;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement continueButton;
// indrajit bhau 
	
	
	public logInPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver = driver;
	}
	
	public void enterLogInID() 
	{
		isElementVisible(driver,logInID);
		logInID.sendKeys("QAC023");
	}
	
	public void enterPassword()
	{
		isElementVisible(driver,password);
		password.sendKeys("indrajit25");
	}
	
	public void clickLogIn()
	{
		isElementVisible(driver,logInButton);
		logInButton.click();
	}
	
	public void enterPin()
	{
		isElementVisible(driver,pin);
		pin.sendKeys("040492");
	}
	
	public void clickContinueButton()
	{
		isElementVisible(driver,continueButton);
		continueButton.click();
	}
	
}
