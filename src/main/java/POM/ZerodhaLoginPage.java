package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaLoginPage {
	@FindBy(xpath="//input[@id='userid']")private WebElement Userid;
	@FindBy(xpath="//input[@maxlength='260']")private WebElement Password;
	@FindBy(xpath="//button[@type='submit']")private WebElement Login;
	@FindBy(xpath="//a[contains(@Class,'forgot')]")private WebElement Forgot;
	@FindBy(xpath="//a[@class='text-light']")private WebElement Signup;
	
	public ZerodhaLoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void enterUserid(String user) {
		Userid.sendKeys(user);
	}
	
	public void enterPassword(String pass) {
		Password.sendKeys(pass);
	}
	
	public void clickLogin() {
		Login.click();
	}
	
	public void clickForgot() {
		Forgot.click();
	}
	
	public void clickSignup() {
		Signup.click();
	}
	
	
	

}
