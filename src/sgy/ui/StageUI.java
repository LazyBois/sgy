package sgy.ui;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import sgy.unit.UnitObject;

public class StageUI extends JFrame {
	public static JLabel lblNewLabel;

	public static int step = 10;

	public StageUI() {
		getContentPane().setBackground(Color.ORANGE);
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		panel.setForeground(Color.RED);
		panel.setBounds(1, 1, 599, 599);
		getContentPane().add(panel);
		panel.setLayout(null);

		lblNewLabel = new JLabel("施光耀");
		lblNewLabel.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {

			}

			@Override
			public void keyReleased(KeyEvent e) {

			}

			@Override
			public void keyPressed(KeyEvent e) {
				switch (e.getKeyChar()) {
				case 'a':
					lblNewLabel.setLocation(lblNewLabel.getX() - step, lblNewLabel.getY());
					break;
				case 'd':
					lblNewLabel.setLocation(lblNewLabel.getX() + step, lblNewLabel.getY());
					break;
				case 'w':
					lblNewLabel.setLocation(lblNewLabel.getX(), lblNewLabel.getY() - step);
					break;
				case 's':
					lblNewLabel.setLocation(lblNewLabel.getX(), lblNewLabel.getY() + step);
					break;
				default:
					break;
				}
			}
		});

		lblNewLabel.setBounds(0, 0, 200, 200);
		panel.add(lblNewLabel);

		this.addWindowListener(new WindowListener() {

			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}

			@Override
			public void windowClosed(WindowEvent e) {
			}

			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub

			}
		});

		this.setBounds(100, 200, 600, 600);
		this.setVisible(true);
		lblNewLabel.requestFocus();
		ImageIcon icon = new ImageIcon("resource/cj.jpg");
		lblNewLabel.setIcon(icon);

		for (int i = 0; i < 10; i++) {
			Bullet bullet = new Bullet(panel);
			panel.add(bullet);

			UnitObject unit = new UnitObject(bullet);
			unit.start();
		}

	}

	public static void main(String[] args) {
		StageUI stage = new StageUI();
	}
}
