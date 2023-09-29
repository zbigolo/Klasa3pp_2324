package P02_RysowanieFigur;


import javax.swing.*;
import java.awt.*;


class panelWielkaBrytania extends JPanel {
    public void paintComponent(Graphics g) {

        int width = 1200;
        int height = 600;

        g.setColor(new Color(128, 178, 229));
        g.fillRect(0, 0, width, height);

        g.setColor(new Color(13, 28, 103));
        g.fillRect(0, 0, width, height);

        g.setColor(Color.white);
        g.fillPolygon(new int[]{0, 120, width, width, width - 120, 0}, new int[]{0, 0, height - 60, height, height, 60}, 6);

        g.setColor(new Color(180, 48, 47));
        g.fillPolygon(new int[]{0, width / 2, width / 2, 0}, new int[]{0, height / 2, height / 2 + 40, 40}, 4);

        g.fillPolygon(new int[]{width, width / 2, width / 2, width}, new int[]{height, height / 2, height / 2 - 40, height - 40}, 4);

        g.setColor(Color.white);
        g.fillPolygon(new int[]{0, 120, width, width, width - 120, 0}, new int[]{height, height, 60, 0, 0, height - 60}, 6);

        g.setColor(new Color(180, 48, 47));
        g.fillPolygon(new int[]{0, 80, width / 2 + 80, width / 2}, new int[]{height, height, height / 2, height / 2}, 4);

        g.fillPolygon(new int[]{width, width - 80, width / 2 - 80, width / 2}, new int[]{0, 0, height / 2, height / 2}, 4);

        g.setColor(Color.white);
        int wid = 200;
        g.fillRect(width / 2 - wid / 2, 0, wid, height);
        g.fillRect(0, height / 2 - wid / 2, width, wid);

        g.setColor(new Color(180, 48, 47));
        wid = 120;
        g.fillRect(width / 2 - wid / 2, 0, wid, height);
        g.fillRect(0, height / 2 - wid / 2, width, wid);
    }
}

public class WielkaBrytania extends JFrame {
    private panelWielkaBrytania rysuj = new panelWielkaBrytania();

    public WielkaBrytania() {
        this.setTitle("Flaga Wielkiej Brytanii");
        int sx = getToolkit().getScreenSize().width;
        int sy = getToolkit().getScreenSize().height;
        this.setBounds(sx / 2 - 1210 / 2, sy / 2 - 635 / 2, 1210, 635);
        this.setResizable(false);
        this.setDefaultCloseOperation(3);

        this.getContentPane().add(rysuj);

        this.setVisible(true);
    }

    public static void main(String[] args) {
        new WielkaBrytania();
    }
}
