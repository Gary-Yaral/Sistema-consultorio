
package consultorio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Agendar extends javax.swing.JInternalFrame {
   
    String nombreDeArchivo;
    Boolean existeEsaHora = false;
    Boolean existeEseConsultorio = false;
    String[] horas;
    OpcionesArchivo opciones = new OpcionesArchivo();
    String ruta = "C:\\Hospital\\Citas.txt";
    String temporal = "C:\\Hospital\\temporal.txt";
    String rutaConsultorio = "C:\\Hospital\\Consultorios.txt";
    int siguienteIndice = opciones.calcularSiguienteIndice(ruta);
    String indiceDeRepetido = "0";
    Horas listaHoras = new Horas();
    String horaSeleccionada,consultorioCargado;
    
    boolean haSeleccionadoTabla = false;
    
    public Agendar(String nombre_archivo) throws IOException {
        initComponents();
        inicializarFechas();
        nombreDeArchivo = nombre_archivo;
        listaHoras.inicializar(ruta, horaCita);
        consultoriosDisponibles.removeAllItems();
        agregarConsultorios();
        resetearIndice();
        llenarTable();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        fechaNacimiento = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
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
        horaCita = new javax.swing.JComboBox();
        consultoriosDisponibles = new javax.swing.JComboBox();
        nombrePaciente = new javax.swing.JTextField();
        apellidoPaterno = new javax.swing.JTextField();
        apellidoMaterno = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        indiceCita = new javax.swing.JLabel();

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
        eliminarCita.setText("Cancelar");
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
        tablaCitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaCitasMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablaCitas);

        horaCita.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                horaCitaItemStateChanged(evt);
            }
        });
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

        nombrePaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombrePacienteActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Cita Nº:");

        indiceCita.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        indiceCita.setText("00");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(indiceCita)
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(fechaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(nombrePaciente)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel1)
                                                .addComponent(jLabel4))
                                            .addGap(23, 23, 23)))
                                    .addComponent(guardarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(apellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(horaCita, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(modificarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(apellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7)
                                            .addComponent(consultoriosDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9))
                                        .addGap(26, 26, 26)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(eliminarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(25, 25, 25)
                                        .addComponent(limpiarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(40, 40, 40))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(indiceCita))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(apellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(apellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombrePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(horaCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(consultoriosDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modificarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eliminarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(limpiarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
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

    private void resetearIndice(){
        siguienteIndice = opciones.calcularSiguienteIndice(ruta);
        indiceCita.setText(String.valueOf(siguienteIndice));
    }
    
    private void guardarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarCitaActionPerformed
        if(indiceCita.getText().equals(String.valueOf(siguienteIndice))){
            if(validarCampos() != null){
                BufferedWriter flujo = null;
                try {

                    flujo = new BufferedWriter( new FileWriter(nombreDeArchivo,true));

                    //Extraemos los datos de los campos de texto
                    int numeroDeCita = siguienteIndice;
                    String nombre_paciente = nombrePaciente.getText();
                    String apellido_paterno = apellidoPaterno.getText();
                    String apellido_materno = apellidoMaterno.getText();
                    String descripcion_cita = descripcion.getText();

                    //Procesamos las fechas para convertirlas al formato '01-01-2000'
                    long f_nacimiento = fechaNacimiento.getDate().getTime();       
                    java.sql.Date fecha_nacimiento = new java.sql.Date(f_nacimiento);

                    //Extreamos los datos de las listas o ComboBox 
                    String hora_cita = horaCita.getSelectedItem().toString();
                    String consultorio_seleccionado = consultoriosDisponibles.getSelectedItem().toString();


                    buscarRepetido(hora_cita, consultorio_seleccionado);


                    if(existeEsaHora.equals(true) && existeEseConsultorio.equals(true)){
                        JOptionPane.showMessageDialog(null, "Lo sentimos, este horario no está disponible");
                    }else{   
                        // Unificamos todos los datos de la cita en una sola línea 
                        String nuevaCita;
                        nuevaCita = numeroDeCita + ",";
                        nuevaCita = nuevaCita + nombre_paciente + ",";
                        nuevaCita = nuevaCita + apellido_paterno +",";
                        nuevaCita = nuevaCita + apellido_materno+",";
                        nuevaCita = nuevaCita + fecha_nacimiento+",";
                        nuevaCita = nuevaCita + hora_cita+",";
                        nuevaCita = nuevaCita + consultorio_seleccionado+",";
                        nuevaCita = nuevaCita + descripcion_cita;
                        // Insertamos los datos al archivo
                        flujo.write(nuevaCita);
                        flujo.flush();
                        flujo.newLine();
                        JOptionPane.showMessageDialog(null,"Hemos guardado correctamente la cita");
                        limpiarCampos();
                        resetearIndice();
                        llenarTable();

                    }
                } catch (IOException e) {
                    System.out.println("Error al guardar cita: " + e.getMessage());
                }finally{
                    try{
                        flujo.close();
                    }catch(IOException e){
                        System.out.println("Error al cerrar buffer al guardar cita: " + e.getMessage());
                    }
                }
            }
        }
    }//GEN-LAST:event_guardarCitaActionPerformed

    
    public void buscarRepetido(String hora_cita, String consultorio_seleccionado){
    	String linea;
        BufferedReader br = null;
        try {
            br = new BufferedReader( new FileReader(nombreDeArchivo) );
          
       
            existeEsaHora = false;
            existeEseConsultorio = false;
         
            while( ( linea = br.readLine() ) != null ) {
                Object[] datos = new Object[9];
                int i = 0;
                StringTokenizer cadenaDeTexto = new StringTokenizer(linea,",");

                while(cadenaDeTexto.hasMoreTokens()){  
                    String token = cadenaDeTexto.nextToken();
                    datos[i] = token;
                    i++;
                }
                
                boolean existeLaHora = datos[5].toString().equals(hora_cita);
                boolean estaOcupado = datos[6].toString().equals(consultorio_seleccionado);
                
                if(existeLaHora && estaOcupado){                  
                    existeEsaHora = true;
                    existeEseConsultorio = true;
                    indiceDeRepetido = datos[0].toString();
                }                        
            }           
        } catch(IOException e){
            System.out.println("Error al buscar repetido: " + e.getMessage());
        } finally{
            try{
                br.close();
            }catch(IOException e){
                System.out.println("Error al cerrar bufferWriter en buscarRepetidos");
            }
        }	
    }
    
    public void agregarHoras(){     
        String[] horasOcupadas = {"09h00","10h00","11h00","12h00","13h00","14h00","15h00","16h00"};
        for (String horasOcupada : horasOcupadas) {
            if (horasOcupada != null) {
                horaCita.addItem(horasOcupada);           
            }
        }  		
    }
    
    private void agregarConsultorios(){
        String[] consultorio = {
            "alpa",
            "beta",
            "gamma",
            "delta",
            "epsilon",
            "dseta",
            "eta",
            "zeta",
            "iota",
            "kappa"
        }; 
        
    
        BufferedReader br = null;
        String linea;
        try{
            br = new BufferedReader( new FileReader(nombreDeArchivo));
            
            ArrayList consultoriosOcupados = new ArrayList();
            while( ( linea = br.readLine() ) != null ) {
                Object[] datos = new Object[8];
                int i = 0;
                StringTokenizer cadenaDeTexto = new StringTokenizer(linea,",");

                while(cadenaDeTexto.hasMoreTokens()){  
                    String token = cadenaDeTexto.nextToken();
                    datos[i] = token;
                    i++;
                }  
                if(datos[5].toString().equals(horaCita.getSelectedItem())){                   
                    consultoriosOcupados.add(datos[6].toString());                 
                }
            
            }
          
            int longitud = consultoriosOcupados.size();
       
            for(int t = 0; t<consultorio.length; t++){
                boolean ocupado = false;
                for(int g = 0; g<longitud; g++){                 
                    if(consultorio[t].equals(consultoriosOcupados.get(g))){
                        ocupado = true;
                    }                  
                }
                if(ocupado == false){
                    consultoriosDisponibles.addItem(consultorio[t]);
                }
                ocupado = false;
            }           
            
        }catch(IOException e){
            System.out.println("Error al cargar horas: " + e.getMessage());
        } finally{
            try{
                br.close();
            }catch(IOException e){
            }
        } 
    }
    
    private void limpiarCampos(){
        nombrePaciente.setText("");
        apellidoPaterno.setText("");
        apellidoMaterno.setText("");
        descripcion.setText("");
        inicializarFechas();
        nombrePaciente.requestFocus();
        horaCita.removeAllItems();
        listaHoras.inicializar(ruta, horaCita);
        consultoriosDisponibles.removeAllItems();
        agregarConsultorios();
        
    }
    
    private void llenarTable(){
        String[] titulos = {
            "ID", 
            "Nombre", 
            "Apellido_Paterno", 
            "Apellido_Materno",
            "Fecha_Nacimiento",
            "Hora_cita",
            "Consultorio",
            "Descripción"
        };
        
        
        Object[][] data = {};
        DefaultTableModel modelo = new DefaultTableModel(data, titulos);
       
        tablaCitas.setModel(modelo);
        modelo.setRowCount(0);
        
        if(opciones.calcularSiguienteIndice(ruta) > 0){
            
            String linea; 
            BufferedReader br = null;
            try {

                 br = new BufferedReader( new FileReader(nombreDeArchivo));      

                while( ( linea = br.readLine() ) != null ) {
                    Object[] datos = new Object[8];
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
            } catch (FileNotFoundException e) {
                System.out.println("Archivo no encontrado en llenar tabla: " + e.getMessage());
            } catch(IOException e){
                System.out.println("Error en el buffer al llenar tabla: " + e.getMessage());
            }  finally{
                try{
                    br.close();
                }catch(IOException e){
                    System.out.println("Error al cerrar buffer al llenar tabla: " + e.getMessage());
                }
            }
        } 
    }
    
    private void eliminarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarCitaActionPerformed
        if(!indiceCita.getText().equals("")){
            String id = indiceCita.getText();
            opciones.eliminarRegistro(ruta, temporal, id);
            resetearIndice();
            limpiarCampos();
            llenarTable();
        }
    }//GEN-LAST:event_eliminarCitaActionPerformed
    
    private void modificarCita(){
        if(!indiceCita.getText().equals(String.valueOf(siguienteIndice))){
            if(validarCampos() != null){
                long f_nacimiento = fechaNacimiento.getDate().getTime();
                java.sql.Date fecha_nacimiento = new java.sql.Date(f_nacimiento);
                String hora_cita = horaCita.getSelectedItem().toString();
                String consultorio_seleccionado = consultoriosDisponibles.getSelectedItem().toString();
                
                buscarRepetido(hora_cita, consultorio_seleccionado);
                if(existeEsaHora.equals(true) && existeEseConsultorio.equals(true)){
                                        
                    if(indiceCita.getText().equals(indiceDeRepetido)){
                        String [] nuevosDatos = new String[8];
                        nuevosDatos[0] = indiceCita.getText();
                        nuevosDatos[1] = nombrePaciente.getText();
                        nuevosDatos[2] = apellidoPaterno.getText();
                        nuevosDatos[3] = apellidoMaterno.getText();
                        nuevosDatos[4] = String.valueOf(fecha_nacimiento);
                        nuevosDatos[5] = horaCita.getSelectedItem().toString();
                        nuevosDatos[6] = consultoriosDisponibles.getSelectedItem().toString();
                        nuevosDatos[7] = descripcion.getText();  
                        opciones.modificar(ruta, temporal, nuevosDatos);
                        resetearIndice();
                        limpiarCampos();
                        llenarTable();
                    }else{
                        JOptionPane.showMessageDialog(null, "Lo sentimos, este horario no está disponible: " );
                    }
                }else{   
                    
                    String [] nuevosDatos = new String[8];
                    nuevosDatos[0] = indiceCita.getText();
                    nuevosDatos[1] = nombrePaciente.getText();
                    nuevosDatos[2] = apellidoPaterno.getText();
                    nuevosDatos[3] = apellidoMaterno.getText();
                    nuevosDatos[4] = String.valueOf(fecha_nacimiento);
                    nuevosDatos[5] = horaCita.getSelectedItem().toString();
                    nuevosDatos[6] = consultoriosDisponibles.getSelectedItem().toString();
                    nuevosDatos[7] = descripcion.getText();  
                    opciones.modificar(ruta, temporal, nuevosDatos);
                    resetearIndice();
                    limpiarCampos();
                    llenarTable();
                }
            }
        }
  
    }
    
    private void modificarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarCitaActionPerformed
        modificarCita();
    }//GEN-LAST:event_modificarCitaActionPerformed

    private void limpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarCamposActionPerformed
        resetearIndice();
        limpiarCampos();
    }//GEN-LAST:event_limpiarCamposActionPerformed

    private void horaCitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_horaCitaMouseClicked
        
    }//GEN-LAST:event_horaCitaMouseClicked

    private void horaCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horaCitaActionPerformed
        
    }//GEN-LAST:event_horaCitaActionPerformed

    private void nombrePacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombrePacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombrePacienteActionPerformed

    private void tablaCitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCitasMouseClicked
        
        int indiceFila = tablaCitas.rowAtPoint(evt.getPoint());
        indiceCita.setText(String.valueOf(tablaCitas.getValueAt(indiceFila, 0)));
        nombrePaciente.setText(String.valueOf(tablaCitas.getValueAt(indiceFila, 1)));
        apellidoPaterno.setText(String.valueOf(tablaCitas.getValueAt(indiceFila, 2)));
        apellidoMaterno.setText(String.valueOf(tablaCitas.getValueAt(indiceFila, 3)));
        //Cargamos la fecha de nacimiento 
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
        Date nuevaFechaNacimiento;
        try{
            nuevaFechaNacimiento = formatoFecha.parse(String.valueOf(tablaCitas.getValueAt(indiceFila, 4)));
            fechaNacimiento.setDate(nuevaFechaNacimiento);
        }catch(ParseException e){
            System.out.println("Error al transformar fecha nacimiento: " + e.getMessage());
        }
        
        //Cargamos la hora
        String hora_seleccionada = String.valueOf(tablaCitas.getValueAt(indiceFila,5));
        horaSeleccionada = hora_seleccionada;
        haSeleccionadoTabla = true;
        horaCita.removeAllItems();
        if(haSeleccionadoTabla){
            listaHoras.inicializar(ruta, horaCita);
            boolean encontrado = false;
            int indice = 0;
            for(int i = 0; i<horaCita.getItemCount();i++){
                horaCita.setSelectedIndex(i);
                if(horaCita.getSelectedItem().equals(hora_seleccionada)){
                    encontrado = true;
                    indice = i;
                }
            }
            horaCita.setSelectedIndex(indice);
            if(!encontrado){
                horaCita.addItem(String.valueOf(tablaCitas.getValueAt(indiceFila,5)));
                horaCita.setSelectedIndex(horaCita.getItemCount() - 1);
            }
            
            //Cargamos los consultorios
            consultoriosDisponibles.removeAllItems();
             agregarConsultorios();
            consultoriosDisponibles.addItem(String.valueOf(tablaCitas.getValueAt(indiceFila,6)));
            consultoriosDisponibles.setSelectedIndex(consultoriosDisponibles.getItemCount() - 1);
            consultorioCargado = String.valueOf(tablaCitas.getValueAt(indiceFila,6));
            
            //Cargamos la descripcion
            descripcion.setText(String.valueOf(tablaCitas.getValueAt(indiceFila, 7)));
            
        }   
        
        
       
    }//GEN-LAST:event_tablaCitasMouseClicked

    private void horaCitaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_horaCitaItemStateChanged
        
        if(haSeleccionadoTabla == true){      
            //Cargamos los consultorios
            consultoriosDisponibles.removeAllItems();
             agregarConsultorios();
            if(horaSeleccionada.equals(horaCita.getSelectedItem())){
                consultoriosDisponibles.addItem(consultorioCargado);
                
            }
            consultoriosDisponibles.setSelectedIndex(0);
        }else{
            consultoriosDisponibles.removeAllItems();
             agregarConsultorios();
        }
                
    }//GEN-LAST:event_horaCitaItemStateChanged
    
    private void inicializarFechas(){
        fechaNacimiento.setDate(new Date());
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
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidoMaterno;
    private javax.swing.JTextField apellidoPaterno;
    private javax.swing.JComboBox consultoriosDisponibles;
    private javax.swing.JTextArea descripcion;
    private javax.swing.JButton eliminarCita;
    private com.toedter.calendar.JDateChooser fechaNacimiento;
    private javax.swing.JButton guardarCita;
    private javax.swing.JComboBox horaCita;
    private javax.swing.JLabel indiceCita;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton limpiarCampos;
    private javax.swing.JButton modificarCita;
    private javax.swing.JTextField nombrePaciente;
    private javax.swing.JTable tablaCitas;
    // End of variables declaration//GEN-END:variables
       
}
