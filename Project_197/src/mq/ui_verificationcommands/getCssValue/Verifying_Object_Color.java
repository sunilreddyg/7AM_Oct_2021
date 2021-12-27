package ui_verificationcommands.getCssValue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Verifying_Object_Color {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		
		
		WebElement FreeTrail=driver.findElement(By.xpath("//a[@href='/orangehrm-30-day-trial/'][contains(.,'FREE TRIAL')]"));
		
		
		//WebDriver Always Return color and background color in RGBA format
		//RGBA [Red, Green, Blue, Alpha]
		
		
		Color ObjColor=Color.fromString(FreeTrail.getCssValue("background-color"));
		
		String Color_in_HEX=ObjColor.asHex();
		System.out.println("Color in HEX format --> "+Color_in_HEX);
		
		String Color_in_RGB=ObjColor.asRgb();
		System.out.println("Color in RGB format --> "+Color_in_RGB);
		

		String Color_in_RGBA=ObjColor.asRgba();
		System.out.println("Color in RGBA format --> "+Color_in_RGBA);
		
		
		String Exp_color="#17a954";
		if(Exp_color.equals(Color_in_HEX))
			System.out.println("Testpass, Same color is displayed");
		else
			System.out.println("Testfail, Same Color is not displayed");
		
	}

}
