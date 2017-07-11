
package ModeloDAO;

import Beans.Usuarios;
import controle.ConexaoBDjava;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Statement;

public class DaoUsuario {
    ConexaoBDjava conex = new ConexaoBDjava();
    Usuarios users = new Usuarios();
    
    public void Salvar(Usuarios users){
        conex.conexao();
        try{
            PreparedStatement pat = conex.con.prepareStatement("insert into novocadastrodeusuario(novonomedousuario,novasenhadousuario,novoemaildousuario)values (?,?,?)");
            pat.setString(1, users.getNomedousuario());
            pat.setString(2, users.getNomedasenha());
            pat.setString(3, users.getNomedoemail());
            pat.execute();
            JOptionPane.showMessageDialog(null, "Cadastro Efetuado com sucesso");
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Cadstro não efetuado");
        }
        conex.desconexao();
    }
    
}
