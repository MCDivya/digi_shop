package RobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class MouseAndKeyBoardAction {
	public static void main(String[] args) throws AWTException, InterruptedException {
		Robot robo=new Robot();
		Thread.sleep(5000);
		
		robo.mouseMove(200, 200);
		
		
		robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(5000);
		
		robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(5000);
		
		
	}

}
