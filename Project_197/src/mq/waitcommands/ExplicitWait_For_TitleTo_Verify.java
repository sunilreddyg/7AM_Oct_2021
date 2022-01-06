package waitcommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_For_TitleTo_Verify {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		
		new WebDriverWait(driver, Duration.ofSeconds(30))
		.until(ExpectedConditions.titleContains("Facebook"));
		System.out.println("Facebook homepage title is Title is Presented");
		
		
		WebElement Messenger_link=driver.findElement(By.linkText("Messenger"));
		Messenger_link.click();
		
		
		try {
			new WebDriverWait(driver, Duration.ofSeconds(10))
			.until(ExpectedConditions.titleIs("Messenger1"));
			System.out.println("Messenger page title is presented");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("Run Continued");
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
