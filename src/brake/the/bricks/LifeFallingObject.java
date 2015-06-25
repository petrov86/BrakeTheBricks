package brake.the.bricks;

import javax.swing.ImageIcon;

public class LifeFallingObject extends FallingObject {

	public LifeFallingObject(int x, int y) {
		super(x, y);
		System.out.println("Created - " + GameConstants.LIFE_IMG_PATH);
		try {
			ImageIcon ii = new ImageIcon(this.getClass().getResource(
					GameConstants.LIFE_IMG_PATH));
			image = ii.getImage();
		} catch (Exception e) {
			System.out
					.println("Error loading - " + GameConstants.LIFE_IMG_PATH);
		}
	}

	@Override
	public void changeGame() {
		Player.getInstance().giveOneLife();
	}

}
