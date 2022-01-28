package findelements.webtable;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_SpecifiRow_Data_From_DynamicRows {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.icicidirect.com/equity/sector-overview");
		driver.manage().window().maximize();
		
		//Identify table
		WebElement Table=driver.findElement(By.id("tbl_sector0"));
		System.out.println("Table identified");
		
		//Find list of Rows available under table
		List<WebElement> rows=Table.findElements(By.tagName("tr"));
		rows.remove(0);   //Removing header
		
		for (int i = 0; i <rows.size(); i++) 
		{
			
			WebElement DynamicRow=rows.get(i);
			//Read Row Text at runtime
			
			//Read Each Row Text
			String RowText=DynamicRow.getText();
			
			if(RowText.contains("Infosys"))
			{
				System.out.println("Record Available at row is --> "+i);
				
				//Identify list of cells under selected row
				List<WebElement> cells=DynamicRow.findElements(By.tagName("td"));
				
				String Cname=cells.get(0).getText();
				String Capital=cells.get(1).getText();
				String NetProfit=cells.get(7).getText();
				String yearlyProfit=cells.get(9).getText();
				
				System.out.println(Cname+"\t"+Capital+"\t"+NetProfit+"\t"+yearlyProfit);
				
			}
		}
		

		
		
		

	}

}
