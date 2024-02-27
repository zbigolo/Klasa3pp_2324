package Z4ElementsGUI;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.xml.crypto.Data;
import java.awt.*;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Sample11A_JSpinner implements ChangeListener {

    private JSpinner dzien, miesiac, rok,inne;
    private JLabel data;
    private JPanel myContentPane() {
        JPanel panel = new JPanel(null);

        String months[] = { "January", "February", "March",
                "April", "May", "June", "July", "August",
                "September", "October", "Novemeber", "December" };

        dzien = new JSpinner(new SpinnerNumberModel( 1,  1,31,1 ));
        dzien.setBounds(30,50,40,20);

         miesiac = new JSpinner(new SpinnerListModel (months));
        miesiac.setBounds(100,50,90,20);

        rok = new JSpinner(new SpinnerNumberModel( 1900,  1900,2024,1 ));
        rok.setBounds(230,50,60,20);

        Calendar cal = Calendar.getInstance(Locale.forLanguageTag("pl-PL"));
        Date initData = cal.getTime();
        int d = cal.get(Calendar.DAY_OF_MONTH);
        int mi = cal.get(Calendar.MONTH);
        cal.add(Calendar.MONTH, -1);
        cal.add(Calendar.DAY_OF_MONTH,-d);
        Date earliestDate = cal.getTime();
        cal.add(Calendar.MONTH,mi+1);
        cal.add(Calendar.DAY_OF_MONTH,30);
        Date latestDate = cal.getTime();

        inne = new JSpinner(new SpinnerDateModel(initData,earliestDate,latestDate,Calendar.YEAR));
        inne.setEditor(new JSpinner.DateEditor(inne,"dd-MMMM-yyyy"));
        inne.setBounds(20,150,160,20);

        dzien.addChangeListener(this);
        miesiac.addChangeListener(this);
        rok.addChangeListener(this);

        data = new JLabel();
        data.setBounds(10,100,290,20);
        data.setOpaque(true);
        data.setBackground(Color.white);
        data.setToolTipText("Data urodzin aktora");
        data.setEnabled(true);


        panel.add( dzien);
        panel.add( miesiac );
        panel.add( rok );
        panel.add( data );
        panel.add(inne);
        return panel;
    }
    public Sample11A_JSpinner() {
        JFrame myWindow = new JFrame("Sample JSpiner");
        myWindow.setContentPane(myContentPane());
        myWindow.setSize(400, 300);
        myWindow.setResizable(false);
        myWindow.setLocationRelativeTo(null);
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myWindow.setVisible(true);
    }

    public static void main(String[] args) {
        new Sample11A_JSpinner();
    }

    @Override
    public void stateChanged(ChangeEvent e) {
                data.setText("" + dzien.getValue() + " " + miesiac.getValue() + " " + rok.getValue());
    }
}
