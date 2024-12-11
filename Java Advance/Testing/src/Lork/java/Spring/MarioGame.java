package Lork.java.Spring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements Game{

	@Override
	public void up() {
		System.out.println("Jump");
	}

	@Override
	public void down() {
		System.out.println("Down");
	}

	@Override
	public void left() {
		System.out.println("Back");
	}

	@Override
	public void right() {
		System.out.println("Forward");
	}
	
}
