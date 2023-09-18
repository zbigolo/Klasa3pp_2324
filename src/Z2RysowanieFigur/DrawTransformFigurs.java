package Z2RysowanieFigur;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;


class paneDrawTransorm extends JPanel{

    public void paintComponent(Graphics g){
            Graphics2D g2d = (Graphics2D) g;
            AffineTransform old = g2d.getTransform();

            g2d.setColor(Color.blue);
            g2d.fillRect(150, 150, 100, 50);
            g2d.setTransform(old);

            g2d.scale(0.5,0.5);
            g2d.setColor(Color.yellow);
            g2d.fillRect(300, 300, 100, 50);
            g2d.setTransform(old);

            g2d.rotate(90, 150, 150);
            g2d.setColor(Color.red);
            g2d.fillRect(150, 150, 100, 50);
            g2d.setTransform(old);
    }
}

public class DrawTransformFigurs{

    private paneDrawTransorm rysunek = new paneDrawTransorm();


    public DrawTransformFigurs(){
        JFrame myFrame = new JFrame();
        myFrame.setSize(900, 900);
        myFrame.setResizable(false);
        myFrame.setLocationRelativeTo(null);
        myFrame.getContentPane().add(rysunek);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new DrawTransformFigurs();
    }
}

