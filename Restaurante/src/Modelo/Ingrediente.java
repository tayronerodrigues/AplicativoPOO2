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
public class Ingrediente {
    private String nomeIngrediente;
    private int idIngrediente;
    private String descricaoIngrediente;

    public Ingrediente(String nomeIngrediente, int idIngrediente, String descricaoIngrediente) {
        this.nomeIngrediente = nomeIngrediente;
        this.idIngrediente = idIngrediente;
        this.descricaoIngrediente = descricaoIngrediente;
    }

    public Ingrediente(String nomeIngrediente, String descricaoIngrediente) {
        this.nomeIngrediente = nomeIngrediente;
        this.descricaoIngrediente = descricaoIngrediente;
    }

    public Ingrediente() {
    }
    
    public void cadastrarIngrediente(){
        
    }

    public String getNomeIngrediente() {
        return nomeIngrediente;
    }

    public void setNomeIngrediente(String nomeIngrediente) {
        this.nomeIngrediente = nomeIngrediente;
    }

    public int getIdIngrediente() {
        return idIngrediente;
    }

    public void setIdIngrediente(int idIngrediente) {
        this.idIngrediente = idIngrediente;
    }

    public String getDescricaoIngrediente() {
        return descricaoIngrediente;
    }

    public void setDescricaoIngrediente(String descricaoIngrediente) {
        this.descricaoIngrediente = descricaoIngrediente;
    }
    
    
}
