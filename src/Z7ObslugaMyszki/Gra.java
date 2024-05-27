package Z7ObslugaMyszki;

import javax.swing.*;
import javax.swing.event.MouseInputAdapter;
import javax.swing.event.MouseInputListener;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Gra {
    private static int klik = 0;
    private int r, g, b;

    JPanel box;

    private int Losuj(int granica){
        return (int) (Math.random() * ( granica ));
    }
    MouseListener my2MouseListner = new MouseAdapter() {
        @Override
        public void mouseClicked (MouseEvent e) {
            super.mouseClicked(e);
        }

        @Override
        public void mouseEntered (MouseEvent e) {
            super.mouseEntered(e);
            r = Losuj(256); g = Losuj(256); b = Losuj(256);
            box.setBackground(new Color(r,g,b));

/*
            if((r == 255) &&( g == 255) && (b == 255) && (klik <= 10))
                JOptionPane.showMessageDialog(null,"WYGRAŁEŚ");
             else
                JOptionPane.showMessageDialog(null,"PRZEGRANA !!!");
*/
            }
    };
    MouseMotionListener myMouseListner = new MouseMotionAdapter() {
        @Override
        public void mouseMoved (MouseEvent e) {
            int x = Losuj(380);
            int y = Losuj(380);
            klik ++;
            System.out.println(klik);
            box.setBounds(x,y,15,15);
        }
    };



    public JPanel createContentPane () {
        JPanel myPanel = new JPanel();

        box = new JPanel(null);
        box.setBounds(0,10,25,25);
        box.setBackground(Color.yellow);
        box.addMouseMotionListener(myMouseListner);
        box.addMouseListener(my2MouseListner);

        myPanel.add(box);
        return myPanel;
    }

    public Gra () {
        JFrame myWindow = new JFrame("Obsługa Myszy");
        myWindow.setContentPane(createContentPane());
        myWindow.setSize(600, 600);
        myWindow.setLayout(null);
        myWindow.setResizable(false);
        myWindow.setLocationRelativeTo(null);
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myWindow.setVisible(true);
    }

    public static void main (String[] args) {
        new Gra();
    }
}
