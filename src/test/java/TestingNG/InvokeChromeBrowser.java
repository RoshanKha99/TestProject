package TestingNG;




	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Listeners;
	import org.testng.annotations.Test;



	@Listeners(ListenerClass.class)
	public class InvokeChromeBrowser {
		
		@Test
		public void invokechrome() {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Roshan Khapekar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.selenium.dev/");
			
			
			
			
		}

	}

