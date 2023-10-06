package Z4ElementsGUI;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Sample_04A_JTextField implements ActionListener {

    private JTextField test;
    private JLabel etykieta;

    public void actionPerformed(ActionEvent e){
        if(e.getSource() instanceof  JTextField){
            JTextField t = (JTextField) e.getSource();
            System.out.println(t.getText());
        }
    }
    public JPanel myContentPane () {
        JPanel myPanel = new JPanel(null);

        etykieta = new JLabel("Podaj dowolny tekst:");
        etykieta.setBounds(20,100,150,40);

         test = new JTextField();
         test.setBounds(170,100, 200,40);

        test.addActionListener(this);

        test.getDocument().addDocumentListener(new DocumentListener() {
                                                   @Override
                                                   public void insertUpdate(DocumentEvent e) {
                                                       System.out.println(test.getText());
                                                   }

                                                   @Override
                                                   public void removeUpdate(DocumentEvent e) {
                                                       System.out.println(test.getText());
                                                   }

                                                   @Override
                                                   public void changedUpdate(DocumentEvent e) {

                                                   }
                                               });


                myPanel.add(etykieta);
         myPanel.add(test);
        return myPanel;
    }



    public Sample_04A_JTextField() {
        JFrame myWindow = new JFrame("Sample JTextField");
        myWindow.setContentPane(myContentPane());
        myWindow.setSize(400, 300);
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
