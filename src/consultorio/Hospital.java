
package consultorio;

public class Hospital extends javax.swing.JFrame {

    /* Método Constructor */
    public Hospital() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    /* Código de creación de componentes */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        barraDeMenu = new javax.swing.JMenuBar();
        menuCitas = new javax.swing.JMenu();
        opcionesCitas = new javax.swing.JMenuItem();
        verCitas = new javax.swing.JMenuItem();
        menuConsultorios = new javax.swing.JMenu();
        verConsultorios = new javax.swing.JMenuItem();
        menuMedicamentos = new javax.swing.JMenu();
        opcionesMedicamentos = new javax.swing.JMenuItem();
        verMedicamentos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        menuCitas.setText("Citas");

        opcionesCitas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        opcionesCitas.setText("Opciones");
        opcionesCitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionesCitasActionPerformed(evt);
            }
        });
        menuCitas.add(opcionesCitas);

        verCitas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        verCitas.setText("Ver todas");
        verCitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verCitasActionPerformed(evt);
            }
        });
        menuCitas.add(verCitas);

        barraDeMenu.add(menuCitas);

        menuConsultorios.setText("Consultorios");

        verConsultorios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        verConsultorios.setText("Ver todos");
        verConsultorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verConsultoriosActionPerformed(evt);
            }
        });
        menuConsultorios.add(verConsultorios);

        barraDeMenu.add(menuConsultorios);

        menuMedicamentos.setText("Medicamentos");

        opcionesMedicamentos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        opcionesMedicamentos.setText("Opciones");
        opcionesMedicamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionesMedicamentosActionPerformed(evt);
            }
        });
        menuMedicamentos.add(opcionesMedicamentos);

        verMedicamentos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        verMedicamentos.setText("Ver todos");
        verMedicamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verMedicamentosActionPerformed(evt);
            }
        });
        menuMedicamentos.add(verMedicamentos);

        barraDeMenu.add(menuMedicamentos);

        setJMenuBar(barraDeMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /* Fin de código de creación de componentes */
    
    
    /* Eventos y Métodos de la clase principal */
    private void opcionesCitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionesCitasActionPerformed
        Agendar agendar = new Agendar();
        int x = (escritorio.getWidth() - agendar.getWidth())/2;
        int y = (escritorio.getHeight() - agendar.getHeight())/2;
        agendar.setLocation(x,y);
        escritorio.add(agendar);
        agendar.show();
    }//GEN-LAST:event_opcionesCitasActionPerformed

    private void verConsultoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verConsultoriosActionPerformed
        Consultorios consultorios = new Consultorios();
        int x = (escritorio.getWidth() - consultorios.getWidth())/2;
        int y = (escritorio.getHeight() - consultorios.getHeight())/2;
        consultorios.setLocation(x,y);
        escritorio.add(consultorios);
        consultorios.show();
    }//GEN-LAST:event_verConsultoriosActionPerformed

    private void verCitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verCitasActionPerformed
        VerCitas citasAgendadas = new VerCitas();
        int x = (escritorio.getWidth() - citasAgendadas.getWidth())/2;
        int y = (escritorio.getHeight() - citasAgendadas.getHeight())/2;
        citasAgendadas.setLocation(x,y);
        escritorio.add(citasAgendadas);
        citasAgendadas.show();
        
    }//GEN-LAST:event_verCitasActionPerformed

    private void opcionesMedicamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionesMedicamentosActionPerformed
        Medicamentos medicamentos = new Medicamentos();
        int x = (escritorio.getWidth() - medicamentos.getWidth())/2;
        int y = (escritorio.getHeight() - medicamentos.getHeight())/2;
        medicamentos.setLocation(x,y);
        escritorio.add(medicamentos);
        medicamentos.show();
    }//GEN-LAST:event_opcionesMedicamentosActionPerformed

    private void verMedicamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verMedicamentosActionPerformed
        VerMedicamentos todosLosMedicamentos = new VerMedicamentos();
        int x = (escritorio.getWidth() - todosLosMedicamentos.getWidth())/2;
        int y = (escritorio.getHeight() - todosLosMedicamentos.getHeight())/2;
        todosLosMedicamentos.setLocation(x,y);
        escritorio.add(todosLosMedicamentos);
        todosLosMedicamentos.show();
    }//GEN-LAST:event_verMedicamentosActionPerformed
        
    
    /* Método principal desde donde arrancará el sistema */
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
            java.util.logging.Logger.getLogger(Hospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Se crea y se ejecuta el sistema */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hospital().setVisible(true);
            }
        });
    }
    /* Estas son las variables donde se guardará cada componente */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraDeMenu;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu menuCitas;
    private javax.swing.JMenu menuConsultorios;
    private javax.swing.JMenu menuMedicamentos;
    private javax.swing.JMenuItem opcionesCitas;
    private javax.swing.JMenuItem opcionesMedicamentos;
    private javax.swing.JMenuItem verCitas;
    private javax.swing.JMenuItem verConsultorios;
    private javax.swing.JMenuItem verMedicamentos;
    // End of variables declaration//GEN-END:variables
}
