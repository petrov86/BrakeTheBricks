package brake.the.bricks;

import javax.swing.ImageIcon;

public class BallSpeedDownFallingObject extends FallingObject{

	public BallSpeedDownFallingObject(int x, int y) {
		super(x, y);
		System.out.println("Created - " + GameConstants.BALL_SPEED_DOWN_IMG_PATH);
		try {
			ImageIcon ii = new ImageIcon(this.getClass().getResource(
					GameConstants.BALL_SPEED_DOWN_IMG_PATH));
			image = ii.getImage();
		} catch (Exception e) {
			System.out.println("Error loading - "
					+ GameConstants.BALL_SPEED_DOWN_IMG_PATH);
		}
	}

	@Override
	public void changeGame() {
		Ball.getInstance().slowDown();
	}

}
