package Modelo;
// Generated 29/04/2015 11:11:01 by Hibernate Tools 4.3.1



/**
 * ItemPedidoId generated by hbm2java
 */
public class ItemPedidoId  implements java.io.Serializable {


     private int pedidoIdPedido;
     private int produtoIdProduto;

    public ItemPedidoId() {
    }

    public ItemPedidoId(int pedidoIdPedido, int produtoIdProduto) {
       this.pedidoIdPedido = pedidoIdPedido;
       this.produtoIdProduto = produtoIdProduto;
    }
   
    public int getPedidoIdPedido() {
        return this.pedidoIdPedido;
    }
    
    public void setPedidoIdPedido(int pedidoIdPedido) {
        this.pedidoIdPedido = pedidoIdPedido;
    }
    public int getProdutoIdProduto() {
        return this.produtoIdProduto;
    }
    
    public void setProdutoIdProduto(int produtoIdProduto) {
        this.produtoIdProduto = produtoIdProduto;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ItemPedidoId) ) return false;
		 ItemPedidoId castOther = ( ItemPedidoId ) other; 
         
		 return (this.getPedidoIdPedido()==castOther.getPedidoIdPedido())
 && (this.getProdutoIdProduto()==castOther.getProdutoIdProduto());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getPedidoIdPedido();
         result = 37 * result + this.getProdutoIdProduto();
         return result;
   }   


}

