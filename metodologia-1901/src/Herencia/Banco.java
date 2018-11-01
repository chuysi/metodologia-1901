/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author T-107
 */
public class Banco {
      public static void main(String[] args) {
        //Primero creamos una tarjeta credito
       TarjetaCredito tcredito=new TarjetaCredito();
       tcredito.setNumero(1234);
       tcredito.setNombre("Banamex");
       tcredito.setTipo("credito");
       
       
       TarjetaAhorro tahorro=new TarjetaAhorro();
               tahorro.setNumero(4321);
               tahorro.setNombre("Bancomer");
               tahorro.setTipo("ahorro");
               
        
              TarjetaNomina tnomina=new TarjetaNomina();
              tnomina.setNumero(6789);
              tnomina.setNombre("hsbc");
              tnomina.setTipo("nomina");
    }
    
}
