package Z4ElementsGUI;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.String.valueOf;

public class Sample06JSlider {

    private JLabel napisTytul;
    private JLabel napisRozmiar;
    private JLabel napisRozmiarFont;
    private JSlider slider;

    private JLabel napisModyfikowany;
    private int sizeFont = 0;

    private JButton zmianaTekstu;
    private int pozycjaZmianyTekstu  = 0;

    private String[] sampleText ={"Dzień dobry", "Good morning","Buenos dias"};
    private int sizeSampleText  = 3;
    public JPanel myContentPane() {
        JPanel panel = new JPanel(null);

        napisTytul = new JLabel();
        napisTytul.setBounds(20,20, 250,30);
        napisTytul.setFont(new Font("Curier", Font.PLAIN,25));
        napisTytul.setOpaque(true);
        napisTytul.setForeground(Color.white);
        napisTytul.setBackground(Color.decode("#558B2F"));
        napisTytul.setText("Właściwości czcionki");

       napisRozmiar = new JLabel("Rozmiar:");
       napisRozmiar.setBounds(20,60,100,20);
       napisRozmiar.setFont(new Font("Curier", Font.BOLD,20));

       napisRozmiarFont = new JLabel(" 0 ");
        napisRozmiarFont.setBounds(110,60,150,20);
        napisRozmiarFont.setFont(new Font("Curier", Font.BOLD,20));

        slider = new JSlider(0,40,0);
        slider.setBounds(20,90,250,30);
       // slider.setPaintTicks(true);
        //slider.setPaintTrack(false);

        slider.setMajorTickSpacing(5);
        slider.setMinorTickSpacing(2);
        slider.setPaintLabels(true);
        slider.setVisible(true);

        napisModyfikowany = new JLabel(sampleText[0]);
        napisModyfikowany.setBounds(20,120, 250,40);
        napisModyfikowany.setFont(new Font("Arial", Font.PLAIN,0));
        napisModyfikowany.setOpaque(true);

        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int vauleSlider = slider.getValue();

                String sizefont = valueOf(vauleSlider);

                napisModyfikowany.setFont(new Font("Arial", Font.PLAIN,vauleSlider));
                napisRozmiarFont.setText(sizefont);

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
       panel.add(napisRozmiarFont);
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
