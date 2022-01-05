package capture_screen;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenWith_TimeStampt 
{

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		
		//Get System Default Date
		Date d=new Date();
		//Create Simple date format
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MMM-dd hh-mm-ss");
		//Covert default date using simple date formatter
		String time=sdf.format(d);
		
		//Capture screenshot and convert into file format
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Create folder under project
		FileHandler.createDir(new File("Screens"));
		//Copy file to screens folder
		FileHandler.copy(src, new File("Screens\\image"+time+".png"));
		
		
	
		
	
		
		
		
		
		
		
		
		
	}

}
