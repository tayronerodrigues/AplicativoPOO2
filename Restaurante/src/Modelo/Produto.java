/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author Rafael
 */
public class Produto extends Item_Pedido{
    private int qtdEstoqueProduto;
    private Date dataValidadeProduto; 
    private String nomeProduto;
    private float precoCompraProduto;

    public Produto(int qtdEstoqueProduto, Date dataValidadeProduto, String nomeProduto, float precoCompraProduto, int idItem_Pedido, int precoItem_Pedido, Pedido pedido_origem) {
        super(idItem_Pedido, precoItem_Pedido, pedido_origem);
        this.qtdEstoqueProduto = qtdEstoqueProduto;
        this.dataValidadeProduto = dataValidadeProduto;
        this.nomeProduto = nomeProduto;
        this.precoCompraProduto = precoCompraProduto;
    }

    public Produto(int qtdEstoqueProduto, Date dataValidadeProduto, String nomeProduto, float precoCompraProduto, int precoItem_Pedido, Pedido pedido_origem) {
        super(precoItem_Pedido, pedido_origem);
        this.qtdEstoqueProduto = qtdEstoqueProduto;
        this.dataValidadeProduto = dataValidadeProduto;
        this.nomeProduto = nomeProduto;
        this.precoCompraProduto = precoCompraProduto;
    }

    public Produto() {
    }
    
    public void cadastrarProduto(){
        
    }

    public int getQtdEstoqueProduto() {
        return qtdEstoqueProduto;
    }

    public void setQtdEstoqueProduto(int qtdEstoqueProduto) {
        this.qtdEstoqueProduto = qtdEstoqueProduto;
    }

    public Date getDataValidadeProduto() {
        return dataValidadeProduto;
    }

    public void setDataValidadeProduto(Date dataValidadeProduto) {
        this.dataValidadeProduto = dataValidadeProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public float getPrecoCompraProduto() {
        return precoCompraProduto;
    }

    public void setPrecoCompraProduto(float precoCompraProduto) {
        this.precoCompraProduto = precoCompraProduto;
    }    
}
