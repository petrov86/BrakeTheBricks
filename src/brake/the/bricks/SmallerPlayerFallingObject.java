package brake.the.bricks;

import javax.swing.ImageIcon;

public class SmallerPlayerFallingObject extends FallingObject {

	public SmallerPlayerFallingObject(int x, int y) {
		super(x, y);
		System.out.println("Created - "
				+ GameConstants.SMALLER_PLAYER_IMG_PATH);
		try {
			ImageIcon ii = new ImageIcon(this.getClass().getResource(
					GameConstants.SMALLER_PLAYER_IMG_PATH));
			image = ii.getImage();
		} catch (Exception e) {
			System.out.println("Error loading - "
					+ GameConstants.SMALLER_PLAYER_IMG_PATH);
		}
	}

	@Override
	public void changeGame() {

		Player.getInstance().makePlayerSmaller();

	}

}
