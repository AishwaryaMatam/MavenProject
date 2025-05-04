package packagename.ProjectName;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class TestListener implements ITestListener {
	//WebDriver driver;
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
		Reporter.log("Started Exectuting testcase");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		Reporter.log("Testcase is pass and will take a screenshot");
		 TakesScreenshot ts = (TakesScreenshot) Connections.driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			String TimeStamp = date();
			File Destination = new File("C:\\Users\\aishw\\eclipse-workspace\\ProjectName\\Screenshots\\Pass\\"+TimeStamp+".png");
			try {
				FileHandler.copy(source, Destination);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		Reporter.log("Testcase id fail and take a screenshot");
		 TakesScreenshot ts = (TakesScreenshot) Connections.driver;
		 	String TimeStamp = date();
			File source = ts.getScreenshotAs(OutputType.FILE);
			File Destination = new File("C:\\Users\\aishw\\eclipse-workspace\\ProjectName\\Screenshots\\Fail\\"+TimeStamp+".png");
			try {
				FileHandler.copy(source, Destination);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	public String date() {
		Date d = new Date();
		String Date = d.toString();
		String day = Date.substring(8, 10);
		String t = Date.substring(11,19);
		String time = t.replace(":", "-");
		String year = Date.substring(24);
		String month = Date.substring(4,7);
		String finalDate = month+day+"_"+time+"_"+year;
		System.out.println(finalDate);
		return finalDate;
	}
}
	
	

