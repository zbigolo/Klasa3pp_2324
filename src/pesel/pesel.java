/**********
 * @Author: Hubert Strączewski *
 * @Data: 01.03.2024 *
 **********/




import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class pesel {

private JComboBox wybierz;
private  JTextField peselText;
private JLabel peselLabel;
private JButton peselButton, plecButton, dataButton;

    private JPanel MyPanel() {
        JPanel panel = new JPanel();
        panel.setFont(new Font("Arial", Font.PLAIN, 14));
        panel.setBackground(Color.cyan);

        String[] opcje = {"", "Sprawdź PESEL", "Sprawdź Płeć", "Sprawdź Datę Urodzenia"};


        wybierz = new JComboBox(opcje);
        wybierz.setBounds(150, 20, 300, 30);
        wybierz.setBackground(new Color(195,195,195));
        wybierz.setFont(new Font("Arial",Font.PLAIN,14));

        peselLabel = new JLabel("PESEL:");
        peselLabel.setBounds(150,100,50,30);
        peselLabel.setFont(new Font("Arial",Font.PLAIN,14));
        peselLabel.setVisible(false);

        peselText = new JTextField();
        peselText.setBounds(200,100,250,30);
        peselText.setFont(new Font("Arial",Font.PLAIN,14));
        peselText.setVisible(false);

        peselButton = new JButton("Sprawdź");
        peselButton.setBounds(250,170,100,30);
        peselButton.setFont(new Font("Arial",Font.PLAIN,14));
        peselButton.setVisible(false);

        plecButton = new JButton("Sprawdź");
        plecButton.setBounds(250,170,100,30);
        plecButton.setFont(new Font("Arial",Font.PLAIN,14));
        plecButton.setVisible(false);

        dataButton = new JButton("Sprawdź");
        dataButton.setBounds(250,170,100,30);
        dataButton.setFont(new Font("Arial",Font.PLAIN,14));
        dataButton.setVisible(false);


        peselButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String pesel = peselText.getText();
                funkcje sprawdzPesel = new funkcje(pesel);
                String messagePesel = (sprawdzPesel.isValidPesel(pesel));
                JOptionPane.showMessageDialog(null, messagePesel);
            }

        });
        plecButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String pesel = peselText.getText();
                funkcje sprawdzPlec = new funkcje(pesel);
                String messagePlec = (sprawdzPlec.Plec(pesel));
                JOptionPane.showMessageDialog(null, messagePlec);
            }
        });
        dataButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String pesel = peselText.getText();
                funkcje sprawdzData = new funkcje(pesel);
                String messageData = (sprawdzData.Data(pesel));
                JOptionPane.showMessageDialog(null, messageData);
            }
        });

        wybierz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                int wybor = wybierz.getSelectedIndex();
                peselButton.setVisible(false);
                peselLabel.setVisible(false);
                peselText.setVisible(false);


                switch (wybor) {
                    case 0 -> {
                        peselButton.setVisible(false);
                        plecButton.setVisible(false);
                        dataButton.setVisible(false);
                        peselLabel.setVisible(false);
                        peselText.setVisible(false);
                    }
                    case 1 -> {
                        peselButton.setVisible(true);
                        plecButton.setVisible(false);
                        dataButton.setVisible(false);
                        peselLabel.setVisible(true);
                        peselText.setVisible(true);
                    }
                    case 2 -> {
                        peselButton.setVisible(false);
                        plecButton.setVisible(true);
                        dataButton.setVisible(false);
                        peselLabel.setVisible(true);
                        peselText.setVisible(true);
                    }
                    case 3 -> {
                        peselButton.setVisible(false);
                        plecButton.setVisible(false);
                        dataButton.setVisible(true);
                        peselLabel.setVisible(true);
                        peselText.setVisible(true);
                    }
                }
            }
        });

        panel.add(wybierz);
        panel.add(peselText);
        panel.add(peselLabel);
        panel.add(peselButton);
        panel.add(plecButton);
        panel.add(dataButton);
        return panel;
    }
    public pesel() {
        JFrame myWindow = new JFrame("Hubert Strączewski 4pp");
        myWindow.setContentPane(MyPanel());
        myWindow.setSize(600, 300);
        myWindow.setLayout(null);
        myWindow.setResizable(false);
        myWindow.setLocationRelativeTo(null);
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myWindow.setVisible(true);
    }
}
