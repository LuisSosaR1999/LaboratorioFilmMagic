/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mantenimientos;

import Procesos.Fechas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lsosa
 */
public class MantenimientoVideoJuegos extends javax.swing.JFrame {

    /**
     * Creates new form MantenimientoProducto
     */
    public MantenimientoVideoJuegos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt3 = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        bt4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos3 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bt5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        label_status = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtAutorVideoJuego = new javax.swing.JTextField();
        txtVideoJuego = new javax.swing.JTextField();
        bt1 = new javax.swing.JButton();
        txtCategoriaVideoJuego = new javax.swing.JTextField();
        bt2 = new javax.swing.JButton();
        txtClasificacionVideoJuego = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bt3.setText("Eliminar");
        bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt3ActionPerformed(evt);
            }
        });

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });

        jLabel1.setText("Mantenimiento De VideoJuegos");

        bt4.setText("Buscar");
        bt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt4ActionPerformed(evt);
            }
        });

        jLabel2.setText("Autor");

        tblDatos3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Autor", "VideoJuego", "Categoria", "Clasificacion"
            }
        ));
        jScrollPane1.setViewportView(tblDatos3);
        if (tblDatos3.getColumnModel().getColumnCount() > 0) {
            tblDatos3.getColumnModel().getColumn(0).setResizable(false);
        }

        jLabel3.setText("Categoria");

        jLabel4.setText("VideoJuego");

        bt5.setText("Fechas");
        bt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt5ActionPerformed(evt);
            }
        });

        jLabel5.setText("Clasificacion");

        jLabel6.setText("Buscar:");

        bt1.setText("Agregar");
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });

        txtCategoriaVideoJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCategoriaVideoJuegoActionPerformed(evt);
            }
        });

        bt2.setText("Editar");
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(34, 34, 34)
                        .addComponent(txtClasificacionVideoJuego, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAutorVideoJuego)
                            .addComponent(txtVideoJuego)
                            .addComponent(txtCategoriaVideoJuego))))
                .addGap(571, 571, 571))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(320, 320, 320)
                            .addComponent(jLabel1)
                            .addGap(211, 211, 211))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(159, 159, 159)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(47, 47, 47))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(328, 328, 328)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(bt2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(bt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(bt3)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(225, 225, 225)
                                        .addComponent(label_status, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(bt4)
                                        .addGap(84, 84, 84))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(bt5)
                                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGap(90, 90, 90)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtAutorVideoJuego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtVideoJuego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCategoriaVideoJuego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtClasificacionVideoJuego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(289, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(13, 13, 13)
                    .addComponent(jLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(bt1)
                    .addGap(17, 17, 17)
                    .addComponent(bt2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(bt3)
                    .addGap(27, 27, 27)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(bt4)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(bt5)
                        .addComponent(label_status, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(28, 28, 28)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(14, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt3ActionPerformed
        // TODO add your handling code here:
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/MBD1?useSSL=false", "root", "lfsr1999");
            PreparedStatement pst = cn.prepareStatement("delete from MantenimientoVideoJuego where ID = ?" );

            pst.setString(1, txtBuscar.getText().trim());

            pst.executeUpdate();

            txtBuscar.setText("");
            txtAutorVideoJuego.setText("");
            txtVideoJuego.setText("");
            txtCategoriaVideoJuego.setText("");
            txtClasificacionVideoJuego.setText("");
            

            label_status.setText("Registro Eliminado con exito");

        } catch (Exception e) {
        }

        DefaultTableModel modelo = (DefaultTableModel) tblDatos3.getModel();
        int a=tblDatos3.getSelectedRow();
        if (a<0){
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila");
        }else{
            int confirmar = JOptionPane.showConfirmDialog(null, "Esta seguro que desea eliminar el registro?");
            if (JOptionPane.OK_OPTION == confirmar){
                modelo.removeRow(a);
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
            }
        }

    }//GEN-LAST:event_bt3ActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void bt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt4ActionPerformed
        // TODO add your handling code here:

        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/MBD1?useSSL=false", "root", "lfsr1999");
            PreparedStatement pst = cn.prepareStatement("select * from MantenimientoVideoJuego where ID = ?");
            pst.setString(1, txtBuscar.getText().trim());

            ResultSet rs = pst.executeQuery();

            if(rs.next()){
                txtAutorVideoJuego.setText(rs.getString("AutorVideoJuego"));
                txtVideoJuego.setText(rs.getString("NombreVideoJuego"));
                txtCategoriaVideoJuego.setText(rs.getString("Categorias"));
                txtClasificacionVideoJuego.setText(rs.getString("Clasificacion"));
                

            } else {
                JOptionPane.showMessageDialog(null, "Empleado no registrado.");
            }

        }catch (Exception e){

        }

    }//GEN-LAST:event_bt4ActionPerformed

    private void bt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt5ActionPerformed
        // TODO add your handling code here:
        Fechas fe=new Fechas();
        fe.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_bt5ActionPerformed

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
        // TODO add your handling code here:
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/MBD1?useSSL=false", "root", "lfsr1999");
            PreparedStatement pst = cn.prepareStatement("insert into MantenimientoVideoJuego values(?,?,?,?,?)");

            pst.setString(1, "0");
            //  pst.setString(1,buscar.getText().trim());
            pst.setString(2, txtAutorVideoJuego.getText().trim());
            pst.setString(3, txtVideoJuego.getText().trim());
            pst.setString(4, txtCategoriaVideoJuego.getText().trim());
            pst.setString(5, txtClasificacionVideoJuego.getText().trim());
            

            pst.executeUpdate();

            txtBuscar.setText("");
            txtAutorVideoJuego.setText("");
            txtVideoJuego.setText("");
            txtCategoriaVideoJuego.setText("");
            txtClasificacionVideoJuego.setText("");
            

            label_status.setText("Registro exitoso.");

        }catch (Exception e){

        }
        DefaultTableModel modelo = (DefaultTableModel) tblDatos3.getModel();
        Object  [] fila=new Object [7];

        fila[0]=txtAutorVideoJuego.getText();
        fila[1]=txtVideoJuego.getText();
        fila[2]=txtCategoriaVideoJuego.getText();
        fila[3]=txtClasificacionVideoJuego.getText();
        
        modelo.addRow(fila);
        tblDatos3.setModel(modelo);

    }//GEN-LAST:event_bt1ActionPerformed

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
        // TODO add your handling code here:

        try{ String Codigo = txtBuscar.getText().trim();
            Connection cn= DriverManager.getConnection("jdbc:mysql://localhost/MBD1?useSSL=false","root","lfsr1999");
            PreparedStatement pst = cn.prepareStatement("update MantenimientoVideoJuego set AutorVideoJuego=?,NombreVideoJuego=?,Categorias=?,Clasificacion=? where ID = " + Codigo);

            pst.setString(1, txtAutorVideoJuego.getText().trim());
            pst.setString(2, txtVideoJuego.getText().trim());
            pst.setString(3, txtCategoriaVideoJuego.getText().trim());
            pst.setString(4, txtClasificacionVideoJuego.getText().trim());
            

            pst.executeUpdate();

            label_status.setText("Registro Editado con exito");

        } catch (Exception e) {

        }

        Object  [] fila=new Object [7];
        //fila[0]=txtCodigo.getText();
        fila[0]=txtAutorVideoJuego.getText();
        fila[1]=txtVideoJuego.getText();
        fila[2]=txtCategoriaVideoJuego.getText();
        fila[3]=txtClasificacionVideoJuego.getText();
        
        int i = 0;

    }//GEN-LAST:event_bt2ActionPerformed

    private void txtCategoriaVideoJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCategoriaVideoJuegoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCategoriaVideoJuegoActionPerformed

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
            java.util.logging.Logger.getLogger(MantenimientoVideoJuegos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MantenimientoVideoJuegos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MantenimientoVideoJuegos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MantenimientoVideoJuegos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MantenimientoVideoJuegos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt2;
    private javax.swing.JButton bt3;
    private javax.swing.JButton bt4;
    private javax.swing.JButton bt5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_status;
    private javax.swing.JTable tblDatos3;
    private javax.swing.JTextField txtAutorVideoJuego;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCategoriaVideoJuego;
    private javax.swing.JTextField txtClasificacionVideoJuego;
    private javax.swing.JTextField txtVideoJuego;
    // End of variables declaration//GEN-END:variables
}