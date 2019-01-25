import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	public static void main(String[] args) {
		char currentLetter;
		currentLetter = generateRandomLetter();
		
		TypingTutor tt = new TypingTutor();
		tt.createFrame();
}
	private static char generateRandomLetter() {
		// TODO Auto-generated method stub
		Random r = new Random();
	      return (char) (r.nextInt(26) + 'a');
	}
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	char currentLetter;
	
	void createFrame() {
		currentLetter = generateRandomLetter();
		frame.add(panel);
		panel.add(label);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label.setText(Character.toString(currentLetter));
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		frame.addKeyListener(this);
		frame.setTitle("Type or Die");
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("You typed: "+e.getKeyChar());
		if(e.getKeyChar()==currentLetter) {
			System.out.println("Correct");
			panel.setBackground(Color.GREEN);
		}
		else {
			panel.setBackground(Color.RED);
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		currentLetter = generateRandomLetter();
		label.setText(Character.toString(currentLetter));
	}
}