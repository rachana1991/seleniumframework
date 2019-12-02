package crmpkg;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TempSensors {

	public TempSensors(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	public WebDriver driver;
	
	By vp =By.xpath("//div[@class='product-list FL canning dairy acpr_thermometer reference_thermometer']//a[@class='button'][contains(text(),'View Product')]");
	
	public WebElement viewProduct()
	{
		System.out.println("made call to click view product");
		WebElement element= driver.findElement(vp);
		return element;
	}
	
	public void download() throws IOException
	{
		WebElement e= driver.findElement(By.name("Select language to download"));
		Select s = new Select(e);
		s.selectByVisibleText("English");
	}
}
