package Z1FirstWindows;

import javax.swing.*;

public class FrameExample {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                FrameExample example = new FrameExample();
                example.createAndShowGUI();
            }
        });
    }

    void createAndShowGUI() {
        JFrame frame = new JFrame("[=] Hello World [=] My First Window");
        frame.setSize(400, 100);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setContentPane(createContentPane());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public JPanel createContentPane () {
        JPanel myPanel = new JPanel();

        return myPanel;
    }

}
