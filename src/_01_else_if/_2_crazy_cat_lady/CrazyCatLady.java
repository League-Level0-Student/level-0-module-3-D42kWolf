
package _01_else_if._2_crazy_cat_lady;

import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		
		String cats = JOptionPane.showInputDialog("How many cats do you have?");
		// 1. Ask the user how many cats they have
	
		// 2. Convert their answer into an int
		int catsnum = Integer.parseInt(cats);
		// 3. If they have 3 or more cats, tell them they are a crazy cat lady
		if (catsnum >=5 ) {
			//JOptionPane.showOutputDialog("You are a crazy cat lady");
			System.out.println("i dont like to type");
			}
			else if (catsnum < 5 && catsnum > 0) { 
				playVideo("https://youtu.be/cytJLvf-eVs?si=PsSUwHvVOY32rU3D");
			}
			else if (catsnum == 0) {
				playVideo("https://youtu.be/W_juM14WHNQ?si=EGPM6ESG-M3T4gvT");
			}
		
		// 4. If they have less than 3 cats AND more than 0 cats, call the method below to show them a cat video
		//    Hint: You can use the && operator 
		// 5. If they have 0 cats, show them a video of A Frog Sitting on a Bench Like a Human
		
		
		
		
		
		
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
