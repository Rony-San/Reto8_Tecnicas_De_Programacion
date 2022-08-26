
package com.mycompany.reto7;

/**
 *
 * @author ronys
 */
public class VelocidadMenorQueCeroException extends Exception{
     public VelocidadMenorQueCeroException() {
        super("La velocidad debe ser mayor que cero");
    }
}
