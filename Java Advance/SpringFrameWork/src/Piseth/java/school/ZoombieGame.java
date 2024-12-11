package Piseth.java.school;

import org.springframework.stereotype.Component;

@Component
public class ZoombieGame implements Game {

	public void Up() {
		System.out.println("Go foward");
	}

	public void Left() {
		System.out.println("Go left");
	}

	public void Down() {
		System.out.println("Go Down");
	}

	public void Right() {
		System.out.println("Go right");
	}
}
