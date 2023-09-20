package Z2RysowanieFigur;

import javax.swing.*;
import java.awt.*;

class panelKomory extends JPanel {
    public void paintComponent(Graphics g) {
        g.setColor(new Color(243, 202, 57));
        g.fillRect(0,0,980,150);

        g.setColor(new Color(255, 255, 255));
        g.fillRect(0,150,980,150);

        g.setColor(new Color(185, 49, 40));
        g.fillRect(0,300,980,150);

        g.setColor(new Color(77, 117, 194));
        g.fillRect(0,450,980,150);

        g.setColor(new Color(86, 140, 56));
        g.fillPolygon(new int[] {0,0,500}, new int[]{0,600,300},3);

        g.setColor(new Color(255,255,255));
        int radius = 270;
        g.fillOval(170-radius/2,300-radius/2,radius,radius);

        g.setColor(new Color(86, 140, 56));
        g.fillOval(230-radius/2, 300-radius/2,radius,radius);

        g.setColor(new Color(255,255,255));
        int x = 200;
        int y = 180;
        for (int i = 0; i < 4; i++) {
            g.fillPolygon(new int[]{x,x+7,x+27,x+10,x+16,x,x-16,x-10,x-27,x-7}, new int[]{y,y+20,y+20,y+30,y+50,y+37,y+50,y+30,y+20,y+20},10);
            y += 60;
        }
    }
}

public class Komory extends JFrame {
    private panelKomory rysuj = new panelKomory();

    public Komory() {
        this.setTitle("Flaga Komory");
        int sx = getToolkit().getScreenSize().width;
        int sy = getToolkit().getScreenSize().height;
        this.setBounds(sx/2 - 990/2,sy/2 - 635/2,990,635);
        this.setResizable(false);
        this.setDefaultCloseOperation(3);

        this.getContentPane().add(rysuj);

        this.setVisible(true);
    }
}
