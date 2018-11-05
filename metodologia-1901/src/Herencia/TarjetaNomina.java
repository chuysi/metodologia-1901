/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

import com.sun.org.apache.bcel.internal.generic.SALOAD;

/**
 *
 * @author T-107
 */
public class TarjetaNomina extends Tarjeta{

    @Override
    public void pagar(float deposito) {
        setSaldo(getSaldo()+deposito);
        
    }
     
}
