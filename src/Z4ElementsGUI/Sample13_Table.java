package Z4ElementsGUI;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;

public class Sample13_Table{
    public static void main(String args[]){
        JFrame frame = new JFrame();

        String[] columnNames = {"Name", "Age", "Student","Telefon"};

        Object[][] data;
        data = new Object[][]{
                {"Ken", 5, false,"11111111111"},
                {"Tom", 3, true,""},
                {"Susam", 2, false,"22222222222"},
                {"Mark",20, true,"33333333333"},
                {"Joe", 10, false, "00000000000"}
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
