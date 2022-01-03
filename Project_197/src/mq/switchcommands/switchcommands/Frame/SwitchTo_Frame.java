package switchcommands.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchTo_Frame 
{

	public static void main(String[] args) 
	{
		
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.cleartrip.com/account/trips");
			driver.manage().window().maximize();
			
			driver.switchTo().frame("modal_window");
			
			WebElement Email=driver.findElement(By.xpath("//input[@id='email']"));
			Email.clear();
			Email.sendKeys("info.dsnr@gmail.com");
			
			WebElement TripId=driver.findElement(By.xpath("//input[@name='tripid']"));
			TripId.clear();
			TripId.sendKeys("78787877");
			
			//Get Controls back to Page
			driver.switchTo().defaultContent();
			
			WebElement FeedBack=driver.findElement(By.xpath("//a[contains(.,'Feedback')]"));
			FeedBack.click();
			
			
			
			
			

	}

}
