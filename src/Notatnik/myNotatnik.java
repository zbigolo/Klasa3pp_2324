package Notatnik;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.*;

public class myNotatnik extends Component implements ActionListener {

    private final String tytul = "Notatnik";
    private String myFile = "";
    private boolean myfile = false;
    private JTextArea edytor;
    private JMenuBar pasekMenu;
    private JScrollPane scroll;


    JMenu plik, edycja, format, widok, pomoc;
    JMenu settings;
    JMenuItem newColorFont, newSizeFont, newNameFont, newStyleFont;
    JMenuItem nowy, newwindow, open, save, saveas, print, exit;
    JMenuItem cofnij, wytnij, kopiuj, wklej, usun;
    JMenuItem wiersze, czcionka;
    JMenuItem infoplik, help, informacje;
    String nameFont = "Aria";
    int sizeFont = 24;

    Font fonts (String nameFont, int sizeFont) {
        return new Font(nameFont, Font.PLAIN, sizeFont);
    }

    JPanel createContentPane () {
        JPanel myPanel = new JPanel();

        pasekMenu = menuapki();
        pasekMenu.setBackground(Color.yellow);

        edytor = new JTextArea();
        edytor.setFont(new Font(nameFont, Font.PLAIN, sizeFont));
        edytor.setForeground(Color.black);

        scroll = new JScrollPane(edytor);
        scroll.setSize(800, 600);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        myPanel.setBackground(Color.black);
        myPanel.add(scroll);

        return myPanel;
    }


    public myNotatnik () {

        JFrame frame = new JFrame(tytul);
        frame.setContentPane(createContentPane());
        frame.setSize(800, 600);
        frame.setLayout(null);
        // frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setJMenuBar(pasekMenu);
    }

    public JMenuBar menuapki () {
        JMenuBar mymenu = new JMenuBar();

        plik = new JMenu("Plik");
        plik.setMnemonic(KeyEvent.VK_P);
        edycja = new JMenu("Edycja");
        format = new JMenu("Format");
        widok = new JMenu("Widok");
        pomoc = new JMenu("Help");
        pomoc.setMnemonic(KeyEvent.VK_H);

        nowy = new JMenuItem("Nowy");
        nowy.setAccelerator(KeyStroke.getKeyStroke('N',
                KeyEvent.CTRL_DOWN_MASK));
        plik.add(nowy);
        newwindow = new JMenuItem("Nowe Okno");
        plik.add(newwindow);

        open = new JMenuItem("Otwórz");
        open.addActionListener(this);
        plik.add(open);
        save = new JMenuItem("Zapisz");
        save.setAccelerator(KeyStroke.getKeyStroke('Z', KeyEvent.CTRL_DOWN_MASK));
        save.addActionListener(this);
        plik.add(save);
        saveas = new JMenuItem("Zapisz jako");
        plik.add(saveas);
        plik.addSeparator();
        settings = new JMenu("Ustawienia");
        newColorFont = new JMenuItem("Kolor Czcionki");
        newColorFont.addActionListener(this);
        settings.add(newColorFont);
        newSizeFont = new JMenuItem("Rozmiar Czcionki");
        newSizeFont.addActionListener(this);
        settings.add(newSizeFont);
        newNameFont = new JMenuItem("Nazwa Czcionki");
        newNameFont.addActionListener(this);
        settings.add(newNameFont);
        plik.add(settings);
        print = new JMenuItem("Drukuj");
        plik.add(print);
        plik.addSeparator();
        exit = new JMenuItem("Zakończ");
        plik.add(exit);

        wiersze = new JMenuItem("Zawijanie wierszy");
        wiersze.addActionListener(this);
        format.add(wiersze);
        czcionka = new JMenuItem("Czcionka");
        czcionka.addActionListener(this);
        format.add(czcionka);

        help = new JMenuItem("Wyświetl Pomoc");
        help.addActionListener(this);
        pomoc.add(help);
        infoplik = new JMenuItem("Info Plik");
        infoplik.addActionListener(this);
        pomoc.add(infoplik);

        mymenu.add(plik);
        mymenu.add(edycja);
        mymenu.add(format);
        mymenu.add(widok);
        mymenu.add(pomoc);
        return mymenu;
    }

