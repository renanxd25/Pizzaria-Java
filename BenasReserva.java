/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.util.Date;



/**
 *
 * @author cb
 */
public class BenasReserva {
    private int reservaCod;
    private String reservaMesa;
    private String nomedoCliente;
    private String turno;
    private Date data;
    private String numerodePessoas;
    private String status;

    public int getReservaCod() {
        return reservaCod;
    }

    public void setReservaCod(int reservaCod) {
        this.reservaCod = reservaCod;
    }

    public String getReservaMesa() {
        return reservaMesa;
    }

    public void setReservaMesa(String reservaMesa) {
        this.reservaMesa = reservaMesa;
    }

    public String getNomedoCliente() {
        return nomedoCliente;
    }

    public void setNomedoCliente(String nomedoCliente) {
        this.nomedoCliente = nomedoCliente;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getNumerodePessoas() {
        return numerodePessoas;
    }

    public void setNumerodePessoas(String numerodePessoas) {
        this.numerodePessoas = numerodePessoas;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
}
