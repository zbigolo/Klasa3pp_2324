package Z4ElementsGUI;


import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Sample_05_JCheckBox {

    JPanel os;
    JCheckBox windows,linux,mac,dos;
    JLabel lwindows,llinux,lmac,ldos;
    JLabel pwindows;
    JCheckBox status;

    public JPanel myContentPane(){
        JPanel mypanel = new JPanel(null);
        mypanel.setBackground(Color.yellow);


        os = new JPanel(null);
        os.setBounds(10,20,160,180);
        os.setBorder(new TitledBorder(new LineBorder(Color.green, 5),
                "Wybierz ulubiony OS:") );

        windows = new JCheckBox("OS Windows");
        windows.setBounds(20,50, 100,20);
        lwindows = new JLabel(new ImageIcon(".\\grafika\\os\\win.png"));
        lwindows.setBounds(200,20,64,64);
        lwindows.setVisible(false);
        pwindows = new JLabel("Windows");
        pwindows.setBounds(200,85,64,20);
        pwindows.setHorizontalAlignment(SwingConstants.CENTER);
        pwindows.setVisible(false);

        linux = new JCheckBox("OS Linux");
        linux.setBounds(20,80,100,20);
        llinux = new JLabel(new ImageIcon(".\\grafika\\os\\linux.png"));
        llinux.setBounds(270,20,64,64);
        llinux.setVisible(false);

        mac = new JCheckBox("OS Mac");
        mac.setBounds(20,110,100,20);
        lmac = new JLabel(new ImageIcon(".\\grafika\\os\\mac.png"));
        lmac.setBounds(200,120,64,64);
        lmac.setVisible(false);

        dos = new JCheckBox("OS DOS");
        dos.setBounds(20,140,100,20);
        ldos = new JLabel(new ImageIcon(".\\grafika\\os\\dos.png"));
        ldos.setBounds(270,120,64,64);
        ldos.setVisible(false);

        ItemListener checkbox = new ItemListener() {
            @Override
            public void itemStateChanged (ItemEvent e) {
                if (e.getItem() == windows){
                    switch(e.getStateChange()){
                        case ItemEvent.SELECTED :
                            lwindows.setVisible(true);
                            pwindows.setVisible(true);
                            break;
                        case ItemEvent.DESELECTED:
                            lwindows.setVisible(false);
                            pwindows.setVisible(false);

                    }
                }
                if (e.getItem() == linux){
                    switch(e.getStateChange()){
                        case ItemEvent.SELECTED :
                            llinux.setVisible(true);
                            break;
                        case ItemEvent.DESELECTED:
                            llinux.setVisible(false);
                    }
                }
                if (e.getItem() == mac) {
                    switch(e.getStateChange()){
                        case ItemEvent.SELECTED :
                            lmac.setVisible(true);
                            break;
                        case ItemEvent.DESELECTED:
                            lmac.setVisible(false);
                    }
                }
                if (e.getItem() == dos) {
                    switch(e.getStateChange()){
                        case ItemEvent.SELECTED :
                            ldos.setVisible(true);
                            break;
                        case ItemEvent.DESELECTED:
                            ldos.setVisible(false);
                    }
                }
            }

        };

        windows.addItemListener(checkbox);
        linux.addItemListener(checkbox);
        mac.addItemListener(checkbox);
        dos.addItemListener(checkbox);

        windows.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged (ItemEvent e) {

            }
        });

        os.add(windows); os.add(linux); os.add(mac);os.add(dos);
        mypanel.add(os);
        mypanel.add(lwindows); mypanel.add(llinux); mypanel.add(lmac);mypanel.add(ldos);
        mypanel.add(pwindows);
        return mypanel;
    }

    public Sample_05_JCheckBox () {
        JFrame myWindow = new JFrame("Sample JCheckBox");
        myWindow.setContentPane(myContentPane());
        myWindow.setSize(400, 300);
        myWindow.setResizable(false);
        myWindow.setLocationRelativeTo(null);
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myWindow.setVisible(true);
    }

    public static void main (String[] args) {
        new Sample_05_JCheckBox();

    }
}
