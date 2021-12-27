package ui_verificationcommands.getSize_And_location;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GetLocation {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		
		
		WebElement FreeTrail=driver.findElement(By.xpath("//a[@href='/orangehrm-30-day-trial/'][contains(.,'FREE TRIAL')]"));
		
	
		//Get Object x and y coordinates
		int Objx=FreeTrail.getLocation().getX();
		int Objy=FreeTrail.getLocation().getY();
		
		System.out.println("Object x value is --> "+Objx);
		System.out.println("Object y value is --> "+Objy);
		
		
		
		if(Objx< 400)
			System.out.println("Located At Left Side of the page");
		else
			System.out.println("Located At Right side of the page");
		
		
		
		//Verify Object visibility using coordinates
		//For hidden object getlocation return zero coorindates
		if(Objx >0)
			System.out.println("Object is visible at webpage");
		else
			System.out.println("Object is Not visible at webpage");
		
		
		
		

	}

}
