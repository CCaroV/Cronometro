/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cronometro;

/**
 *
 * @author ccv
 */
public class Cronometro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Modelo m = new Modelo();
        Vista v = new Vista();
        Controlador c = new Controlador(v, m);
        
        v.asignaOyentes(c);
        v.mostrar();
    }

}
