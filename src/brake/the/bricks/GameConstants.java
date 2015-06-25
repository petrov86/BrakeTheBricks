package brake.the.bricks;

import java.util.HashMap;
import java.util.Map;

public class GameConstants {

	
	
	public static final String BACKGROUND_IMG_PATH = "images/background.png";
	public static final int WIDTH = 500;
	public static final int HEIGTH = 600;
	public static final int VISIBLE_WIDTH = WIDTH - 6; // 6 is the side of
														// borders
	public static final int BRICK_WIDTH = 20;
	public static final int NAVIGATION_PANEL_HEIGHT = 23;
	public static final int GAME_PANEL_HEIGTH = HEIGTH
			- NAVIGATION_PANEL_HEIGHT;
	public static final int BOTTOM = GAME_PANEL_HEIGTH - 10;
	public static final int BALL_RADIUS = 15;
	public static final int OFFSET_SIDE = 40;
	public static final int OFFSET_TOP = 70;
	public static final int END_LEVEL = 4; // Levels start counting from zero
											// 0!!!
	
	
	/******************************************BRICKS*********************************************/
	public static final int BRICKS_COUNT = 5;
	public static final String RED_BRICK_IMG_PATH = "images/brick-red2.png";
	public static final String GREEN_BRICK_IMG_PATH = "images/brick-green2.png";
	public static final String YELLOW_BRICK_IMG_PATH = "images/brick-yellow2.png";
	public static final String ORANGE_BRICK_IMG_PATH = "images/brick-orange2.png";
	public static final String BLUE_BRICK_IMG_PATH = "images/brick-blue2.png";
	public static Map<String, Integer> BRICKS_COLOURS = new HashMap<String, Integer>() {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		{
			put("green", 0);
			put("yellow", 1);
			put("orange", 2);
			put("red", 3);
			put("blue", 4);

		}
	};
	/**********************************************************************************************/
	
	
	/**************************************Falling Objects*****************************************/
	public static final String BIGGER_PLAYER_IMG_PATH = "images/star_PNG1591.png";
	public static final String SMALLER_PLAYER_IMG_PATH = "images/grenade_PNG1351.png";
	public static final String BALL_SPEED_UP_IMG_PATH = "images/shield_PNG1281.png";
	public static final String BALL_SPEED_DOWN_IMG_PATH = "images/shield_PNG1283.png";
	public static final String LIFE_IMG_PATH = "images/heart_PNG691.png";
	public static final int FALLING_OBJECT_WIDTH = 30;
	public static final int FALLING_OBJECT_HEIGTH = 30;
	

	public static Map<String, Integer> FALLING_OBJECTS_PRIORITY = new HashMap<String, Integer>() {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		{
			put("smaller player", 0);
			put("bigger player", 1);
			put("plus one life", 2);
			put("speed up", 3);
			put("speed down", 4);
		}
	};
	/**********************************************************************************************/
	
	
	
	/****************************************LEVELS************************************************/
	
	public static final String PLAYER_IMG_PATH = "images/player2.png";
	public static final int PLAYER_DEFAULT_LIVES = 3;

	public static final String[] FIGURES = { "rectangle", "square", "triangle",
			"rhombus", "hexagon" };


	public static Map<String, Integer> BRICKS_COUNT_IN_LEVELS = new HashMap<String, Integer>() {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		{
			put(FIGURES[0], 50);
			put(FIGURES[1], 100);
			put(FIGURES[2], 80);
			put(FIGURES[3], 80);
			put(FIGURES[4], 96);

		}
	};
	
	public static Map<String, Integer> GAME_SPEED_IN_LEVELS = new HashMap<String, Integer>() {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		{
			put(FIGURES[0], 9);
			put(FIGURES[1], 8);
			put(FIGURES[2], 7);
			put(FIGURES[3], 6);
			put(FIGURES[4], 5);

		}
	};
	
	/**********************************************************************************************/
}
