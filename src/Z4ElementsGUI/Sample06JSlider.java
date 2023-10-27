package Z4ElementsGUI;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class Sample06JSlider {

    private JLabel napisTytul;
    private JLabel napisRozmiar;
    private JSlider slider;

    private JLabel napisModyfikowany;
    private int sizeFont = 5;

    private String[] sampleText ={"Dzień dobry", "Good morning","Buenos dias"};
    public JPanel myContentPane() {
        JPanel panel = new JPanel(null);

        napisTytul = new JLabel("Właściwości czcionki");
        napisTytul.setBounds(20,20, 250,20);
        napisTytul.setFont(new Font("Arial", Font.BOLD,14));
        napisTytul.setOpaque(true);
        napisTytul.setForeground(Color.white);
        napisTytul.setBackground(Color.decode("#558B2F"));


       napisRozmiar = new JLabel("Rozmiar:");
       napisRozmiar.setBounds(20,60,250,20);
        napisTytul.setFont(new Font("Arial", Font.BOLD,12));

        slider = new JSlider(0,30,1);
        slider.setBounds(20,80,250,20);
        slider.setVisible(true);


        napisModyfikowany = new JLabel("Dzień dobry");
        napisModyfikowany.setBounds(20,120, 250,40);
        napisModyfikowany.setFont(new Font("Arial", Font.PLAIN,5));
        napisModyfikowany.setOpaque(true);

        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int vauleSlider = slider.getValue();
                System.out.println(vauleSlider);

                napisModyfikowany.setFont(new Font("Arial", Font.PLAIN,vauleSlider));
                napisModyfikowany.requestFocusInWindow();
            }
        });


        panel.add(slider);
       panel.add(napisRozmiar);
       panel.add(napisTytul);
       panel.add(napisModyfikowany);

        return panel;
    }

    public Sample06JSlider() {
        JFrame myWindow = new JFrame("Sample JSlider");
        myWindow.setContentPane(myContentPane());
        myWindow.setSize(300, 600);
        myWindow.setLayout(null);
        myWindow.setResizable(false);
        myWindow.setLocationRelativeTo(null);
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myWindow.setVisible(true);
    }

    public static void main(String[] args) {
        new Sample06JSlider();

    }
}
