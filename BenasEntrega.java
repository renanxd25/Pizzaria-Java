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
public class BenasEntrega {
    private int codentrega;
    private String nomecliente;
    private String endereco;       
    private String complemento;
    private String cep;
    private String pedidos;

    public int getCodentrega() {
        return codentrega;
    }

    public void setCodentrega(int codentrega) {
        this.codentrega = codentrega;
    }

    public String getNomecliente() {
        return nomecliente;
    }

    public void setNomecliente(String nomecliente) {
        this.nomecliente = nomecliente;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getPedidos() {
        return pedidos;
    }

    public void setPedidos(String pedidos) {
        this.pedidos = pedidos;
    }

    public void getEndereco(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void getComplemento(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void getCep(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
