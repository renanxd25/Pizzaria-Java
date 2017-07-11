/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import Beans.BenasReserva;
import ModeloDAO.DaoReserva;
import controle.ConexaoBDjava;
import java.sql.Date;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author cb
 */
public class Reserva extends javax.swing.JFrame {

    /**
     * importando a conexao da classe do banco de dados
     */
    ConexaoBDjava conex = new ConexaoBDjava();
    BenasReserva reserva = new BenasReserva();
    public Reserva() {
        initComponents();
        escolhertipomesa();
    }
    
    public void escolhertipomesa(){
     conex.conexao();
     conex.executaSql("select *from mesas order by nomemesa");
     try {
         conex.rs.first();
         escolherMesa.removeAllItems();
         do{
            escolherMesa.addItem(conex.rs.getString("nomemesa"));
         }while(conex.rs.next());
        } 
     catch (SQLException ex) {
        JOptionPane.showMessageDialog(rootPane, ex);
        }
     conex.desconexao();
    }
    
    
   
            
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        campodeTurno = new javax.swing.JComboBox<>();
        escolherMesa = new javax.swing.JComboBox<>();
        camponumerodepessoas = new javax.swing.JTextField();
        butaodeFinalizarReserva = new javax.swing.JButton();
        butaodeCancelarReseva = new javax.swing.JButton();
        campodedata = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        campodeNomeCliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel2.setText("DATA");

        jLabel3.setText("MESA");

        jLabel5.setText("Nª DE PESSOAS");

        jLabel6.setText("TURNO");

        campodeTurno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vespertino", "Noturno" }));

        escolherMesa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mesa 1", "Mesa 2", "Mesa 3", "Mesa 4", "Mesa 5", "Mesa 6" }));
        escolherMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escolherMesaActionPerformed(evt);
            }
        });

        butaodeFinalizarReserva.setBackground(new java.awt.Color(51, 255, 0));
        butaodeFinalizarReserva.setText("Finalizar Reserva");
        butaodeFinalizarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butaodeFinalizarReservaActionPerformed(evt);
            }
        });

        butaodeCancelarReseva.setBackground(new java.awt.Color(255, 0, 0));
        butaodeCancelarReseva.setText("Cancelar Reserva");
        butaodeCancelarReseva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butaodeCancelarResevaActionPerformed(evt);
            }
        });

        jLabel4.setText("CLIENTE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(butaodeFinalizarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(butaodeCancelarReseva, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 36, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(campodeNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2))
                                        .addGap(122, 122, 122))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(81, 81, 81)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(camponumerodepessoas)
                                    .addComponent(campodeTurno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(escolherMesa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(campodedata, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(campodeNomeCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(campodedata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(campodeTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(escolherMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(camponumerodepessoas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butaodeFinalizarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butaodeCancelarReseva))
                .addGap(24, 24, 24))
        );

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1.setText("RESERVA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jLabel1)
                .addContainerGap(152, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(376, 374));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void butaodeFinalizarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butaodeFinalizarReservaActionPerformed
        // TODO add your handling code here:
        reserva.setNomedoCliente(campodeNomeCliente.getText());
        reserva.setNumerodePessoas(camponumerodepessoas.getText());
        reserva.setTurno((String) campodeTurno.getSelectedItem());
        reserva.setReservaMesa((String) escolherMesa.getSelectedItem());
        reserva.setData(campodedata.getDate());
        reserva.setStatus("Reservado");
        DaoReserva res = new DaoReserva();
        res.Salvar(reserva);
        
        //JOptionPane.showMessageDialog(null, "Reserva Confirmada");
        dispose();
        
        
    }//GEN-LAST:event_butaodeFinalizarReservaActionPerformed

    private void butaodeCancelarResevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butaodeCancelarResevaActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Você cancelou a Reserva");
        dispose();
    }//GEN-LAST:event_butaodeCancelarResevaActionPerformed

    private void escolherMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escolherMesaActionPerformed
        // TODO add your handling code here:
        
           
        
        
    }//GEN-LAST:event_escolherMesaActionPerformed

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
            java.util.logging.Logger.getLogger(Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reserva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butaodeCancelarReseva;
    private javax.swing.JButton butaodeFinalizarReserva;
    private javax.swing.JTextField campodeNomeCliente;
    private javax.swing.JComboBox<String> campodeTurno;
    private com.toedter.calendar.JDateChooser campodedata;
    private javax.swing.JTextField camponumerodepessoas;
    private javax.swing.JComboBox<String> escolherMesa;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
