package Z5Managers;

import javax.swing.*;
import java.awt.*;

import static java.awt.ComponentOrientation.*;

public class ManagerFlowLayout {

    private JButton button (String text){
        JButton przycisk = new JButton(text);
        przycisk.setVisible(true);
        return przycisk;
    }

    public JPanel createContentPane () {
        JPanel myPanel = new JPanel();
        for (int i = 1; i < 16 ; i++) {
            JButton butt = new JButton("Przycisk" + i);
            myPanel.add(butt);
        }

        return myPanel;
    }

    public ManagerFlowLayout () {
        JFrame myWindow = new JFrame("Manager FlowLayout");
        myWindow.setContentPane(createContentPane());
        myWindow.setSize(300, 400);

        myWindow.setLayout(new FlowLayout());
        myWindow.setLocationRelativeTo(null);
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myWindow.setVisible(true);
    }

    public static void main (String[] args) {
        new ManagerFlowLayout();
    }

}
