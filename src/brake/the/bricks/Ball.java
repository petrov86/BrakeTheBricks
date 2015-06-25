package brake.the.bricks;

import java.awt.Rectangle;
import java.util.Random;

public class Ball extends GameObject {

	private static final Ball ball = new Ball(Player.getInstance().getX()
			+ Player.getInstance().getWidth() / 2 - GameConstants.BALL_RADIUS / 2,
			Player.getInstance().getY() - GameConstants.BALL_RADIUS);
	
	private int xdir;
	private int ydir;
	private int tempXDir;
	private int tempYDir;
	private boolean isBallStopped = false;
	private int xDirMoveSpeed;
	private int yDirMoveSpeed;

	private Ball(int x, int y) {
		tempXDir = 0;
		tempYDir = 0;
		xDirMoveSpeed = 2;
		yDirMoveSpeed = 2;

		// set random X direction
		Random random = new Random();
		int r = random.nextInt(100);
		if (r < 50) {
			xdir = -1;
		} else {
			xdir = 1;
		}

		ydir = -1;
		width = GameConstants.BALL_RADIUS;
		heigth = GameConstants.BALL_RADIUS;
	}

	
	public static Ball getInstance() {
		return ball;
	}
	
	public void accelerate() {
		if (xDirMoveSpeed < 3) {
			xDirMoveSpeed++;
		}
		if (yDirMoveSpeed < 3) {
			yDirMoveSpeed++;
		}
	}

	public void slowDown() {
		if (xDirMoveSpeed > 2) {
			xDirMoveSpeed--;
		}
		if (yDirMoveSpeed > 2) {
			yDirMoveSpeed--;
		}
	}

	public void move() {

		if ((x + xDirMoveSpeed * xdir) < GameConstants.VISIBLE_WIDTH - width) {
			x += (xDirMoveSpeed * xdir);
		} else {
			x = GameConstants.VISIBLE_WIDTH - width;
		}

		y += (yDirMoveSpeed * ydir);
		if (x <= 0) {
			setXDir(1);
		}

		if (x >= GameConstants.VISIBLE_WIDTH - width) {
			changeXDir();
		}

		if (y <= 0) {
			changeYDir();
		}

	}

	public void stopMove() {
		if (!isBallStopped) {
			tempXDir = getXDir();
			tempYDir = getYDir();
			setXDir(0);
			setYDir(0);
			isBallStopped = true;
		}
	}

	public void resumeMove() {

		if (isBallStopped) {
			setXDir(tempXDir);
			setYDir(tempYDir);
			isBallStopped = false;
		}
	}

	public void resetState() {
		this.x = Player.getInstance().getX()
				+ Player.getInstance().getWidth() / 2 - GameConstants.BALL_RADIUS / 2;
		this.y = Player.getInstance().getY() - GameConstants.BALL_RADIUS;
		xDirMoveSpeed = 2;
		yDirMoveSpeed = 2;
	}

	public void setXDir(int x) {
		this.xdir = x;
	}

	public int getXDir() {
		return this.xdir;
	}

	public void changeXDir() {
		if (this.xdir == 0) {
			return;
		} else if (this.xdir == 1) {
			setXDir(-1);
		} else {
			setXDir(1);
		}
	}

	public void setYDir(int y) {
		this.ydir = y;
	}

	public int getYDir() {
		return this.ydir;
	}

	public void changeYDir() {
		if (this.ydir == 0) {
			return;
		} else if (this.ydir == 1) {
			setYDir(-1);
		} else {
			setYDir(1);
		}
	}

	public Rectangle getRect() {
		return new Rectangle(x, y, width, heigth);
	}

}
