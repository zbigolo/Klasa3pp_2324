<<<<<<< HEAD
package Z2;
=======
package Z2RysowanieFigur;
>>>>>>> 896f40f (ze szkoły)

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

class panelRysowania extends JPanel{
     public void paintComponent(Graphics g){
         Graphics2D g2 = (Graphics2D) g;

        //  fillRect()
         g2.setColor(Color.white);
         g2.fillRect(0, 0, 900,800);

        // drawLine()
         g2.setColor(Color.black);
         g2.drawLine(100,200,300,100 );
         g2.setColor(Color.blue);
         g2.drawLine(150,200,350,100);

        // drawPolygon()
         g2.setColor(Color.red);
         int[] x = {100,150,200,600};
         int[] y = {200,300,500,200};
<<<<<<< HEAD
         g2.drawPolygon(x,y,4 );
=======
         g2.drawPolygon(x,y,4);
>>>>>>> 896f40f (ze szkoły)

       //  drawRect()
         g2.setColor(Color.green);
         g2.setStroke(new BasicStroke(5));
         g2.drawRect(300,100,40,40);
         g2.setColor(Color.blue);
         g2.setStroke(new BasicStroke(1));
         g2.fill(new Rectangle(250,100,40,80));

<<<<<<< HEAD
=======
         g2.setColor(Color.CYAN);
         g2.fillRect(300,400, 210,100);
         g2.setColor(Color.black);
         g2.drawRect(300,400, 210,100);
>>>>>>> 896f40f (ze szkoły)
       //  drawOval()
         g2.setColor(Color.black);
         g2.drawOval(600,100,50,100);

         g2.setColor(new Color(105, 51, 255, 255));
         g2.setStroke(new BasicStroke(5));
<<<<<<< HEAD
         g2.drawOval(80,150,60,100);
=======
         g2.drawOval(80,150,160,160);
>>>>>>> 896f40f (ze szkoły)

      //  fillOval()
         g2.setColor(Color.black);
         g2.fillOval(800,100,50,100);

         //   fillRoundRect()
         g2.setColor(Color.magenta);
         g2.fillRoundRect( 200,600,100,150,300,200 );

         //
         BufferedImage img = null;
         try {
<<<<<<< HEAD
             img = ImageIO.read(new File("rysunek.png"));
=======
             img = ImageIO.read(new File("rysunek.jpg"));
>>>>>>> 896f40f (ze szkoły)
         } catch (IOException e) {  }
         g2.drawImage(img,400,350,null);

     }
}

public class DrawFigurs{

    private panelRysowania rysunek = new panelRysowania();


    public DrawFigurs(){
<<<<<<< HEAD
        JFrame myFrame = new JFrame("ZG");
=======
        JFrame myFrame = new JFrame();
>>>>>>> 896f40f (ze szkoły)

        myFrame.setSize(900, 800);
        myFrame.setResizable(false);
        myFrame.setLocationRelativeTo(null);
        myFrame.getContentPane().add(rysunek);

        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }

    public static void main(String[] args) {
            new DrawFigurs();
    }
}
