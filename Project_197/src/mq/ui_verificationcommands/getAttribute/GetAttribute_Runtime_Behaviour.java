package ui_verificationcommands.getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute_Runtime_Behaviour {

	public static void main(String[] args) throws Exception {
		
		
		
		/*
		 * Scenario:--> Verify Roundtrip Selection
		 * 			Given site url is "http://makemytrip.com"
		 * 			When Selected Roundtrip Button
		 * 			Then Verify it is Selected
		 * 			And Verify double seat fares options is disabled from webpage
		 */
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://makemytrip.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		WebElement Roundtrip=driver.findElement(By.xpath("//li[contains(@data-cy,'roundTrip')]"));
		Roundtrip.click();

		
		//Decision statemenet to verify round trip is selected
		String Runtime_Class=Roundtrip.getAttribute("class");
		if(Runtime_Class.contains("selected"))
		{
			System.out.println("Roundtrip is Selected");
			
			WebElement DoubleFares=driver.findElement(By.xpath("(//li[contains(@class,'font12 blackText latoBold wrapFilter  ')])[4]"));
			if(DoubleFares.getAttribute("class").contains("isItemDisabled"))
			{
				System.out.println("Double fares object is disabled");
			}
			else
			{
				System.out.println("Double fares object is not disabled");
			}
		}
		else
		{
			System.out.println("Roundtrip is not selected");
		}

	}

}
