import javax.swing.*;

public class OperacionesMatematicas {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton btnMultiplicarButton;
    private JButton btnSumarButton;
    private JButton btnRestarButton;
    private JButton btnDividirButton;
    protected JPanel panelPrincipal;

    public OperacionesMatematicas() {

        textField3.setEditable(false);

        // Sumar
        btnSumarButton.addActionListener(e -> {
            if (validarNumeros()) {
                double v1 = Double.parseDouble(textField1.getText());
                double v2 = Double.parseDouble(textField2.getText());
                textField3.setText(String.valueOf(v1 + v2));
            }
        });
        // Restar
        btnRestarButton.addActionListener(e -> {
            if (validarNumeros()) {
                double v1 = Double.parseDouble(textField1.getText());
                double v2 = Double.parseDouble(textField2.getText());
                textField3.setText(String.valueOf(v1 - v2));
            }
        });
        // Multiplicar
        btnMultiplicarButton.addActionListener(e -> {
            if (validarNumeros()) {
                double v1 = Double.parseDouble(textField1.getText());
                double v2 = Double.parseDouble(textField2.getText());
                textField3.setText(String.valueOf(v1 * v2));
            }
        });
        // Dividir
        btnDividirButton.addActionListener(e -> {
            if (validarNumeros()) {
                double v1 = Double.parseDouble(textField1.getText());
                double v2 = Double.parseDouble(textField2.getText());

                if (v2 == 0) {
                    JOptionPane.showMessageDialog(null, "No se puede dividir para cero");
                } else {
                    textField3.setText(String.valueOf(v1 / v2));
                }
            }
        });
    }
    private boolean validarNumeros() {
        try {
            Double.parseDouble(textField1.getText());
            Double.parseDouble(textField2.getText());
            return true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingresa solo números");
            return false;
        }
    }
}