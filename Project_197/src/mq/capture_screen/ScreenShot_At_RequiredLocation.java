package capture_screen;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot_At_RequiredLocation {

	public static void main(String[] args) throws Exception {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.naukri.com/");
	driver.manage().window().maximize();
	
	//Using javascript Scoll Object to view
	WebElement Screen_Location=driver.findElement(By.xpath("//h2[contains(.,'Job Gallery')]"));
	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)", Screen_Location);

	
	//Capture screenshot and convert into file format
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//Create folder under project
	FileHandler.createDir(new File("Screens"));
	//Copy file to screens folder
	FileHandler.copy(src, new File("Screens\\Image2.png"));
	
	
	
	}

}
