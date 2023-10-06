package Z4ElementsGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// zastosowanie rozdzielnych  listnerów
public class Sample003AListner {

    JButton czerwonyButton, niebieskiButton,resetButton;
    JTextField poletekstowe;
    private JButton przycisk(int x, int y, String textJButton){

        JButton sampleJButton = new JButton();
        sampleJButton.setBounds(x,y,200,50);
        sampleJButton.setText(textJButton);

        return sampleJButton;
    }


    private JPanel myContentPane() {
        JPanel myPanel = new JPanel(null);

        myPanel.setBackground(Color.white);

         czerwonyButton = przycisk(100,200, "Czerwony");
         niebieskiButton = przycisk(200,400,"Niebieski");
         resetButton = przycisk(400, 600,"Reset");
         poletekstowe = new JTextField(20);
         poletekstowe.setBounds(10,50,180,50);

         czerwonyButton.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 myPanel.setBackground(Color.red);
             }
         });

        niebieskiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myPanel.setBackground(Color.blue);
                String napis = poletekstowe.getText();
                System.out.println(napis);
                poletekstowe.setText("");
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myPanel.setBackground(Color.white);
            }
        });

        myPanel.add(poletekstowe);
        myPanel.add(czerwonyButton);
        myPanel.add(niebieskiButton);
        myPanel.add(resetButton);
        return myPanel;
    }
    public Sample003AListner () {
        JFrame myWindow = new JFrame("JButton Sample");
        myWindow.setContentPane(myContentPane());
        myWindow.setSize(900, 800);
        myWindow.setLayout(null);
        myWindow.setResizable(false);
        myWindow.setLocationRelativeTo(null);
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myWindow.setVisible(true);
    }



    public static void main (String[] args) {
        new Sample003AListner();
    }

}
