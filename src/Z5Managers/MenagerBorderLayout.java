package Z5Managers;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenagerBorderLayout {
    public JPanel createContentPane(){

        BorderLayout layoutborder = new BorderLayout(40,100);
        JPanel panelTestowy = new JPanel(layoutborder);

        JButton button1 = new JButton("Button 1 - PAGE START");
        JButton button2 = new JButton("Button 2 - PAGE END");
        JButton button3 = new JButton("Button 3 - LINE START");
        JButton button4 = new JButton("Button 4 - LINE END");
        JButton button5 = new JButton("Button 5 - CENTER");

        JButton button3A = new JButton("Button 3A - RED");
        JButton button3B = new JButton("Button 3B - GREEN");

        JPanel yellow = new JPanel(new FlowLayout());
        yellow.setBackground(Color.yellow);
        yellow.add(button3);
        yellow.add(button3A);
        yellow.add(button3B);

        button3A.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                yellow.setBackground(Color.red);
            }
        });
        button3B.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                yellow.setBackground(Color.green);
            }
        });


        panelTestowy.add(button1, BorderLayout.PAGE_START);
        panelTestowy.add(button2, BorderLayout.PAGE_END);
        //panelTestowy.add(button3, BorderLayout.LINE_START);
        panelTestowy.add(yellow, BorderLayout.LINE_START);
        panelTestowy.add(button4, BorderLayout.LINE_END);
        panelTestowy.add(button5, BorderLayout.CENTER);
        return panelTestowy;
    }
    public MenagerBorderLayout () {
        JFrame myWindow = new JFrame("Manager BorderLayout");
        myWindow.setContentPane(createContentPane());
        myWindow.setSize(300, 400);

        myWindow.setLocationRelativeTo(null);
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myWindow.setVisible(true);
    }

    public static void main (String[] args) {
        new MenagerBorderLayout();
    }
}
