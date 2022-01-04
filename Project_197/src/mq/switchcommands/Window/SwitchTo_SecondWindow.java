package switchcommands.Window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchTo_SecondWindow 
{

	public static void main(String[] args) throws Exception 
	{
		
		//setting runtime environment variable
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();     //Launching browser method
		driver.get("https://www.instagram.com");
	    driver.manage().window().maximize();
	    
	    
	    String MainwindowId=driver.getWindowHandle();
	    
	    //Hyper link open page at new window
	    WebElement Blog=driver.findElement(By.linkText("Blog"));
	    Blog.click();
	    Thread.sleep(4000);	
	    
	    
	    //Collect All WebDriver Windows
	    Set<String> AllWindowId=driver.getWindowHandles();
	    for (String EachWindowID : AllWindowId) 
	    {
			driver.switchTo().window(EachWindowID);
		}
	    
	    //Here is the assumption when loop finished controls available at child window
	    System.out.println("Current Window Title is --> "+driver.getTitle());
	    
	    //Switch Control back to main window
	    driver.switchTo().window(MainwindowId);
	    
	    
	    System.out.println("Main Window Title is ---> "+driver.getTitle());
	    
	    
	}

}
