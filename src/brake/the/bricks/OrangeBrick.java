package brake.the.bricks;

import javax.swing.ImageIcon;

public class OrangeBrick extends Brick {

	public OrangeBrick(int x, int y) {
		super(x, y);
		colour = "orange";
		// TODO Auto-generated constructor stub

		try {
			ImageIcon ii = new ImageIcon(this.getClass().getResource(
					GameConstants.ORANGE_BRICK_IMG_PATH));
			image = ii.getImage();
			width = image.getWidth(null);
			heigth = image.getHeight(null);

		} catch (Exception e) {
			System.out.println("Error loading brick image!");
		}

	}


}
