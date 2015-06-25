package brake.the.bricks;

import javax.swing.ImageIcon;

public class RedBrick extends Brick {

	public RedBrick(int x, int y) {
		super(x, y);
		colour = "red";
		// TODO Auto-generated constructor stub

		try {
			ImageIcon ii = new ImageIcon(this.getClass().getResource(
					GameConstants.RED_BRICK_IMG_PATH));
			image = ii.getImage();
			width = image.getWidth(null);
			heigth = image.getHeight(null);

		} catch (Exception e) {
			System.out.println("Error loading brick image!");
		}

	}

	@Override
	public String getColour() {
		// TODO Auto-generated method stub
		return colour;
	}

}
