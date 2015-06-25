package brake.the.bricks;

public class RectangleLevel extends Level {

	public RectangleLevel(int bricksCount, int speed) {
		super(bricksCount, speed);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setLevel() {

		int x = GameConstants.OFFSET_SIDE;
		int y = GameConstants.OFFSET_TOP;
		int offset = 2;

		for (int i = 0; i < getBricksCount() / 10; i++) {
			for (int j = 0; j < 10; j++) {
				bricks.add(brickRandomFactory.getBrick(x, y));
				x += (bricks.get(bricks.size() - 1)
						.getWidth() + offset);
			}
			x = GameConstants.OFFSET_SIDE;
			y += (bricks.get(bricks.size() - 1).getHeight() + offset);
		}

	}

}
