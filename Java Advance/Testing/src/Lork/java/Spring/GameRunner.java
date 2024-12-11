package Lork.java.Spring;

import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	private Game game;
	
	public GameRunner(Game game) {
		this.game = game;
	}
	
	public void MoveUp() {
		game.up();
	}
	
	public void MoveDown() {
		game.down();
	}
	
	public void MoveLeft() {
		game.left();
	}
	
	public void MoveRight() {
		game.right();
	}
}
