package Z5Managers;

import javax.swing.*;
import java.awt.*;

public class ManagerBox2Layout {

    private JButton button (String text){
        JButton przycisk = new JButton(text);
        przycisk.setSize(200,50);
        przycisk.setVisible(true);
        return przycisk;
    }

    public JPanel createContentPane () {
        JPanel myPanel = new JPanel(null);
        BoxLayout mylayout = new BoxLayout(myPanel, BoxLayout.LINE_AXIS);

        myPanel.setLayout(mylayout);
        myPanel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

        for (int i = 1; i < 6 ; i++) {
            JButton butt = new JButton("Przycisk" + i);

            myPanel.add(Box.createRigidArea(new Dimension(10,10)));

            myPanel.add(butt);
        }
        JButton butt7 = new JButton("Przycisk" + 7);
       // JButton butt8 = new JButton("Przycisk" + 8);
        myPanel.add(butt7);
      //  myPanel.add(butt8);

        System.out.println(mylayout.getTarget());
        System.out.println(mylayout.getAxis());

        return myPanel;
    }

    public ManagerBox2Layout () {
        JFrame myWindow = new JFrame("Manager FlowLayout");
        myWindow.setContentPane(createContentPane());
        myWindow.setSize(600, 400);
        myWindow.setLocationRelativeTo(null);
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myWindow.setVisible(true);
    }

    public static void main (String[] args) {
        new ManagerBox2Layout();
    }

}

