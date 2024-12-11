package Lork.java.Spring;

import javax.swing.JPanel;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAplicationDemo {
	public static void main(String[] arqs) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		GameRunner gameRuner = context.getBean(GameRunner.class);

		gameRuner.MoveUp();
		
	}
}
