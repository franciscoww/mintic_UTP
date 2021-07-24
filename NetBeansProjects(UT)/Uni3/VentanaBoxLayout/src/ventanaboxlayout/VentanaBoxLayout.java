package ventanaboxlayout;

import java.awt.BorderLayout;
import javax.swing.*;

public class VentanaBoxLayout extends JFrame{
    JPanel panelBox;
    
    public VentanaBoxLayout (){
        setSize(350, 300);
        setLocation(100,100);
        creaPanel();
        getContentPane().add(panelBox);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void creaPanel(){
        panelBox = new JPanel();
        JPanel panelIzquierdo = new JPanel();
        JPanel panelDerecho = new JPanel();
        JPanel panelSuperior = new JPanel();
        JPanel panelInferior = new JPanel();
        JTextArea textArea = new JTextArea(10, 5);
        JScrollPane scrollPane = new JScrollPane(textArea);
        Icon icono = new ImageIcon("/home/francisco/Descargas/tenor.gif");
        
        //Area de textos
        textArea.append("Este es el area de el texto");
        
        panelIzquierdo.setLayout(new BoxLayout(panelIzquierdo, BoxLayout.Y_AXIS));
        panelIzquierdo.add(new JButton("A1"));
        panelIzquierdo.add(new JButton("A2"));
        panelIzquierdo.add(new JButton("A3"));
        panelIzquierdo.add(new JButton("A4"));
        panelIzquierdo.add(new JButton("A5"));
        panelIzquierdo.add(new JButton("A6"));
        panelIzquierdo.add(new JButton("A7"));
        panelIzquierdo.add(new JButton("A8"));
        
        panelDerecho.setLayout(new BoxLayout(panelDerecho, BoxLayout.Y_AXIS));
        panelDerecho.add(new JButton("A"));
        panelDerecho.add(new JButton("B"));
        panelDerecho.add(new JButton("C"));
        panelDerecho.add(new JButton("D"));
        panelDerecho.add(new JButton("E"));
        panelDerecho.add(new JButton("F"));
        panelDerecho.add(new JButton("G"));
        panelDerecho.add(new JButton("H"));
        
        panelInferior.setLayout(new BoxLayout(panelInferior, BoxLayout.X_AXIS));
        panelInferior.add(new JButton("A"));
        panelInferior.add(new JButton("B"));
        panelInferior.add(new JButton("C"));
        panelInferior.add(new JButton("D"));
        panelInferior.add(new JButton("E"));
        panelInferior.add(new JButton("F"));
        panelInferior.add(new JButton("G"));
        panelInferior.add(new JButton("H"));
        
        //Configuramos el panel principal (panelBox)
        panelBox.setLayout(new BorderLayout());
        panelBox.add(new JButton("Esto es un jemplo de Box Layout"), BorderLayout.NORTH);
        panelBox.add(panelIzquierdo, BorderLayout.WEST);
        panelBox.add(scrollPane, BorderLayout.CENTER);
        panelBox.add(panelDerecho, BorderLayout.EAST);
        panelBox.add(panelInferior, BorderLayout.SOUTH);
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        new VentanaBoxLayout().setVisible(true);
    }
    
}
