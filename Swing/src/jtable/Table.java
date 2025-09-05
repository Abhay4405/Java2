package jtable;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Table {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        String data[][] = {
            {"1", "Abhay", "Java"},
            {"2", "Sahil", "Python"},
            {"3", "Rahul", "C++"}
        };
        String column[] = {"Roll No", "Name", "Subject"};

        JTable jTable = new JTable(data, column);
        JScrollPane jScrollPane = new JScrollPane(jTable);  // ✅ Add table to scroll pane

        frame.add(jScrollPane);  // ✅ Add scroll pane (with table inside) to frame
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ✅ Always add this
        frame.setVisible(true);
    }
}
