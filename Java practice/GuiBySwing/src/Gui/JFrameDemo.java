package Gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JFrameDemo {
	public static void main(String[] arqs) {
		JFrame frame = new JFrame();
		frame.setTitle("Student Information");
		frame.setSize(300, 350);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//Name
		frame.setLayout(null);
		JLabel lblName = new JLabel("Name: ");
		lblName.setBounds(10, 10, 50, 20);
		frame.add(lblName);
		JTextField txtName = new JTextField();
		txtName.setBounds(70, 10, 70, 20);
		frame.add(txtName);
		
		//gender
		JLabel lblGender = new JLabel("Gender: ");
		lblGender.setBounds(10, 40, 50, 20);
		frame.add(lblGender);
		JTextField txtGender = new JTextField();
		txtGender.setBounds(70, 40, 70, 20);
		frame.add(txtGender);

		//age
		JLabel lblAge = new JLabel("Age: ");
		lblAge.setBounds(10, 70, 50, 20);
		frame.add(lblAge);
		JTextField txtAge = new JTextField();
		txtAge.setBounds(70,70 , 70, 20);
		frame.add(txtAge);
		
		//grade
		JLabel lblGrade = new JLabel("Grade: ");
		lblGrade.setBounds(10, 100, 50, 20);
		frame.add(lblGrade);
		Integer []grades = new Integer[] {1, 2, 3, 4, 5};
		JComboBox<Integer> cbx = new JComboBox<>(grades);
		cbx.setBounds(70, 100, 50, 20);
		frame.add(cbx);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(90, 130, 100, 20);
		frame.add(btnSave);
		
		btnSave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String txt = "Name: " + txtName.getText() + ", Gender: " + txtGender.getText() + ", Age: " + txtAge.getText() + ", Grade: " + cbx.getSelectedIndex() ;
				System.out.println(txt);
			}
		}); 
		
		frame.setVisible(true);
	}
}
