package Z4ElementsGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Sample08_JRadioButton {

    private JRadioButton redbackground;
    private JRadioButton greenbackground;
    private JRadioButton yellowbackground;
    private JRadioButton blackground;

    private JLabel colorbackground;
    private JLabel mycolor;
    private JLabel zolty;

    private ButtonGroup tlo;

    public JPanel myContentPane() {
        JPanel mypanel = new JPanel(null);

        colorbackground = new JLabel("Wybierz kolor tła");
        colorbackground.setBounds(10,10,350,20);
        colorbackground.setHorizontalAlignment(SwingConstants.CENTER);

        mycolor = new JLabel();
        mycolor.setBounds(20,100,350,100);
        mycolor.setOpaque(true);
        mycolor.setBorder(BorderFactory.createRaisedBevelBorder());

        redbackground = new JRadioButton("Czerwone",
                new ImageIcon(".\\grafika\\save.png"));
        redbackground.setBounds(20,50,90,20);
        greenbackground = new JRadioButton("Zielone");
        greenbackground.setBounds(120,50,80,20);
        yellowbackground = new JRadioButton();
        yellowbackground.setBounds(220,50,20,20);
        zolty = new JLabel(new ImageIcon("insta.png"));
        zolty.setBounds(245,48,24,24);
        yellowbackground.setText("Żółte");
        zolty.setVisible(true);

        blackground = new JRadioButton("Czarne");
        blackground.setBounds(320,50,80,20);

        tlo = new ButtonGroup();
        tlo.add(redbackground);
        tlo.add(greenbackground);
        tlo.add(yellowbackground);
         tlo.add(blackground);

        ActionListener myJRadioButtonListner = new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                JRadioButton rbutton = (JRadioButton) e.getSource();
                System.out.println("Clicked: " + rbutton.getText());

                switch (e.getActionCommand()){
                    case "Czerwone" ->  {
                                                            mycolor.setBackground(Color.red);
                                                       }
                    case "Zielone"  ->   mycolor.setBackground(Color.green);
                    case "Żółte"    ->   mycolor.setBackground(Color.yellow);
                    case "Czarne"   ->   mycolor.setBackground(Color.black);
                }
            }
        };



        redbackground.addActionListener(myJRadioButtonListner);
        greenbackground.addActionListener(myJRadioButtonListner);
        yellowbackground.addActionListener(myJRadioButtonListner);
        blackground.addActionListener(myJRadioButtonListner);



        mypanel.add(colorbackground);
        mypanel.add(mycolor);
        mypanel.add(redbackground);
        mypanel.add(greenbackground);
        mypanel.add(yellowbackground);
        mypanel.add(blackground);
        mypanel.add(zolty);
        return mypanel;
    }
    public Sample08_JRadioButton() {
        JFrame myWindow = new JFrame("Sample JRadioButton");
        myWindow.setContentPane(myContentPane());
        myWindow.setSize(400, 300);
        myWindow.setResizable(false);
        myWindow.setLocationRelativeTo(null);
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myWindow.setVisible(true);
    }

    public static void main (String[] args) {
        new Sample08_JRadioButton();

    }
}
