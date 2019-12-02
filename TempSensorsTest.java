package crmpkg;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TempSensorsTest {

	public WebDriver driver;
	@Test
	public void init()
	{
	System.setProperty("webdriver.chrome.driver","C://Users//racmhatr//drivers//chromedriver_win32//chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.anderson-negele.com/us/temperature-sensors/");
	driver.manage().window().maximize();
	//close popup
	driver.findElement(By.xpath("//button[@class='cta allowCookies']")).click();
	//click on filter
	WebElement element = driver.findElement(By.xpath("//div[@class='product-filters']//div[@class='wrapFilter']//div[@class='industryFilters']//div//input[@id='03 filterindustry']"));
    element.click();
	
	
	}
	
	
	
	@Test
	public void viewProduct()
	{
	TempSensors a=new TempSensors(driver);
	a.viewProduct().click();
	}
	
	
	@Test
	public void downloadpdf() throws IOException
	{
		TempSensors a=new TempSensors(driver);
	    a.download();
		
		
		
	}
}
