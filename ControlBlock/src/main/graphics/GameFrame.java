package main.graphics;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

import main.CBMain;

public class GameFrame extends Canvas {
	
	private static final long serialVersionUID = 1L;
	
	public GameFrame(int width, int height, String title, CBMain game) {
		
		JFrame frame = new JFrame();
		
		frame.setPreferredSize(new Dimension(width, height));
		frame.setMaximumSize(new Dimension(width, height));
		frame.setMinimumSize(new Dimension(width, height));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setTitle(title);
		
		frame.add(game);
		game.start();
}
	
}
