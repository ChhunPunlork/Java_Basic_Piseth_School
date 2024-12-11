package Piseth.java.school;

import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	private Game game;

	public GameRunner(Game game) {
		this.game = game;
	}

	public void MoveUp() {
		game.Up();
	}

	public void MoveDown() {
		game.Down();
	}

	public void MoveLeft() {
		game.Left();
	}

	public void MoveRight() {
		game.Right();
	}

}
