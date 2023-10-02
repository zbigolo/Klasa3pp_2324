package Z4ElementsGUI;

import javax.swing.*;



public class Sample_04A_JTextField {

     public JPanel myContentPane () {
        JPanel myPanel = new JPanel(null);


        return myPanel;
    }



    public Sample_04A_JTextField() {
        JFrame myWindow = new JFrame("Sample JTextField");
        myWindow.setContentPane(myContentPane());
        myWindow.setSize(400, 200);
        myWindow.setLayout(null);
        myWindow.setResizable(false);
        myWindow.setLocationRelativeTo(null);
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myWindow.setVisible(true);
    }

    public static void main (String[] args) {
         new Sample_04A_JTextField();

    }
}
