package Z1FirstWindows;

import javax.swing.*;


public class OneWindow {

    public JPanel createContentPane () {
        JPanel myPanel = new JPanel();

        return myPanel;
    }

    public OneWindow () {
        JFrame myWindow = new JFrame("Moje pierwsze okno");
        myWindow.setContentPane(createContentPane());
        myWindow.setSize(800, 600);
        //  myWindow.setLocation(340,100);
        myWindow.setLayout(null);
        myWindow.setResizable(false);
        myWindow.setLocationRelativeTo(null);
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myWindow.setVisible(true);
    }

}
