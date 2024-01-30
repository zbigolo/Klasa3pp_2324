package Z4ElementsGUI;

import javax.swing.*;

public class Sample10OknoDialogoweZKomunikatami {

    public static void main (String[] args) {
        
        final String[] komunikaty = {"Message Dialog", "Confirm Dialog",
                                     "Option Dialog", "Input Dialog"};

        final String[] typOkna = {" - ERROR_MESSAGE"," - INFORMATION_MESSAGE",
                                  " - WARNING_MESSAGE", " - QUESTION_MESSAGE",
                                  " - PLAIN_MESSAGE"};
        final String tytul = "Okno dialogowe z komunikatem";

        // showMessageDialog
        JOptionPane.showMessageDialog(null,
                komunikaty[0] + typOkna[0],
                         tytul,
                         JOptionPane.ERROR_MESSAGE);

        // showCofirmDialog
        int wyborConfirmDialog = JOptionPane.showConfirmDialog(null,
                        komunikaty[1] + typOkna[1],
                                 tytul,
                                 JOptionPane.YES_NO_OPTION,
                                 JOptionPane.INFORMATION_MESSAGE);

        switch(wyborConfirmDialog){
            case JOptionPane.YES_OPTION -> System.out.println(" Wybrales TAK ");
            case JOptionPane.NO_OPTION -> System.out.println(" Wybrales NIE ");
        }


        // showOptionDialog
        final String[] myButton = {"Ok", "PRAWDOPODOBNIE","Cancel"};
        int wyborOptionDialog = JOptionPane.showOptionDialog(null,
                                                komunikaty[2] + typOkna[2],
                                                 tytul,
                                                 JOptionPane.YES_NO_CANCEL_OPTION,
                                                 JOptionPane.WARNING_MESSAGE, null,
                                                 myButton, myButton[1]);
        switch(wyborOptionDialog){
            case JOptionPane.YES_OPTION -> System.out.println(" Wybrales Ok ");
            case JOptionPane.NO_OPTION -> System.out.println(" Wybrales PRAWDOPODOBNIE ");
            case JOptionPane.CANCEL_OPTION -> System.out.println("Wybrales Cancel");
        }
        // showInputdialog
        String liczba;
        liczba = JOptionPane.showInputDialog(null,
                                    komunikaty[3] + typOkna[3],
                                     tytul,
                                     JOptionPane.QUESTION_MESSAGE);
       int myliczba = Integer.parseInt(liczba);

        System.out.println(myliczba);
    }
}
