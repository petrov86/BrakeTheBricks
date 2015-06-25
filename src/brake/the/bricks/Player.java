package brake.the.bricks;

import java.awt.Rectangle;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

public class Player extends GameObject {

	private static final Player player = new Player();
	int dx;
	int life;

	private Player() {

		System.out.println("==================================");
		System.out.println("PLAYER CREATED");
		System.out.println("==================================");
		life = GameConstants.PLAYER_DEFAULT_LIVES;
		resetState();
	}

	public void resetState() {
		setPlayerImage();
		x = (GameConstants.VISIBLE_WIDTH - this.width) / 2;
		y = GameConstants.BOTTOM - getHeight() - 40;

		// Check whether the player is dead
		if (life == 0) {
			life = GameConstants.PLAYER_DEFAULT_LIVES;
		}

	}

	public void giveOneLife() {

		life++;

	}

	public static Player getInstance() {
		return player;
	}

	public void setX(int x) {
		if (x > 0 || x < GameConstants.VISIBLE_WIDTH - this.width)
			this.x = x;

	}

	private void setPlayerImage() {
		try {
			ImageIcon ii = new ImageIcon(this.getClass().getResource(
					GameConstants.PLAYER_IMG_PATH));
			image = ii.getImage();
			width = image.getWidth(null);
			heigth = image.getHeight(null);
		} catch (Exception e) {
			System.out.println("Error loading player image!");
			System.out.println(GameConstants.PLAYER_IMG_PATH);
		}

	}

	public void makePlayerBigger() {
		if (this.width < 150) {
			System.out.println("==================================");
			System.out.println("PLAYER IMAGE RESIZED");
			System.out.println("==================================");
			this.width += 50;

		}
	}

	public void makePlayerSmaller() {
		if (this.width >= 100) {
			System.out.println("==================================");
			System.out.println("PLAYER IMAGE RESIZED");
			System.out.println("==================================");
			this.width -= 50;
		}
	}

	public void move() {
		x += dx;
		if (x <= 0)
			x = 0;
		if (x >= GameConstants.VISIBLE_WIDTH - this.width)
			x = GameConstants.VISIBLE_WIDTH - this.width;
	}

	public void keyPressed(KeyEvent e) {

		int key = e.getKeyCode();
		if (key == KeyEvent.VK_LEFT) {
			dx = -2;

		}

		if (key == KeyEvent.VK_RIGHT) {
			dx = 2;
		}
	}

	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();

		if (key == KeyEvent.VK_LEFT) {
			dx = 0;
		}

		if (key == KeyEvent.VK_RIGHT) {
			dx = 0;
		}

	}

	@Override
	public Rectangle getRect() {
		return new Rectangle(x, y, width, 1);
	}

	Rectangle getRect(int direction) {
		if (direction == 1) {
			return new Rectangle(x, y, 1, heigth);
		} else if (direction == -1) {
			return new Rectangle(x + width, y + heigth, 1, heigth);
		} else {
			return null;
		}

	}
}
