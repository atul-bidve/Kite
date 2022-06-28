package Test;

import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.NewSignUpPage;
import Utility.Parametrization;

public class NewSignUp {
	WebDriver driver;
	@BeforeMethod
	public void OpenSignup() {
		driver=Browser.openBrowser("https://kite.zerodha.com/");
	}
	@Test
	public void KiteNewSignup() throws EncryptedDocumentException, IOException, InterruptedException {
		NewSignUpPage signup=new NewSignUpPage(driver);
		signup.clickSignup();
		String mobile=Parametrization.getData(3, 1);
		signup.enterMobileNo(mobile);
		
	}

}
