package reto3;

public class PesoNegativoException extends Exception {

    public PesoNegativoException() {
        super("PesoNegativoException: Se ingreso un peso negativo");
    }

}
