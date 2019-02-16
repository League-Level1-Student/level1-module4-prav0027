import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	public static void main(String[] args) {
		SlotMachine slot = new SlotMachine();
		slot.createUI();
	}

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label1 = new JLabel();
	JLabel label2 = new JLabel();
	JLabel label3 = new JLabel();
	JButton button = new JButton();

	void createUI() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.add(button);
		setImages();
		frame.pack();
		button.addActionListener(this);
		button.setText("SPIN");
	}

	void setImages() {
		int rand1 = new Random().nextInt(2);
		int rand2 = new Random().nextInt(2);
		int rand3 = new Random().nextInt(2);
		panel.remove(label1);
		panel.remove(label2);
		panel.remove(label3);
		if (rand1 == 0) {
			label1 = loadImage("cherries.jpg");
		} else if (rand1 == 1) {
			label1 = loadImage("orange.jpg");
		} else if (rand1 == 2) {
			label1 = loadImage("lemon.jpg");
		}
		if (rand2 == 0) {
			label2 = loadImage("cherries.jpg");
		} else if (rand2 == 1) {
			label2 = loadImage("orange.jpg");
		} else if (rand2 == 2) {
			label2 = loadImage("lemon.jpg");
		}
		if (rand3 == 0) {
			label3 = loadImage("cherries.jpg");
		} else if (rand3 == 1) {
			label3 = loadImage("orange.jpg");
		} else if (rand3 == 2) {
			label3 = loadImage("lemon.jpg");
		}
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		frame.pack();
	}

	public JLabel loadImage(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		setImages();
	}
}
