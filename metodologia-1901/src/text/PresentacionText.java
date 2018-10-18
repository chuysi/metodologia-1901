/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package text;

import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author T-107
 */
public class PresentacionText extends javax.swing.JFrame {

    JRadioButton radios[];
    Opcion []opciones;
    Pregunta p1;
    
    /**
     * Creates new form PresentacionText
     */
    public PresentacionText() {
        initComponents();
        setLocationRelativeTo(this);
        
        //Generamos en un arreglo los radios button visuales
       
        radios=new JRadioButton[5];
        opciones=new Opcion[5];
        radios[0]=radioOp1;
        radios[1]=radioOp2;
        radios[2]=radioOp3;
        radios[3]=radioOp4;
        radios[4]=radioOp5;
        
        //llenamos el modelo con los valores  correctos en la interfaz de usuario
         Opcion op1=new Opcion("Las quesadillas ",false); //el constructor se llama igual que la clase
       // System.out.println("yu respuesta es correcta "+op1.correcta);
         //System.out.println("es correctas"+op1.titulo);
         Opcion op2=new Opcion("la grasa",false);
         Opcion op3=new Opcion("El azucar",true);
         Opcion op4=new Opcion("la contaminacion",false);
         Opcion op5=new Opcion("la sal",false);
         
         opciones[0]=op1;
         opciones[1]=op2;
         opciones[2]=op3;
         opciones[3]=op4;
         opciones[4]=op5;
         
          p1=new Pregunta("esta es la principall causa del cancer",opciones);
         
         etiquetaTitulo.setText(p1.titulo);
        for(int i=0; i<radios.length;i++){
            radios[i].setText(p1.opciones[i].titulo);
            
            // radios[i]= es el radio 0 el settext =poner texto de la pregunta 
            //pi= de la pregunta 1 . opciones[i] = pone las opciones del 0 al 5 
            //titulo = pone el nombre de la opcion
            
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        etiquetaTitulo = new javax.swing.JLabel();
        radioOp1 = new javax.swing.JRadioButton();
        radioOp2 = new javax.swing.JRadioButton();
        radioOp3 = new javax.swing.JRadioButton();
        radioOp4 = new javax.swing.JRadioButton();
        radioOp5 = new javax.swing.JRadioButton();
        checarRespuesta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etiquetaTitulo.setText("jLabel1");

        buttonGroup1.add(radioOp1);
        radioOp1.setText("jRadioButton1");

        buttonGroup1.add(radioOp2);
        radioOp2.setText("jRadioButton2");

        buttonGroup1.add(radioOp3);
        radioOp3.setText("jRadioButton3");

        buttonGroup1.add(radioOp4);
        radioOp4.setText("jRadioButton4");

        buttonGroup1.add(radioOp5);
        radioOp5.setText("jRadioButton5");

        checarRespuesta.setText("Checar Respuesta");
        checarRespuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checarRespuestaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(etiquetaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioOp1)
                            .addComponent(radioOp4)
                            .addComponent(radioOp5)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radioOp2)
                                    .addComponent(radioOp3))
                                .addGap(56, 56, 56)
                                .addComponent(checarRespuesta)))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(etiquetaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(radioOp1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radioOp2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radioOp3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(checarRespuesta)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioOp4)
                .addGap(18, 18, 18)
                .addComponent(radioOp5)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checarRespuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checarRespuestaActionPerformed
        // TODO add your handling code here:
        //Buscamos el radiobutton seleccionado
        int indiceSeleccionado=0;
        for(int i=0;i<radios.length;i++){
         if(radios[i].isSelected()){
             indiceSeleccionado=i;
             break;
         }   
        }
        System.out.println("El indice seleccionado es:"+indiceSeleccionado);
        JOptionPane.showConfirmDialog(this,""+ evaluar(p1,indiceSeleccionado));
        

    }//GEN-LAST:event_checarRespuestaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PresentacionText.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PresentacionText.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PresentacionText.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PresentacionText.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PresentacionText().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton checarRespuesta;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JRadioButton radioOp1;
    private javax.swing.JRadioButton radioOp2;
    private javax.swing.JRadioButton radioOp3;
    private javax.swing.JRadioButton radioOp4;
    private javax.swing.JRadioButton radioOp5;
    // End of variables declaration//GEN-END:variables

public boolean evaluar(Pregunta p, int indiceSeleccionado){
boolean correcta=false;

 if(p.opciones[indiceSeleccionado].correcta){
     correcta=true;
 }   
 return correcta;
}

}



