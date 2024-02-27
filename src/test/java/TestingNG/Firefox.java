package TestingNG;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.Listeners;
	import org.testng.annotations.Test;


	@Listeners(ListenerClass.class)
	public class Firefox {
		
		
		@Test
		public void invokefirefox() {
			System.setProperty("webdriver.Gecko.driver",
					"C:\\Users\\Roshan Khapekar\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");

				WebDriver driver = new FirefoxDriver();
				
				driver.get("https://www.seleniu.dev/");
				
}}