package com.mycompany.reto7;

public class SinAsfaltar extends TramoGenerico {
    private final double ESPESOR;
    private final double ANCHO= 8;
    private final String TIPODEMATERIAL;

    public SinAsfaltar(double coordenadaXinicial, double coordenadaYinicial, double coordenadaXfinal, double coordenadaYfinal,double ESPESOR, String TIPODEMATERIAL) throws EspesorMenorQueCeroException {
        super(coordenadaXinicial, coordenadaYinicial, coordenadaXfinal, coordenadaYfinal);
              if (ESPESOR <= 0) {
            throw new EspesorMenorQueCeroException();
        } else {
            this.ESPESOR = ESPESOR;
        }
        
             if ("piedra".equals(TIPODEMATERIAL) ||"arena".equals(TIPODEMATERIAL) ||"balastro".equals(TIPODEMATERIAL) ){
            this.TIPODEMATERIAL = TIPODEMATERIAL;
        } else{
            this.TIPODEMATERIAL ="no Especificado o invalido";
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
    
    public String obtenerMaterial(){
        return this.TIPODEMATERIAL;
    }
    
    public double obtenerEspeso(){
        return this.ESPESOR;
    }

}
