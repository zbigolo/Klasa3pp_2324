package Z4ElementsGUI;
import javax.swing.*;
public class Sample001JLabel {

         public JPanel myContentPane () {
             JPanel myPanel = new JPanel(null);
                  // tutaj tworzymy obiekty
                  // to zrób
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
