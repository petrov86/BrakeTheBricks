package brake.the.bricks;

public class LevelFactory {

	public Level getLevel(int levelIndex) {

		int bricksCount = GameConstants.BRICKS_COUNT_IN_LEVELS
				.get(GameConstants.FIGURES[levelIndex]);
		int speed = GameConstants.GAME_SPEED_IN_LEVELS
				.get(GameConstants.FIGURES[levelIndex]);

		
	
		switch (levelIndex) {
		case 0:
			return new RectangleLevel(bricksCount, speed);

		case 1:
			return new SquareLevel(bricksCount, speed);

		case 2:
			return new TriangleLevel(bricksCount, speed);

		case 3:
			return new RhombusLevel(bricksCount, speed);

		case 4:
			return new HexagonLevel(bricksCount, speed);

		default:
			return new RectangleLevel(bricksCount, speed);
		}

	}

}
