package Piseth.java.school;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApplication {

	public static void main(String[] args) {
//		ZoombieGame game = new ZoombieGame();
//		MarioGame game2 = new MarioGame();
//		GameRunner gameRunner = new GameRunner(game);
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		GameRunner gameRunner = context.getBean(GameRunner.class);
		
		
		gameRunner.MoveUp();
		gameRunner.MoveDown();
		
	}

}
