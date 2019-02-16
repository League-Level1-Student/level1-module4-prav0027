import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
public static void main(String[] args) {
	WhackAMole mole = new WhackAMole();
	mole.createUI();
}
JFrame frame = new JFrame();
JPanel panel = new JPanel();
int rand = new Random().nextInt(24);

void createUI() {
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.add(panel);
for(int i=0; i<24; i++) {
	JButton button = new JButton();
	panel.add(button);
	button.addActionListener(this);
	if(i==rand) {
		button.setText("mole!");
	}
}
	frame.setTitle("Whack a Button for Fame and Glory");
	frame.pack();
	frame.setSize(300, 300);
}
void speak(String words) {
    try {
         Runtime.getRuntime().exec("say " + words).waitFor();
    } catch (Exception e) {
         e.printStackTrace();
    }
}
private void endGame(Date timeAtStart, int molesWhacked) {
    Date timeAtEnd = new Date();
    JOptionPane.showMessageDialog(null, "Your whack rate is "
         + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
         + " moles per second.");
}
private void playSound(String fileName) {
    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
    sound.play();
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	int count = 0;
	int incorrect = 0;
	JButton button = (JButton) e.getSource();
	if(button.getText().equals("mole!")) {
		count++;
		playSound("clapping.wav");
	}
	else if(incorrect==0) {
		speak("incorrect");
		incorrect++;
	}
	else if(incorrect==1) {
		speak("you're wrong");
		incorrect++;
	}
	else if(incorrect==2) {
		speak("wrong!");
		incorrect++;
	}
	else if(incorrect==3) {
		speak("How many times are you going to get it wrong?");
		incorrect++;
	}
	else if(incorrect==4) {
		speak("you lost");
		frame.dispose();
	}
	
	if(count==10) {
		endGame(null, count);
	}
	frame.dispose();
	WhackAMole mole = new WhackAMole();
	mole.createUI();
	
}
}
