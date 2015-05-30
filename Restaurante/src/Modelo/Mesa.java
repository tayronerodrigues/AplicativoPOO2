package Modelo;
// Generated 16/05/2015 14:55:13 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Mesa generated by hbm2java
 */
public class Mesa  implements java.io.Serializable {


     private int idMesa;
     private Funcionario funcionario;
     private Set pedidos = new HashSet(0);

    public Mesa() {
    }

	
    public Mesa(int idMesa, Funcionario funcionario) {
        this.idMesa = idMesa;
        this.funcionario = funcionario;
    }
    public Mesa(int idMesa, Funcionario funcionario, Set pedidos) {
       this.idMesa = idMesa;
       this.funcionario = funcionario;
       this.pedidos = pedidos;
    }
   
    public int getIdMesa() {
        return this.idMesa;
    }
    
    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }
    public Funcionario getFuncionario() {
        return this.funcionario;
    }
    
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    public Set getPedidos() {
        return this.pedidos;
    }
    
    public void setPedidos(Set pedidos) {
        this.pedidos = pedidos;
    }




}


