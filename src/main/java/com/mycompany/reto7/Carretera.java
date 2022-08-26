package com.mycompany.reto7;

import java.util.ArrayList;
import java.util.List;

public class Carretera {

    private final List<TramoGenerico> TRAMOS;

    public Carretera() {
        this.TRAMOS = new ArrayList<>();
    }
    
    public void adicionarTramo(TramoGenerico tramo){
        this.TRAMOS.add(tramo);
    }
    
    public double calcularLongitud() {
        double suma = 0;
        for (TramoGenerico tramo : TRAMOS) {
            suma = suma + tramo.calcularLongitud();
        }
        return suma;
    }

    public double calcularArea() {
        double suma = 0;
        for (TramoGenerico tramo : TRAMOS) {
            suma = suma + tramo.calcularArea();
        }
        return suma;
    }

    public double calcularVolumen() {
        double suma = 0;
        for (TramoGenerico tramo : TRAMOS) {
            suma = suma + tramo.calcularVolumen();
        }
        return suma;
    }

    public double calcularVolumenAsfaltado() {
        double suma = 0;
        for (TramoGenerico tramo : TRAMOS) {
            if ("Asfaltado".equals(tramo.getClass().getSimpleName())) {
                suma = suma + tramo.calcularVolumen();
            }
        }
        return suma;
    }

    public double calcularVolumenSinAsfaltar() {
        double suma = 0;
        for (TramoGenerico tramo : TRAMOS) {
            if ("SinAsfaltar".equals(tramo.getClass().getSimpleName())) {
                suma = suma + tramo.calcularVolumen();
            }
        }
        return suma;
    }

    public boolean estaConectadaTodaLaCarretera() {
        boolean resultado = true;
        TramoGenerico tramoAnterior = this.TRAMOS.get(0);
        
        for (int i = 1; i < TRAMOS.size() ; i++ ) {
            TramoGenerico tramo = TRAMOS.get(i);
            if ( tramo.coordenadaXinicial != tramoAnterior.coordenadaXfinal || 
                    tramo.coordenadaYinicial != tramoAnterior.coordenadaYfinal ){
                resultado = false;
            }
            tramoAnterior = tramo;
        }
        return resultado;       
    }

}
