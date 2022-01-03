package switchcommands.Window;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchTo_Next_Window {

	public static void main(String[] args) throws Exception 
	{
		//setting runtime environment variable
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();     //Launching browser method
		driver.get("https://www.instagram.com");
	    driver.manage().window().maximize();
	    
	    //Hyper link open page at new window
	    WebElement Blog=driver.findElement(By.linkText("Blog"));
	    Blog.click();
	    Thread.sleep(4000);
	    
	   //Collecting all window id's open through webdriver interface
	   Set<String> AllWindowIDS= driver.getWindowHandles();
	    
	    //Convert set string values into iterators
	   Iterator<String> itr=AllWindowIDS.iterator();
	   
	   //Iterator class allowed to read each iterator with next keyword
	   String Window1=itr.next();
	   String Window2=itr.next();
	   
	   //Switch to Second window
	   driver.switchTo().window(Window2);
	   System.out.println("Current Focused window title is --> "+driver.getTitle());
	   
	   //Switch to First Window
	   driver.switchTo().window(Window1);
	   System.out.println("Main Window title is ---> "+driver.getTitle());
	   
	   
	   
	   
	   
	    
	    
	    
	    
	}

}
