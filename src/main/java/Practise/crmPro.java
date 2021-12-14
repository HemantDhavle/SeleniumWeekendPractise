package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class crmPro 
{
	public DriverUtil du;
	public WebDriver driver;
	@Test
	public void testPro()
	{
		du = new DriverUtil();
		driver  = du.loadBrowser("chrome");
		
		driver.get("https://classic.crmpro.com/index.html");
		
		ElementUtils el = new ElementUtils(driver);
		
		By username = By.xpath("//div[@class='input-group']/input[@name='username']");
		el.doElementVisible(username, 4).sendKeys("hemant");
		System.out.println("hemant");
		
	}
}
