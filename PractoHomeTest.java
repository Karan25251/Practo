package test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pajeObjectModel.Mydriver;
import pajeObjectModel.PractoHome;

public class PractoHomeTest {
	
	WebDriver driver;
	PractoHome practoHomeObject;
	
	
	@Test(priority = 1)
	@Parameters({"browser"})
	void setUp(String browser) {
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.practo.com/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver=Mydriver.getDriver(browser);
		practoHomeObject=new PractoHome(driver);
	}
	
	@Test(priority = 2)
	void searchDoctor() {
		practoHomeObject.clickOnFindDoctor();
		
		Mydriver.updateDriver(practoHomeObject.driver_update());
	}

}
