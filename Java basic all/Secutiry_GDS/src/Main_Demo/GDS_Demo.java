package Main_Demo;

import DB_Service.JDBC_Service;
import GUI.GUI_Form;

public class GDS_Demo {
	public static void main(String[] arqs) {
		JDBC_Service DBservice = new JDBC_Service();
//		DBservice.ConnetToDB();
		GUI_Form gui_Form = new GUI_Form();
	}
}
