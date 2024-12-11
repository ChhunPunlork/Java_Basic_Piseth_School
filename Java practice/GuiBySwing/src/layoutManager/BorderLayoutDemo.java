package layoutManager;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutDemo {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(300, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		JButton btn1 = new JButton("Button1");
		JButton btn2 = new JButton("Button2");
		JButton btn3 = new JButton("Button3");
		JButton btn4 = new JButton("Button4");
		JButton btn5 = new JButton("Button5");
		frame.setLayout(new BorderLayout());
		frame.add(btn1, BorderLayout.SOUTH);
		frame.add(btn2, BorderLayout.NORTH);
		frame.add(btn3, BorderLayout.EAST);
		frame.add(btn4, BorderLayout.WEST);
		frame.add(btn5, BorderLayout.CENTER);
		
		
		frame.setVisible(true);
	}

}
