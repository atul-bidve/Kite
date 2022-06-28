package Test;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import POJO.Browser;
import POM.ZerodhaLoginPage;
import POM.ZerodhaPinPage;
import Utility.Parametrization;
import Utility.Report;
@Listeners(HandleListners.class)
public class PinPageTest extends BaseTest{
	ExtentReports reports;
	ExtentTest test;
	@BeforeTest
	public void extentReports() {
		reports =Report.createReport();
	}
	@BeforeMethod
	public void launchBrowser() {
		 driver = Browser.openBrowser("https://kite.zerodha.com/");
		 
		
	}
	@Test
	public void loginZerodhaPinPage() throws EncryptedDocumentException, IOException, InterruptedException {
		test=reports.createTest("loginZerodhaPinPage");
		ZerodhaLoginPage zerodhaloginpage=new ZerodhaLoginPage(driver);
		String username = Parametrization.getData(0,1);
		String password =Parametrization.getData(1, 1);
		zerodhaloginpage.enterUserid(username);
		zerodhaloginpage.enterPassword(password);
		zerodhaloginpage.clickLogin();
	
		ZerodhaPinPage zerodhapinpage=new ZerodhaPinPage(driver);
		String pin =Parametrization.getData(2, 1);
		System.out.println(pin);
		zerodhapinpage.enterpin(pin, driver);
		zerodhapinpage.clickContinue();

		
		
		
		
		
		
		
			
	
	
	}

}
