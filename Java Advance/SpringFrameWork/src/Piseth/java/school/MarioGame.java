package Piseth.java.school;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements Game {

	public void Up() {
		System.out.println("Jump");
	}

	public void Left() {
		System.out.println("Turn left");
	}

	public void Down() {
		System.out.println("Sit Down");
	}

	public void Right() {
		System.out.println("Turn right");
	}
}
