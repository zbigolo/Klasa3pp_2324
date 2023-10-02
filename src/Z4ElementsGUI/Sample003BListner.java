package Z4ElementsGUI;

// zastosowanie listnera dla wszystkich

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Sample003BListner {

    JButton czerwonyButton, niebieskiButton,resetButton;
    JLabel etykieta;
    private JButton przycisk(int x, int y, String textJButton, String command){

        JButton sampleJButton = new JButton();
        sampleJButton.setBounds(x,y,200,50);
        sampleJButton.setText(textJButton);
        sampleJButton.setBackground(Color.white);
        sampleJButton.setSelected(false);
        sampleJButton.setActionCommand(command);

        return sampleJButton;
    }

    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if(source == czerwonyButton) {
            czerwonyButton.setBackground(Color.red);
            niebieskiButton.setBackground(Color.red);
            etykieta.setText(czerwonyButton.getText());
        }
        if(source == niebieskiButton){
            czerwonyButton.setBackground(Color.blue);
            niebieskiButton.setBackground(Color.blue);
            resetButton.setBackground(Color.yellow);
            etykieta.setText(niebieskiButton.getText().toString());
        }
    }

    public void actionPerformed2(ActionEvent e) {
        Object source = e.getActionCommand();

        if(source.equals("reset")){
            czerwonyButton.setBackground(Color.white);
            niebieskiButton.setBackground(Color.white);
            resetButton.setBackground(Color.white);
            etykieta.setText("");
        }
    }

    private JPanel myContentPane() {
        JPanel myPanel = new JPanel(null);

        etykieta = new JLabel();
        etykieta.setBounds(400,250,200,50);
        etykieta.setVisible(true);
        etykieta.setOpaque(true);
        etykieta.setBackground(Color.white);

        czerwonyButton = przycisk(100,200, "Czerwony","czerwony");
        niebieskiButton = przycisk(200,400,"Niebieski","niebieski");
        resetButton = przycisk(400, 600,"Reset","reset");

        czerwonyButton.addActionListener(this::actionPerformed);
        niebieskiButton.addActionListener(this::actionPerformed);
        resetButton.addActionListener(this::actionPerformed2);

        myPanel.add(etykieta);
        myPanel.add(czerwonyButton);
        myPanel.add(niebieskiButton);
        myPanel.add(resetButton);
        return myPanel;
    }
    public Sample003BListner () {
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
        new Sample003BListner();
    }

}

