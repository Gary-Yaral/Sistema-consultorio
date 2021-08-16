
package consultorio;

import javax.swing.JOptionPane;

public class Medicamentos extends javax.swing.JInternalFrame {
    String ruta = "C:\\Hospital\\Medicamentos.txt";
    OpcionesArchivo opciones = new OpcionesArchivo();
    public Medicamentos() {
        initComponents();
    }
    
    private Boolean validarCampos(){
        //Método para verificar que no se guarden campos vacios
        
        if(codigo.getText().replaceAll(" ", "").isEmpty()){
            codigo.setText("");
            codigo.requestFocus();
            return null;
        }       
        if(nombreComercial.getText().replaceAll(" ", "").isEmpty()){
            nombreComercial.setText("");
            nombreComercial.requestFocus();
            return null;
        }
        
        if(principioActivo.getText().replaceAll(" ", "").isEmpty()){
            principioActivo.setText("");
            principioActivo.requestFocus();
            return null;
        }
        
        if(tipoMedicamento.getText().replaceAll(" ", "").isEmpty()){
            tipoMedicamento.setText("");
            tipoMedicamento.requestFocus();
            return null;
        }
        
        if(gramajePeso.getText().replaceAll(" ", "").isEmpty()){
            gramajePeso.setText("");
            gramajePeso.requestFocus();
            return null;
        }
        
        if(stock.getText().replaceAll(" ", "").isEmpty()){
            stock.setText("");
            stock.requestFocus();
            return null;
        }
        
        //Si todos los campos están llenos entonces nos dejará guardar o modificar
        return true;
    }
    
    private void limpiarCampos(){
        codigo.setText("");
        nombreComercial.setText("");
        principioActivo.setText("");
        tipoMedicamento.setText("");
        gramajePeso.setText("");
        stock.setText("");
        codigo.requestFocus();       
    }
    
    private void guardarDatos(){
        if(validarCampos() != null){
            JOptionPane.showMessageDialog(null,"Se guardo");
            limpiarCampos();
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        principioActivo = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        codigo = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        nombreComercial = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        tipoMedicamento = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        stock = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        gramajePeso = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        agregarMedicamento = new javax.swing.JButton();
        modificarMedicamento = new javax.swing.JButton();
        limpiarCampos = new javax.swing.JButton();
        eliminarMedicamento = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Medicamentos");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setViewportView(principioActivo);

        jScrollPane2.setViewportView(codigo);

        jScrollPane3.setViewportView(nombreComercial);

        jScrollPane4.setViewportView(tipoMedicamento);

        jScrollPane5.setViewportView(stock);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "Nombre_Comercial", "Principio_Activo", "Tipo", "Gramaje/Peso", "Stock"
            }
        ));
        jScrollPane6.setViewportView(jTable1);

        jScrollPane7.setViewportView(gramajePeso);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Medicamentos");

        jLabel2.setText("Codigo");

        jLabel3.setText("Nombre Comercial");

        jLabel4.setText("Principio Activo");

        jLabel5.setText("Gramaje / Peso");

        jLabel6.setText("Cantidad en Stock");

        jLabel7.setText("Tipo");

        agregarMedicamento.setBackground(new java.awt.Color(51, 153, 0));
        agregarMedicamento.setForeground(new java.awt.Color(255, 255, 255));
        agregarMedicamento.setText("Agregar");
        agregarMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarMedicamentoActionPerformed(evt);
            }
        });

        modificarMedicamento.setBackground(new java.awt.Color(102, 102, 255));
        modificarMedicamento.setForeground(new java.awt.Color(255, 255, 255));
        modificarMedicamento.setText("Modificar");

        limpiarCampos.setBackground(new java.awt.Color(255, 255, 255));
        limpiarCampos.setForeground(new java.awt.Color(102, 102, 255));
        limpiarCampos.setText("Limpiar");
        limpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarCamposActionPerformed(evt);
            }
        });

        eliminarMedicamento.setBackground(new java.awt.Color(255, 0, 5));
        eliminarMedicamento.setForeground(new java.awt.Color(255, 255, 255));
        eliminarMedicamento.setText("Eliminar");
        eliminarMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarMedicamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(agregarMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(modificarMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(eliminarMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(limpiarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel7))
                                .addGap(122, 122, 122))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2)
                                .addGap(25, 25, 25)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)))
                            .addComponent(jLabel1))))
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(limpiarCampos)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(agregarMedicamento)
                        .addComponent(modificarMedicamento)
                        .addComponent(eliminarMedicamento)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarCamposActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_limpiarCamposActionPerformed

    private void eliminarMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarMedicamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminarMedicamentoActionPerformed

    private void agregarMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarMedicamentoActionPerformed
        guardarDatos();
    }//GEN-LAST:event_agregarMedicamentoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarMedicamento;
    private javax.swing.JTextPane codigo;
    private javax.swing.JButton eliminarMedicamento;
    private javax.swing.JTextPane gramajePeso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton limpiarCampos;
    private javax.swing.JButton modificarMedicamento;
    private javax.swing.JTextPane nombreComercial;
    private javax.swing.JTextPane principioActivo;
    private javax.swing.JTextPane stock;
    private javax.swing.JTextPane tipoMedicamento;
    // End of variables declaration//GEN-END:variables
}
