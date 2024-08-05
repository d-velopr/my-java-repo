package personal;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Frame extends JFrame implements ActionListener{
	JFrame frame;
	JPanel hPanel;
	JPanel cPanel;
	JPanel fPanel;
	JLabel hLabel;
	JLabel cLabel;
	JLabel fLabel;
	JButton button1;
	JButton button2;
	ImageIcon icon1;
	ImageIcon icon2;

	Frame(){
		
		hPanel = new JPanel();
		cPanel = new JPanel();
		fPanel = new JPanel();
		hLabel = new JLabel();
		cLabel = new JLabel();
		fLabel = new JLabel();
		button1 = new JButton();
		button2 = new JButton();
		icon1 = new ImageIcon("bow.png");
		icon2 = new ImageIcon("mouse.png");
		
		hPanel.setBounds(0, 0, 600, 100);
		hPanel.setBackground(Color.magenta);
		hLabel.setText("Header");
		hLabel.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		hLabel.setForeground(Color.black);
		
		cPanel.setBounds(0, 0, 600, 472);
		cPanel.setBackground(Color.BLUE);
		
		button1.setBounds(75,135,200,300);
		button1.setBorder(BorderFactory.createEtchedBorder());
		button1.setIcon(icon1);
		button1.addActionListener(this);
		
		button2.setBounds(325,135,200,300);
		button2.setBorder(BorderFactory.createEtchedBorder());
		button2.setIcon(icon2);
		button2.addActionListener(this);
		
		fPanel.setBounds(0, 472, 600, 100);
		fPanel.setBackground(Color.black);
		fLabel.setText("Footer");
		fLabel.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		fLabel.setForeground(Color.white);
		
		hPanel.add(hLabel);
		fPanel.add(fLabel);
		this.add(button1);
		this.add(button2);
		this.add(hPanel);
		this.add(cPanel);
		this.add(fPanel);
		this.setTitle("idk");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600,600);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button1){
			System.out.println("Bow");

		}
		
		if(e.getSource()==button2) {
			System.out.println("Mouse");
		}
	}
	public static void main(String[] args){
		new Frame();
	}
}
