package Z6Menu;

import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JRadioButtonMenuItem;

public class Main {
    public static void main(String[] args) {
        JFrame f = new JFrame("Application Menu Sample");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMenuBar bar = new JMenuBar();
        bar.addNotify();
        JMenu menu = new JMenu("Options");
        menu.setMnemonic(KeyEvent.VK_O);

        ButtonGroup group = new ButtonGroup();

        JRadioButtonMenuItem menuItem = new JRadioButtonMenuItem("A");
        group.add(menuItem);
        menu.add(menuItem);

        menuItem = new JRadioButtonMenuItem("B");
        group.add(menuItem);
        menu.add(menuItem);

        menuItem = new JRadioButtonMenuItem("C");
        group.add(menuItem);
        menu.add(menuItem);

        bar.add(menu);

        bar.setHelpMenu(menu);

        f.setJMenuBar(bar);
        f.setSize(300, 200);
        f.setVisible(true);
    }
}