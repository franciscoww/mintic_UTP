package cuadricula.gridlayout;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public final class VentanaBorderLayout extends JFrame{
    JPanel panel;
    
    VentanaBorderLayout(){
        setSize(300, 200);
        crearPanel();
        getContentPane().add(panel);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    void crearPanel(){
        panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(new JButton(BorderLayout.CENTER));
        panel.add(new JButton(BorderLayout.NORTH));
        panel.add(new JButton(BorderLayout.EAST));
        panel.add(new JButton(BorderLayout.WEST));
        panel.add(new JButton(BorderLayout.SOUTH));
    }
}
