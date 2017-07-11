/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConexaoBDjava {
    // Resposavel por realizar a pesquisa no banco de dados
    public Statement stm;
    // Armazena o resultado da pesquisa
    public ResultSet rs;
    //Indentifica o serviço do banco de dados
    private final  String driver = "org.postgresql.Driver";
    //Vai dizer qual a locallização do banco de dados ou seja o caminho a seguir
    private final  String caminho ="jdbc:postgresql://localhost:5433/novoprojetorestarante";
    //Usuario do banco de dados server
    private final  String usuario = "postgres";
    //Senha do banco de dados sever
    private final  String senha = "RENANBBXD25";
    //Essa variavel realiza a conexão com o banco de dados
    public Connection con;
    
    // metodo para conecter o  banco de dados
    public void conexao(){
        System.setProperty("jdbc.Drivers", driver);
        /*O try catch forma a codições de conexão do banco de dados
        se o banco estiver conectado ele mostrará a mensagem no JOptionpane de 
        conexão sucessedia ou não.
        */
        try {
            con = DriverManager.getConnection(caminho, usuario,senha);
            //JOptionPane.showMessageDialog(null, "Conexão efetuada com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de conexão do banco de dados:\n" +ex.getMessage());
        }
    }
    
    public void desconexao(){
        try {
            con.close();
            //JOptionPane.showMessageDialog(null, "Banco de dados desconectado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao conectar oo banco:\n" + ex.getMessage());
        }
        
    
    }

    public void executaSql(String sql) {
        try {
            stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY); //To change body of generated methods, choose Tools | Templates.
            rs = stm.executeQuery(sql);
                    } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao conectar oo banco:\n" + ex.getMessage());
        }
    }
    /*public void executaSql(String string) {
       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }*/
    
}
