package mq.selenium.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoard_Shortcuts {

	public static void main(String[] args) {
	

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.outlook.com");
		driver.manage().window().maximize();
		//Clickin  on signin button
		driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]")).click();
		
		//Typing characters at email and press Enter Keybaord shortcut
		driver.findElement(By.xpath("//input[@id='i0116']"))
		.sendKeys("sunilreddy.gajjala@outlook.com",Keys.ENTER);
		
		//Typing characters at email and press Enter Keybaord shortcut
		driver.findElement(By.xpath("//input[@id='i0118']"))
		.sendKeys("Hello123"+Keys.ENTER);
		
		

	}

}
