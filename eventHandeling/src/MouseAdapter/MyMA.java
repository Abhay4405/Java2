package MouseAdapter;
import java.awt.*;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.foreign.AddressLayout;

public class MyMA extends MouseAdapter {
public static void main(String[] args) {
	Frame frame = new Frame();
	frame.setBounds(100,100,300,70);
	frame.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseEntered(MouseEvent e) {
			System.out.println("entered");
		}
	});
	frame.setSize(500, 500);
	frame.setLayout(null);
	frame.setVisible(true);
}
}
