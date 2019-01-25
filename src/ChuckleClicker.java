import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
public static void main(String[] args) {
	ChuckleClicker chuckleclicker = new ChuckleClicker();
	chuckleclicker.makeButtons();
}
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton joke = new JButton();
JButton punchline = new JButton();

public void makeButtons() {
	joke.addActionListener(this);
	punchline.addActionListener(this);
	
	frame.add(panel);
	panel.add(joke);
	panel.add(punchline);
	frame.pack();
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	joke.setText("joke");
	punchline.setText("punchline");
}

@Override
public void actionPerformed(ActionEvent buttonPressed) {
	// TODO Auto-generated method stub
	JOptionPane.showMessageDialog(null, "hi");
	if(buttonPressed.getSource()==joke) {
		JOptionPane.showMessageDialog(null, "How did the telephone propose to its girlfriend?");
	}
	if(buttonPressed.getSource()==punchline) {
		JOptionPane.showMessageDialog(null, "He gave her a ring!");
	}
}
}
