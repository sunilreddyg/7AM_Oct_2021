package mq.selenium.AutoCompleteTextbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select_options_From_Sugessions 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/autocomplete/default.html");
		driver.manage().window().maximize();
		
		//Typing Sugession Keyword at Editbox
		driver.findElement(By.xpath("//input[@id='tags']")).sendKeys("Py");
		Thread.sleep(2000);  //Time to load sugessions
		driver.findElement(By.xpath("//div[@tabindex='-1'][contains(.,'Python')]")).click();
		

	}

}
