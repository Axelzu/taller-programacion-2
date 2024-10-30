
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class BalanceoAppForm extends JFrame {

    private JTextField campoEntradaTextField;  // Campo para la entrada de texto
    private JLabel resultadoLabel;               // JLabel para mostrar el resultado
    private JButton botonVerificar;              // Botón ver si es o no es balanceado
    private BalanceoController controller;       // Controlador para verificar balanceo

    // Constructor
    public BalanceoAppForm() {
        controller = new BalanceoController();
        setTitle("Verificador de Balanceo");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        campoEntradaTextField = new JTextField(20); // Inicializa el campo de entrada
        add(new JLabel("Expresión:")); // Añade etiqueta
        add(campoEntradaTextField); // Añade el campo de entrada

        botonVerificar = new JButton("Verificar"); // Inicializa el botón
        add(botonVerificar); // Añade el botón

        resultadoLabel = new JLabel(""); // Inicializa el JLabel para el resultado
        add(resultadoLabel); // Añade el JLabel para resultados

        // Configuración del botón de verificación
        botonVerificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verificarExpresion(); // Llama a la función que verifica la expresión
            }
        });
    }

    private void verificarExpresion() {
        String expresion = campoEntradaTextField.getText(); // Obtiene la expresión ingresada
        String resultado = controller.verificarBalanceo(expresion); // Llama al controlador
        resultadoLabel.setText(resultado); // Muestra el resultado en el JLabel
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new BalanceoAppForm().setVisible(true));
    }
}
