package Lork.java.Spring;

import org.springframework.stereotype.Component;

@Component
public class ZoombieGame implements Game{

	@Override
	public void up() {
		System.out.println("Move up");
	}

	@Override
	public void down() {
		System.out.println("Move down");
	}

	@Override
	public void left() {
		System.out.println("Move forward");
	}

	@Override
	public void right() {
		System.out.println("Move back");
	}
	
}
