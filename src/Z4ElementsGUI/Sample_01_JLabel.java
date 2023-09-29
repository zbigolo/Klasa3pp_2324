package Z4ElementsGUI;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Sample_01_JLabel {

    private JLabel witaj, zegnaj, myicon, sample;
    public JPanel myContentPane () {
        JPanel myPanel = new JPanel(null);

        // Etykieta 1
            witaj = new JLabel("Witaj");
            witaj.setBounds(10,20,100,50);
            witaj.setVisible(true);
            myPanel.add(witaj);

        // Etykieta 2
            zegnaj = new JLabel("Nominowanie", SwingConstants.CENTER);
            zegnaj.setBounds(50,100,300,100);
           // zegnaj.setBackground(Color.green);
            zegnaj.setBackground(new Color(100,34,120));
            zegnaj.setOpaque(true);
            zegnaj.setVisible(true);

            myPanel.add(zegnaj);
        // Etykieta 3
            ImageIcon ikona = new ImageIcon(".\\grafika\\save.png");
            myicon = new JLabel(ikona);
            myicon.setBounds(100,300,250,150);
            myicon.setVisible(true);
            myicon.setAlignmentY(SwingConstants.HORIZONTAL);
            myicon.setBackground(Color.yellow);
            myicon.setOpaque(true);
            myPanel.add(myicon);

        // Etykieta 4
         sample = new JLabel();
         ImageIcon ikona2 = new ImageIcon(".\\grafika\\save.png");
         Border ramka = BorderFactory.createLineBorder(Color.red,6,true);
         sample.setText("<html><u>Witaj w aplikacji</u></html>");
         sample.setIcon(ikona2);
         sample.setBounds(400,100,200,60);
         sample.setOpaque(true);
         sample.setBackground(Color.cyan);
         sample.setHorizontalAlignment(JLabel.RIGHT);
         sample.setVerticalTextPosition(JLabel.BOTTOM);
         sample.setForeground(Color.white);
         sample.setBorder(ramka);
         sample.setVisible(true);
         myPanel.add(sample);



        // Etykieta 5

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
