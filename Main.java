package brickBreaker;

import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class Main {

	public static void main(String[] args) {
		
		JFrame obj = new JFrame();

		  Gameplay gameplay = new Gameplay();
	        obj.setBounds(10,10,700,600);
	        obj.setTitle("BrickBreaker");
	        
	        ImageIcon image = new ImageIcon("images.png");
	        obj.setIconImage(image.getImage());

	        obj.setResizable(false);
	        obj.setVisible(true);
	        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	       
	        obj.add(gameplay);
	     
	       
		}
	}


	


