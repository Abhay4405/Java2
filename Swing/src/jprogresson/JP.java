package jprogresson;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class JP extends JFrame{
	JProgressBar bar;
	int i = 0 , num = 0;
public JP() {
	 bar = new JProgressBar(0,2000);
	bar.setBounds(40,40,200,30);
	bar.setValue(0);
	bar.setStringPainted(true);
	add(bar);
	setSize(300,150);
	setLayout(null);
}
public void iterate() {
	while (i <= 2000) {
		bar.setValue(i);
		i = i+ 20;
		try {
			Thread.sleep(150);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
public static void main(String[] args) {
	JP jp = new JP();
	jp.setVisible(true);
	jp.iterate();
	
}
}
