package Z5Managers;

import javax.swing.*;
import java.awt.*;

public class ManagerGridBagLayout {
    public JPanel createContentPane(){
        GridBagLayout layout = new GridBagLayout();

        JPanel mypanel = new JPanel(layout);

        GridBagConstraints gbc =
               new GridBagConstraints( 0, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets( 4, 8, 6, 10 ), 0, 0 );
        mypanel.add( new JButton( "Start"), gbc );

     //   gbc = new GridBagConstraints( 1, 0, 1, 1, 1.0, 0.0,
     //        GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
    //           new Insets( 4, 8, 6, 10 ), 0, 0 );
       gbc.gridx = 1;
       gbc.gridy = 0;
       mypanel.add( new JButton( "Naprzód" ), gbc );

    //     gbc = new GridBagConstraints( 2, 0, 1, 1, 0.0, 0.0,
   //             GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
  //             new Insets( 4, 8, 6, 10 ), 0, 0 );
         gbc.gridx = 0;
         gbc.gridy = 1;
        mypanel.add( new JButton( "Wstecz" ), gbc );
/*
        gbc = new GridBagConstraints( 0, 1, 3, 1, 0.0, 0.0,
               GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets( 4, 8, 6, 10 ), 0, 25 );
        mypanel.add( new JButton( "Zwiększ prędkość odtwarzania" ), gbc );

       gbc = new GridBagConstraints( 1, 2, 2, 1, 0.0, 1.0,
              GridBagConstraints.PAGE_END, GridBagConstraints.HORIZONTAL,
              new Insets( 4, 8, 6, 10 ), 0, 0);
       mypanel.add( new JButton( "Stop"), gbc );

*/
        return mypanel;
    }
    public ManagerGridBagLayout() {
        JFrame myWindow = new JFrame("Manager GirdBoxLayout");
        myWindow.setContentPane(createContentPane());
        myWindow.setSize(800, 400);
        myWindow.setLocationRelativeTo(null);
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myWindow.setVisible(true);
    }

    public static void main (String[] args) {
        new ManagerGridBagLayout();
    }
}

