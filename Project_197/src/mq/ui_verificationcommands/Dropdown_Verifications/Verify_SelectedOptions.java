package ui_verificationcommands.Dropdown_Verifications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_SelectedOptions 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Given Site url is  https://www.facebook.com/r.php
		 * Then verify DOB month display Current Month
		 */
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		

		WebElement Dropdown_month=driver.findElement(By.id("month"));
		
		String Expected_month="Dec";
		
		//Read selected month at dropdown
		String Act_monthSelected=new Select(Dropdown_month)
		.getFirstSelectedOption().getText();
		
		if(Expected_month.equals(Act_monthSelected))
			System.out.println("Testpass, Expected Options is selected");
		else
			System.out.println("Testfail, Expected Options is not selected");
	}

}
