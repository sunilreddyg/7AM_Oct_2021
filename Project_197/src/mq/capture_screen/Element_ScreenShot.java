package capture_screen;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Element_ScreenShot {

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		driver.manage().window().maximize();
		
		//Capture screenshot and convert into file format
		WebElement DOB_Location=driver.findElement(By.xpath("//div[contains(@id,'birthday_wrapper')]"));
		File src=DOB_Location.getScreenshotAs(OutputType.FILE);
		//Create folder under project
		FileHandler.createDir(new File("Screens"));
		//Copy file to screens folder
		FileHandler.copy(src, new File("Screens\\Image1.png"));

	}

}
