package brake.the.bricks;

import java.awt.Rectangle;
import java.util.Random;

public abstract class Brick extends GameObject {

	private boolean haveFallingRock;
	private int brickColor;
	protected String colour;

	public Brick(int x, int y) {
		this.x = x;
		this.y = y;
		haveFallingRock = generateHaveFallingRock();

	}

	public String getColour() {
		return colour;
	};

	public int getBrickColor() {
		return brickColor;
	}

	public int getPriority() {
		return GameConstants.BRICKS_COLOURS.get(getColour());
	}

	public boolean getHaveFallingObject() {
		return haveFallingRock;
	}

	// return true if the Brick has a falling rock
	private boolean generateHaveFallingRock() {

		Random random = new Random();
		int rand = random.nextInt(10);
		if (rand == 1) {
			return true;
		}

		return false;
	}

	public Rectangle getXRect(int direction) {
		if (direction == 1) {
			return new Rectangle(x, y, width, 1);
		} else if (direction == -1) {
			return new Rectangle(x, y + heigth, width, 1);
		} else {
			return null;
		}

	}

	public Rectangle getYRect(int direction) {
		if (direction == 1) {
			return new Rectangle(x, y, 1, heigth);
		} else if (direction == -1) {
			return new Rectangle(x + width, y + heigth, 1, heigth);
		} else {
			return null;
		}

	}

}
