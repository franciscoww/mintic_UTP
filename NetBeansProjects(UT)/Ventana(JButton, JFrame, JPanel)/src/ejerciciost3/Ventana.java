package ejerciciost3;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author francisco
 */
public final class Ventana extends JFrame{

    JPanel panel;
    Ventana(){
        setSize(500, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        creaPanel();
        getContentPane().add(panel);
    }
    
    void creaPanel(){
        panel = new JPanel();
        panel.add(new JButton("Boton 1"));
        panel.add(new JButton("Boton 2"));
        panel.add(new JButton("Boton 3"));
    }
    
}
