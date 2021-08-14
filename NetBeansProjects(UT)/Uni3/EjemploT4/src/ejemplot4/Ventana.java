package ejemplot4;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana extends JFrame {
    JPanel panel;
    JTextField txtCampo;
    JButton boton1;
    JButton boton2;
    
    public Ventana(){
        confPanel();
        getContentPane().add(panel);
        setSize(500,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Crear manejador de eventos
        boton1.addActionListener(new ActionListener(){
            public void  actionPerformed(ActionEvent e){
                txtCampo.setText("Se presionó el botón 1");
            }
        });
        
        boton2.addActionListener(new ActionListener(){
            public void  actionPerformed(ActionEvent e){
                txtCampo.setText("Se presionó el botón 2");
            }
        });
        
    }
    
    void confPanel(){
        panel = new JPanel();
        
        panel.setLayout(new FlowLayout());
        panel.add(txtCampo = new JTextField(20));
        panel.add(boton1 = new JButton("Boton1"));
        panel.add(boton2 = new JButton("Boton2"));
    }
}

