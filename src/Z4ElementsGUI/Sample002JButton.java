package Z4ElementsGUI;

import javax.swing.*;
import java.awt.*;

public class Sample002JButton {
    private JButton sampleJButton;
    private JPanel myContentPane() {
        JPanel myPanel = new JPanel(null);

        sampleJButton = new JButton();
        sampleJButton.setBounds(100,200,100,30);
        sampleJButton.setFont(new Font("Arial", Font.BOLD, 18));
        sampleJButton.setText("RESET");
        sampleJButton.setBackground(Color.black);
        sampleJButton.setForeground(new Color(255,255,200));
        sampleJButton.setBorder(BorderFactory.createLineBorder(Color.yellow,6));
        myPanel.add(sampleJButton);


        return myPanel;
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
