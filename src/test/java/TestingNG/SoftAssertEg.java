package TestingNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertEg {

	@Test
	public void testassert() throws InterruptedException {
		
		SoftAssert st = new SoftAssert();
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Roshan Khapekar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

				WebDriver driver=new ChromeDriver();
				  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

				  driver.manage().window().maximize();
				  Thread.sleep(1000);
				  String actualTitle = driver.getTitle();
				  String expectedTitle = "Orange";
				  
				  st.assertEquals(actualTitle, expectedTitle);
				  Thread.sleep(1000);
				  driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
				  driver.close();

				}

		}