import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
public static void main(String[] args) {
	calc.createFrame();
}
static Calculator calc = new Calculator();
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton addition = new JButton();
JButton sub = new JButton();
JButton mul = new JButton();
JButton div = new JButton();
JTextField text1 = new JTextField(10);
JTextField text2 = new JTextField(10);
JLabel label = new JLabel();

void createFrame() {
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setTitle("Simple Calculator");
	frame.add(panel);
	panel.add(text1);
	panel.add(text2);
	panel.add(addition);
	panel.add(sub);
	panel.add(mul);
	panel.add(div);
	panel.add(label);
	frame.setVisible(true);
	frame.pack();
	text1.setText("Enter number");
	text2.setText("Enter number");
	addition.setText("add");
	sub.setText("sub");
	mul.setText("mul");
	div.setText("div");
	label.setText("Your answer will return here");
	addition.addActionListener((ActionListener) this);
	sub.addActionListener(this);
	mul.addActionListener(this);
	div.addActionListener(this);
	
}
 String add(int a, int b) {
	int c = a+b;
	String answer = ""+c;
	return answer;
}
String subtract(int a, int b) {
	int c = a-b;
	String answer = ""+c;
	return answer;
}
String multiply(int a, int b) {
	int c = a*b;
	String answer = ""+c;
	return answer;
}
String divide(int a, int b) {
	double c = a/b;
	String answer = ""+c;
	return answer;
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonPressed = (JButton) e.getSource();
	int a = Integer.parseInt(text1.getText());
	int b = Integer.parseInt(text2.getText());
	if(buttonPressed==addition) {
		label.setText(calc.add(a, b));
	}
	if(buttonPressed==sub) {
		label.setText(calc.subtract(a, b));
	}
	if(buttonPressed==mul) {
		label.setText(calc.multiply(a, b));
	}
	if(buttonPressed==div) {
		label.setText(calc.divide(a, b));
	}
}
}
