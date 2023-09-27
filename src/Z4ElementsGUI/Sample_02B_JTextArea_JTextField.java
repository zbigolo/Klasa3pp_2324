package P03_ObiektyRamki;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Sample_02B_JTextArea_JTextField {

    JLabel ltext;
    JTextField txftext;
    JButton btext;
    JTextArea txatext;
    String tmp ="";
    public JPanel myContentPane () {
        JPanel myPanel = new JPanel(null);

        ltext =  new JLabel("Write text: ");
        ltext.setBounds(10,10, 150,20);
        ltext.setHorizontalAlignment(SwingConstants.RIGHT);
        ltext.setVisible(true);

        txftext = new JTextField();
        txftext.setBounds(161,10,100,20);
        txftext.setFont(new Font("Times New Roman",Font.TRUETYPE_FONT,12));
        txftext.setVisible(true);

        btext = new JButton("Send text");
        btext.setBounds(263,10,120,20);
        btext.setVisible(true);

        txatext = new JTextArea();
        txatext.setFont(new Font("Times New Roman",Font.BOLD,14));
       //txatext.setBounds(10,50,760,200);
        txatext.setEditable(true);
        //txatext.setAutoscrolls(true);
     //   txatext.setVisible(true);
        


        JScrollPane scroll = new JScrollPane(txatext);
        scroll.setBounds(10,50,760,200);
        scroll.setBackground(Color.black);
        scroll.setVisible(true);
        txatext.setAutoscrolls(true);


        btext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                tmp += txftext.getText()+"\n";
                txftext.setText("");
                txatext.setText(tmp);
            }
        });;


        myPanel.add(txftext); //myPanel.add(txftext);
        myPanel.add(btext);
        myPanel.add(ltext);
        myPanel.add(scroll);
        return myPanel;
    }



    public Sample_02B_JTextArea_JTextField() {
        JFrame myWindow = new JFrame("Sample JTextArea and JScrollPane");
        myWindow.setContentPane(myContentPane());
        myWindow.setSize(800, 300);
        myWindow.setLayout(null);
        myWindow.setResizable(false);
        myWindow.setLocationRelativeTo(null);
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myWindow.setVisible(true);
    }

    public static void main (String[] args) {
         new Sample_02B_JTextArea_JTextField();

    }
}
