/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto7;

/**
 *
 * @author ronys
 */
public class EspesorMenorQueCeroException extends Exception {
        public EspesorMenorQueCeroException() {
        super("El espesor debe ser mayor a cero");
    }
}
