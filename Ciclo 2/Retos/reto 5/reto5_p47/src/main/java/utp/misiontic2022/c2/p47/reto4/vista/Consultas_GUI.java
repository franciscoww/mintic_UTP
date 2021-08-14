package utp.misiontic2022.c2.p47.reto4.vista;

import utp.misiontic2022.c2.p47.reto4.controlador.ControladorRequerimientos;

public class Consultas_GUI extends javax.swing.JFrame {

    private ControladorRequerimientos controlador;
    private Requerimiento1TM requerimiento1TM;
    private Requerimiento2TM requerimiento2TM;
    private Requerimiento3TM requerimiento3TM;
    
    /**
     * Creates new form Consultas_GUI
     */
    public Consultas_GUI() {
        controlador = new ControladorRequerimientos();
        initComponents();
        mostrarConsulta1();
        mostrarConsulta2();
        mostrarConsulta3();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabConsulta1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblConsulta1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblConsulta2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblConsulta3 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SalesPro");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tabConsulta1.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N

        tblConsulta1.setModel(new javax.swing.table.DefaultTableModel(
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
        tblConsulta1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblConsulta1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblConsulta1.setShowGrid(false);
        jScrollPane1.setViewportView(tblConsulta1);

        tabConsulta1.addTab("Proyectos por lider", jScrollPane1);

        tblConsulta2.setModel(new javax.swing.table.DefaultTableModel(
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
        tblConsulta2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblConsulta2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblConsulta2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(tblConsulta2);

        tabConsulta1.addTab("Precios de materiales", jScrollPane2);

        tblConsulta3.setModel(new javax.swing.table.DefaultTableModel(
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
        tblConsulta3.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblConsulta3.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(tblConsulta3);

        tabConsulta1.addTab("Costos proyectos", jScrollPane3);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("SF UI Text", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("/home/francisco/Escritorio/salespro-domains-logo.png")); // NOI18N
        jLabel1.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tabConsulta1, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabConsulta1, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mostrarConsulta1(){
        
        try {
            var req1 = controlador.consultarRequerimiento1();
            requerimiento1TM = new Requerimiento1TM(req1);
            tblConsulta1.setModel(requerimiento1TM);
        } catch (Exception e) {
        }
    }
    
    private void mostrarConsulta2(){
        try {
            var req2 = controlador.consultarRequerimiento2();
            requerimiento2TM = new Requerimiento2TM(req2);
            tblConsulta2.setModel(requerimiento2TM);
        } catch (Exception e) {
        }
    }
    
    private void mostrarConsulta3(){
        try {
            var req3 = controlador.consultarRequerimiento3();
            requerimiento3TM = new Requerimiento3TM(req3);
            tblConsulta3.setModel(requerimiento3TM);
        } catch (Exception e) {
        }
    }
    
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
            java.util.logging.Logger.getLogger(Consultas_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consultas_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consultas_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consultas_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consultas_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane tabConsulta1;
    private javax.swing.JTable tblConsulta1;
    private javax.swing.JTable tblConsulta2;
    private javax.swing.JTable tblConsulta3;
    // End of variables declaration//GEN-END:variables
}
