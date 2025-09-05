package jframe;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Jfrm {
public static void main(String[] args) {
	JFrame frame = new JFrame("My First JFrame Example");
	JPanel panel = new JPanel();
	panel.setLayout(new FlowLayout());
	JLabel label = new JLabel("My First JFrame by Example");
	JButton button = new JButton();
	button.setText("Hello, I am Button");
	frame.add(panel);
	panel.add(label);
	panel.add(button);
	frame.setSize(400,400);
	frame.setLocationRelativeTo(null);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
}
}
