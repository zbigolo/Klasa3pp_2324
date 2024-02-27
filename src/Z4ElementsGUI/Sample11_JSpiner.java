package Z4ElementsGUI;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class Sample11_JSpiner implements ChangeListener {

    private JSpinner red, green, blue;
    private int cred,cgreen,cblue;

    private JLabel testColor;
    private JPanel myContentPane() {
        JPanel panel = new JPanel(null);

        red = new JSpinner(new SpinnerNumberModel( 0,  0,255,1 ));
        red.setBounds(30,50,40,20);

        green = new JSpinner(new SpinnerNumberModel( 0,  0,255,1 ));
        green.setBounds(100,50,40,20);

        blue = new JSpinner(new SpinnerNumberModel( 0,  0,255,1 ));
        blue.setBounds(170,50,40,20);

        cred = cgreen = cblue = 255;


        red.addChangeListener(this);
        green.addChangeListener(this);
        blue.addChangeListener(this);

        testColor = new JLabel();
        testColor.setBounds(10,100,290,20);
        testColor.setOpaque(true);
        testColor.setBackground(new Color(cred,cgreen,cblue));


        panel.add( red );
        panel.add( green );
        panel.add( blue );
        panel.add( testColor );
        return panel;
    }
    public Sample11_JSpiner() {
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
        System.out.println("State changed : " +  (int) red.getValue() + (int) green.getValue()+ (int) blue.getValue());

        cred = (int) red.getValue();

        testColor.setBackground(new Color(cred, (int) green.getValue(),(int) blue.getValue()));

    }
}
