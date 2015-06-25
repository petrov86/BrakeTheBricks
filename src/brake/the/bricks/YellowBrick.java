package brake.the.bricks;

import javax.swing.ImageIcon;

public class YellowBrick extends Brick {

	public YellowBrick(int x, int y) {
		super(x, y);
		colour = "yellow";
		// TODO Auto-generated constructor stub

		try {
			ImageIcon ii = new ImageIcon(this.getClass().getResource(
					GameConstants.YELLOW_BRICK_IMG_PATH));
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
