package P03_ObiektyRamki;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Sample_07_JComboBox {

    private JComboBox wyborOS;
    private JLabel ikona;
    private JLabel tekst, tempselected, tempdeselected;
    private JPanel gora, dol;


    private JPanel myContentPane () {
        JPanel mypanel = new JPanel(null);
        String[] systemy = {"", "Windows", "Linux", "MacOS", "DOS", "Unix"};

        gora = new JPanel(null);
        gora.setBounds(0, 0, 400, 90);
        gora.setBackground(Color.green);

        wyborOS = new JComboBox<>(systemy);
        wyborOS.setBounds(50, 40, 200, 25);


        ikona = new JLabel();
        ikona.setBounds(100, 100, 64, 64);
        ikona.setVisible(true);

        tekst = new JLabel();
        tekst.setBounds(200, 125, 200, 30);
        tekst.setVisible(true);

        tempselected = new JLabel();
        tempselected.setBounds(150, 200, 200, 30);
        tempselected.setVisible(true);

        tempdeselected = new JLabel("Wybierz system operacyjny ...");
        tempdeselected.setBounds(50, 15, 200, 30);
        tempdeselected.setVisible(true);

        wyborOS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                String path = "";

                int wybor = wyborOS.getSelectedIndex();
                System.out.println(wybor);
                switch (wybor) {
                    case 1 -> {
                        path = "./grafika/os/win.png";
                        tekst.setText("Twój wybór : Windows");
                    }
                    case 2 -> {
                        path = "./grafika/os/linux.png";
                        tekst.setText("Twój wybór : Linux");
                    }
                    case 3 -> {
                        path = "./grafika/os/mac.png";
                        tekst.setText("Twój wybór : MacOS");
                    }
                    case 4 -> {
                        path = "./grafika/os/dos.png";
                        tekst.setText("Twój wybór : DOS OS");
                    }
                }

                ikona.setIcon(new ImageIcon(path));
            }
        });
        wyborOS.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged (ItemEvent e) {
                int state = e.getStateChange();
                String tmp = "Wybrałeś: ";
                String tmp1 = "";

                if (state == ItemEvent.SELECTED) {
                    tmp += systemy[wyborOS.getSelectedIndex()];
                    if (wyborOS.getSelectedIndex() > 0)
                        tempselected.setText(tmp);
                }
                if (state == ItemEvent.DESELECTED) {
                    System.out.println("DESELECTED : " + e.getItem());
                }

            }
        });


        mypanel.add(ikona);
        mypanel.add(tekst);
        mypanel.add(tempselected);
        mypanel.add(tempdeselected);
        mypanel.add(gora);
        //l.add(dol);
        gora.add(wyborOS);
        return mypanel;
    }

    public Sample_07_JComboBox () {
        JFrame myWindow = new JFrame("Sample JComboBox");
        myWindow.setContentPane(myContentPane());
        myWindow.setSize(400, 300);
        myWindow.setResizable(false);
        myWindow.setLocationRelativeTo(null);
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myWindow.setVisible(true);
    }

    public static void main (String[] args) {
        new Sample_07_JComboBox();
    }
}