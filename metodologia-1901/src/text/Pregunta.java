/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package text;

/**
 *
 * @author T-107
 */
public class Pregunta {
    
    String titulo;
    Opcion[] opciones;
    public Pregunta(String x, Opcion[] y){//el valor de la variable se le pasa al atributo 
        titulo=x;
        opciones=y;
    }
    
}
