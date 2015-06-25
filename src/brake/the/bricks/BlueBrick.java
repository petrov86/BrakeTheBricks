package brake.the.bricks;

import javax.swing.ImageIcon;

public class BlueBrick extends Brick {

	public BlueBrick(int x, int y) {
		super(x, y);
		colour = "blue";
		// TODO Auto-generated constructor stub

		try {
			ImageIcon ii = new ImageIcon(this.getClass().getResource(
					GameConstants.BLUE_BRICK_IMG_PATH));
			image = ii.getImage();
			width = image.getWidth(null);
			heigth = image.getHeight(null);

		} catch (Exception e) {
			System.out.println("Error loading brick image!");
		}

	}


}
