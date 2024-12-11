package GuiSwing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatFrame {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(400, 500);
		frame.setTitle("Chat Frame");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//creating menu bar
		JMenuBar mb = new JMenuBar();
		JMenu mb1 = new JMenu("File");
		JMenu mb2 = new JMenu("Help");
		mb.add(mb1);
		mb.add(mb2);
		JMenuItem m11 = new JMenuItem("Open");
		JMenuItem m22 = new JMenuItem("Save as");
		JMenuItem m33 = new JMenuItem("Close");
		mb1.add(m11);
		mb1.add(m22);
		mb1.add(m33);
		
		//creating panel add button and adding component
		JPanel panel = new JPanel();
		JLabel txt = new JLabel("Enter text");
		JTextField txtField = new JTextField(10);
		JButton send = new JButton("Send");
		JButton reset = new JButton("Reset");
		panel.add(txt);
		panel.add(txtField);
		panel.add(send);
		panel.add(reset);
		
		//text area at center
		JTextArea txtA = new JTextArea();
		
		//adding component to frame
		frame.getContentPane().add(BorderLayout.SOUTH, panel);
		frame.getContentPane().add(BorderLayout.NORTH, mb);
		frame.getContentPane().add(BorderLayout.CENTER, txtA);
		
		frame.setVisible(true);
	}

}
