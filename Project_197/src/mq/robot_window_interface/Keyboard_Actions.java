package robot_window_interface;


import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Keyboard_Actions {

	public static void main(String[] args) throws Exception
	{
		
		//Launching notepad file at runtime
		Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(4000);
		
		//Create object for robot
		Robot robot=new Robot();
		robot.setAutoDelay(500);
		
		//Type Hello At Notepad File
		robot.keyPress(KeyEvent.VK_H);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_O);
		
	}

}
