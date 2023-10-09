package Z4ElementsGUI;
import javax.swing.*;
import java.awt.*;
public class Sample04BJAreaField {
    private JTextArea myText;
    private final String sampleText = "Lorem ipsum dolor sit amet, consectetur adipiscing";
    private final String sampleNumber = "12345678901234567890123456789012345678901234567890";

    private final String text ="dolor";
    public JPanel myContentPane () {
        JPanel myPanel = new JPanel(null);
        myText = new JTextArea(10,50);
        myText.setBounds(10,10, 325,50);
        myText.setBackground(Color.green);
        myText.setLineWrap(false);
        myText.insert(sampleNumber,0);
        myText.append("\n");
        myText.append(sampleText);

        myText.setSelectedTextColor(Color.blue);
        myText.setSelectionColor(Color.yellow);
        myText.select(myText.getText().indexOf(text),myText.getText().
                indexOf(text)+text.length());
        JScrollPane pod = new JScrollPane(myText);
        pod.setBounds(0,0,300,200);
        pod.setBackground(Color.yellow);

        int start = myText.getSelectionStart();
        int end = myText.getSelectionEnd();

        StringBuilder strBuilder = new StringBuilder(myText.getText());
        strBuilder.replace(start, end, "KONIEC");
        myText.setText(strBuilder.toString());



        System.out.println(myText.getSelectedText());


         myPanel.add(pod);

        return myPanel;
    }



    public Sample04BJAreaField() {
        JFrame myWindow = new JFrame("Sample JTextArea");
        myWindow.setContentPane(myContentPane());
        myWindow.setSize(400, 300);
       // myWindow.setLayout(null);
        myWindow.setResizable(false);
        myWindow.setLocationRelativeTo(null);
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myWindow.setVisible(true);
    }

    public static void main (String[] args) {
        new Sample04BJAreaField();

    }
}
