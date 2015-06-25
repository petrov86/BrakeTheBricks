package brake.the.bricks;

import java.awt.Rectangle;
import java.util.Random;

public abstract class FallingObject extends GameObject {


	private int speed = 0;
	private boolean isVisible;

	public FallingObject(int x, int y) {
		
		this.x = x;
		this.y = y;
		isVisible = true;
		width = GameConstants.FALLING_OBJECT_WIDTH;
		heigth = GameConstants.FALLING_OBJECT_HEIGTH;		
		Random random = new Random();
		speed = random.nextInt(2) + 1;
	}

	public void move() {
		y += speed;
	}


	public Rectangle getRect() {
		return new Rectangle(x, y, width, heigth);
	}

	public boolean getVisibility() {
		return isVisible;
	}

	public void setVisibility(boolean visibility) {
		isVisible = visibility;
	}

	public abstract void changeGame();

}
