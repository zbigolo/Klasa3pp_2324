package Z4ElementsGUI;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;

public class Sample13_Table{
    public static void main(String args[]){
        JFrame frame = new JFrame();

        String[] columnNames = {"Name", "Age", "Student","Telefon"};

        Object[][] data = {
                {"Ken", new Integer(5), new Boolean(false),"11111111111"},
                {"Tom", new Integer(3), new Boolean(true),""},
                {"Susam", new Integer(2), new Boolean(false),"22222222222"},
                {"Mark",new Integer(20), new Boolean(true),"33333333333"},
                {"Joe", new Integer(10), new Boolean(false),"00000000000"}
        };
        JTable table = new JTable(data, columnNames);
        table.setRowHeight(100);

        JScrollPane scrollPanel =new JScrollPane(table);

        frame.add(scrollPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
