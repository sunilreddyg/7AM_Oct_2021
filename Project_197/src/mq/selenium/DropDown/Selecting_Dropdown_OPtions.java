package mq.selenium.DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selecting_Dropdown_OPtions 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		
		//Selecting dropdown option using OptionName
		new Select(driver.findElement(By.id("day")))
		.selectByVisibleText("23");
		
		//Selecting Dropdown option  using Value Property
		new Select(driver.findElement(By.id("month")))
		.selectByValue("7");
		
		//Selecting Dropdown option using Index Number
		new Select(driver.findElement(By.id("year")))
		.selectByIndex(21);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
