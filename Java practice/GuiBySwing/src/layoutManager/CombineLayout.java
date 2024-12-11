package layoutManager;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.nio.ByteOrder;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CombineLayout {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		frame.setLayout(new BorderLayout());
		JPanel panel1 = form1();
		frame.add(panel1, BorderLayout.WEST);
		
		JPanel panel2 = form2();
		frame.add(panel2, BorderLayout.EAST);
		
		JPanel panel3 = form3();
		frame.add(panel3, BorderLayout.SOUTH);
		
		frame.setVisible(true);
	}
	private static JPanel form1() {
		JPanel jPanel = new JPanel();
		jPanel.setLayout(new GridLayout(2,2));
		JLabel lblName = new JLabel("Name: ");
		JTextField txtName = new JTextField();
		
		JLabel lblGender = new JLabel("Gender: ");
		JTextField txtGender = new JTextField();
		
		jPanel.add(lblName);
		jPanel.add(txtName);
		jPanel.add(lblGender);
		jPanel.add(txtGender);
		return jPanel ;
	}
	private static JPanel form2() {
		JPanel jPanel = new JPanel();
		jPanel.setLayout(new FlowLayout());
	
		JButton btn1 = new JButton("Button1");
		JButton btn2 = new JButton("Button2");
		JButton btn3 = new JButton("Button3");
		JButton btn4 = new JButton("Button4");
		
		jPanel.add(btn1);
		jPanel.add(btn2);
		jPanel.add(btn3);
		jPanel.add(btn4);
		return jPanel ;
	}
	private static JPanel form3() {
		JPanel jPanel = new JPanel();
		jPanel.setLayout(new FlowLayout());
	
		JButton btn1 = new JButton("Button1");
		JButton btn2 = new JButton("Button2");
		
		jPanel.add(btn1);
		jPanel.add(btn2);
		return jPanel ;
	}
	

}
