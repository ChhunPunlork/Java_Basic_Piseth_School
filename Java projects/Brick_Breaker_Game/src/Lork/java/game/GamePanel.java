package Lork.java.game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GamePanel extends JPanel implements ActionListener {
	private Timer timer;
	private int paddleX, ballX, ballY, ballDirectionX, ballDirectionY;
	private boolean[][] bricks;
	private final int paddleWidth = 100;
	private final int paddleHeight = 10;
	private final int ballSize = 15;

	public GamePanel() {
		this.setBackground(Color.BLACK);
		this.setFocusable(true);
		this.addKeyListener(new PaddleControl());

		paddleX = 350;
		ballX = 400;
		ballY = 300;
		ballDirectionX = 2;
		ballDirectionY = -2;

		// Initialize bricks
		bricks = new boolean[5][10];
		for (int i = 0; i < bricks.length; i++) {
			for (int j = 0; j < bricks[i].length; j++) {
				bricks[i][j] = true; // All bricks are visible
			}
		}
	}

	public void startGame() {
		timer = new Timer(10, this);
		timer.start();
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		drawBricks(g);
		drawPaddle(g);
		drawBall(g);
	}

	private void drawBricks(Graphics g) {
		g.setColor(Color.RED);
		for (int i = 0; i < bricks.length; i++) {
			for (int j = 0; j < bricks[i].length; j++) {
				if (bricks[i][j]) {
					g.fillRect(j * 75 + 50, i * 30 + 50, 70, 20);
				}
			}
		}
	}

	private void drawPaddle(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillRect(paddleX, getHeight() - paddleHeight - 30, paddleWidth, paddleHeight);
	}

	private void drawBall(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillOval(ballX, ballY, ballSize, ballSize);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		moveBall();
		checkCollision();
		repaint();
	}

	private void moveBall() {
		ballX += ballDirectionX;
		ballY += ballDirectionY;

		// Bounce off walls
		if (ballX < 0 || ballX > getWidth() - ballSize) {
			ballDirectionX = -ballDirectionX;
		}
		if (ballY < 0) {
			ballDirectionY = -ballDirectionY;
		}
	}

	private void checkCollision() {
		// Check paddle collision
		if (ballY >= getHeight() - paddleHeight - 30 && ballX + ballSize > paddleX && ballX < paddleX + paddleWidth) {
			ballDirectionY = -ballDirectionY;
		}

		// Check brick collision
		for (int i = 0; i < bricks.length; i++) {
			for (int j = 0; j < bricks[i].length; j++) {
				if (bricks[i][j]) {
					int brickX = j * 75 + 50;
					int brickY = i * 30 + 50;
					if (ballX + ballSize > brickX && ballX < brickX + 70 && ballY + ballSize > brickY
							&& ballY < brickY + 20) {
						bricks[i][j] = false; // Break the brick
						ballDirectionY = -ballDirectionY;
					}
				}
			}
		}

		// Ball falls below paddle
		if (ballY > getHeight()) {
			timer.stop(); // Game over
			JOptionPane.showMessageDialog(this, "Game Over!");
			System.exit(0);
		}
	}

	private class PaddleControl extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode() == KeyEvent.VK_LEFT && paddleX > 0) {
				paddleX -= 20;
			}
			if (e.getKeyCode() == KeyEvent.VK_RIGHT && paddleX < getWidth() - paddleWidth) {
				paddleX += 20;
			}
		}
	}
}
