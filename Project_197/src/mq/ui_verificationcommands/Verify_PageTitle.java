package ui_verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Verify_PageTitle 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://outlook.live.com/owa/");
		driver.manage().window().maximize();
		
		String Exp_title="Outlook – free personal email and calendar from Microsoft";
		
		if(driver.getTitle().equals(Exp_title))
		{
			System.out.println("Expected Title Presented");
			WebElement SigninButton=driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]"));
			SigninButton.click();
			
				String Exp_SigninPage_title="Sign in";
				if(driver.getTitle().contains(Exp_SigninPage_title))
				{
					System.out.println("SignIn page title is Verified");
				}
				else
				{
					System.out.println("Signin Page title Not verified");
				}
		}
		else
		{
			System.out.println("Wrong Page title presented for outlook page");
		}
		
		
		
		

	}

}
