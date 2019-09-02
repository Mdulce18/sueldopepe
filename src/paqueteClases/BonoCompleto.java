package paqueteClases;

public class BonoCompleto implements Bono {

    @Override
    public double calculoBono(int cantidadFaltas) {
        double bonoPlus;
        if (cantidadFaltas == 0) {
            bonoPlus = 100;
        } else if (cantidadFaltas == 1) {
            bonoPlus = 50;
        } else {
            bonoPlus = 0;
        }

        return bonoPlus;
    }
}
