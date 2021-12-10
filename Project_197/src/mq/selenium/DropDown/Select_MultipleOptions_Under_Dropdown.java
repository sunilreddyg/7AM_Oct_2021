package mq.selenium.DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_MultipleOptions_Under_Dropdown {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://bridgeqsystems.com/demo.php");
		driver.manage().window().maximize();
		
		//Click Select Menu to open dropdowns list
		driver.findElement(By.xpath("//button[contains(.,'Select Menu')]")).click();
		Thread.sleep(2000);
		
		
		boolean flag=new Select(driver.findElement(By.id("exampleFormControlSelect2")))
		.isMultiple();
		
		if(flag==true)
		{
			System.out.println("Dropdown is a multiple selection type");
			Select CountrySelector=new Select(driver.findElement(By.id("exampleFormControlSelect2")));
			CountrySelector.deselectAll(); //This Command only works on multiple selection type
			CountrySelector.selectByIndex(1);
			CountrySelector.selectByIndex(3);
		}
		else
		{
			System.out.println("Dropdown is not a multiple selection type");
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
