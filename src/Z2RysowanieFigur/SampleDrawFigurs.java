package Z2RysowanieFigur;

import javax.swing.*;
import java.awt.*;


class panelRysunku extends JPanel {
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;

         // Tu wpisać instrukcje rysunku
    }
}
public class SampleDrawFigurs {

    private panelRysunku rysunek = new panelRysunku();


    public SampleDrawFigurs(){
        // dostosoawć poniższe parametry do wymagań

        JFrame myFrame = new JFrame("PRzykładowy plik");
        myFrame.setSize(900, 800);
        myFrame.setResizable(false);
        myFrame.setLocationRelativeTo(null);
        myFrame.getContentPane().add(rysunek);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new SampleDrawFigurs();
    }
}
