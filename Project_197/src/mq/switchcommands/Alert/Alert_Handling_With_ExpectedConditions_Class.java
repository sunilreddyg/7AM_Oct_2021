package switchcommands.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Alert_Handling_With_ExpectedConditions_Class {

	public static void main(String[] args) throws Exception {
		
		//setting runtime environment variable
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("http://demo.automationtesting.in/Alerts.html");
	    driver.manage().window().maximize();
	    
	    
	    WebElement Alert_prompt_link=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
	    Alert_prompt_link.click();
	    Thread.sleep(3000);
	    
	    //This Condition verify alert presented at webpage
	    if(ExpectedConditions.alertIsPresent().apply(driver)!=null)
	    {
	    	System.out.println("Alert is Presented");
	    	driver.switchTo().alert().accept();
	    }
	    else
	    {
	    	System.out.println("Alert is not presented");
	    }
	    
	    
	    

	}

}
