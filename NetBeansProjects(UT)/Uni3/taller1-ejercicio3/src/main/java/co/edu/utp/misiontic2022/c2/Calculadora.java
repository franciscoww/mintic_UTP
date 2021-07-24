package co.edu.utp.misiontic2022.c2;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import com.googlecode.wicket.jquery.ui.kendo.splitter.BorderLayout;

// Crear una interfaz gráfica para una calculadora, con los 
// botones de los números del 0 al 9 y las operaciones básicas. 
// (NOTA: Solamente la estructura, no deben funcionar las operaciones).

public class Calculadora extends JFrame{
    JPanel panelBox;

        Calculadora(){
            setSize(500,500);
            setVisible(true);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            creaPanel();
            getContentPane().add(panelBox);
        }

        void creaPanel(){
            panelBox = new JPanel();
            JPanel panelIzquierdo = new JPanel();
            JPanel panelDerecho = new JPanel();
            JPanel panelSuperior = new JPanel();
            JTextArea area = new JTextArea(2, 4);
            JScrollPane scroll = new JScrollPane(area);
            
            //Area de texto
            panelIzquierdo.setLayout(new BoxLayout(panelIzquierdo, BoxLayout.Y_AXIS));
            panelIzquierdo.add(new JButton("9"));
            panelIzquierdo.add(new JButton("6"));
            panelIzquierdo.add(new JButton("3"));
            panelIzquierdo.add(new JButton("0"));

            panelDerecho.setLayout(new BoxLayout(panelDerecho, BoxLayout.Y_AXIS));
            panelDerecho.add(new JButton("+"));
            panelDerecho.add(new JButton("-"));
            panelDerecho.add(new JButton("*"));
            panelDerecho.add(new JButton("/"));
            panelDerecho.add(new JButton("="));
            panelDerecho.add(new JButton("CE"));
            
            // panelBox.setLayout(new BorderLay);
            
        }


    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
    }
}
