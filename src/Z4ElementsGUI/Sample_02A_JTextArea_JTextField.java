package Z4ElementsGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.file.ClosedWatchServiceException;


public class Sample_02A_JTextArea_JTextField {

    JLabel llogin, lwynik;
    JTextField txflogin ,txfwynik;
    JButton blogin;


    public JPanel myContentPane () {
        JPanel myPanel = new JPanel(null);

        llogin =  new JLabel("Podaj login : ");
        llogin.setBounds(10,10, 100,20);
        llogin.setVisible(true);

        txflogin = new JTextField();
        txflogin.setBounds(111,10,100,20);
        txflogin.setVisible(true);

        blogin = new JButton("Wyślij Login");
        blogin.setBounds(212,10,120,20);
        blogin.setVisible(true);

        lwynik = new JLabel();
        lwynik.setBounds(100,100,150,20);
        lwynik.setOpaque(true);
        lwynik.setBackground(Color.yellow);
        lwynik.setVisible(false);

        blogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                String tmp = "";
                tmp = txflogin.getText();
               txflogin.setText("");
               lwynik.setVisible(true);
               lwynik.setText(tmp);
            }
        });

        myPanel.add(lwynik);
        myPanel.add(blogin);
        myPanel.add(txflogin);
        myPanel.add(llogin);
        return myPanel;
    }

    public JPanel myContentPane1 () {
        JPanel myPanel = new JPanel(null);

        JLabel lx = new JLabel("Podaj X: ");
        lx.setBounds(10,10,50,20);
        lx.setVisible(true);

        JTextField txfX = new JTextField();
        txfX.setBounds(61,10,50,20);
        txfX.setVisible(true);

        JLabel ly = new JLabel("Podaj Y: ");
        ly.setBounds(10,35,50,20);
        ly.setVisible(true);

        JTextField txfY = new JTextField();
        txfY.setBounds(61,35,50,20);
        txfY.setVisible(true);

        JButton bsuma = new JButton("X + Y = ");
        bsuma.setBounds(10,60,80,20);
        bsuma.setVisible(true);

        lwynik = new JLabel();
        lwynik.setBounds(91, 60, 100, 20);
        lwynik.setBounds(91, 60, 100, 20);
        lwynik.setVisible(false);

        bsuma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                int X = Integer.parseInt(txfX.getText());
                int Y = Integer.parseInt(txfY.getText());

                int tmp = X + Y;
                lwynik.setVisible(true);
                lwynik.setText(String.valueOf(tmp));
                txfX.setText(""); txfY.setText("");
            }
        });

        myPanel.add(lx); myPanel.add(ly); myPanel.add(lwynik);
        myPanel.add(txfX); myPanel.add(txfY);
        myPanel.add(bsuma);
        return myPanel;
    }

    public Sample_02A_JTextArea_JTextField() {
        JFrame myWindow = new JFrame("Sample JTextField");
        myWindow.setContentPane(myContentPane1());
        myWindow.setSize(400, 200);
        myWindow.setLayout(null);
        myWindow.setResizable(false);
        myWindow.setLocationRelativeTo(null);
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myWindow.setVisible(true);
    }

    public static void main (String[] args) {
         new Sample_02A_JTextArea_JTextField();

    }
}
