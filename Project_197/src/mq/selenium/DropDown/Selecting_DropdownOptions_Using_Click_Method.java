package mq.selenium.DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selecting_DropdownOptions_Using_Click_Method {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//option[contains(.,'Books')]")).click();
		
		/*
		 * Note:--> We can also use click method to select dropdown options
		 * 		    instead of using selector class...
		 */

	}

}
