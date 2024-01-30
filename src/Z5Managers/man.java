package Z5Managers;

import javax.swing.*;
import java.awt.*;

public class man {

        JLabel ltext, ltext2;

        public JPanel myContentPane () {
            JPanel myPanel = new JPanel();

            JPanel panelLewy = new JPanel( new FlowLayout());
            panelLewy.setBackground(Color.blue);
           // panelLewy.setSize(150,200);
            panelLewy.setPreferredSize(new Dimension(100,100));

            JPanel panelPrawy = new JPanel( null);
            panelPrawy.setBackground(Color.black);
            panelPrawy.setPreferredSize(new Dimension(100,100));


            myPanel.add(panelLewy);
            myPanel.add(panelPrawy);
            return myPanel;
        }



        public man() {
            JFrame myWindow = new JFrame("Sample JTextArea and JScrollPane");
            myWindow.setContentPane(myContentPane());
            myWindow.setSize(400, 300);
           // myWindow.setLayout(null);
          //  myWindow.setResizable(false);
            myWindow.setLocationRelativeTo(null);
            myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            myWindow.setVisible(true);
        }

        public static void main (String[] args) {
            new man();

        }
    }

