package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewSignUpPage {
	@FindBy(xpath="//a[@class='text-light']")private WebElement Signup;
	@FindBy(xpath="//input[@pattern='^[6-9][0-9]{9}$']")private WebElement MobileNo;
	@FindBy(xpath="//input[@label='Mobile OTP']")private WebElement MobileOTP;
	@FindBy(xpath="//button[contains(@id,'proceed')]")private WebElement Continue;
	
	 public  NewSignUpPage(WebDriver driver) {
		 PageFactory.initElements(driver, this);
	 }
	 
	 public void clickSignup() {
		 Signup.click();
	 }
	 
	 public void enterMobileNo( String mobileno) {
		
		 MobileNo.sendKeys(mobileno);
	 }
	 
	 public void clickContinue() {
		 Continue.click();
	 }
	 
	 public void enterMobileOTP(String otp) {
		 MobileOTP.sendKeys(otp);
	 }
	 
	 public void clickcontinue() {
		 Continue.click();
	 }
	 
	 
	

}
