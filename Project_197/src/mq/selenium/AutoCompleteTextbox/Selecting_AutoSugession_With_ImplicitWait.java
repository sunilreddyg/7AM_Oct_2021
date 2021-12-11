package mq.selenium.AutoCompleteTextbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selecting_AutoSugession_With_ImplicitWait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/autocomplete/default.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Typing Sugession Keyword at Editbox
		driver.findElement(By.xpath("//input[@id='tags']")).sendKeys("Py");
		driver.findElement(By.xpath("//div[@tabindex='-1'][contains(.,'Python')]")).click();
		

		
		

	}

}
