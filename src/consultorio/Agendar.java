
package consultorio;

import java.beans.PropertyChangeEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Agendar extends javax.swing.JInternalFrame {
    
    public void propertyChange(PropertyChangeEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    String nombreDeArchivo;
    int contador = 0;
    Boolean existeEsaFecha = false;
    Boolean existeEsaHora = false;
    Boolean existeEseConsultorio = false;
    String[] horas;
   
    public Agendar(String nombre_archivo) throws IOException {
        initComponents();
        inicializarFechas();
        nombreDeArchivo = nombre_archivo;
        //Procesamos las fechas para convertirlas al formato '01-01-2000'
 
        long f_cita = fechaCita.getDate().getTime();
        java.sql.Date fecha_cita = new java.sql.Date(f_cita);
        agregarHoras(fecha_cita);
        
        llenarTable();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        fechaNacimiento = new com.toedter.calendar.JDateChooser();
        fechaCita = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descripcion = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        modificarCita = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        eliminarCita = new javax.swing.JButton();
        guardarCita = new javax.swing.JButton();
        limpiarCampos = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaCitas = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        nombrePaciente = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        apellidoPaterno = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        apellidoMaterno = new javax.swing.JTextPane();
        horaCita = new javax.swing.JComboBox();
        consultoriosDisponibles = new javax.swing.JComboBox();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setClosable(true);
        setIconifiable(true);
        setTitle("Citas");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Nombre del Paciente");

        jLabel2.setText("Apellido Paterno");

        jLabel3.setText("Apellido materno");

        jLabel4.setText("Fecha de Nacimiento");

        jLabel5.setText("Fecha de la cita");

        jLabel6.setText("Hora de la cita");

        jLabel7.setText("Consultorios disponible");

        descripcion.setColumns(20);
        descripcion.setRows(5);
        jScrollPane1.setViewportView(descripcion);

        jLabel8.setText("Descripción");

        modificarCita.setBackground(new java.awt.Color(102, 102, 255));
        modificarCita.setForeground(new java.awt.Color(255, 255, 255));
        modificarCita.setText("Modificar");
        modificarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarCitaActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Agendar Cita ");

        eliminarCita.setBackground(new java.awt.Color(255, 0, 51));
        eliminarCita.setForeground(new java.awt.Color(255, 255, 255));
        eliminarCita.setText("Eliminar");
        eliminarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarCitaActionPerformed(evt);
            }
        });

        guardarCita.setBackground(new java.awt.Color(51, 153, 0));
        guardarCita.setForeground(new java.awt.Color(255, 255, 255));
        guardarCita.setText("Guardar");
        guardarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarCitaActionPerformed(evt);
            }
        });

        limpiarCampos.setBackground(new java.awt.Color(255, 255, 255));
        limpiarCampos.setForeground(new java.awt.Color(102, 102, 255));
        limpiarCampos.setText("Limpiar");
        limpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarCamposActionPerformed(evt);
            }
        });

        tablaCitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tablaCitas);

        jScrollPane4.setViewportView(nombrePaciente);

        jScrollPane5.setViewportView(apellidoPaterno);

        jScrollPane6.setViewportView(apellidoMaterno);

        horaCita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                horaCitaMouseClicked(evt);
            }
        });
        horaCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horaCitaActionPerformed(evt);
            }
        });

        consultoriosDisponibles.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fechaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1)
                                    .addComponent(jScrollPane4))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(fechaCita, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                    .addComponent(jScrollPane5)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(38, 38, 38))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(consultoriosDisponibles, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(25, 25, 25)))
                                .addComponent(guardarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(horaCita, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(modificarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(eliminarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(limpiarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel9)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fechaCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(horaCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(guardarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(modificarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(eliminarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(limpiarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(consultoriosDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
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

    private void guardarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarCitaActionPerformed
        if(validarCampos() != null){
            try (BufferedWriter EscritorDeArchivo = new BufferedWriter( new FileWriter(nombreDeArchivo,true))) {

                try {
                    contarRegistros();
                } catch (IOException ex) {
                    Logger.getLogger(Agendar.class.getName()).log(Level.SEVERE, null, ex);
                }

                //Extraemos los datos de los campos de texto
                int numeroDeCita = contador;
                String nombre_paciente = nombrePaciente.getText();
                String apellido_paterno = apellidoPaterno.getText();
                String apellido_materno = apellidoMaterno.getText();
                String descripcion_cita = descripcion.getText();

                //Procesamos las fechas para convertirlas al formato '01-01-2000'
                long f_nacimiento = fechaNacimiento.getDate().getTime();
                long f_cita = fechaCita.getDate().getTime();
                java.sql.Date fecha_nacimiento = new java.sql.Date(f_nacimiento);
                java.sql.Date fecha_cita = new java.sql.Date(f_cita);

                //Extreamos los datos de las listas o ComboBox 
                String hora_cita = horaCita.getSelectedItem().toString();
                String consultorio_seleccionado = consultoriosDisponibles.getSelectedItem().toString();

                try {
                    buscarRepetido(fecha_cita, hora_cita, consultorio_seleccionado);
                } catch (IOException ex) {
                    Logger.getLogger(Agendar.class.getName()).log(Level.SEVERE, null, ex);
                }

                    if(existeEsaFecha.equals(true) && existeEsaHora.equals(true) && existeEseConsultorio.equals(true)){
                        JOptionPane.showMessageDialog(null, "Lo sentimos, este horario no está disponible");
                    }else{   
                        // Unificamos todos los datos de la cita en una sola línea 
                        String nuevaCita;
                        nuevaCita = numeroDeCita + ",";
                        nuevaCita = nuevaCita + nombre_paciente + ",";
                        nuevaCita = nuevaCita + apellido_paterno +",";
                        nuevaCita = nuevaCita + apellido_materno+",";
                        nuevaCita = nuevaCita + fecha_nacimiento+",";
                        nuevaCita = nuevaCita + fecha_cita+",";
                        nuevaCita = nuevaCita + hora_cita+",";
                        nuevaCita = nuevaCita + consultorio_seleccionado+",";
                        nuevaCita = nuevaCita + descripcion_cita;
                        // Insertamos los datos al archivo
                        EscritorDeArchivo.write(nuevaCita);
                        EscritorDeArchivo.flush();
                        EscritorDeArchivo.newLine();
                        JOptionPane.showMessageDialog(null,"Hemos guardado correctamente la cita");
                        limpiarCampos();

                    }
            } catch (IOException ex) {
                Logger.getLogger(Agendar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_guardarCitaActionPerformed

    public void contarRegistros() throws IOException {
        try (BufferedReader lectorDeArchivo = new BufferedReader( new FileReader(nombreDeArchivo) )) {
            String registros; 
            contador = 0;
            while( ( registros = lectorDeArchivo.readLine() ) != null ){ 
                contador++;                 
            }   
             
            contador = contador + 1;
 
        }    		
    }
    
    public void buscarRepetido(java.sql.Date fecha_cita,String hora_cita, String consultorio_seleccionado) throws IOException {
    	String fecha_seleccionada,linea;
    		
        try (BufferedReader lectorDeArchivo = new BufferedReader( new FileReader(nombreDeArchivo) )) {
            fecha_seleccionada = String.valueOf(fecha_cita);
            existeEsaFecha = false;
            existeEsaHora = false;
            existeEseConsultorio = false;

            while( ( linea = lectorDeArchivo.readLine() ) != null ) {
                
                StringTokenizer cadenaDeTexto = new StringTokenizer(linea,",");
                
                while(cadenaDeTexto.hasMoreTokens()){
                    String token = cadenaDeTexto.nextToken();
                    if(token.equals(fecha_seleccionada)) existeEsaFecha = true;  
                    if(token.equals(hora_cita))existeEsaHora = true;
                    if(token.equals(consultorio_seleccionado))existeEseConsultorio = true;
                }                        
            }           
        }   		
    }
    
    public void agregarHoras(java.sql.Date fecha_cita) throws IOException {
    	String fecha_seleccionada,linea; 
        try (BufferedReader lectorDeArchivo = new BufferedReader( new FileReader(nombreDeArchivo) )) {
            fecha_seleccionada = String.valueOf(fecha_cita);
            existeEsaFecha = false;
            existeEsaHora = false;
            existeEseConsultorio = false;
            ArrayList datos = new ArrayList();
           String[] horasOcupadas = {"09h00","10h00","11h00","12h00","13h00","14h00","15h00","16h00"};
                     
            while( ( linea = lectorDeArchivo.readLine() ) != null ) {
                
                StringTokenizer cadenaDeTexto = new StringTokenizer(linea,",");
                
                while(cadenaDeTexto.hasMoreTokens()){  
                    String token = cadenaDeTexto.nextToken();
                    datos.add(token);     
                }
                
                if(datos.get(5).toString().equals(fecha_seleccionada)){
                    for(int j = 0; j<horasOcupadas.length; j++){
                        if(datos.get(6).toString().equals(horasOcupadas[j])){
                            horasOcupadas[j] = null;
                        }
                    }
                }
                  
                datos.clear();
            } 
            
                        
            
            for(int j = 0; j<horasOcupadas.length; j++){
                if(horasOcupadas[j]!= null){
                    horaCita.addItem(horasOcupadas[j]);           
                }
            }
        }   		
    }
    
    
    private void limpiarCampos(){
        nombrePaciente.setText("");
        apellidoPaterno.setText("");
        apellidoMaterno.setText("");
        descripcion.setText("");
        horaCita.setSelectedIndex(0);
        consultoriosDisponibles.setSelectedIndex(0);
        inicializarFechas();
        nombrePaciente.requestFocus();
        
    }
    
    private void llenarTable() throws IOException{
        String[] titulos = {
            "ID", 
            "Nombre", 
            "Apellido_Paterno", 
            "Apellido_Materno",
            "Fecha_Nacimiento",
            "Fecha_Cita",
            "Hora_cita",
            "Consultorio",
            "Descripción"
        };
        
        
        Object[][] data = {};
        DefaultTableModel modelo = new DefaultTableModel(data, titulos);
       
        tablaCitas.setModel(modelo);
        modelo.setRowCount(0);
   
        
        try {
            String linea; 
        
            BufferedReader lectorDeArchivo = new BufferedReader( new FileReader(nombreDeArchivo));
        
   
            while( ( linea = lectorDeArchivo.readLine() ) != null ) {
                Object[] datos = new Object[9];
                int i = 0;
                StringTokenizer cadenaDeTexto = new StringTokenizer(linea,",");
                
                while(cadenaDeTexto.hasMoreTokens()){  
                    String token = cadenaDeTexto.nextToken();
                    datos[i] = token;
                    i++;
                }
                DefaultTableModel nuevoModelo = (DefaultTableModel)tablaCitas.getModel();
                nuevoModelo.addRow(datos);
                tablaCitas.setModel(nuevoModelo); 
                
            }     
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Agendar.class.getName()).log(Level.SEVERE, null, ex);
        }     
            
    }
    
    private void eliminarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarCitaActionPerformed
        
    }//GEN-LAST:event_eliminarCitaActionPerformed

    private void modificarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarCitaActionPerformed
        
    }//GEN-LAST:event_modificarCitaActionPerformed

    private void limpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarCamposActionPerformed
        
    }//GEN-LAST:event_limpiarCamposActionPerformed

    private void horaCitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_horaCitaMouseClicked
        
    }//GEN-LAST:event_horaCitaMouseClicked

    private void horaCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horaCitaActionPerformed
        
    }//GEN-LAST:event_horaCitaActionPerformed
    
    private void inicializarFechas(){
        fechaNacimiento.setDate(new Date());
        fechaCita.setDate(new Date());
    }
    
    private Boolean validarCampos(){
        if(nombrePaciente.getText().replaceAll(" ", "").isEmpty()){
            nombrePaciente.setText("");
            nombrePaciente.requestFocus();
            return null;
        }
        
        if(apellidoPaterno.getText().replaceAll(" ", "").isEmpty()){
            apellidoPaterno.setText("");
            apellidoPaterno.requestFocus();
            return null;
        }
        
        if(apellidoMaterno.getText().replaceAll(" ", "").isEmpty()){
            apellidoMaterno.setText("");
            apellidoMaterno.requestFocus();
            return null;
        }
        
        if(descripcion.getText().replaceAll(" ", "").isEmpty()){
            descripcion.setText("");
            descripcion.requestFocus();
            return null;
        }
        return true;
    }
    
    private void obtenerLosDatos(){
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane apellidoMaterno;
    private javax.swing.JTextPane apellidoPaterno;
    private javax.swing.JComboBox consultoriosDisponibles;
    private javax.swing.JTextArea descripcion;
    private javax.swing.JButton eliminarCita;
    private com.toedter.calendar.JDateChooser fechaCita;
    private com.toedter.calendar.JDateChooser fechaNacimiento;
    private javax.swing.JButton guardarCita;
    private javax.swing.JComboBox horaCita;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton limpiarCampos;
    private javax.swing.JButton modificarCita;
    private javax.swing.JTextPane nombrePaciente;
    private javax.swing.JTable tablaCitas;
    // End of variables declaration//GEN-END:variables

    /*
        fechaCita.getDateEditor().addPropertyChangeListener(new java.beans.PropertyChangeListener(){
        public void propertyChange(java.beans.PropertyChangeEvent evt){
        
        saludar();
        
    }
});
    */
}
