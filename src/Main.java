import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main implements MouseListener{

	public static void main(String[] args) {
		final JFrame frame = new JFrame("Bomberman World");
		frame.setContentPane(new JLabel(new ImageIcon("resources/titlescreen.png")));

		final Container c = frame.getContentPane();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.setPreferredSize(new Dimension(666, 465));

		frame.setResizable(false);
		frame.pack();
		frame.setVisible(true);
		frame.addMouseListener(new Main());
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		int mx = e.getX();
		int my = e.getY();

		if(my >= 244 && my <= 298) {
			if(mx >= 112 && mx <= 315) {
				System.out.println("Start as Server");
			} else if(mx >= 345 && mx <= 594) {
				System.out.println("Start as Client");
			}
		} else if(my >= 322 && my <= 372){
			if(mx >= 226 && mx <= 440) {
				System.out.println("Instructions");
			}
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
	}

}
