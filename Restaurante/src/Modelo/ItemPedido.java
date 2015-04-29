package Modelo;
// Generated 29/04/2015 11:11:01 by Hibernate Tools 4.3.1



/**
 * ItemPedido generated by hbm2java
 */
public class ItemPedido  implements java.io.Serializable {


     private ItemPedidoId id;
     private Pedido pedido;
     private Produto produto;
     private float precoItemPedido;
     private int qtdItemPedido;

    public ItemPedido() {
    }

    public ItemPedido(ItemPedidoId id, Pedido pedido, Produto produto, float precoItemPedido, int qtdItemPedido) {
       this.id = id;
       this.pedido = pedido;
       this.produto = produto;
       this.precoItemPedido = precoItemPedido;
       this.qtdItemPedido = qtdItemPedido;
    }
   
    public ItemPedidoId getId() {
        return this.id;
    }
    
    public void setId(ItemPedidoId id) {
        this.id = id;
    }
    public Pedido getPedido() {
        return this.pedido;
    }
    
    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    public Produto getProduto() {
        return this.produto;
    }
    
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public float getPrecoItemPedido() {
        return this.precoItemPedido;
    }
    
    public void setPrecoItemPedido(float precoItemPedido) {
        this.precoItemPedido = precoItemPedido;
    }
    public int getQtdItemPedido() {
        return this.qtdItemPedido;
    }
    
    public void setQtdItemPedido(int qtdItemPedido) {
        this.qtdItemPedido = qtdItemPedido;
    }




}


