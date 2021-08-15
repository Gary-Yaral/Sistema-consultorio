
package consultorio;

import java.beans.PropertyChangeEvent;

public class Fecha extends javax.swing.JInternalFrame {
    int fecha = 0;
    boolean haIniciado = false;
    public Fecha() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        etiqueta = new javax.swing.JLabel();

        etiqueta.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(etiqueta)
                .addContainerGap(104, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiqueta)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(210, Short.MAX_VALUE))
        );

        //Recuerda que este código necesita dos variables globales para funcionar
        //Debes copiar estas variables antes del contructor de la clase
        // int fecha = 0;
        // boolean = false;
        jDateChooser1.getDateEditor().addPropertyChangeListener(
            (PropertyChangeEvent evt) -> {

                fecha++;
                if(haIniciado != true){
                    //Esto se ejecuta al crear el JDataChooser
                    if(fecha == 4){
                        haIniciado = true;
                        fecha = 0;
                    }
                }
                if(haIniciado == true){
                    if(fecha == 3){
                        fecha = 0;
                        //Aqui debajo debes ubicar el código ejecutar
                    }
                }
            });

            pack();
        }// </editor-fold>//GEN-END:initComponents

        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etiqueta;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    // End of variables declaration//GEN-END:variables
}
