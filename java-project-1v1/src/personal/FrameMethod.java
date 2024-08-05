package personal;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class FrameMethod extends JFrame{
	
	FrameMethod(){
		
		this.setTitle("Title");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);
		this.setSize(500,500);
		this.getContentPane().setBackground(new Color(255,255,255));
		
		this.setLocationRelativeTo(null); // Sets the location to the middle of the screen.
		this.setLayout(new BorderLayout()); // borderLayouts.java
		this.setLayout(new FlowLayout());
		this.setLayout(new GridLayout());
		this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
		
		
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new FrameMethod();
	}
}
