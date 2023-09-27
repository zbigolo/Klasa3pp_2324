package Z4ElementsGUI;

import javax.swing.*;
import javax.swing.text.PlainDocument;
import java.awt.*;


public class Sample_01_JLabel {


    public JPanel myContentPane () {
        JPanel myPanel = new JPanel(null);

        // Etykieta 1
            JLabel witaj = new JLabel("Witaj 22222222");
            witaj.setBounds(10,20,100,50);
            witaj.setVisible(true);
            myPanel.add(witaj);

        // Etykieta 2
            JLabel zegnaj = new JLabel("Nominowanie", SwingConstants.CENTER);
            zegnaj.setBounds(50,100,300,100);
           // zegnaj.setBackground(Color.green);
            zegnaj.setBackground(new Color(100,34,120));
            zegnaj.setOpaque(true);
            zegnaj.setVisible(true);

            myPanel.add(zegnaj);
        // Etykieta 3
            ImageIcon ikona = new ImageIcon(".\\grafika\\save.png");
            JLabel myicon = new JLabel(ikona);
            myicon.setBounds(100,300,250,150);
            myicon.setVisible(true);
            myicon.setAlignmentY(SwingConstants.HORIZONTAL);
            myicon.setBackground(Color.yellow);
            myicon.setOpaque(true);
            myPanel.add(myicon);

            // Etykieta 4

        return myPanel;
    }

    public Sample_01_JLabel () {
        JFrame myWindow = new JFrame("JLabel Sample");
        myWindow.setContentPane(myContentPane());
        myWindow.setSize(800, 600);
        myWindow.setLayout(null);
        myWindow.setResizable(false);
        myWindow.setLocationRelativeTo(null);
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myWindow.setVisible(true);
    }

    public static void main (String[] args) {
        new Sample_01_JLabel();

    }
}
