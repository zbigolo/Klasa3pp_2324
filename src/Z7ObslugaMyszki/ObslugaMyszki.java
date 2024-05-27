package Z7ObslugaMyszki;



import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.*;


public class ObslugaMyszki extends JFrame {

    static int klik = 0;

    MouseListener myMouseListner = new MouseListener() {
        @Override
        public void mouseClicked (MouseEvent e) {

           System.out.println(" KLIK w pozycji EKRANU: "+ e.getXOnScreen()+ ", " +
                e.getYOnScreen());
            System.out.println(" KLIK w pozycji Aplikacji: "+ e.getX()+ ", " +
                    e.getY());

            switch(e.getButton()){
                case MouseEvent.BUTTON1 -> System.out.println("Wciśnięto LEWY KLAWISZ");
                case MouseEvent.BUTTON2 -> System.out.println("Wciśnięto SCROLL");
                case MouseEvent.BUTTON3 -> System.out.println("Wciśnięto PRAWY KLAWISZ");
            }
            klik += e.getClickCount();
            System.out.println("Licznik kliknięć " + klik);
            System.out.println("Polożenie myszy na ekranie: " + e.getLocationOnScreen());
        }

        @Override
        public void mousePressed (MouseEvent e) {
            System.out.println("Klawisz myszy wciśnięty");
        }

        @Override
        public void mouseReleased (MouseEvent e) {
            System.out.println("Klawisz myszy zwolniony");
        }

        @Override
        public void mouseEntered (MouseEvent e) {
            System.out.println("KURSOR w obrebie okna aplikacji");
        }

        @Override
        public void mouseExited (MouseEvent e) {
            System.out.println("KURSOR poza  oknem aplikacji");

        }
    };

    MouseAdapter mouseAdapter = new MouseAdapter(){
        @Override
        public void mouseClicked(MouseEvent e) {
            super.mouseClicked(e);
        }
    };

    MouseMotionListener mouseMotionListener = new MouseMotionListener() {
        @Override
        public void mouseDragged(MouseEvent e) {

        }

        @Override
        public void mouseMoved(MouseEvent e) {

        }
    };

 //   MouseInputListener mouseInputListener = new MouseInputListener() {}

    MouseWheelListener mouseWheelListener = new MouseWheelListener() {
        public void mouseWheelMoved(MouseWheelEvent e) {

            if(e.getWheelRotation() == -1) System.out.println("Up / Forward Rotation");
                else System.out.println("Down / Back Rotation");


            System.out.println("param: " + e.paramString());

        }



    };

    public ObslugaMyszki () {
        JFrame myWindow = new JFrame("Obsługa Myszy");
        myWindow.setSize(600, 300);
        myWindow.setLayout(null);
        myWindow.setResizable(false);
        myWindow.setLocationRelativeTo(null);
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myWindow.addMouseListener(myMouseListner);
        myWindow.addMouseWheelListener(mouseWheelListener);
        myWindow.setVisible(true);
    }

    public static void main (String[] args) {
            new ObslugaMyszki();
    }
}
