/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author sala305b
 */
public class Telefone {

    /**
     * @return the idtelefone
     */
    public int getIdtelefone() {
        return idtelefone;
    }

    /**
     * @param idtelefone the idtelefone to set
     */
    public void setIdtelefone(int idtelefone) {
        this.idtelefone = idtelefone;
    }

    /**
     * @return the ddd
     */
    public String getDdd() {
        return ddd;
    }

    /**
     * @param ddd the ddd to set
     */
    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the idcliente
     */
    public int getIdcliente() {
        return idcliente;
    }

    /**
     * @param idcliente the idcliente to set
     */
    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }
    
    private int idtelefone;
    private String ddd;
    private String telefone;
    private int idcliente;
    
}
