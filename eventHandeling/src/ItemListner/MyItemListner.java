package ItemListner;

import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class MyItemListner extends Frame implements ItemListener {
	Checkbox checkbox1, checkbox2;

	public MyItemListner() {
		Label label = new Label();
		label.setAlignment(label.CENTER);
		label.setSize(400, 100);

		checkbox1 = new Checkbox("Java");
		checkbox1.setBounds(100, 100, 100, 50);

		checkbox2 = new Checkbox("Python");
		checkbox2.setBounds(100, 150, 100, 50);

		add(checkbox1);
		add(checkbox2);
		add(label);

		checkbox1.addItemListener(this);
		checkbox2.addItemListener(this);

		setSize(400, 400);
		setLayout(null);
		setVisible(true);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == checkbox1) {
			System.out.println("Java checkbox " + (e.getStateChange() == 1 ? "checked" : "unchecked"));
		}
		if (e.getSource() == checkbox2) {
			System.out.println("Python checkbox " + (e.getStateChange() == 1 ? "checked" : "unchecked"));
		}
	}

	public static void main(String[] args) {
		new MyItemListner();
	}
}
 