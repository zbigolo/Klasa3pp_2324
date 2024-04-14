package Z6Menu;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Aplikacja implements ActionListener {

    private JMenuBar pasekMenuApplicaction;
    private JMenu appFile, appFonts, appEdycja;
    private JMenu help;

    private JMenuItem nowy, otworz, exit;
    private JMenuItem setColorFont, setSizeFont;
    private JMenuItem pabout;

    public Aplikacja () throws IOException {

        JFrame frame = new JFrame("Przykładowe menu aplikacji");
        frame.setContentPane(createContentPane());
        frame.setSize(800, 600);
        frame.setLayout(null);
        // frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setJMenuBar(pasekMenuApplicaction);
    }

    JPanel createContentPane () throws IOException {
        JPanel myPanel = new JPanel();

        // menu aplication
       pasekMenuApplicaction = new JMenuBar();
       pasekMenuApplicaction.setBorder(BorderFactory.createLineBorder(Color.red, 3));
       pasekMenuApplicaction.setBackground(Color.yellow);


      //---------------------- --- FILE --------------------------------
        appFile = new JMenu("File");

        nowy = new JMenuItem("Nowy");
        nowy.setArmed(true);
        nowy.setAccelerator(KeyStroke.getKeyStroke('N', KeyEvent.CTRL_DOWN_MASK));
        nowy.addActionListener(this);

        otworz = new JMenuItem("Otworz");
        otworz.setEnabled(false);

        exit = new JMenuItem("Exit");
        exit.setBackground(Color.white);

        appFile.add(nowy);
        appFile.add(otworz);
        appFile.addSeparator();
        appFile.add(exit);

        //---------------------- --- Fonts --------------------------------
        appFonts = new JMenu("Fonts");
        appFonts.setMnemonic(KeyEvent.VK_F);

        setColorFont = new JMenuItem("Color Font", KeyEvent.VK_C);
        setColorFont.addActionListener(this);

        setSizeFont = new JMenuItem("Size Font",KeyEvent.VK_S);
        setSizeFont.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, ActionEvent.CTRL_MASK ) );
        setSizeFont.addActionListener(this);

        appFonts.add(setColorFont);
        appFonts.add(setSizeFont);

        //------------------------------- Edycja ---------------------------------

        appEdycja = new JMenu("Edycja");

        JCheckBoxMenuItem pzOrtografia = new JCheckBoxMenuItem( "Korekta ortograficzna" );
        JCheckBoxMenuItem pzStyl = new JCheckBoxMenuItem( "Korekta stylistyczna" );

        JRadioButtonMenuItem pzDopisywanie = new JRadioButtonMenuItem( "Tryb dopisywania" );
        pzDopisywanie.setSelected(true);
        JRadioButtonMenuItem pzNadpisywanie = new JRadioButtonMenuItem( "Tryb zastępowania" );

        ButtonGroup tryb = new ButtonGroup();
        tryb.add( pzDopisywanie );
        tryb.add( pzNadpisywanie );

        appEdycja.add(pzOrtografia);
        appEdycja.add(pzStyl);

        appEdycja.addSeparator();

        appEdycja.add(pzDopisywanie);
        appEdycja.add(pzNadpisywanie);


        //---------------------- --- HELP --------------------------------
        help = new JMenu("Help");

        pabout = new JMenuItem("About");

        BufferedImage bufferedImage = ImageIO.read(new File("grafika/about.png"));
        Image image = bufferedImage.getScaledInstance(20, 20, Image.SCALE_DEFAULT);

        pabout.setIcon( new ImageIcon( image) );


        help.add(pabout);


        pasekMenuApplicaction.add(appFile);
        pasekMenuApplicaction.add(appFonts);
        pasekMenuApplicaction.add(appEdycja);
        pasekMenuApplicaction.add(help);

        return myPanel;
    }

    public static void main(String[] args) throws IOException {
        new Aplikacja();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        // wairian I

        if (e.getSource() == nowy) {
            JOptionPane.showMessageDialog(null,
                    "Nowa testowa funkcja",
                    "Opcja File - Nowy",
                    JOptionPane.INFORMATION_MESSAGE);
        }


        // wariant II
        switch (e.getActionCommand()) {
            case "Size Font" ->
                                            JOptionPane.showMessageDialog(null,
                                                                                                "Do napisania funkcja: SIZE FONT",
                                                                                                "Size Font",
                                                                                                 JOptionPane.INFORMATION_MESSAGE);
            default ->  JOptionPane.showMessageDialog(null,
                                                                                "Brak implementaji tej funkcji",
                                                                                "Size Font",
                                                                                JOptionPane.ERROR_MESSAGE);
        }

    }
}
