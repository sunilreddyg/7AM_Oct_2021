package capture_screen;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreen_Using_Robot
{
	public static void main(String args[]) throws Exception
	{
		//setting runtime environment variable
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("http://demo.automationtesting.in/Alerts.html");
	    driver.manage().window().maximize();
	    
	    
	    WebElement Alert_prompt_link=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
	    Alert_prompt_link.click();
	    Thread.sleep(3000);
	    
	    //Get Default System Dimension using AWT
	    Dimension Screen_Dimension=Toolkit.getDefaultToolkit().getScreenSize();
	    
	    //Create object for robot and Create Screen using Rectangle Dimension
	    Robot robot=new Robot();
	    BufferedImage Image=robot.createScreenCapture(new Rectangle(Screen_Dimension));
	    
	    
	    String path="D:\\15th_Nov_7-30AM_2021\\Project_197\\Screens\\NewImage.png";
	    
	    ImageIO.write(Image, "PNG", new File(path));
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
