package brake.the.bricks;

import java.util.Random;

public class FallingObjectFactory {

	public FallingObject getRandomFallingObject(int x, int y) {

		Random random = new Random();
		int rand = random
				.nextInt(GameConstants.FALLING_OBJECTS_PRIORITY.size());

		
		switch (rand) {
		case 0:
			return new SmallerPlayerFallingObject(x, y);

		case 1:
			return new BiggerPlayerFallingObject(x, y);

		case 2:
			return new LifeFallingObject(x, y);

		case 3:
			return new BallSpeedUpFallingObject(x, y);

		case 4:
			return new BallSpeedDownFallingObject(x, y);

		default:
			return new SmallerPlayerFallingObject(x, y);
		}

	}

}
