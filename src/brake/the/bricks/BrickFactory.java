package brake.the.bricks;


public class BrickFactory {

	public Brick getBrick(int x, int y, int priority) {

		switch (priority) {
		case 0:
			return new GreenBrick(x, y);

		case 1:
			return new YellowBrick(x, y);

		case 2:
			return new OrangeBrick(x, y);

		case 3:
			return new RedBrick(x, y);

		case 4:
			return new BlueBrick(x, y);

		default:
			return new GreenBrick(x, y);
		}

	}

}
