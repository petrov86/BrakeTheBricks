package brake.the.bricks;

import javax.swing.ImageIcon;

public class Background extends GameObject {

	public Background() {
		x = 0;
		y = 0;
		try {
			ImageIcon ii = new ImageIcon(this.getClass().getResource(
					GameConstants.BACKGROUND_IMG_PATH));
			image = ii.getImage();
			width = GameConstants.WIDTH;
			heigth = GameConstants.GAME_PANEL_HEIGTH;

		} catch (Exception e) {
			System.out.println("Error loading backgroung image!");
		}
	}

}
