package switchcommands.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchToWindow_Using_WindowTitle {

	public static void main(String[] args) throws Exception {
		
		
		//setting runtime environment variable
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();     //Launching browser method
		driver.get("https://www.naukri.com/");
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    

	    //Hover on location to display sub categories
	    WebElement MenuJobs=driver.findElement(By.xpath("(//div[contains(.,'Jobs')])[4]"));
	    new Actions(driver).moveToElement(MenuJobs).perform();
	    Thread.sleep(1000);
	    
	    //click register to open new window
	    WebElement RegisterNow_JobsMenu=driver.findElement(By.xpath("//a[@data-ga-track='Main Navigation Jobs|Register Now']"));
	    RegisterNow_JobsMenu.click();
	    Thread.sleep(5000);
	    
	    
	    String Exp_title="Register on Naukri.com";
	    
	    
	    for (String EachWindodID : driver.getWindowHandles()) 
	    {
			String RuntimeTitle=driver.switchTo().window(EachWindodID).getTitle();
			if(RuntimeTitle.contains(Exp_title))
			{
				break;   //Stop Iteration 
			}
		}
	    
	    
	    System.out.println("current focused window title is --> "+driver.getTitle());
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    

	}

}
