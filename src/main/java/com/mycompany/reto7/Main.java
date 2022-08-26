package com.mycompany.reto7;

public class Main {

    public static void main(String[] args) throws VelocidadMenorQueCeroException, EspesorMenorQueCeroException {
        TramoGenerico asfaltado1 = null;
        TramoGenerico asfaltado2 = null;

        // Creacion de tramos 
        try {
            asfaltado1 =  new Asfaltado(1, 2, 7, 13, "IndustrialFerroviarias", 50);
            asfaltado2 = new Asfaltado(7, 13, 50, 72, "IndustrialFerroviarias", 80);
        } catch (VelocidadMenorQueCeroException e) {
            System.err.println(e.getMessage());
        }

        TramoGenerico noAsfaltado1 = null;
        try {
            noAsfaltado1 = new SinAsfaltar(50, 72, 12, 2, 1.6, "piedra");
        } catch (EspesorMenorQueCeroException e) {
            System.err.println(e.getMessage());
        }
        

        // Creación de la carretera 
        Carretera carretera = new Carretera();
        carretera.adicionarTramo(asfaltado1);
        carretera.adicionarTramo(asfaltado2);
        carretera.adicionarTramo(noAsfaltado1);

        // Creacion carretera no conectada 
        Carretera carreteraNoConectada = new Carretera();
        carreteraNoConectada.adicionarTramo(asfaltado1);
        carreteraNoConectada.adicionarTramo(noAsfaltado1);
        carreteraNoConectada.adicionarTramo(asfaltado2);

        // Prueba de Alsaltado
        System.out.println("La Longitud del tramo asfaltado es : " + asfaltado1.calcularLongitud() + "m");
        System.out.println("El Area del tramo asfaltado es : " + asfaltado1.calcularArea() + "m2");
        System.out.println("El Volumen del tramo asfaltado es : " + asfaltado1.calcularVolumen() + "m3");
        System.out.println("El proveedor es : " + ((Asfaltado) asfaltado1).obtenerProveedor());
        System.out.println("La velocidad maxima es : " + ((Asfaltado) asfaltado1).obtenerVelocidadMaxima());
        System.out.println("Es posible adelantar? : " + ((Asfaltado) asfaltado1).adelantarProhibicion());

        // Prueba sin Asfaltar 
        System.out.println("\nLa Longitud del tramo asfaltado es : " + ((SinAsfaltar) noAsfaltado1).calcularLongitud() + "m");
        System.out.println("El Area del tramo asfaltado es : " + ((SinAsfaltar) noAsfaltado1).calcularArea() + "m2");
        System.out.println("El Volumen del tramo asfaltado es : " + ((SinAsfaltar) noAsfaltado1).calcularVolumen() + "m3");
        System.out.println("El material es : " + ((SinAsfaltar) noAsfaltado1).obtenerMaterial());
        System.out.println("El espesor es : " + ((SinAsfaltar) noAsfaltado1).obtenerEspeso() + "m");

        // Prueba de la carretera 
        System.out.println("\nLa longitud de la carretera es: " + carretera.calcularLongitud());
        System.out.println("El area de la carretera es: " + carretera.calcularArea());
        System.out.println("El volumen total de la carretera es: " + carretera.calcularVolumen());
        System.out.println("El volumen total Asfaltado de la carretera es: " + carretera.calcularVolumenAsfaltado());
        System.out.println("El volumen total Sin asfaltar de la carretera es: " + carretera.calcularVolumenSinAsfaltar());
        System.out.println("La carretera está conectada: " + carretera.estaConectadaTodaLaCarretera());

        // Pureba carretera no conectada 
        System.out.println("\nLa carretera está conectada (Carretera No Conectada): " + carreteraNoConectada.estaConectadaTodaLaCarretera());
    }

}
