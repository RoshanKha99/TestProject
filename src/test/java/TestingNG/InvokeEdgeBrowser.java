package TestingNG;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.testng.annotations.Listeners;
	import org.testng.annotations.Test;


	@Listeners(ListenerClass.class)

	public class InvokeEdgeBrowser {
		
		@Test
		public void invokeEdge() {
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\Roshan Khapekar\\Downloads\\edgedriver_win64\\msedgedriver.exe");
			
					WebDriver driver = new EdgeDriver();
					
					driver.get("https://www.sele");
					
		}

	}

