package Z5Managers;

import javax.swing.*;
import java.awt.*;

public class MenagerGridLayout {
    public JPanel createContentPane(){
        GridLayout gridlayout = new GridLayout();
      //  GridLayout gridlayout = new GridLayout(2, 4);
     //   GridLayout gridlayout = new GridLayout(2,4,15,15);

        gridlayout.setColumns(2);
        gridlayout.setRows(4);
        gridlayout.setHgap(20);
        gridlayout.setVgap(2);
        JPanel mypanel = new JPanel(gridlayout);


















        String[] napisy = {"Cała naprzód","Pół naprzód", "Ćwierć naprzód",
                           "STOP", "Cwierć wstecz", "Pół wstecz", "Cała wstecz","    "};

        for (int i = 0; i < 8; i++) {
            JButton przyciski = new JButton(napisy[i]);
            mypanel.add(przyciski);
        }

        return mypanel;
    }
    public MenagerGridLayout() {
        JFrame myWindow = new JFrame("Manager GirdLayout");
        myWindow.setContentPane(createContentPane());
        myWindow.setSize(300, 400);
        myWindow.setLocationRelativeTo(null);
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myWindow.setVisible(true);
    }

    public static void main (String[] args) {
        new MenagerGridLayout();
    }
}
