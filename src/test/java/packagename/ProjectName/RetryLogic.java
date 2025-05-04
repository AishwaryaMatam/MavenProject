package packagename.ProjectName;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryLogic implements IRetryAnalyzer{
	int intialcount = 0;
	int retrycount = 2;
	@Override
	public boolean retry(ITestResult result) {
		
		if(intialcount<retrycount)
		{
			intialcount++;
			return true;
		}
		return false;
	}

}
