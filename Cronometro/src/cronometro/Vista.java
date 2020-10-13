package cronometro;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author ccv
 */
public class Vista extends JFrame{

    JButton btnInicar = new JButton("Iniciar");
    JButton btnDetener = new JButton("Detener");
    JButton btnVuelta = new JButton("Vuelta");
    JButton btnTemporizador = new JButton("Temporizador");
    JLabel lbTiempo = new JLabel("Hola");

    public Vista() throws HeadlessException {
        Container c = getContentPane();
        
        c.setLayout(null);
        c.add(btnInicar);
        c.add(btnDetener);
        c.add(btnVuelta);
        c.add(btnTemporizador);
        c.add(lbTiempo);
        
        lbTiempo.setBounds(15, 15, 190, 40);
        btnInicar.setBounds(15, 70, 70, 30);
        btnDetener.setBounds(100, 70, 70, 30);
        btnVuelta.setBounds(185, 70, 70, 30);
        btnTemporizador.setBounds(270, 70, 70, 30);
        
    }
    
    public void mostrar() {
        setSize(500, 170);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void asignaOyentes(Controlador c) {
        btnInicar.addActionListener(c);
        btnDetener.addActionListener(c);
        btnVuelta.addActionListener(c);
        btnInicar.addActionListener(c);
    }


}
