package Z4ElementsGUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sample04BJAreaField {
    private JTextArea myText;
    private JLabel lfind, lreplace;
    private JButton bfind, breplace;
    private JTextField tfind, treplace;
    private final String sampleText = "Lorem ipsum dolor sit amet, consectetur adipiscing";
    private final String sampleNumber = "12345678901234567890123456789012345678901234567890";

    private String tex;
    public JPanel myContentPane () {
        JPanel myPanel = new JPanel(null);

        myPanel.setBackground(new Color(240,230,140));
       lfind = new JLabel(" Find word: ");
       lfind.setBounds(10,10,100, 20);

       lreplace = new JLabel("Replace word: ");
       lreplace.setBounds(10,70, 100, 20 );

       bfind = new JButton("FIND");
       bfind.setBounds(310, 10,150,20);

       breplace = new JButton("REPLACE");
       breplace.setBounds(310,70,150,20);

       tfind = new JTextField();
       tfind.setBounds(100, 10, 200,20);

       treplace = new JTextField();
       treplace.setBounds(100,70,200,20);

        myText = new JTextArea(10,20);
        myText.setBounds(10,150, 360,360);
        myText.setLineWrap(false);
        myText.insert(sampleNumber,0);
        myText.insert(sampleText,1);

        myText.append("\n"+sampleText);
        myText.setSelectedTextColor(Color.white);
        myText.setSelectionColor(Color.blue);
        myText.setTabSize(10);
       // myText.setEditable(false);


        myText.setFont(new Font("Arial", Font.PLAIN, 16));
        myText.setBackground(Color.yellow);
        myText.setForeground(new Color(210,17,234));

        myText.setSelectedTextColor(Color.white);
        myText.setSelectionColor(Color.blue);

        JScrollPane pod = new JScrollPane(myText);
        pod.setBounds(10,140,570,400);



       bfind.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               String text = tfind.getText();

               int pozycja = myText.getText().indexOf(text);

                myText.select(pozycja, pozycja + text.length());

               myText.requestFocusInWindow();
           }
       });

       breplace.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               String co = treplace.getText();
               int start = myText.getSelectionStart();
               int end = myText.getSelectionEnd();

               StringBuilder strBuilder = new StringBuilder(myText.getText());
               strBuilder.replace(start, end, co);
               myText.setText(strBuilder.toString());
               myText.requestFocusInWindow();
           }
       });





            ;











         myPanel.add(pod);

        myPanel.add(lfind); myPanel.add(lreplace);
        myPanel.add(tfind); myPanel.add(treplace);
        myPanel.add(bfind); myPanel.add(breplace);
       //  myPanel.add(myText);
        return myPanel;
    }



    public Sample04BJAreaField() {
        JFrame myWindow = new JFrame("Sample JTextArea");
        myWindow.setContentPane(myContentPane());
        myWindow.setSize(600, 600);
        myWindow.setLayout(null);
        myWindow.setResizable(false);
        myWindow.setLocationRelativeTo(null);
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myWindow.setVisible(true);
    }

    public static void main (String[] args) {
        new Sample04BJAreaField();

    }
}
