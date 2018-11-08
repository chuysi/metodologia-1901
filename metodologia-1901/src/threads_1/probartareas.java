/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads_1;

/**
 *
 * @author T-107
 */
public class probartareas {
    public static void main(String[] args) {
        //cremos el thread
        tareabasica t1=new tareabasica();
        //lo inicializamos
        t1.start();
        Tareahora t2=new Tareahora();
        t2.start();
    }
}