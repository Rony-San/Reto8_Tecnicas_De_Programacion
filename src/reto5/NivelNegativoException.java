/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto5;

/**
 *
 * @author ronys
 */
public class NivelNegativoException extends Exception{

    public NivelNegativoException() {
        super("El nivel es negativo, debe ser positivo");
    }
    
}
