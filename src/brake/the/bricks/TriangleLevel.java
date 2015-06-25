package brake.the.bricks;

public class TriangleLevel extends Level {

	public TriangleLevel(int bricksCount, int speed) {
		super(bricksCount, speed);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setLevel() {

		int count = getBricksCount();
		int cols = 10;
		int rowCount = 0;
		int y = GameConstants.OFFSET_TOP;
		int x = GameConstants.OFFSET_SIDE;
		int offset = 2;
		int tempOffset = GameConstants.OFFSET_SIDE;

		while (count > 0) {
			for (int i = 0; i < cols; i++) {
				bricks.add(brickRandomFactory.getBrick(x, y));
				x += (bricks.get(bricks.size() - 1).getWidth() + offset);
				count--;
			}
			y += (bricks.get(bricks.size() - 1).getHeight() + offset);
			rowCount++;

			if (rowCount % 2 == 0) {
				cols--;
				tempOffset += bricks.get(bricks.size() - 1).getWidth() / 2
						+ offset / 2;
				x = tempOffset;
			} else {
				x = tempOffset;
			}

		}
	}

}
