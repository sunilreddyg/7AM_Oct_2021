package mq.selenium.launchBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Interface {

	public static void main(String[] args) 
	{
		
		String path="C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe";
	    System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		
		/*
		 * Exceptions:-->
		 * 
		 * 		IllegalStateException:-->
		 * 			=> This exception we receive when don't define
		 * 				environment path for browser drivers
		 * 							[OR]
		 * 
		 * 		=> When we define wrong path  or Spell Mistakes
		 * 
		 * 		SessionNotCreateException:-->
		 * 			=> When your browser driver and browser version
		 * 				is mismatched
		 * 
		 * 		
		 * 		InvalidArgumentException:-->
		 * 				=> When url format is mismatched
		 * 				=> Url should start with http://  or https://
		 */
		
		
		
		
		
		
		
		
	}

}
