package extra;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class L1PracticeExam implements ActionListener {
public static void main(String[] args) {
L1PracticeExam practice = new L1PracticeExam();
practice.createUI();
}

JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton submit = new JButton();
JButton hint = new JButton();
JLabel label = new JLabel();
JTextField textfield = new JTextField();

public void createUI() {
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.add(panel);
	panel.add(label);
	textfield.setPreferredSize(new Dimension(200,50));
	panel.add(textfield);
	panel.add(hint);
	panel.add(submit);
	label.setText("The more you take, the more you leave behind. What am I?");
	hint.setText("hint");
	submit.setText("submit");
	hint.addActionListener(this);
	submit.addActionListener(this);
	frame.pack();
	
	
}

	public L1PracticeExam() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(hint==e.getSource()) {
			JOptionPane.showMessageDialog(null, "Hint: I have something to do with walking");
		}
		else if(submit==e.getSource()) {
			if(textfield.getText().equalsIgnoreCase("footsteps")) {
				JOptionPane.showMessageDialog(null, "You won!");
			}
			else {
				JOptionPane.showMessageDialog(null, "Sorry, that is incorrect.");
			}
		}
	}

}
