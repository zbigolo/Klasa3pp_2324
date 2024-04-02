package Z5Managers;

import javax.swing.*;
import java.awt.*;

public class MenagerGridLayout {
    public JPanel createContentPane(){
        GridLayout layout = new GridLayout(2,2);
        JPanel mypanel = new JPanel(layout);

        String[] napisy = {"Cała naprzód","Pół naprzód", "Ćwierć naprzód",
                           "STOP", "Cwierć wstecz", "Pół wstecz", "Cała wstecz"};

        for (int i = 0; i < 7; i++) {
            JButton przyciski = new JButton(napisy[i]);
            mypanel.add(przyciski);
        }

        return mypanel;
    }
    public MenagerGridLayout() {
        JFrame myWindow = new JFrame("Manager GirdLayout");
        myWindow.setContentPane(createContentPane());
        myWindow.setSize(300, 400);

        //myWindow.setLayout();
        myWindow.setLocationRelativeTo(null);
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myWindow.setVisible(true);
    }

    public static void main (String[] args) {
        new MenagerGridLayout();
    }
}
