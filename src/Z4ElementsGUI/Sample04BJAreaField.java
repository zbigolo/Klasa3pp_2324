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

    String text = "";
    public JPanel myContentPane () {
        JPanel myPanel = new JPanel(null);

        myPanel.setBackground(Color.yellow);
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
        myText.setBounds(10,150, 560,400);
        myText.setLineWrap(false);
        myText.insert(sampleNumber,0);
        myText.append("\n");
        myText.append(sampleText);
        text = "dolor";
        myText.setSelectedTextColor(Color.white);
        myText.setSelectionColor(Color.blue);

       bfind.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               text = tfind.getText();
               myText.select(myText.getText().indexOf(text),myText.getText(). indexOf(text)+text.length());
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





        /*


        ;


        JScrollPane pod = new JScrollPane(myText);
        pod.setBounds(0,0,300,200);
        pod.setBackground(Color.yellow);








         myPanel.add(pod);
*/
        myPanel.add(lfind); myPanel.add(lreplace);
        myPanel.add(tfind); myPanel.add(treplace);
        myPanel.add(bfind); myPanel.add(breplace);
         myPanel.add(myText);
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
