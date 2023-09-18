package Z3DrawFonts;


import javax.swing.*;
import java.awt.*;
import java.awt.font.TextAttribute;
import java.awt.geom.AffineTransform;
import java.text.AttributedString;


class panelPisania extends JPanel{
    private final String words = "Valour fate kinship darkness";
    private final String java = "Java TM";

    private final String textToWrite = "Hello World!";
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        AffineTransform defaultAt = g2.getTransform();


        g2.setColor(new Color(167, 136, 69));
        g2.setFont(new Font("Stencil", Font.PLAIN, 28));
        g2.drawString(textToWrite, 100, 100);



       g2.setFont(new Font("Book Antiqua", Font.PLAIN, 28));
        AffineTransform at = AffineTransform.getQuadrantRotateInstance(3);
        g2.setTransform(at);
        g2.drawString(textToWrite, -300, 150);

        AffineTransform at2 = AffineTransform.getQuadrantRotateInstance(1);
        g2.setTransform(at2);
        g2.drawString(textToWrite, 150, -350);

        AffineTransform at3 = AffineTransform.getQuadrantRotateInstance(2);
        g2.setTransform(at3);
        g2.drawString(textToWrite, -330, -300);

        g2.setTransform(defaultAt);

/*
        g2.setColor(Color.black);
        Font font = new Font("Serif", Font.PLAIN, 40);

        AttributedString as1 = new AttributedString(words);
        as1.addAttribute(TextAttribute.FOREGROUND, Color.green, 0, 6);
        as1.addAttribute(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON, 7, 11);
        as1.addAttribute(TextAttribute.BACKGROUND, Color.YELLOW, 12, 19);
        as1.addAttribute(TextAttribute.STRIKETHROUGH, TextAttribute.STRIKETHROUGH_ON, 20, 28);
        as1.addAttribute(TextAttribute.FONT, font);


        AttributedString as2 = new AttributedString(java);
        as2.addAttribute(TextAttribute.SIZE, 40);
        as2.addAttribute(TextAttribute.SUPERSCRIPT, TextAttribute.SUPERSCRIPT_SUPER, 5, 7);;

        g2.drawString(as1.getIterator(), 30, 360);
        g2.drawString(as2.getIterator(), 30, 425);
        g2.dispose();
*/
    }
}

public class DrawFonts{

    private panelPisania text = new panelPisania();


    public DrawFonts(){
        JFrame myFrame = new JFrame();

        myFrame.setSize(900, 800);
        myFrame.setResizable(false);
        myFrame.setLocationRelativeTo(null);
        myFrame.getContentPane().add(text);

        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new DrawFonts();
    }
}
