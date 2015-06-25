package brake.the.bricks;

import java.awt.Image;
import java.awt.Rectangle;

public abstract class GameObject {

	public int width;
	public int heigth;
	public int x;
	public int y;
	public Image image;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return heigth;
	}

	public Image getImage() {
		return image;
	}
	
	Rectangle getRect() {
		return new Rectangle(x, y, image.getWidth(null), image.getHeight(null));
	}

}
