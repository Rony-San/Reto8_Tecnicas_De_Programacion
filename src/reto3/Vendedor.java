package reto3;

import java.time.LocalDate;

public class Vendedor {

    private int anioIngreso;
    private String documento;
    private String nombre;
    private String appelidos;
    private int edad;
    private double ventas;
    private String descripcion;
    private final int EDADMAYORDEEDAD = 18;
    private final double VENTASMINIMAS =500000000 ;
    private final double VENTASMEDIAS = 2000000000;
    public static final int anioActual = 2022;

    public Vendedor(int anioIngreso, String documento, String nombre, String appelidos, int edad, double ventas, String descripcion) throws VendedorMenorDeEdadException, AnioDeIngresoException {
        // Excepcion de anio de ingreso
        if (anioIngreso > anioActual) {
            this.anioIngreso = anioIngreso;
        } else {
            throw new AnioDeIngresoException();
        }
        this.documento = documento;
        this.nombre = nombre;
        this.appelidos = appelidos;
        // Excepcion de edad del vendedor
        if (edad >= EDADMAYORDEEDAD) {
            this.edad = edad;
        } else {
            throw new VendedorMenorDeEdadException();
        }
        this.ventas = ventas;
        this.descripcion = descripcion;
    }

    public String resultadoVentas() {

        double ventas = getVentas();

        if (ventas == 0) {
            return " novato ";
        } else if (ventas > 0 && ventas < VENTASMINIMAS) {
            return "Principiante";
        } else if (ventas >= VENTASMINIMAS && ventas < VENTASMEDIAS) {
            return "Intermedio";

        } else if (ventas >= VENTASMEDIAS) {
            return " Avanzado";
        }
        return "nulo";
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) throws AnioDeIngresoException {
        if (anioIngreso > anioActual) {
            this.anioIngreso = anioIngreso;
        } else {
            throw new AnioDeIngresoException();
        }
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAppelidos() {
        return appelidos;
    }

    public void setAppelidos(String appelidos) {
        this.appelidos = appelidos;
    }

    public int getEdad() {
        return edad;
    }
    // Excepcion de anio de ingresode edad del vendedor
       
    public void setEdad(int edad) throws VendedorMenorDeEdadException {
        if (edad >= EDADMAYORDEEDAD) {
            this.edad = edad;
        } else {
            throw new VendedorMenorDeEdadException();
        }
    }

    public double getVentas() {
        return ventas;
    }

    public void setVentas(double ventas) {
        this.ventas = ventas;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
