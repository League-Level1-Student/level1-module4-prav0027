import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole {
public static void main(String[] args) {
	WhackAMole mole = new WhackAMole();
	mole.createUI();
}
JFrame frame = new JFrame();
JPanel panel = new JPanel();

void createUI() {
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.add(panel);
	frame.setTitle("Whack a Button for Fame and Glory");
	frame.pack();
}
void drawButtons() {
	Random number = new Random();
	
}
}
