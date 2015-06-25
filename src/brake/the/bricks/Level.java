package brake.the.bricks;

import java.util.ArrayList;

public abstract class Level {

	private int bricksCount;
	private int speed;
	private BrickFactory brickFactory = null;
	protected BrickRandomFactory brickRandomFactory = null;
	public ArrayList<Brick> bricks = null;

	public Level(int bricksCount, int speed) {

		brickRandomFactory = new BrickRandomFactory();
		brickFactory = new BrickFactory();
		this.bricksCount = bricksCount;
		this.speed = speed;
		bricks = new ArrayList<Brick>();
	}

	public int getBricksCount() {

		return bricksCount;
	}

	public void changeTheBrick(Brick brick) {
		Brick tmp = brickFactory.getBrick(
				brick.getX(),
				brick.getY(), (brick.getPriority() - 1));
		
		bricks.remove(brick);
		bricks.add(tmp);

	}

	public int getSpeed() {

		return speed;
	}

	public abstract void setLevel();

}
