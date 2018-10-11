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
public class ProbarTodo {
    public static void main(String[] args) {
        Opcion op1=new Opcion("el azucar y la harina ",true); //el constructor se llama igual que la clase
      //  System.out.println("tu titulo es "+op1.correcta);
         //System.out.println("es correctas"+op1.titulo);
         Opcion op2=new Opcion("la grasa",false);
         Opcion op3=new Opcion("El sol",false);
         Opcion op4=new Opcion("la contaminacion",false);
         Opcion op5=new Opcion("la sal",false);
         
         Opcion[] opciones={op1,op2,op3,op4,op5};
         
         Pregunta p1=new Pregunta("esta es la principall causa del cancer",opciones);
                          
        System.out.println(p1.titulo);
        
        for (Opcion opcion : opciones) {
            System.out.println(opcion.titulo);
        }
    }
    
}
