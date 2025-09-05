package jpassword;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class Pass {
public static void main(String[] args) {
	JFrame frame = new JFrame();
	JPasswordField field = new JPasswordField();
	JLabel jLabel = new JLabel("Password :");
	jLabel.setBounds(20,100,80,30);
	field.setBounds(100,100,100,30);
	frame.add(field);
	frame.add(jLabel);
	frame.setSize(300,300);
	frame.setLayout(null);
	frame.setVisible(true);
	frame.setLocationRelativeTo(null);
}
}
