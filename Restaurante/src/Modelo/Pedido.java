/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.Date;


/**
 *
 * @author Rafael
 */
public class Pedido {
    private int valorTotalPedido;
    private Date horarioPedido;
    private int idPedido;
    private String statusPedido;
    private Mesa mesaPedido;
    private ArrayList<Item_Pedido> itensPedido = new ArrayList<>();

    public Pedido(int valorTotalPedido, Date horarioPedido, int idPedido, String statusPedido, Mesa mesaPedido) {
        this.valorTotalPedido = valorTotalPedido;
        this.horarioPedido = horarioPedido;
        this.idPedido = idPedido;
        this.statusPedido = statusPedido;
        this.mesaPedido = mesaPedido;
    }

    public Pedido(int valorTotalPedido, Date horarioPedido, String statusPedido, Mesa mesaPedido) {
        this.valorTotalPedido = valorTotalPedido;
        this.horarioPedido = horarioPedido;
        this.statusPedido = statusPedido;
        this.mesaPedido = mesaPedido;
    }

    public Pedido() {
    }
    
    public void fecharPedido() {
        this.mudarStatusPedido("Fechado");
    }
    
    public void mudarStatusPedido ( String status ) {
        this.statusPedido = status;
    }
    
    public void removerItemPedido ( Item_Pedido item ) {
        //Colocar codigo para remover
    }

    public int getValorTotalPedido() {
        return valorTotalPedido;
    }

    public void setValorTotalPedido(int valorTotalPedido) {
        this.valorTotalPedido = valorTotalPedido;
    }

    public Date getHorarioPedido() {
        return horarioPedido;
    }

    public void setHorarioPedido(Date horarioPedido) {
        this.horarioPedido = horarioPedido;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(String statusPedido) {
        this.statusPedido = statusPedido;
    }

    public Mesa getMesaPedido() {
        return mesaPedido;
    }

    public void setMesaPedido(Mesa mesaPedido) {
        this.mesaPedido = mesaPedido;
    }

    public ArrayList<Item_Pedido> getItensPedido() {
        return itensPedido;
    }

    public void setItensPedido(ArrayList<Item_Pedido> itensPedido) {
        this.itensPedido = itensPedido;
    }
}
