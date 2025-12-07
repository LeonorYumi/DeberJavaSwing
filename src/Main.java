import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Crear ventana
        JFrame frame = new JFrame("Operaciones Matemáticas");
        // Cargar el formulario Swing
        frame.setContentPane(new OperacionesMatematicas().panelPrincipal);
        // Configuración estándar
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();                      // Ajusta el tamaño automático según el formulario
        frame.setLocationRelativeTo(null); // Centra la ventana en la pantalla
        frame.setVisible(true);            // Muestra la ventana
    }
}