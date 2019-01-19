import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener {

	
public static void main(String[] args) {
	new NastySurprise().createUI();
	
}
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton buttontrick = new JButton();
JButton buttontreat = new JButton();
public void createUI() {
	frame.add(panel);
	frame.setVisible(true);
	buttontrick.setText("Trick");
	buttontrick.addActionListener(this);
	buttontreat.setText("Treat");
	buttontreat.addActionListener(this);
	panel.add(buttontreat);
	panel.add(buttontrick);
	frame.pack();
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonPressed = (JButton) e.getSource();
	if(buttonPressed==buttontrick) {
		showPictureFromTheInternet("https://i.pinimg.com/originals/ae/c4/53/aec453161b2f33ffc6219d8a758307a9.jpg");
	}
	else if(buttonPressed==buttontreat) {
		showPictureFromTheInternet("https://images.unsplash.com/photo-1509248961158-e54f6934749c?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&w=1000&q=80");
	}
}
private void showPictureFromTheInternet(String imageUrl) {
    try {
         URL url = new URL(imageUrl);
         Icon icon = new ImageIcon(url);
         JLabel imageLabel = new JLabel(icon);
         JFrame frame = new JFrame();
         frame.add(imageLabel);
         frame.setVisible(true);
         frame.pack();
    } catch (MalformedURLException e) {
         e.printStackTrace();
    }
}
}
