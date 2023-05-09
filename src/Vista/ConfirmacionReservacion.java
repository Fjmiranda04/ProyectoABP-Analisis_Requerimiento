/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.ConexionMySQL;
import Modelo.ModeloRegistro;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;

/**
 *
 * @author Franklyn Miranda
 */
public class ConfirmacionReservacion extends javax.swing.JFrame {

    ConexionMySQL conexion = new ConexionMySQL();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public ConfirmacionReservacion() {
        initComponents();
        botones();
        buscarPuestoReservado();

    }

    int filas = 3;
    int columnas = 5;
    int largoBoton = 120;
    int anchoBoton = 40;
    int ejeX = 10;
    int ejeY = 20;

    public JToggleButton[][] JTBotones = new JToggleButton[filas][columnas];

    public void botones() {

        Font fuenteLetra = new Font("Segoe UI", Font.BOLD, 12);
        int contadorPuestoParqueo = 1;
        JTBotones = new JToggleButton[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                JTBotones[i][j] = new JToggleButton();
                JTBotones[i][j].setBounds(ejeX, ejeY, largoBoton, anchoBoton);
                JTBotones[i][j].setText("Puesto " + contadorPuestoParqueo);
                JTBotones[i][j].setFont(fuenteLetra);
                JTBotones[i][j].setBackground(new Color(0, 255, 0));

                accionBotones accion = new accionBotones();

                JTBotones[i][j].addActionListener(accion);

                JPnlBotones.add(JTBotones[i][j]);

                contadorPuestoParqueo++;
                ejeX += 150;
            }
            ejeX = 10;
            ejeY += 60;
        }
    }

    public void reservacionPuesto(int numeroPuesto) {

        String sql = "UPDATE reservacionpuesto SET Estado_Reservacion = 'Si' WHERE Numero_Puesto =  " + numeroPuesto;

        try {

            con = conexion.getConnection();
            ps = con.prepareStatement(sql);

            int mensaje = ps.executeUpdate();

            if (mensaje > 0) {
                JOptionPane.showMessageDialog(null, "Puesto de Parqueo Reservado");
            } else {
                JOptionPane.showMessageDialog(null, "Error en el proceso de reservacion.");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());

        } finally {
            try {

                con.close();

            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }

    public void quitarReservacionPuesto(int numeroPuesto) {

        String sql = "UPDATE reservacionpuesto SET Estado_Reservacion = 'No' WHERE Numero_Puesto =  " + numeroPuesto;

        try {

            con = conexion.getConnection();
            ps = con.prepareStatement(sql);

            int mensaje = ps.executeUpdate();

            if (mensaje > 0) {
                JOptionPane.showMessageDialog(null, "Reservacion Finalizada");
            } else {
                JOptionPane.showMessageDialog(null, "Error en el proceso de reservacion.");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());

        } finally {
            try {

                con.close();

            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }

    public void buscarPuestoReservado() {

        String sql = "SELECT Estado_Reservacion,Numero_Puesto FROM reservacionpuesto";

        try {

            con = conexion.getConnection();
            ps = con.prepareStatement(sql);

            rs = ps.executeQuery();

            int numeroPuesto;
            String estadoReselvado;

            while (rs.next()) {

                numeroPuesto = rs.getInt("Numero_Puesto");
                estadoReselvado = rs.getString("Estado_Reservacion");

                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {

                        if (JTBotones[i][j].getText().length() == 8) {
                            String numeroLetra = JTBotones[i][j].getText().charAt(7) + "";
                            int numero = Integer.parseInt(numeroLetra);

                            if ((numeroPuesto == numero) && (estadoReselvado.equals("Si"))) {
                                JTBotones[i][j].setBackground(new Color(204, 0, 0));
                                JTBotones[i][j].setSelected(true);

                            }
                        } else if (JTBotones[i][j].getText().length() == 9) {
                            String numeroLetra = JTBotones[i][j].getText().charAt(7) + "" + JTBotones[i][j].getText().charAt(8);
                            int numero = Integer.parseInt(numeroLetra);

                            if ((numeroPuesto == numero) && (estadoReselvado.equals("Si"))) {
                                JTBotones[i][j].setBackground(new Color(204, 0, 0));
                                JTBotones[i][j].setSelected(true);

                            }
                        }

                    }
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());

        }
    }

    public class accionBotones implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {

                    if (e.getSource().equals(JTBotones[i][j])) {
                        if (JTBotones[i][j].isSelected()) {
                            JTBotones[i][j].setBackground(new Color(204, 0, 0));

                            if (JTBotones[i][j].getText().length() == 8) {

                                String numeroLetra = JTBotones[i][j].getText().charAt(7) + "";
                                int numero = Integer.parseInt(numeroLetra);
                                reservacionPuesto(numero);

                            } else if (JTBotones[i][j].getText().length() == 9) {
                                String numeroLetra = JTBotones[i][j].getText().charAt(7) + "" + JTBotones[i][j].getText().charAt(8);
                                int numero = Integer.parseInt(numeroLetra);
                                reservacionPuesto(numero);
                            }
                        } else {
                            JTBotones[i][j].setBackground(new Color(0, 255, 0));
                            if (JTBotones[i][j].getText().length() == 8) {

                                String numeroLetra = JTBotones[i][j].getText().charAt(7) + "";
                                int numero = Integer.parseInt(numeroLetra);
                                quitarReservacionPuesto(numero);

                            } else if (JTBotones[i][j].getText().length() == 9) {
                                String numeroLetra = JTBotones[i][j].getText().charAt(7) + "" + JTBotones[i][j].getText().charAt(8);
                                int numero = Integer.parseInt(numeroLetra);
                                quitarReservacionPuesto(numero);
                            }
                        }
                    }
                }
            }
        }

    }

//--------------------------------------------------------------------------------------------------------------------------------------
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JPnlBotones = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnConReservacion_Atras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(177, 168, 179));

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

        JPnlBotones.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout JPnlBotonesLayout = new javax.swing.GroupLayout(JPnlBotones);
        JPnlBotones.setLayout(JPnlBotonesLayout);
        JPnlBotonesLayout.setHorizontalGroup(
            JPnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );
        JPnlBotonesLayout.setVerticalGroup(
            JPnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(0, 255, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Puesto Parqueo Disponible");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Puesto Parqueo Reservado");

        btnConReservacion_Atras.setBackground(new java.awt.Color(0, 117, 211));
        btnConReservacion_Atras.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnConReservacion_Atras.setForeground(new java.awt.Color(0, 0, 0));
        btnConReservacion_Atras.setText("Atras");
        btnConReservacion_Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConReservacion_AtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JPnlBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConReservacion_Atras)
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JPnlBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addComponent(btnConReservacion_Atras, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(19, 19, 19))
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

    private void btnConReservacion_AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConReservacion_AtrasActionPerformed
        Alquiler reservarcion = new Alquiler();
        reservarcion.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnConReservacion_AtrasActionPerformed

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
            java.util.logging.Logger.getLogger(ConfirmacionReservacion.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfirmacionReservacion.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfirmacionReservacion.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfirmacionReservacion.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfirmacionReservacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel JPnlBotones;
    public javax.swing.JButton btnConReservacion_Atras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
