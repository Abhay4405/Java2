package awtEg;

import java.awt.*;

public class AwtEg extends Frame {

	AwtEg() {
		Button button = new Button("Hii, I am Mr.Button!");
		button.setBounds(200, 100, 100, 100);
		add(button);
		setSize(700, 700);
		setLayout(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		AwtEg awtEg = new AwtEg();
	}
}
