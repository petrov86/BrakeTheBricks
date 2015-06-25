package brake.the.bricks;

import java.util.Random;

public class BrickRandomFactory {

	public Brick getBrick(int x, int y) {

		Random random = new Random();
		int rand = random.nextInt(GameConstants.BRICKS_COUNT);
		BrickFactory bf = new BrickFactory();

		return bf.getBrick(x, y, rand);

	}

}
