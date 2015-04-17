/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Rafael
 */
public class Mesa {
    private int idMesa;
    private Funcionario atendenteMesa;

    public Mesa(int idMesa, Funcionario atendenteMesa) {
        this.idMesa = idMesa;
        this.atendenteMesa = atendenteMesa;
    }

    public Mesa(Funcionario atendenteMesa) {
        this.atendenteMesa = atendenteMesa;
    }

    public Mesa() {
    }

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public Funcionario getAtendenteMesa() {
        return atendenteMesa;
    }

    public void setAtendenteMesa(Funcionario atendenteMesa) {
        this.atendenteMesa = atendenteMesa;
    }
    
    
}
