package cronometro;

import static java.lang.Thread.sleep;

/**
 *
 * @author ccv
 */
public class Modelo {

    boolean estado = true;
    int milisec = 0;
    int sec = 0;
    int min = 0;
    int hour = 0;
    String tiempoTotal;

    public String iniciar() {
        estado = true;

        for (;;) {
            if (estado) {
                try {
                    sleep(1);
                    if (milisec >= 1000) {
                        milisec = 0;
                        sec++;
                    }
                    if (sec >= 60) {
                        milisec = 0;
                        sec = 0;
                        min++;
                    }
                    if (min >= 0) {
                        milisec = 0;
                        sec = 0;
                        min = 0;
                        hour++;
                    }
                    tiempoTotal = hour + " : " + min + " : " + sec + " : " + milisec;
                } catch (Exception e) {

                }
            } else {
                break;
            }

        }

        return tiempoTotal;

    }

    public boolean parar() {
        estado = false;
        return estado;
    }

    public String borrar() {
        milisec = 0;
        sec = 0;
        min = 0;
        hour = 0;
        tiempoTotal = hour + " : " + min + " : " + sec + " : " + milisec;
        return tiempoTotal;
    }

}
