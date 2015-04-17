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
public class Prato extends Item_Pedido {
    private String nomePrato;
    private char tamanhoPrato;

    public Prato(int idItem_Pedido, int precoItem_Pedido, Pedido pedido_origem, String nomePrato, char tamanhoPrato) {
        super(idItem_Pedido, precoItem_Pedido, pedido_origem);
        this.nomePrato = nomePrato;
        this.tamanhoPrato = tamanhoPrato;
    }
    
    public Prato(int precoItem_Pedido, Pedido pedido_origem, String nomePrato, char tamanhoPrato) {
        super(precoItem_Pedido, pedido_origem);
        this.nomePrato = nomePrato;
        this.tamanhoPrato = tamanhoPrato;
    }

    public Prato() {
    }

    public String getNomePrato() {
        return nomePrato;
    }

    public void setNomePrato(String nomePrato) {
        this.nomePrato = nomePrato;
    }

    public char getTamanhoPrato() {
        return tamanhoPrato;
    }

    public void setTamanhoPrato(char tamanhoPrato) {
        this.tamanhoPrato = tamanhoPrato;
    }
      
    public void cadastrarPrato(){
        
    }
}
