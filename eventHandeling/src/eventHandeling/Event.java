
	// WITHIN CLASS


package eventHandeling;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Event extends Frame implements ActionListener{
	TextField textField;
	public Event() {
		 textField = new TextField();
		textField.setBounds(60, 50, 170, 20);
		Button button = new Button("Hello I am under water");
		button.setBounds(100, 170, 200, 30);
		button.addActionListener( this);
		add(button);
		add(textField);
		setSize(600,600);
		setLayout(null);
		setVisible(true);
	}
	
		
	
	public static void main(String[] args) {
		Event event = new Event();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		textField.setText("Help me");
		textField.setSize(170, 50);
	}
}
