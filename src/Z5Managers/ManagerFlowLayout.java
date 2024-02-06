package Z5Managers;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManagerFlowLayout implements ActionListener {

    private JButton button;
    private JLabel pole;

    public JPanel createContentPane () {
        //1
         // JPanel myPanel = new JPanel(new FlowLayout());
        //2
        //    JPanel myPanel = new JPanel();
       //     myPanel.setLayout(new FlowLayout());

        JPanel myPanel = new JPanel();
        FlowLayout rozkladLiniowy = new FlowLayout(FlowLayout.LEFT, 20, 40);
        myPanel.setLayout(rozkladLiniowy);


        for (int i = 1; i < 16 ; i++) {
            button = new JButton("Przycisk" + i);
            button.addActionListener(this);
            myPanel.add(button);
        }

        pole = new JLabel("Witaj świecie");
        pole.setOpaque(true);
        pole.setBackground(Color.ORANGE);
        pole.setPreferredSize(new Dimension(80,20));

        JPanel panelLewy = new JPanel( new FlowLayout());
        panelLewy.setBackground(Color.blue);
        // panelLewy.setSize(150,200);
        panelLewy.setPreferredSize(new Dimension(100,100));

        myPanel.add(pole);
        myPanel.add(panelLewy);
        return myPanel;
    }



    public ManagerFlowLayout () {
        JFrame myWindow = new JFrame("Manager FlowLayout");
        myWindow.setContentPane(createContentPane());
        myWindow.setSize(300, 400);
        myWindow.setLayout(new FlowLayout());
        myWindow.setLocationRelativeTo(null);
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myWindow.setVisible(true);
    }

    public static void main (String[] args) {
        new ManagerFlowLayout();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(button.getText());
    }
}
