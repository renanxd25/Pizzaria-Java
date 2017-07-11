/*
 * O dao é a classe de alterar de excluir de fazer update
 */
package ModeloDAO;

import Beans.BenasEntrega;
import controle.ConexaoBDjava;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class DaoEntrega {
    ConexaoBDjava conex = new ConexaoBDjava();
    BenasEntrega entrega = new BenasEntrega();
    
    public void Salvar(BenasEntrega entrega){
        conex.conexao();
        try{
            PreparedStatement pat = conex.con.prepareStatement("insert into entrega(endereco,complemento,cep,numerodepedidos)values (?,?,?,?)");
            pat.setString(1, entrega.getEndereco());
            pat.setString(2, entrega.getComplemento());
            pat.setString(3, entrega.getCep());
            pat.setString(4,entrega.getPedidos());
            pat.execute();
            //JOptionPane.showMessageDialog(null, "Cadastro Efetuado");
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao armazenar os dados");
        }
        conex.desconexao();
    }
    
}
