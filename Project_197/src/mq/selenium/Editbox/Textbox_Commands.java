package mq.selenium.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textbox_Commands {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://flipkart.com");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.name("q")).clear();
		driver.findElement(By.name("q")).sendKeys("iPhone 12"+Keys.ENTER);
		
		
		

	}

}
