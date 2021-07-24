package layouts;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public final class VentanaEmpleado extends JFrame{
    
    private JPanel panel;
    
    VentanaEmpleado(){
        setSize(700, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        creaPanel();
        getContentPane().add(panel);
    }
    
    void creaPanel(){
        panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.RIGHT,30,30));
        panel.add(new JLabel("Cédula: "));
        panel.add(new JTextField(15));
        panel.add(new JButton("Click aquí"));
    }
}
