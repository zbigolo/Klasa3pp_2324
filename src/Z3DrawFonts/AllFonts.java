package Z3DrawFonts;

import java.awt.*;

public class AllFonts {

    public static void main(String[] args) {

        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Font[] fonts = ge.getAllFonts();

        for (Font font : fonts) {
            System.out.println(font.getFontName() + " : " + font.getFamily());
        }
    }

}
