package com.mycompany.reto7;

public abstract class TramoGenerico {

    protected double coordenadaXinicial;
    protected double coordenadaYinicial;
    protected double coordenadaXfinal;
    protected double coordenadaYfinal;

    public TramoGenerico(double coordenadaXinicial, double coordenadaYinicial, double coordenadaXfinal, double coordenadaYfinal) {
        this.coordenadaXinicial = coordenadaXinicial;
        this.coordenadaYinicial = coordenadaYinicial;
        this.coordenadaXfinal = coordenadaXfinal;
        this.coordenadaYfinal = coordenadaYfinal;
    }

    public abstract double calcularLongitud();

    public abstract double calcularArea();

    public abstract double calcularVolumen();

}
