package Modelo;
// Generated 16/05/2015 14:55:13 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Funcionario generated by hbm2java
 */
public class Funcionario  implements java.io.Serializable {


     private Integer idFuncionario;
     private String nomeFuncionario;
     private String funcaoFuncionario;
     private int tipoFuncionario;
     private String senhaFuncionario;
     private byte[] fotoFuncionario;
     private String loginFuncionario;
     private String cpfFuncionario;
     private String telefoneFuncionario;
     private String enderecoFuncionario;
     private String celularFuncionario;
     private Set mesas = new HashSet(0);

    public Funcionario() {
    }

	
    public Funcionario(String nomeFuncionario, int tipoFuncionario, String senhaFuncionario, String loginFuncionario, String cpfFuncionario, String telefoneFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
        this.tipoFuncionario = tipoFuncionario;
        this.senhaFuncionario = senhaFuncionario;
        this.loginFuncionario = loginFuncionario;
        this.cpfFuncionario = cpfFuncionario;
        this.telefoneFuncionario = telefoneFuncionario;
    }
    
    public Funcionario(String nomeFuncionario, String funcaoFuncionario, int tipoFuncionario, String senhaFuncionario, byte[] fotoFuncionario, String loginFuncionario, String cpfFuncionario, String telefoneFuncionario, String enderecoFuncionario, String celularFuncionario) {
       this.nomeFuncionario = nomeFuncionario;
       this.funcaoFuncionario = funcaoFuncionario;
       this.tipoFuncionario = tipoFuncionario;
       this.senhaFuncionario = senhaFuncionario;
       this.fotoFuncionario = fotoFuncionario;
       this.loginFuncionario = loginFuncionario;
       this.cpfFuncionario = cpfFuncionario;
       this.telefoneFuncionario = telefoneFuncionario;
       this.enderecoFuncionario = enderecoFuncionario;
       this.celularFuncionario = celularFuncionario;
    }
    
    public Funcionario(String nomeFuncionario, String funcaoFuncionario, int tipoFuncionario, String senhaFuncionario, byte[] fotoFuncionario, String loginFuncionario, String cpfFuncionario, String telefoneFuncionario, String enderecoFuncionario, String celularFuncionario, Set mesas) {
       this.nomeFuncionario = nomeFuncionario;
       this.funcaoFuncionario = funcaoFuncionario;
       this.tipoFuncionario = tipoFuncionario;
       this.senhaFuncionario = senhaFuncionario;
       this.fotoFuncionario = fotoFuncionario;
       this.loginFuncionario = loginFuncionario;
       this.cpfFuncionario = cpfFuncionario;
       this.telefoneFuncionario = telefoneFuncionario;
       this.enderecoFuncionario = enderecoFuncionario;
       this.celularFuncionario = celularFuncionario;
       this.mesas = mesas;
    }
   
    public Integer getIdFuncionario() {
        return this.idFuncionario;
    }
    
    public void setIdFuncionario(Integer idFuncionario) {
        this.idFuncionario = idFuncionario;
    }
    public String getNomeFuncionario() {
        return this.nomeFuncionario;
    }
    
    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }
    public String getFuncaoFuncionario() {
        return this.funcaoFuncionario;
    }
    
    public void setFuncaoFuncionario(String funcaoFuncionario) {
        this.funcaoFuncionario = funcaoFuncionario;
    }
    public int getTipoFuncionario() {
        return this.tipoFuncionario;
    }
    
    public void setTipoFuncionario(int tipoFuncionario) {
        this.tipoFuncionario = tipoFuncionario;
    }
    public String getSenhaFuncionario() {
        return this.senhaFuncionario;
    }
    
    public void setSenhaFuncionario(String senhaFuncionario) {
        this.senhaFuncionario = senhaFuncionario;
    }
    public byte[] getFotoFuncionario() {
        return this.fotoFuncionario;
    }
    
    public void setFotoFuncionario(byte[] fotoFuncionario) {
        this.fotoFuncionario = fotoFuncionario;
    }
    public String getLoginFuncionario() {
        return this.loginFuncionario;
    }
    
    public void setLoginFuncionario(String loginFuncionario) {
        this.loginFuncionario = loginFuncionario;
    }
    public String getCpfFuncionario() {
        return this.cpfFuncionario;
    }
    
    public void setCpfFuncionario(String cpfFuncionario) {
        this.cpfFuncionario = cpfFuncionario;
    }
    public String getTelefoneFuncionario() {
        return this.telefoneFuncionario;
    }
    
    public void setTelefoneFuncionario(String telefoneFuncionario) {
        this.telefoneFuncionario = telefoneFuncionario;
    }
    public String getEnderecoFuncionario() {
        return this.enderecoFuncionario;
    }
    
    public void setEnderecoFuncionario(String enderecoFuncionario) {
        this.enderecoFuncionario = enderecoFuncionario;
    }
    public String getCelularFuncionario() {
        return this.celularFuncionario;
    }
    
    public void setCelularFuncionario(String celularFuncionario) {
        this.celularFuncionario = celularFuncionario;
    }
    public Set getMesas() {
        return this.mesas;
    }
    
    public void setMesas(Set mesas) {
        this.mesas = mesas;
    }
    
    public Object[] toArray() {
        return new Object[] {this, funcaoFuncionario, cpfFuncionario, celularFuncionario};
    }

    @Override
    public String toString() {
        return nomeFuncionario;
    }
}