    @Override
    public void actionPerformed (ActionEvent evt) {
        if (evt.getSource() == print) {
        }

        switch (evt.getActionCommand()) {
            case "Otwórz":
                JFileChooser wczytajplik = new JFileChooser();
                wczytajplik.setDialogTitle("Wybierz plik do odczytu");
                wczytajplik.addChoosableFileFilter(new FileNameExtensionFilter("Text File", "txt", "text"));


                BufferedReader odczyt = null;
                String textofread = "";
                int i = wczytajplik.showOpenDialog(this);
                if (i == JFileChooser.APPROVE_OPTION) {
                    File fileread = wczytajplik.getSelectedFile();
                    String filepathread = fileread.getPath();
                    try {
                        odczyt = new BufferedReader(new FileReader(filepathread));

                        String linia = "";
                        while ((linia = odczyt.readLine()) != null) {
                            textofread += linia + "\n";
                        }
                        edytor.setText(textofread);
                        myFile = filepathread;
                        myfile = true;
                        odczyt.close();

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                break;

            case "Zapisz":
                JFileChooser zapiszplik = new JFileChooser();
                zapiszplik.setDialogTitle("Wybierz plik do zapisu");
                FileNameExtensionFilter filterzapisu = new FileNameExtensionFilter("Text Files", "txt", "text");
                zapiszplik.setFileFilter(filterzapisu);
                FileWriter zapis = null;
                String textofsave = "";
                int i1 = zapiszplik.showSaveDialog(this);
                if (i1 == JFileChooser.APPROVE_OPTION) {
                    File filesave = zapiszplik.getSelectedFile();
                    String filepathwrite = "";
                    try {
                        zapis = new FileWriter(filesave);
                        textofsave = edytor.getText();
                        System.out.println(edytor.getText());
                        zapis.write(textofsave);
                        zapis.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                break;
            case "Kolor Czcionki":
                Color c = JColorChooser.showDialog(this, "Wybór czcionki", Color.CYAN);
                edytor.setForeground(c);

                //pasekMenu.setBackground(tlo);
                break;
            case "Rozmiar Czcionki":
                Object[] rozmiar = {9, 10, 12, 14, 16, 18, 20, 22, 24, 26, 30, 32, 34, 36, 38, 40};
                int rozmiarfont = (int) JOptionPane.showInputDialog(
                        null,
                        "Wybierz rozmiar czcionki",
                        "Rozmiar czcionki edytora",
                        JOptionPane.PLAIN_MESSAGE,
                        null,
                        rozmiar,
                        12);
                sizeFont = rozmiarfont;
                edytor.setFont(new Font(nameFont, Font.PLAIN, rozmiarfont));
                break;
            case "Nazwa Czcionki":
                Toolkit narzedzia = Toolkit.getDefaultToolkit();
                Object[] arrayfont = narzedzia.getFontList();
                String namefont = (String) JOptionPane.showInputDialog(
                        null,
                        "Wybierz rozmiar czcionki",
                        "Rozmiar czcionki edytora",
                        JOptionPane.PLAIN_MESSAGE,
                        null,
                        arrayfont,
                        "Arial");
                nameFont = namefont;
                edytor.setFont(new Font(nameFont, Font.PLAIN, sizeFont));

                break;
            case "Zakończ":
                System.exit(0);
                break;

            case "Info Plik":
                if (myfile) {
                    File plik = new File(myFile);
                    String komunikat = "Nazwa: " + plik.getName() +
                            "PATH: " + plik.getPath();

                    JOptionPane.showMessageDialog(null,
                            komunikat,
                            "Info Plik",
                            JOptionPane.INFORMATION_MESSAGE);
                } else
                    JOptionPane.showMessageDialog(null,
                            "BRAK otwartego pliku",
                            "Info Plik",
                            JOptionPane.ERROR_MESSAGE);
                break;
            default:
                JOptionPane.showMessageDialog(null,
                        "Opcja w trakcie realizacji",
                        "Brak opcji",
                        JOptionPane.ERROR_MESSAGE);
        }
        edytor.repaint();
    }

    public static void main (String[] args) {
        new myNotatnik();
    }

}
