package Z5Managers;

import javax.swing.*;
import java.awt.*;

import static java.awt.ComponentOrientation.*;

public class ManagerBoxLayout {

    private JButton button (String text){
        JButton przycisk = new JButton(text);
        przycisk.setVisible(true);
        return przycisk;
    }

    public JPanel createContentPane () {
        JPanel myPanel = new JPanel();

        JPanel redPanel = new JPanel();
        redPanel.setBounds(0,0,300,200);
        redPanel.setBackground(Color.red);
        redPanel.setVisible(true);
        JLabel tytul = new JLabel("Rozkład liniowy na panelu");
        tytul.setPreferredSize(new Dimension(250,50));
        redPanel.add(tytul);
        JButton prz1 = button("Button 1");
        prz1.setSize(200,50);
        redPanel.add(prz1);
        JButton prz2 = button("Button 2");
        prz2.setSize(200,50);
        redPanel.add(prz2);



        JPanel yellowPanel = new JPanel(null);
        yellowPanel.setLayout(new BoxLayout(yellowPanel, BoxLayout.X_AXIS));
        yellowPanel.setBounds(0,200,300,200);
        yellowPanel.setBackground(Color.yellow);
        yellowPanel.setVisible(true);

        JLabel tytul1 = new JLabel("X_AXIS");
        tytul1.setPreferredSize(new Dimension(400,50));
        yellowPanel.add(tytul1);

        JButton prz10 = button("Button 3");
        prz10.setSize(200,50);
        yellowPanel.add(prz10);
        JButton prz11 = button("Button 4");
        prz11.setSize(200,50);
        yellowPanel.add(prz11);


        JPanel greenPanel = new JPanel(null);
        greenPanel.setLayout(new BoxLayout(greenPanel, BoxLayout.Y_AXIS));
        greenPanel.setBounds(300,200,300,200);
        greenPanel.setBackground(Color.green);
        greenPanel.setVisible(true);

        JLabel tytul21 = new JLabel("Y_AXIS");
        tytul21.setSize(new Dimension(200,50));
        greenPanel.add(tytul21);

        JButton prz20 = button("Button 5");
        prz20.setSize(200,50);
        greenPanel.add(prz20);
        JButton prz21 = button("Button 6");
        prz21.setSize(200,50);
        greenPanel.add(prz21);

        JPanel whitePanel = new JPanel(null);
        whitePanel.setBounds(0,400,300,200);
        whitePanel.setBackground(Color.white);
        whitePanel.setLayout(new BoxLayout(whitePanel, BoxLayout.LINE_AXIS));


        JLabel tytul22 = new JLabel("LINE_AXIS");
        tytul22.setSize(new Dimension(150,50));
        whitePanel.add(tytul22);

        JButton prz30 = button("Button 7");
        prz30.setSize(200,50);
        whitePanel.add(prz30);
        JButton prz31 = button("Button 8");
        prz31.setSize(200,50);
        whitePanel.add(prz31);



        myPanel.add(redPanel);
        myPanel.add(yellowPanel);
        myPanel.add(greenPanel);
        myPanel.add(whitePanel);
        return myPanel;
    }

    public ManagerBoxLayout () {
        JFrame myWindow = new JFrame("Manager FlowLayout");
        myWindow.setContentPane(createContentPane());
        myWindow.setSize(600, 640);

        myWindow.setLayout(null);
        myWindow.setLocationRelativeTo(null);
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myWindow.setVisible(true);
    }

    public static void main (String[] args) {
        new ManagerBoxLayout();
    }

}

