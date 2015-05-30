/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.FuncionarioDAO;
import Modelo.Funcionario;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
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

    public Controlador() {
        byte[] bFile = null;
        funDAO = new FuncionarioDAO();
    }
    
    public void inserirFuncionario(String nomeFuncionario, String funcaoFuncionario, int tipoFuncionario, String senhaFuncionario, Icon imagem, String loginFuncionario, String cpfFuncionario, String telefoneFuncionario, String enderecoFuncionario, String celularFuncionario){
       
        byte[] bFile = IconToBytes(imagem);
        
        Funcionario fun = new Funcionario(nomeFuncionario, funcaoFuncionario, tipoFuncionario, senhaFuncionario, bFile, loginFuncionario, 
                                          cpfFuncionario, telefoneFuncionario, enderecoFuncionario, celularFuncionario, null);
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
                // Set a flag to indicate that the write was successful
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

}
