package ExtendJFrame;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.security.PublicKey;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class StudentForm extends JFrame {
	private JTable table = new JTable();
	private JTextField txtName = new JTextField();
	private JRadioButton Malebt = new JRadioButton("Male");
	private JRadioButton Famalebt = new JRadioButton("Famale");
	private ButtonGroup btGroup = new ButtonGroup();
	private JComboBox<Integer> cbxGrade;
	private JLabel lblAge;
	private JButton btnSave;
	private JTextField txtAge;
	private int SelectedRow = -1;

	public StudentForm() {
		this.setTitle("Student form");
		this.setSize(400, 500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel form = Createform();
		this.getContentPane().add(form, BorderLayout.NORTH);
		table = CreateTable();
		JScrollPane jS = new JScrollPane();
		jS.getViewport().add(table);
		// add row data
//		DefaultTableModel model = (DefaultTableModel) table.getModel();
//		model.addRow(new Object[] {"Veasnae", "Male", 12, 29});
		addMouseClickEventToTable();
		//
		this.getContentPane().add(jS);
		this.setVisible(true);
	}

	private JPanel Createform() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(5, 2));
		JLabel lblName = new JLabel("Name: ");

		panel.add(lblName);
		panel.add(txtName);

		JLabel lblGender = new JLabel("Gender: ");
//		 String[] gender = new String[] {"Male", "Famale"};
		// JComboBox<String> cbxGener = new JComboBox<>(gender);

		btGroup.add(Malebt);
		btGroup.add(Famalebt);
		JPanel pGender = new JPanel(new FlowLayout());
		pGender.add(Malebt);
		pGender.add(Famalebt);
		panel.add(lblGender);
		panel.add(pGender);
//		 panel.add(cbxGener);

		JLabel lblGrade = new JLabel("Grade: ");
		Integer[] grades = new Integer[] { 1, 2, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		cbxGrade = new JComboBox<>(grades);
		panel.add(lblGrade);
		panel.add(cbxGrade);

		lblAge = new JLabel("Age: ");
		txtAge = new JTextField();
		panel.add(lblAge);
		panel.add(txtAge);

		btnSave = new JButton("Save");
		panel.add(btnSave);

		btnSave.addActionListener(new ClickListener());

		return panel;
	}

	private class ClickListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// add row data
			String gender = "Male";
			if (Famalebt.isSelected()) {
				gender = "Famale";
			}
			if (SelectedRow != -1) {// update data
				table.setValueAt(txtName.getText(), SelectedRow, 0);
				table.setValueAt(gender, SelectedRow, 1);
				table.setValueAt(cbxGrade.getSelectedItem().toString(), SelectedRow, 2);
				table.setValueAt(txtAge.getText(), SelectedRow, 3);
				SelectedRow = -1;
			} else {
				DefaultTableModel model = (DefaultTableModel) table.getModel();

				Object[] data = new Object[] { txtName.getText(), gender, cbxGrade.getSelectedItem().toString(),
						txtAge.getText() };
				model.addRow(data);
			}
		}

	}

	private void addMouseClickEventToTable() {
		table.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				setFormValue();
				super.mouseClicked(e);
			}
		});
	}

	private JTable CreateTable() {
		String[] columnName = new String[] { "Name", "Gender", "Grade", "Age" };
		Object[][] rowData = {
				{ "Dara", "Male", 12, 19 },
				{ "Thida", "Famale", 12, 17 }, };
		// TableModel
		DefaultTableModel TbMd = new DefaultTableModel(rowData, columnName);
		JTable table = new JTable(TbMd);

		return table;
	}

	private void setFormValue() {
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		SelectedRow = table.getSelectedRow();
		Object name = model.getValueAt(SelectedRow, 0);
		Object gender = model.getValueAt(SelectedRow, 1);
		Object grade = model.getValueAt(SelectedRow, 2);
		Object age = model.getValueAt(SelectedRow, 3);

		txtName.setText(name.toString());
		if (gender.toString().equals("Male")) {
			Malebt.setSelected(true);
		} else {
			Famalebt.setSelected(true);
		}
		cbxGrade.setSelectedItem(Integer.parseInt(grade.toString()));
		txtAge.setText(age.toString());

	}

}
