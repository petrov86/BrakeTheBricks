package brake.the.bricks;

import javax.swing.ImageIcon;

public class BiggerPlayerFallingObject extends FallingObject {

	public BiggerPlayerFallingObject(int x, int y) {
		super(x, y);
		System.out.println("Created - "
				+ GameConstants.BIGGER_PLAYER_IMG_PATH);
		try {
			ImageIcon ii = new ImageIcon(this.getClass().getResource(
					GameConstants.BIGGER_PLAYER_IMG_PATH));
			image = ii.getImage();
		} catch (Exception e) {
			System.out.println("Error loading - "
					+ GameConstants.BIGGER_PLAYER_IMG_PATH);
		}
	}

	@Override
	public void changeGame() {

		Player.getInstance().makePlayerBigger();

	}

}
