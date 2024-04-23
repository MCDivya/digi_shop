package RobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.sql.Driver;

public class NotepadTest {

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		Runtime.getRuntime().exec("Notepad");
		
		Thread.sleep(3000);
		
		Robot robo =new Robot();
		
		robo.keyPress(KeyEvent.VK_D);
		Thread.sleep(2000);
		
		robo.keyPress(KeyEvent.VK_5);
		Thread.sleep(2000);
		
		robo.keyPress(KeyEvent.VK_SHIFT);
		robo.keyPress(KeyEvent.VK_3);
		Thread.sleep(2000);
		robo.keyRelease(KeyEvent.VK_SHIFT);
		
		robo.keyPress(KeyEvent.VK_ALT);
		robo.keyPress(KeyEvent.VK_F4);
		robo.keyRelease(KeyEvent.VK_ALT);
		Thread.sleep(2000);
		
		robo.keyPress(KeyEvent.VK_S);
		robo.keyPress(KeyEvent.VK_D);
		robo.keyPress(KeyEvent.VK_I);
		robo.keyPress(KeyEvent.VK_V);
		
		robo.keyPress(KeyEvent.VK_ENTER);
		
		
		
		
	}

}
