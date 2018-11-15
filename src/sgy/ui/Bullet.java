package sgy.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.util.Random;

import javax.swing.JComponent;

public class Bullet extends UnitUI {
	private static Random rand = new Random();

	private EFace nowFace;
	
	private 

	public Bullet(JComponent father) {
		super(father);
		setText("需");
		setFont(new Font(Font.DIALOG, Font.BOLD, 13));
		setForeground(randColor());
		setBounds(randPois());
	}

	private Color randColor() {
		int r = rand.nextInt(255);
		int g = rand.nextInt(255);
		int b = rand.nextInt(255);
		return new Color(r, g, b);
	}

	private Rectangle randPois() {
		int x = 10 + rand.nextInt(60);
		int y = 10 + rand.nextInt(60);
		return new Rectangle(x, y, 32, 29);
	}

	private boolean right = false;

	public void move() {
		int forward = rand.nextInt(4);
		nowFace = EFace.getByValue(forward);
		switch (nowFace) {
		case UP:
//			moveUp();
			break;
		case LEFT:
//			moveLeft();
			break;
		case DOWN:
			moveDown();
			break;
		case RIGHT:
			moveRight();
			break;
		default:
			break;
		}
	}
}
