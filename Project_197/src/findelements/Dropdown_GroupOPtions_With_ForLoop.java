package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown_GroupOPtions_With_ForLoop {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		//Identifying single element
		WebElement Dropdown=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		
		//Finding list of options tags unde dropdown
		List<WebElement> AllOptions=Dropdown.findElements(By.tagName("option"));
		AllOptions.remove(0);
		
		//Applying for loop to read all list of options
		for (int i = 0; i < AllOptions.size(); i++) 
		{
			   WebElement EachOption=AllOptions.get(i);
			   EachOption.click();
			   Thread.sleep(200);
		}

	}

}
