package Z4ElementsGUI;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Sample001JLabel {

            private JLabel przycisk1, przycisk2;

            private JLabel newLabel(int x, int y){
                JLabel przycisk = new JLabel();
                Font czcionka = new Font("Arial", Font.PLAIN,20);
                przycisk.setText("Nowa Etykieta");
                przycisk.setBounds(x,y,160 ,80);
                przycisk.setOpaque(true);
                przycisk.setBackground(new Color(200,200,200));
                przycisk.setForeground(Color.white);
                przycisk.setFont(czcionka);
                przycisk.setText("<html><u>JLABEL </u></html>");
                przycisk.setHorizontalAlignment(JLabel.CENTER);
                przycisk.setVerticalAlignment(JLabel.CENTER);
                Border ramka = BorderFactory.createLineBorder(Color.red,5);
                przycisk.setBorder(ramka);
                ImageIcon ikona = new ImageIcon(".\\grafika\\pass.png");
                przycisk.setIcon(ikona);
                przycisk.setVisible(true);
                return  przycisk;
            }
                     public JPanel myContentPane () {
             JPanel myPanel = new JPanel(null);

             przycisk1 = newLabel(20,100);
             przycisk2 = newLabel(100,300);
             myPanel.add(przycisk1);
             myPanel.add(przycisk2);
             return myPanel;
        }

        public Sample001JLabel () {
            JFrame myWindow = new JFrame("JLabel Sample");
            myWindow.setContentPane(myContentPane());
            myWindow.setSize(900, 800);
            myWindow.setLayout(null);
            myWindow.setResizable(false);
            myWindow.setLocationRelativeTo(null);
            myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            myWindow.setVisible(true);
        }

        public static void main (String[] args) {
            new Sample001JLabel();
        }
}
