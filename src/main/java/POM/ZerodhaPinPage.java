package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZerodhaPinPage {
	@FindBy(xpath="//input[@autocorrect='off']")private WebElement Pin;
	@FindBy(xpath="//button[@class='button-orange wide']")private WebElement Continue;
	@FindBy(xpath="//a[text()='Forgot 2FA?']")private WebElement Forgot;
	@FindBy(xpath="//a[@class='text-light']")private WebElement Signup;

	public ZerodhaPinPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public void enterpin(String pin , WebDriver driver) {
		//WebDriverWait wait = new WebDriverWait(driver , Duration.ofMillis(2000));
		//wait.until(ExpectedConditions.visibilityOf(Pin));

		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofMillis(3000));
		wait.pollingEvery(Duration.ofMillis(100));
		wait.ignoring(Exception.class);
		wait.until(ExpectedConditions.visibilityOf(Pin));
		Pin.sendKeys(pin);
	}

	public void clickContinue() {
		Continue.click();	
	}

	public void clickForgot() {
		Forgot.click();
	}

	public void cilickSignup() {
		Signup.click();
	}

}
