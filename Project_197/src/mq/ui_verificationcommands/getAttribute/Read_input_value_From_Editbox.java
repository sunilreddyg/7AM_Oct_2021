package ui_verificationcommands.getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_input_value_From_Editbox 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		
		WebElement Email_Textbox=driver.findElement(By.id("email"));
		Email_Textbox.sendKeys("Darshan");
		
		//Verify Entry Box contains expected text
		String name=Email_Textbox.getAttribute("value");
		if(name.equals("Darshan"))
			System.out.println("Entry box contains expected value");
		else
			System.out.println("Entry box not contains expected value");
		

	}

}
