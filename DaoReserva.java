/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Beans.BenasReserva;
import controle.ConexaoBDjava;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author cb
 */
public class DaoReserva {
    BenasReserva rese = new BenasReserva();
    ConexaoBDjava conex = new ConexaoBDjava();
    ConexaoBDjava mesa = new ConexaoBDjava();
    int codReserva;
    int codMesa;
    public void Salvar(BenasReserva rese){
        //escolhermesa(resevar.getReservaMesa());
        conex.conexao();
        
        try {
            PreparedStatement pat = conex.con.prepareStatement("insert into reserva (codigomesa,turno,datadereserva,statusdereserva,numerodepessoas,nomedocliente)values (?,?,?,?,?,?)");
            //codigodereserva
            //pat.setInt(1,codReserva);
            pat.setInt(1,codMesa);
            pat.setString(2, rese.getTurno());
            pat.setDate(3, new java.sql.Date(rese.getData().getTime()));
            pat.setString(4,rese.getStatus());
            pat.setString(5, rese.getNumerodePessoas());
            pat.setString(6, rese.getNomedoCliente());
            pat.execute();
            JOptionPane.showMessageDialog(null, "Reserva Efetuada");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao confirmar reseva" + ex);
        }
    }
    
    public void escolhermesa(String buscamesa ){
        mesa.conexao();
        mesa.executaSql("select *from reserva where codigomesa='"+buscamesa+"'");
        try {
            mesa.rs.first();
            codMesa = conex.rs.getInt("codigomesa");
  
        } catch (SQLException ex) {
            Logger.getLogger(DaoReserva.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}
