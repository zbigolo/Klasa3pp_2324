package Z2RysowanieFigur;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;


class paneDrawTransorm extends JPanel{

    public void paintComponent(Graphics g){
            Graphics2D g2d = (Graphics2D) g;

            AffineTransform old = g2d.getTransform();
/*
            g2d.setColor(Color.blue);
            g2d.fillRect(150, 150, 300, 150);

            g2d.setTransform(old);

            g2d.scale(0.5,0.5);
            g2d.setColor(Color.yellow);
            g2d.fillRect(300, 300, 300, 150);
            g2d.setTransform(old);
*/
        g2d.fillRect(100, 100, 10, 50);
            g2d.rotate(-9,100,100);
            g2d.setColor(Color.red);
            g2d.fillRect(100, 100, 10, 50);
            g2d.setTransform(old);

            g2d.setColor(Color.black);
            g2d.drawLine(300,300,600,300);
            for(int i = -1; i > -90; i--){
                g2d.setColor(new Color(120+i,100, Math.abs(i)+150));
                g2d.rotate(i,450,300);

                g2d.drawLine(300,300,600,300);
            }

    //

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

