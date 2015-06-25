package brake.the.bricks;


import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;


public class BrakeTheBricks extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7472294058252417426L;

	public MainGame myGame;
	public NavigationPanel myNavigationTopPanel;

	public BrakeTheBricks() {
		JFrame frame = new JFrame("Brake The Bricks 2");

		frame.setSize(GameConstants.WIDTH, GameConstants.HEIGTH);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
	
		myNavigationTopPanel = new NavigationPanel();
		myNavigationTopPanel.setBorder( BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));

		
		
		JPanel content = new JPanel();
		content.setLayout(new BorderLayout());
		content.add(myNavigationTopPanel, BorderLayout.NORTH);
		content.add(new MainGame(), BorderLayout.CENTER);
		frame.add(content);
	
		frame.setContentPane(content);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);

	}


	public static void main(String[] args) {
		new BrakeTheBricks();
	}

}
