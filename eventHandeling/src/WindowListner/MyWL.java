package WindowListner;
import java.awt.*;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyWL extends Frame implements WindowListener {
public MyWL() {
	// TODO Auto-generated constructor stub
	addWindowListener((WindowListener) this);
	setSize(500,500);
	setLayout(null);
	setVisible(true);
}
public static void main(String[] args) {
	new MyWL();
}
@Override
public void windowOpened(WindowEvent e) {
	// TODO Auto-generated method stub
	System.out.println("opened");
}
@Override
public void windowClosing(WindowEvent e) {
	// TODO Auto-generated method stub
	System.out.println("closing");
}
@Override
public void windowClosed(WindowEvent e) {
	// TODO Auto-generated method stub
	System.out.println("closed");
}
@Override
public void windowIconified(WindowEvent e) {
	// TODO Auto-generated method stub
	System.out.println("iconified");
}
@Override
public void windowDeiconified(WindowEvent e) {
	// TODO Auto-generated method stub
	System.out.println("deiconified");
}
@Override
public void windowActivated(WindowEvent e) {
	// TODO Auto-generated method stub
	System.out.println("activated");
}
@Override
public void windowDeactivated(WindowEvent e) {
	// TODO Auto-generated method stub
	System.out.println("deactivated");
}
}
