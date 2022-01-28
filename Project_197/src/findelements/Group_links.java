package findelements;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Group_links
{

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		
		
		WebElement Footer_Area=driver.findElement(By.xpath("//section/footer/div/div[1]"));
		List<WebElement> Footer_links=Footer_Area.findElements(By.tagName("a"));
		System.out.println("Size of footer links ---> "+Footer_links.size());
		
		//iterate for number of links
		for (int i = 0; i < Footer_links.size(); i++) 
		{
			 //Target Each link using index number
			WebElement Eachlink=Footer_links.get(i);
			//Get linkname
			String linkname=Eachlink.getText();
			String linkhref=Eachlink.getAttribute("href");
			//System.out.println(linkname+"    "+linkhref);
	
			driver.navigate().to(linkhref);
			System.out.println(linkname+"  "+driver.getCurrentUrl());
			Thread.sleep(4000);
			
			driver.navigate().back();
			Thread.sleep(4000);
			
			//Restore all links to avoid staleElement reference exception
			Footer_Area=driver.findElement(By.xpath("//section/footer/div/div[1]"));
			Footer_links=Footer_Area.findElements(By.tagName("a"));
			
		}
		
		
		
		
		
		
		

	}

}
