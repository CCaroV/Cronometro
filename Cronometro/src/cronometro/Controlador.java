package cronometro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author ccv
 */
public class Controlador implements ActionListener{
    Vista v;
    Modelo m;

    public Controlador(Vista v, Modelo m) {
        this.v = v;
        this.m = m;
    }

    @Override
    public void actionPerformed(ActionEvent e1) {
        if(e1.getActionCommand().equals("Iniciar")) {
            v.lbTiempo.setText(m.iniciar());
            System.out.println(m.iniciar());
        }
    }

    
    
}
