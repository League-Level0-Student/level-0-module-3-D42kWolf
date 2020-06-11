
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		  Robot rob = new Robot();
	    //2. Make the robot draw a shape (this will take more than one line of code)	
		  rob.penDown();
		  rob.setSpeed(100);
		  rob.move(45);
		  rob.turn(45);
		  rob.move(15);
		  rob.turn(25);
		  rob.move(15);
		  rob.turn(25);
		//3. Set the pen width to 10
		  rob.setPenWidth(10);
		//4. Ask the user what color pen they would like the robot to draw with
		  
		  String color = JOptionPane.showInputDialog("What color would you like to draw with?");
		  
		  System.out.println(color);
		//5. Use an if/else statement to set the pen color that the user requested
		
		 if (color.equals ("red") ) {
			 rob.setPenColor(10,0,0);
			   // codes
			}
			else {
			  // some other code
			}
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	}
}
