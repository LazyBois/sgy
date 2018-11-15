package sgy.ui;

import javax.swing.JComponent;
import javax.swing.JLabel;

public class UnitUI extends JLabel {

	private int step = 5;

	private JComponent father;

	public UnitUI(JComponent father) {
		this.father = father;
	}

	public boolean movePoit(int x, int y) {
		if (father.contains(x, y)) {
			this.setLocation(x, y);
			return true;
		} else {
			return false;
		}
	}

	public boolean moveLeft() {
		return movePoit(this.getX() - step, this.getY());
	}

	public boolean moveRight() {
		return movePoit(this.getX() + step, this.getY());
	}

	public boolean moveUp() {
		return movePoit(this.getX(), this.getY() - step);
	}

	public boolean moveDown() {
		return movePoit(this.getX(), this.getY() + step);
	}
}
