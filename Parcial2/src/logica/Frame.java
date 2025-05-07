package logica;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Frame extends JFrame implements ActionListener {

    private JLabel lResultado;
    private JTextField lBase;
    private JTextField lExponente;
    private JButton bCalcular;

    public Frame() {
        this.setTitle("Calculadora");
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20));
        JLabel lBaseLabel = new JLabel("Base:");
        JLabel lExponenteLabel = new JLabel("Exponente:");
        this.lResultado = new JLabel("Resultado: ");
        this.lBase = new JTextField(10);
        this.lExponente = new JTextField(10);
        this.bCalcular = new JButton("Calcular");
        this.bCalcular.addActionListener(this);
        panel.add(lBaseLabel);
        panel.add(this.lBase);
        panel.add(lExponenteLabel);
        panel.add(this.lExponente);
        panel.add(this.bCalcular);
        panel.add(this.lResultado);
        this.add(panel);
        this.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.bCalcular) {
            try {
                int base = Integer.parseInt(this.lBase.getText());
                int exponente = Integer.parseInt(this.lExponente.getText());
                int resultado = Parcial.potencia(base, exponente);
                this.lResultado.setText("Resultado: " + resultado);
            } catch (ArithmeticException ex) {
                JOptionPane.showMessageDialog(this,ex.getMessage());
            }
        }
    }
    
    
    public static void main(String[] args) {
        new Frame();
    }
}    
   