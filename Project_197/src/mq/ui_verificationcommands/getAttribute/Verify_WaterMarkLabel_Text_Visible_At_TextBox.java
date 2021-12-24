package ui_verificationcommands.getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_WaterMarkLabel_Text_Visible_At_TextBox
{

	public static void main(String[] args) {
		
		
		/*
		 * Scenario:  Verify Email validation using blank
		 * 		Given site url is "http://outlook.com"
		 * 		When click on Sign in button
		 * 		Then verify Email Textbox contains WaterMark label "MyEmail, phone, or Skype"
		 */
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://outlook.com");
		driver.manage().window().maximize();
		
		
		WebElement Signin_btn=driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]"));
		Signin_btn.click();
		
		//identify Email Textbox
		WebElement EmailTextbox=driver.findElement(By.xpath("//input[@id='i0116']"));
		String Runtime_value=EmailTextbox.getAttribute("placeholder");
		
		if(Runtime_value.equals("Email, phone, or Skype"))
			System.out.println("Testpass");
		else
			System.out.println("Testfail");
	}

}
