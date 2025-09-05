package keylistner;
import java.awt.*;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyKeyListner extends Frame {
	Label l;
	TextArea ta;
public MyKeyListner() {
	l = new Label();
	l.setBounds(20,50,100,20);
	ta = new TextArea();
	ta.setBounds(20,80,300,300);
	ta.addKeyListener(new KeyListener() {
		
		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			l.setText("keyTyped");
		}
		
		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			l.setText("keyReleased");
		}
		
		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			l.setText("keyPressed");
		}
	});
	add(l);
	add(ta);
	setSize(400,400);
	setLayout(null);
	setVisible(true);
}
public static void main(String[] args) {
	new MyKeyListner();
}
}
