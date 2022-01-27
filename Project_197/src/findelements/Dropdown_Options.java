package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown_Options 
{

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		//Identifying single element
		WebElement Dropdown=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
				
		//identify group of option tags under dropdown
		List<WebElement> AllOptions=Dropdown.findElements(By.tagName("option"));
		
		//Applying foreach loop to iterate list of options
		for (WebElement EachOption : AllOptions) 
		{
			  String OptionName=EachOption.getText();
			  if(OptionName.equals("Computers"))
			  {
				  EachOption.click();
				  break;
			  }
		}
		

	}

}
