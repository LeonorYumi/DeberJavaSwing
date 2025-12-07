import javax.swing.*;

public class EncuestaPreguntas {
    private JRadioButton siRadioButton;
    private JRadioButton avecesRadioButton;
    private JRadioButton noRadioButton1;
    private JRadioButton siRadioButton1;
    private JRadioButton aVecesRadioButton;
    private JRadioButton noRadioButton;
    private JRadioButton siRadioButton2;
    private JRadioButton aVecesRadioButton1;
    private JRadioButton noRadioButton2;
    private JButton enviarRespuestaButton;
    private JPanel PanelEncuesta;

    public EncuestaPreguntas() {
        // primera pregunta
        ButtonGroup grupo1 = new ButtonGroup();
        grupo1.add(siRadioButton);
        grupo1.add(avecesRadioButton);
        grupo1.add(noRadioButton1);
        // segunda pregunta
        ButtonGroup grupo2 = new ButtonGroup();
        grupo2.add(siRadioButton1);
        grupo2.add(aVecesRadioButton);
        grupo2.add(noRadioButton);
        // tercera pregunta
        ButtonGroup grupo3 = new ButtonGroup();
        grupo3.add(siRadioButton2);
        grupo3.add(aVecesRadioButton1);
        grupo3.add(noRadioButton2);
        //Boton
        enviarRespuestaButton.addActionListener(e -> mostrarResultados());
    }
    private void mostrarResultados() {

        String p1 = obtenerRespuesta(siRadioButton, avecesRadioButton, noRadioButton1);
        String p2 = obtenerRespuesta(siRadioButton1, aVecesRadioButton, noRadioButton);
        String p3 = obtenerRespuesta(siRadioButton2, aVecesRadioButton1, noRadioButton2);

        String mensaje = "RESULTADOS DE LA ENCUESTA\n\n"
                + "1. ¿Quieres seguir una maestría?: " + p1 + "\n"
                + "2. ¿Te gusta estudiar programación?: " + p2 + "\n"
                + "3. ¿Recomendarías tu carrera?: " + p3;
        JOptionPane.showMessageDialog(null, mensaje);
    }
    private String obtenerRespuesta(JRadioButton si, JRadioButton aveces, JRadioButton no) {
        if (si.isSelected()) return "Sí";
        if (aveces.isSelected()) return "A veces";
        if (no.isSelected()) return "No";
        return "Sin respuesta";
    }
    public JPanel getPanel() {
        return PanelEncuesta;
    }
}