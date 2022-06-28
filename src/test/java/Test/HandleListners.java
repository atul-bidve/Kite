package Test;
import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class HandleListners extends BaseTest implements ITestListener {
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName() +"Test has started");
	}
	
	public void onTestFailure(ITestResult result) {
		try
		{
		ScreenShotr.teakesScreenShot(driver, result.getName());
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		



	}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName() +"Test has Success");
	}
	
	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName() +"Test has Skipped");
	}
	
	public void onFinish(ITestResult result) {
		System.out.println(result.getName() +"Test has Finish");
	}


}
