package Z4ElementsGUI;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Sample_03_JButton {

    public JLabel etykieta(String napis,
                           int xp, int yp ,int dlu, int wys){
        JLabel newektykieta = new JLabel(napis);
        newektykieta.setBounds(xp,yp,dlu,wys);
        newektykieta.setVisible(true);

        return newektykieta;
    }
    public JButton przycisk(String napis,
                            int xp, int yp){
        JButton newButton = new JButton(napis);
        newButton.setBounds(xp,yp,100,50);
        newButton.setVisible(true);
      return newButton;
    }


    public JPanel myContentPane () {
        int i1 = 0;
        JPanel myPanel = new JPanel(null);

        JLabel ek = etykieta("Witamy",100,100,100,100);
        ek.setFont(new Font("Serif",Font.ITALIC,24));

        JButton przy = przycisk("OK",200,300);
        przy.setFont(new Font("Arial", Font.BOLD,14));


        przy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                 ek.setVisible(false);
                 myPanel.setBackground(Color.cyan);
            }
        });

        // 2 przykład

        JButton bPassword = new JButton(new ImageIcon(".\\grafika\\pass.png"));
        bPassword.setBounds(400,100,50,100);
        bPassword.setBackground(new Color(200,210,10));
        bPassword.setDefaultCapable(true);
        bPassword.setVisible(true);
        bPassword.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                ek.setVisible(true);
                myPanel.setBackground(Color.yellow);
            }
        });

        myPanel.add(ek);
        myPanel.add(przy);
        myPanel.add(bPassword);
        return myPanel;
    }

    public Sample_03_JButton() {
        JFrame myWindow = new JFrame("Sample JButton");
        myWindow.setContentPane(myContentPane());
        myWindow.setSize(800, 600);
        myWindow.setLayout(null);
        myWindow.setResizable(false);
        myWindow.setLocationRelativeTo(null);
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myWindow.setVisible(true);
    }

    public static void main (String[] args) {
         new Sample_03_JButton();

    }
}
