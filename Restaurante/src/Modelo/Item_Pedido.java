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
public class Item_Pedido {
    private int idItem_Pedido;
    private int precoItem_Pedido;
    private Pedido pedido_origem;

    public Item_Pedido(int idItem_Pedido, int precoItem_Pedido, Pedido pedido_origem) {
        this.idItem_Pedido = idItem_Pedido;
        this.precoItem_Pedido = precoItem_Pedido;
        this.pedido_origem = pedido_origem;
    }

    public Item_Pedido(int precoItem_Pedido, Pedido pedido_origem) {
        this.precoItem_Pedido = precoItem_Pedido;
        this.pedido_origem = pedido_origem;
    }

    public Item_Pedido() {
    }

    public int getIdItem_Pedido() {
        return idItem_Pedido;
    }

    public void setIdItem_Pedido(int idItem_Pedido) {
        this.idItem_Pedido = idItem_Pedido;
    }

    public int getPrecoItem_Pedido() {
        return precoItem_Pedido;
    }

    public void setPrecoItem_Pedido(int precoItem_Pedido) {
        this.precoItem_Pedido = precoItem_Pedido;
    }

    public Pedido getPedido_origem() {
        return pedido_origem;
    }

    public void setPedido_origem(Pedido pedido_origem) {
        this.pedido_origem = pedido_origem;
    }
}
