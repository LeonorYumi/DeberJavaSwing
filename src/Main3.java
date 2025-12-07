import javax.swing.*;

public class Main3 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Formulario de Intereses");
        frame.setContentPane(new Intereses().panelIntereses);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null); // Centra la ventana
        frame.setVisible(true);
    }
}