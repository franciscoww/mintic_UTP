package cuadricula.gridlayout;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public final class VentanaGridLayout extends JFrame{
    JPanel panel;
    
    VentanaGridLayout(){
        setSize(300, 200);
        crearPanel();
        getContentPane().add(panel);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    void crearPanel(){
        panel = new JPanel();
        panel.setLayout(new GridLayout(3,3));
        panel.add(new JButton("Uno"));
        panel.add(new JButton("Dos"));
        panel.add(new JButton("Tres"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));
    }
}
