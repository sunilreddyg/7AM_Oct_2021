package switchcommands.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchTo_Frame_Object 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.redbus.in/bushire/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement FrameObject=driver.findElement(By.xpath("//*[@id=\"reactContentMount\"]/div/div[5]/div[2]/object"));
		driver.switchTo().frame(FrameObject);
		Thread.sleep(2000);
		
		WebElement Outstation=driver.findElement(By.xpath("(//div[contains(@class,'hrteu')])[1]"));
		Outstation.click();
		

	}

}
