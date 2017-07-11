/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

/**
 *
 * @author cb
 */
public class Usuarios {
    private Integer codigo;
    private String Nomedousuario;
    private String Nomedasenha;
    private String Nomedoemail;

    public Integer getCodigo() {
        return codigo;
    }

    public String getNomedoemail() {
        return Nomedoemail;
    }

    public void setNomedoemail(String nomedoemail) {
        this.Nomedoemail = nomedoemail;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNomedousuario() {
        return Nomedousuario;
    }

    public void setNomedousuario(String nomedousuario) {
        this.Nomedousuario = nomedousuario;
    }

    public String getNomedasenha() {
        return Nomedasenha;
    }

    public void setNomedasenha(String nomedasenha) {
        this.Nomedasenha = nomedasenha;
    }
    
    
}
