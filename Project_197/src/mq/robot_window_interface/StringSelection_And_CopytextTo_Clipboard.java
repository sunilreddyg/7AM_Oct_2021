package robot_window_interface;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class StringSelection_And_CopytextTo_Clipboard 
{

	public static void main(String[] args) throws Exception 
	{
		
		//Opening notepad file at runtime
			
		Runtime.getRuntime().exec("notepad.exe");

		Thread.sleep(5000);
			
			
		//Crate objet for Robot
		Robot robot=new Robot();
		robot.setAutoDelay(300);
			
			
		String text="Plan your next trip with confidence - "
					+ "get the latest entry requirements and quarantine info.";
			
		//Copy string selection
		StringSelection stext=new StringSelection(text);
		//Get system clipboard and set content to system clipboard
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stext, stext);
			
		//Press Control+V Shortcut at Computer
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		//Release Down Keys
		robot.keyRelease(KeyEvent.VK_CONTROL);
	}

}
