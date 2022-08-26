package com.mycompany.reto7;

public class Asfaltado extends TramoGenerico {

    private final double ESPESOR = 0.25;
    private final double ANCHO = 8;
    private  String proveedor;
    private double velocidadMaxima;

    public Asfaltado(double coordenadaXinicial, double coordenadaYinicial, double coordenadaXfinal, double coordenadaYfinal) {
        super(coordenadaXinicial, coordenadaYinicial, coordenadaXfinal, coordenadaYfinal);
    }

    public Asfaltado(double coordenadaXinicial, double coordenadaYinicial,
            double coordenadaXfinal, double coordenadaYfinal, String proveedor,
            double velocidadMaxima) throws VelocidadMenorQueCeroException {
        
        super(coordenadaXinicial, coordenadaYinicial, coordenadaXfinal, coordenadaYfinal);
        this.proveedor = proveedor;
        if (velocidadMaxima <= 0) {
            throw new VelocidadMenorQueCeroException();
        } else {
            this.velocidadMaxima = velocidadMaxima;
        }
    }

    @Override
    public double calcularLongitud() {
        double x = this.coordenadaXfinal;
        double y = this.coordenadaYinicial;
        double xf = this.coordenadaXfinal;
        double yf = this.coordenadaYfinal;
        double longitud;
        longitud = Math.sqrt(Math.pow((xf - x), 2) + Math.pow((yf - y), 2));
        return longitud;

    }

    @Override
    public double calcularArea() {
        double area;
        area = calcularLongitud() * this.ANCHO;
        return area;
    }

    @Override
    public double calcularVolumen() {
        double volumen;
        volumen = calcularLongitud() * this.ANCHO * this.ESPESOR;
        return volumen;
    }

    public String obtenerProveedor() {
        return this.proveedor;
    }

    public double obtenerVelocidadMaxima() {
        return this.velocidadMaxima;
    }

    public boolean adelantarProhibicion() {
        boolean adelantamiento = false;
        if (this.velocidadMaxima > 30) {
            adelantamiento = true;
        }
        return adelantamiento;
    }

}
