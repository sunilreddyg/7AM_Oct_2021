package objectidentification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicScript {

	public static void main(String[] args) {
		
		String path="C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe";
	    System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("email")).sendKeys("Darshan@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Hello12345");
		driver.findElement(By.name("login")).click();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
