package Z4ElementsGUI;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class Sample12JSlider {

    private JSlider suwak;
    private JLabel tekst;
    private String sampleText =  "Sample";

    private int sizeFont = 12;
    private JPanel myContentPane(){
        JPanel panel = new JPanel(new FlowLayout());


        suwak = new JSlider(JSlider.HORIZONTAL,0,36,sizeFont);
        suwak.setPreferredSize(new Dimension(380,40));
        suwak.setBackground(Color.CYAN);
        suwak.setMajorTickSpacing(4);
        suwak.setMinorTickSpacing(1);
        suwak.setPaintTrack(true);
        suwak.setPaintTicks(true);
        suwak.setPaintLabels(true);

        Font font = new Font("Helvetica", Font.PLAIN, sizeFont);
        tekst  = new JLabel(sampleText);
        tekst.setSize(new Dimension(320,100));
        tekst.setOpaque(true);
        tekst.setBackground(Color.white);
        tekst.setFont(font);

        suwak.addChangeListener(new ChangeListener() {
                                    @Override
                                    public void stateChanged(ChangeEvent e) {
                                        sizeFont = suwak.getValue();
                                        tekst.setFont(new Font("Helvetica",Font.PLAIN,sizeFont));
                                    }
                                }
        );


        panel.add(suwak);
        panel.add(tekst);
        return panel;
    }

    public Sample12JSlider() {
        JFrame myWindow = new JFrame("Sample JSlider");
        myWindow.setContentPane(myContentPane());
        myWindow.setSize(400, 300);
     //   myWindow.setResizable(false);
        myWindow.setLocationRelativeTo(null);
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myWindow.setVisible(true);
    }

    public static void main(String[] args) {
        new Sample12JSlider();
    }
}
