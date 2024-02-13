package Z5Managers;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;


public class MenagerBorderLayout {


    public MenagerBorderLayout() {
        JFrame myWindow = new JFrame("Manager BorderLayout");
        myWindow.setContentPane(createContentPane());
        myWindow.setSize(new Dimension(700, 200));
        myWindow.setLocationRelativeTo(null);
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myWindow.setVisible(true);
    }

    public static void main(String[] args) {
        new MenagerBorderLayout();
    }

    public JPanel createContentPane() {
        BorderLayout layoutborder = new BorderLayout(10,20);
       JPanel panelTestowy = new JPanel(layoutborder);
        //JPanel panelTestowy = new JPanel(new BorderLayout());

        JButton button1 = new JButton("Button 1 - PAGE START (NORTH)");
        JButton button2 = new JButton("Button 2 - PAGE END (SOUTH)");
        JButton button3 = new JButton("Button 3 - LINE START (WEST)");
        JButton button4 = new JButton("Button 4 - LINE END (EAST)");
        JButton button5 = new JButton("Button 5 - CENTER");

        JButton button3A = new JButton("Button 3A - RED");
        button3A.setBorder(new EmptyBorder(3, 0, 3, 0));
        JButton button3B = new JButton("Button 3B - GREEN");
        button3B.setBorder(new LineBorder(Color.white, 3, false));

        JPanel yellow = new JPanel(new FlowLayout());
        yellow.setBackground(Color.yellow);
        yellow.setPreferredSize(new Dimension(200, 200));
        yellow.add(button3);
        yellow.add(button3A);
        yellow.add(button3B);

        button3A.addActionListener(e -> {
            yellow.setBackground(Color.red);
            button3A.setText("Buttona 3a - r e d");
            button4.isDefaultButton();
        });

        button3B.addActionListener(e -> yellow.setBackground(Color.green));
        button4.addActionListener(e -> {
            button3A.setText("Buttona 3A - RED");
            yellow.setBackground(new Color(100, 100, 100));
            button4.setBackground(Color.white);
            int[] tablica = {1,2,3,4,5,6,7,8,9,0};
            for (int i : tablica) {
                System.out.print(i + " ");
            }
        });







        panelTestowy.add(button1, BorderLayout.PAGE_START);
       panelTestowy.add(button2, BorderLayout.PAGE_END);
       panelTestowy.add(yellow, BorderLayout.LINE_START);
        panelTestowy.add(button4, BorderLayout.LINE_END);
        panelTestowy.add(button5, BorderLayout.CENTER);
        return panelTestowy;
    }
}
