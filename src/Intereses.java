import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Intereses {

    private JCheckBox baseDeDatosCheckBox;
    private JCheckBox programaciónCheckBox;
    private JCheckBox redesCheckBox;
    private JCheckBox diseñoCheckBox;
    private JCheckBox seguridadInformáticaCheckBox;
    private JButton procesarSelecciónButton;
    protected JPanel panelIntereses;

    public Intereses() {
        procesarSelecciónButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String seleccion = "Intereses seleccionados:\n";
                if (programaciónCheckBox.isSelected())
                    seleccion += "- Programación\n";
                if (redesCheckBox.isSelected())
                    seleccion += "- Redes\n";
                if (baseDeDatosCheckBox.isSelected())
                    seleccion += "- Base de Datos\n";
                if (diseñoCheckBox.isSelected())
                    seleccion += "- Diseño\n";
                if (seguridadInformáticaCheckBox.isSelected())
                    seleccion += "- Seguridad Informática\n";
                // Si no se seleccionó nada
                if (seleccion.equals("Intereses seleccionados:\n")) {
                    seleccion = "No seleccionó ningún interés.";
                }
                // Mostrar mensaje
                JOptionPane.showMessageDialog(null, seleccion);
            }
        });
    }
}