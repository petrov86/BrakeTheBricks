package brake.the.bricks;

public class RhombusLevel extends Level {

	public RhombusLevel(int bricksCount, int speed) {
		super(bricksCount, speed);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setLevel() {

		int count = getBricksCount();
		int cols = 2;
		int rowCount = 0;
		int y = GameConstants.OFFSET_TOP;
		int offset = 2;
		int tempOffset = GameConstants.WIDTH / 2 - GameConstants.BRICK_WIDTH
				* 2;
		int x = tempOffset;

		while (count > 0) {
			System.out.println("temp offset = " + tempOffset);
			for (int i = 0; i < cols; i++) {
				bricks.add(brickRandomFactory.getBrick(x, y));
				x += (bricks.get(bricks.size() - 1).getWidth() + offset);
				count--;
			}
			if (rowCount < 4) {
				cols += 2;
				tempOffset -= (GameConstants.BRICK_WIDTH + (offset / 2)) * 2;
				x = tempOffset;

			} else if (rowCount > 6) {
				cols -= 2;
				tempOffset += (GameConstants.BRICK_WIDTH + (offset / 2)) * 2;
				x = tempOffset;
			} else {
				x = tempOffset;
			}
			rowCount++;
			y += (bricks.get(bricks.size() - 1).getHeight() + offset);

		}

	}

}
