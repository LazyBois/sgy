package sgy.unit;

import sgy.ui.Bullet;

public class UnitObject extends Thread {

	private Bullet bullet;

	private boolean start = true;

	@Override
	public void run() {
		while (start) {
			bullet.move();
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public UnitObject(Bullet bullet) {
		this.bullet = bullet;
	}

	public void killself() {
		start = false;
	}
}
