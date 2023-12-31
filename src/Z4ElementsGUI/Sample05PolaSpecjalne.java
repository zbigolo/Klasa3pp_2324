package Z4ElementsGUI;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class Sample05PolaSpecjalne {

    JLabel lpass, lsaldo, ldata;
    JPasswordField pass;
    JFormattedTextField saldo, data;
    JButton bpass, bsaldo, bdata;

    public JPanel myContentPane() {
        JPanel mypanel = new JPanel();

        lpass = new JLabel("Podaj hasło: ");
        lpass.setBounds(20, 20, 100, 20);
        lpass.setVisible(true);

        pass = new JPasswordField();
        pass.setBounds(121, 20, 150, 20);
        pass.setEchoChar('a');
        pass.setVisible(true);

        bpass = new JButton("password");
        bpass.setBounds(275, 20, 150, 20);
        bpass.setVisible(true);

        lsaldo = new JLabel("Podaj kwotę wpłaty: ");
        lsaldo.setBounds(20, 50, 140, 20);
        lsaldo.setVisible(true);

        saldo = new JFormattedTextField(NumberFormat.getCurrencyInstance(Locale.FRANCE));
        saldo.setBounds(161, 50, 100, 20);
        saldo.setValue(0);
        saldo.setVisible(true);

        bsaldo = new JButton("saldo");
        bsaldo.setBounds(275, 50, 150, 20);
        bsaldo.setVisible(true);

        ldata = new JLabel("data urodzenia");
        ldata.setBounds(20, 80, 150, 20);
        ldata.setVisible(true);

        data = new JFormattedTextField(new SimpleDateFormat("yyyy-MM-dd"));
        data.setBounds(171, 80, 100, 20);
        try {
            MaskFormatter maskaData = new MaskFormatter("####-##-##");
            maskaData.setPlaceholderCharacter('_');
            maskaData.install(data);
        } catch (ParseException ex) {
            System.out.println(ex.getMessage());
        }


        bdata = new JButton("data urodzenia");
        bdata.setBounds(275, 80, 150, 20);
        bdata.setVisible(true);


        ActionListener przyciski = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (e.getActionCommand().equals("password")) {
                    System.out.println("1: Podano hsło: " + String.valueOf(pass.getPassword()));
                }
                if (e.getSource() == bsaldo) {

                    System.out.print("2 : ");
                    System.out.println("Podane saldo: " + saldo.getValue());
                }
                if (e.getSource() == bdata) {
                    System.out.println("3 : data urodzenia: " + data.getValue());
                }
            }
        };

        bpass.addActionListener(przyciski);
        bsaldo.addActionListener(przyciski);
        bdata.addActionListener(przyciski);

        mypanel.add(lpass);
        mypanel.add(lsaldo);
        mypanel.add(ldata);
        mypanel.add(pass);
        mypanel.add(saldo);
        mypanel.add(data);
        mypanel.add(bpass);
        mypanel.add(bsaldo);
        mypanel.add(bdata);
        return mypanel;
    }

    public Sample05PolaSpecjalne() {
        JFrame myWindow = new JFrame("Sample JPassword");
        myWindow.setContentPane(myContentPane());
        myWindow.setSize(500, 300);
        myWindow.setLayout(null);
        myWindow.setResizable(false);
        myWindow.setLocationRelativeTo(null);
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myWindow.setVisible(true);
    }

    public static void main(String[] args) {
        new Sample05PolaSpecjalne();

    }
}
