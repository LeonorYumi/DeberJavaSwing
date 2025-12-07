import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Crear ventana
        JFrame frame = new JFrame("Operaciones Matemáticas");
        // Cargar el formulario Swing
        frame.setContentPane(new OperacionesMatematicas().panelPrincipal);
        // Configuración estándar
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();                      
        frame.setLocationRelativeTo(null); 
        frame.setVisible(true);            
    }
}