package ActionListner;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListner extends Frame {
	public static void main(String[] args) {
		Frame f = new Frame("Action Listner Example");
		TextField tf = new TextField();
		tf.setBounds(50, 50, 450, 50);
		Button b = new Button("Hello, I am Button");
		b.setBounds(150, 150, 200, 50);
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tf.setText("Hey, you performed an Action");
			}
		});
		f.add(b);
		f.add(tf);
		f.setSize(550,550);
		f.setLayout(null);
		f.setVisible(true);
	}
}
