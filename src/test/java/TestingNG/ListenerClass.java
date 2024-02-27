package TestingNG;


	

	import org.testng.ITestContext;
	import org.testng.ITestListener;
	import org.testng.ITestResult;

	public class ListenerClass implements ITestListener{

		@Override
		public void onTestStart(ITestResult result) {
			System.out.println("Testcase execution is started");
			
		}

		@Override
		public void onTestSuccess(ITestResult result) {
			System.out.println("Testcase is executed successfully");
			
		}

		@Override
		public void onTestFailure(ITestResult result) {
			System.out.println("Testcase is Failed");
		}

		@Override
		public void onTestSkipped(ITestResult result) {
			System.out.println("Testcase is skipped");
		}

		@Override
		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			System.out.println("test case failed with few are passed");
		}

		
		}
		

	

