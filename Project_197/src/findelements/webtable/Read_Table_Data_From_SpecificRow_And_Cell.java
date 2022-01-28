package findelements.webtable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_Table_Data_From_SpecificRow_And_Cell {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.icicidirect.com/equity/sector-overview");
		driver.manage().window().maximize();
		
		//identifying table
		WebElement Table=driver.findElement(By.id("tbl_sector0"));
		
		//identifying list of rows under table
		List<WebElement> rows=Table.findElements(By.tagName("tr"));
		//Remove Header using index number
		rows.remove(0);
		
		//Target specific row using index number
		WebElement SelectedRow=rows.get(3);
		
		//Identify list of cells under selected row
		List<WebElement> cells=SelectedRow.findElements(By.tagName("td"));
		
		String Cname=cells.get(0).getText();
		String Capital=cells.get(1).getText();
		String NetProfit=cells.get(7).getText();
		String yearlyProfit=cells.get(9).getText();
		
		System.out.println(Cname+"\t"+Capital+"\t"+NetProfit+"\t"+yearlyProfit);
		
		
	}

}
