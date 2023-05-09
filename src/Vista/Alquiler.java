/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.Controlador_Reservacion;

/**
 *
 * @author Portatil
 */
public class Alquiler extends javax.swing.JFrame {

    Controlador_Reservacion controladorReservacion;

    public Alquiler() {
        initComponents();

        this.setLocationRelativeTo(null);

        this.setResizable(false);

        controladorReservacion = new Controlador_Reservacion(this);
        controladorReservacion.LlenarCombobox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtReservacion_NombreU = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtReservacion_Dni = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Cbox_TipoVh = new javax.swing.JComboBox<String>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtReservacion_NumPlacaV = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtReservacion_ColorVh = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtReservacion_MarcaV = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtReservacion_TiempoR = new javax.swing.JTextField();
        btnReservacion_Asignacion_Puesto = new javax.swing.JButton();
        btnReservacion_Cancelar = new javax.swing.JButton();
        btnReservacion_Reservar = new javax.swing.JButton();
        txtReservacion_Puesto_Escogido = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(177, 168, 179));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 134, 120));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MOBILEXO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 12, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(java.awt.Color.red);
        jLabel4.setText("Datos del Cliente:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 79, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre de Usuario: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 111, -1, -1));

        txtReservacion_NombreU.setBackground(new java.awt.Color(255, 255, 255));
        txtReservacion_NombreU.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(txtReservacion_NombreU, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 137, 170, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Dni:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 111, -1, -1));

        txtReservacion_Dni.setBackground(new java.awt.Color(255, 255, 255));
        txtReservacion_Dni.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(txtReservacion_Dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 137, 170, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Tipo de Vehiculo:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, -1, -1));

        Cbox_TipoVh.setBackground(new java.awt.Color(255, 255, 255));
        Cbox_TipoVh.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(Cbox_TipoVh, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 132, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(java.awt.Color.red);
        jLabel5.setText("Datos del Vehiculo:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 175, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("N° de Placa: ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 201, -1, -1));

        txtReservacion_NumPlacaV.setBackground(new java.awt.Color(255, 255, 255));
        txtReservacion_NumPlacaV.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtReservacion_NumPlacaV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReservacion_NumPlacaVActionPerformed(evt);
            }
        });
        jPanel1.add(txtReservacion_NumPlacaV, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 227, 170, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Color:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, -1, -1));

        txtReservacion_ColorVh.setBackground(new java.awt.Color(255, 255, 255));
        txtReservacion_ColorVh.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(txtReservacion_ColorVh, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 170, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Marca:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 250, -1, -1));

        txtReservacion_MarcaV.setBackground(new java.awt.Color(255, 255, 255));
        txtReservacion_MarcaV.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(txtReservacion_MarcaV, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 277, 170, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(java.awt.Color.red);
        jLabel9.setText("Datos del Vehiculo:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Ingrese el tiempo de reserva:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        txtReservacion_TiempoR.setBackground(new java.awt.Color(255, 255, 255));
        txtReservacion_TiempoR.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(txtReservacion_TiempoR, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 170, -1));

        btnReservacion_Asignacion_Puesto.setBackground(new java.awt.Color(0, 117, 211));
        btnReservacion_Asignacion_Puesto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnReservacion_Asignacion_Puesto.setForeground(new java.awt.Color(0, 0, 0));
        btnReservacion_Asignacion_Puesto.setText("Puestos Disponibles");
        jPanel1.add(btnReservacion_Asignacion_Puesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, -1, -1));

        btnReservacion_Cancelar.setBackground(new java.awt.Color(255, 39, 37));
        btnReservacion_Cancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnReservacion_Cancelar.setForeground(new java.awt.Color(0, 0, 0));
        btnReservacion_Cancelar.setText("Cancelar");
        btnReservacion_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservacion_CancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnReservacion_Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 430, -1, -1));

        btnReservacion_Reservar.setBackground(new java.awt.Color(0, 117, 211));
        btnReservacion_Reservar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnReservacion_Reservar.setForeground(new java.awt.Color(0, 0, 0));
        btnReservacion_Reservar.setText("Reservar");
        jPanel1.add(btnReservacion_Reservar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, -1));

        txtReservacion_Puesto_Escogido.setBackground(new java.awt.Color(255, 255, 255));
        txtReservacion_Puesto_Escogido.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(txtReservacion_Puesto_Escogido, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 170, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Puesto Escogido:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReservacion_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservacion_CancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReservacion_CancelarActionPerformed

    private void txtReservacion_NumPlacaVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReservacion_NumPlacaVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReservacion_NumPlacaVActionPerformed

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
            java.util.logging.Logger.getLogger(Alquiler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alquiler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alquiler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alquiler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alquiler().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> Cbox_TipoVh;
    public javax.swing.JButton btnReservacion_Asignacion_Puesto;
    public javax.swing.JButton btnReservacion_Cancelar;
    public javax.swing.JButton btnReservacion_Reservar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JTextField txtReservacion_ColorVh;
    public javax.swing.JTextField txtReservacion_Dni;
    public javax.swing.JTextField txtReservacion_MarcaV;
    public javax.swing.JTextField txtReservacion_NombreU;
    public javax.swing.JTextField txtReservacion_NumPlacaV;
    public javax.swing.JTextField txtReservacion_Puesto_Escogido;
    public javax.swing.JTextField txtReservacion_TiempoR;
    // End of variables declaration//GEN-END:variables
}
