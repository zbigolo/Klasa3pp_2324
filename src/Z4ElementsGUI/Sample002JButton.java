package Z4ElementsGUI;

import javax.swing.*;
import java.awt.*;

public class Sample002JButton {

   private JButton testowyPrzycisk;
    private JPanel myContentPane() {
        JPanel panel = new JPanel(null);

        return panel;
    }
    public Sample002JButton () {
        JFrame myWindow = new JFrame("JButton Sample");
        myWindow.setContentPane(myContentPane());
        myWindow.setSize(900, 800);
        myWindow.setLayout(null);
        myWindow.setResizable(false);
        myWindow.setLocationRelativeTo(null);
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myWindow.setVisible(true);
    }



    public static void main (String[] args) {
        new Sample002JButton();
    }

}
