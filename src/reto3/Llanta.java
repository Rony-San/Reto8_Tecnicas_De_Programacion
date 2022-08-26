/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto3;

/**
 *
 * @author rony.banol
 */
public class Llanta {

    private String marca;
    private String referencia;
    private double peso;

    public Llanta(String marca, String referencia, double peso) throws PesoNegativoException {
        this.marca = marca;
        this.referencia = referencia;
        // Excepcion de peso
        if (peso > 0) {
            this.peso = peso;
        } else {
            throw new PesoNegativoException();
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public double getPeso() {
        return peso;
    }

   // Excepcion de peso
    public void setPeso(double peso) throws PesoNegativoException {
        if (peso > 0) {
            this.peso = peso;
        } else {
            throw new PesoNegativoException();
        }
    }

}
