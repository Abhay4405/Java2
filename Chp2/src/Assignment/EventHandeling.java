package Assignment;
import java.awt.*;
import java.awt.event.*;

public class EventHandeling extends WindowAdapter {
    public EventHandeling() {
        Frame frame = new Frame("Events Handling");

        // Button
        Button button = new Button("Hi, I am Button");
        button.setBounds(100, 100, 300, 70);
        frame.add(button);

        // Menu Bar
        MenuBar menuBar = new MenuBar();

        // Menus
        Menu menu1 = new Menu("Abhay");
        Menu menu2 = new Menu("Dubey");

        // MenuItems
        MenuItem mi1 = new MenuItem("Option 1");
        MenuItem mi2 = new MenuItem("Option 2");
        
        
        Choice choice = new Choice();
        choice.add("java");
        choice.add("python");
        choice.add("c++");
        choice.add("html");
     // Set bounds for ComboBox
        choice.setBounds(100, 200, 300, 30);
        
        
        
        Checkbox checkbox = new Checkbox("Abhay Hoon Main");
        
        checkbox.setBounds(100,450,400,50);
        
        // Create a CheckboxGroup to group the radio buttons together
        CheckboxGroup group = new CheckboxGroup();

        // Create radio buttons
        Checkbox radioButton1 = new Checkbox("Option 1", group, false);
        Checkbox radioButton2 = new Checkbox("Option 2", group, false);
        Checkbox radioButton3 = new Checkbox("Option 3", group, false);
        radioButton1.setBounds(100, 300, 300, 30);  // Adjusted position
        radioButton2.setBounds(100, 330, 300, 30);
        radioButton3.setBounds(100, 360, 300, 30);
        
        // Add items to menu
        menu1.add(mi1);
        menu2.add(mi2);

        // Add menus to menu bar
        menuBar.add(menu1);
        menuBar.add(menu2);

        // Set menu bar to frame
        frame.setMenuBar(menuBar);
        frame.add(choice);
        frame.add(checkbox);
        // Add radio buttons and label to the frame
        frame.add(radioButton1);
        frame.add(radioButton2);
        frame.add(radioButton3);

        // Frame settings
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        
        
        
        frame.addWindowListener(new WindowAdapter() {
        	@Override
        	public void windowActivated(WindowEvent e) {
        		// TODO Auto-generated method stub
        		System.out.println("window acrivated");
        	}
        	@Override
        	public void windowDeactivated(WindowEvent e) {
        		// TODO Auto-generated method stub
        		System.out.println("window deactivatedN");
        	}
		});
        
        
        
        
        
    }

    public static void main(String[] args) {
        new EventHandeling();
    }
}
