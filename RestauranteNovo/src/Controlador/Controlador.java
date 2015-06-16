/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.CategoriaDAO;
import DAO.FuncionarioDAO;
import DAO.ItemPedidoDAO;
import DAO.MesaDAO;
import DAO.PedidoDAO;
import DAO.ProdutoDAO;
import Modelo.Categoria;
import Modelo.Funcionario;
import Modelo.ItemPedido;
import Modelo.Mesa;
import Modelo.Pedido;
import Modelo.Produto;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.imageio.ImageIO;
import javax.imageio.stream.ImageOutputStream;
import javax.swing.Icon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rafael
 */
public class Controlador {
    FuncionarioDAO funDAO;
    CategoriaDAO catDAO;
    ProdutoDAO prodDAO;
    MesaDAO mesaDAO;
    PedidoDAO pedDAO;
    ItemPedidoDAO itemDAO;

    public Controlador() {
        byte[] bFile = null;
        funDAO = new FuncionarioDAO();
        catDAO = new CategoriaDAO();
        prodDAO = new ProdutoDAO();
        mesaDAO = new MesaDAO();
        pedDAO = new PedidoDAO();
        itemDAO = new ItemPedidoDAO();
    }
    
    public void inserirCategoria(String nome, String info){
        Categoria cat = new Categoria(nome, info, null);
        catDAO.InserirCategoria(cat); 
    }
    
    public List<Categoria> listarCategoria(){
        List<Categoria>lst = null;
        lst = catDAO.listarCategoria();
        return lst;
    }
    
    public void alterarCategoria(Categoria cat) {
        catDAO.alterarCategoria(cat);
    }
    
    public void excluirCategoria(Categoria cat) {
        catDAO.excluirCategoria(cat);
    }
    
    public void inserirFuncionario(String nomeFuncionario, String funcaoFuncionario, int tipoFuncionario, String senhaFuncionario, Icon imagem, String loginFuncionario, String cpfFuncionario, String telefoneFuncionario, String enderecoFuncionario, String celularFuncionario){
       
        byte[] bFile = IconToBytes(imagem);
        
        Funcionario fun = new Funcionario(nomeFuncionario, funcaoFuncionario, tipoFuncionario, senhaFuncionario, bFile, loginFuncionario, cpfFuncionario, telefoneFuncionario, enderecoFuncionario, celularFuncionario, null);
        funDAO.inserirFuncionario(fun);
        
    }
    
    public void alterarFuncionario(Funcionario fun){
        funDAO.alterarFuncionario(fun);
    }    
    
    public Funcionario logar(String usuario, String senha){
        return funDAO.logarFuncionario(usuario, senha);
    }
    
    public Funcionario buscarFuncionarioLogin(String login){
        return funDAO.buscarPorLogin(login);
    }
    
    public void excluirFuncionario(Funcionario fun){
        funDAO.excluirFuncionario(fun);
    }
    
    public void listarFuncionario(int cmbTipo, String txtPesq, JTable tab){

        List <Funcionario> lst = null;
        switch(cmbTipo){
            case 0:
                lst = funDAO.pesquisarPorNome(txtPesq);
                break;
            case 1:
                lst = funDAO.pesquisarPorFuncao(txtPesq);
                break;
            case 2:
                lst = funDAO.pesquisarPorCPF(txtPesq);
                break;
        }
        
        if (lst == null || lst.isEmpty()) {
            throw new ArithmeticException("Nenhum Funcionario cadastrado.");
        }
        
        ((DefaultTableModel) tab.getModel()).setRowCount(0);
        
        Iterator<Funcionario> it = lst.iterator();
        Funcionario fun;
        while (it.hasNext()) {
            fun = it.next();
            ((DefaultTableModel) tab.getModel()).addRow(fun.toArray());
        }
    }
    
    public byte[] IconToBytes(Icon icon) {
        if ( icon == null) return null;
        BufferedImage img = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = img.createGraphics();
        icon.paintIcon(null, g2d, 0, 0);
        g2d.dispose();

        byte[] bFile = null;
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            ImageOutputStream ios = ImageIO.createImageOutputStream(baos);
            try {
                ImageIO.write(img, "png", ios);
            } finally {
                ios.close();
            }
            bFile = baos.toByteArray();
        } catch (IOException ex) {
            bFile = null;
            System.out.println(ex);
        }
        finally {
            return bFile;
        } 
    }

    public void inserirProduto(String nome, Double precoCompra, Double precoVenda, Date validade, String tamanho, String ingredientes, Categoria cat, Icon imagem) {
        byte[] bFile = IconToBytes(imagem);
        Produto prod = new Produto( cat, validade, nome, precoCompra, precoVenda, tamanho, bFile, ingredientes, null);
        prodDAO.InserirProduto(prod);
    }
    
public void listarProdutos(int cmbTipo, String txtPesq, JTable tab){

        List <Produto> lst = null;
        switch(cmbTipo){
            case 0:
                lst = prodDAO.pesquisarPorCategoria(txtPesq);
                break;
            case 1:
                lst = prodDAO.pesquisarPorNome(txtPesq);
                break;
        }
        if (lst == null || lst.isEmpty()) {
            throw new ArithmeticException("Nenhum Produto cadastrado.");
        }
        
        ((DefaultTableModel) tab.getModel()).setRowCount(0);
        
        Iterator<Produto> it = lst.iterator();
        Produto prod;
        while (it.hasNext()) {
            prod = it.next();
            //System.out.println(prod.getNomeProduto());
            ((DefaultTableModel) tab.getModel()).addRow(prod.toArray());
        }
    }    

    public void excluirProduto(Produto prod) {
        prodDAO.excluirProdruto(prod);
    }
    
    public void alterarProduto(Produto prod){
        prodDAO.alterarProduto(prod);
    }

    public List<Mesa> listarMesas() {
        return mesaDAO.listarCategoria();
    }

    public void inserirMesa(Mesa mesa) {
        mesaDAO.inserirMesa(mesa);
    }

    public Pedido buscarPedidoPorMesa(int mesa) {
        return pedDAO.buscarPedidoPorMesa(mesa);
    }

    public void inserirPedido(Pedido ped) {
        pedDAO.inserirPedido(ped);
    }

    public void inserirItemPedido(ItemPedido item) {
       itemDAO.inserirItemPedido(item);
    }

    public Mesa buscarMesa(int nMesa) {
        return mesaDAO.buscarMesa(nMesa);
    }

    public void alterarPedido(Pedido ped) {
        pedDAO.alterarPedido(ped);
    }

    public List listarPedidosAbertos() {
        List<Pedido>lst = null;
        lst = pedDAO.listarPedidosAbertos();
        return lst;
    }

}
