package mq.selenium.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys_For_DropdownOptions
{

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.name("firstname"))
		.sendKeys("Arjun"+Keys.TAB+"Kumar"+Keys.TAB+"ArjunKumar@gmail.com");
		
		
		//Keyboard shortcuts on Dropdown Commands
		driver.findElement(By.name("birthday_day")).sendKeys("26");
		driver.findElement(By.name("birthday_month")).sendKeys(Keys.ARROW_UP,Keys.ARROW_UP);
		
		/*
		 * In Webdriver only dropdowns to manage separate commands available
		 * 			=> SelectByvisibleText
		 */
		
		

	}

}
