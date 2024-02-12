package Z5Managers;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenagerBorderLayout {
    public JPanel createContentPane(){

        BorderLayout layoutborder = new BorderLayout();
        JPanel panelTestowy = new JPanel(layoutborder);

        JButton button1 = new JButton("Button 1 - PAGE START (NORTH)");
        JButton button2 = new JButton("Button 2 - PAGE END (SOUTH)");
        JButton button3 = new JButton("Button 3 - LINE START (WEST)");
        JButton button4 = new JButton("Button 4 - LINE END (EAST)");
        JButton button5 = new JButton("Button 5 - CENTER");

        JButton button3A = new JButton("Button 3A - RED");
        button3A.setBorder(new EmptyBorder(3, 0, 3, 0));
        JButton button3B = new JButton("Button 3B - GREEN");
        button3B.setBorder(new LineBorder(Color.white, 3,true));

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
        panelTestowy.add(yellow, BorderLayout.LINE_START);
        panelTestowy.add(button4, BorderLayout.LINE_END);
        panelTestowy.add(button5, BorderLayout.CENTER);
        return panelTestowy;
    }
    public MenagerBorderLayout () {
        JFrame myWindow = new JFrame("Manager BorderLayout");
        myWindow.setContentPane(createContentPane());
        myWindow.setSize(900, 400);

        myWindow.setLocationRelativeTo(null);
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myWindow.setVisible(true);
    }

    public static void main (String[] args) {
        new MenagerBorderLayout();
    }
}
