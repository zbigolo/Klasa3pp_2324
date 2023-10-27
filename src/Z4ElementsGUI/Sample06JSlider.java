package Z4ElementsGUI;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sample06JSlider {

    private JLabel napisTytul;
    private JLabel napisRozmiar;
    private JSlider slider;

    private JLabel napisModyfikowany;
    private int sizeFont = 5;

    private JButton zmianaTekstu;
    private int pozycjaZmianyTekstu  = 0;

    private String[] sampleText ={"Dzień dobry", "Good morning","Buenos dias"};
    private int sizeSampleText  = 3;
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


        napisModyfikowany = new JLabel(sampleText[0]);
        napisModyfikowany.setBounds(20,120, 250,40);
        napisModyfikowany.setFont(new Font("Arial", Font.PLAIN,5));
        napisModyfikowany.setOpaque(true);

        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int vauleSlider = slider.getValue();
                System.out.println(vauleSlider);
                sizeFont = vauleSlider;
                napisModyfikowany.setFont(new Font("Arial", Font.PLAIN,vauleSlider));
                napisModyfikowany.requestFocusInWindow();
            }
        });

        zmianaTekstu = new JButton(">>");
        zmianaTekstu.setBounds(120,170, 50,40);
        zmianaTekstu.setForeground(Color.white);
        zmianaTekstu.setBackground(Color.decode("#558B2F"));


        zmianaTekstu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pozycjaZmianyTekstu++;

                if (pozycjaZmianyTekstu > 2) pozycjaZmianyTekstu = 0;

                napisModyfikowany.setText(sampleText[pozycjaZmianyTekstu]);

                napisModyfikowany.requestFocusInWindow();

            }
        });

       panel.add(slider);
       panel.add(zmianaTekstu);
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
