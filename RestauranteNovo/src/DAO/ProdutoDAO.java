/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Produto;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Rafael
 */
public class ProdutoDAO {

    public ProdutoDAO() {
    }
    
    public void InserirProduto(Produto prod){
        Session sessao = null;
        try{
            sessao = DAO.HibernateConexao.getSessionFactory().openSession();
            sessao.beginTransaction();

            sessao.save(prod);

            sessao.getTransaction().commit();
        } catch (HibernateException e){
            if (sessao != null) sessao.getTransaction().rollback();
            throw new HibernateException(e);
        } finally {
            if (sessao != null) sessao.close();
        }
    }
    
    public List<Produto> pesquisar(int tipo, String txtPesq){
        Session sessao = null;
        List<Produto> lista = null;
        try {            
            sessao = DAO.HibernateConexao.getSessionFactory().openSession();
            sessao.beginTransaction();            
            Criteria cons = sessao.createCriteria(Produto.class);
            cons.setFetchMode("categoria", FetchMode.JOIN);
            cons.createAlias("categoria", "cat");
            
            switch(tipo){
                case 0: break;
                case 1://categoria 
                    cons.add(Restrictions.like("cat.nomeCategoria", txtPesq + "%"));
                    cons.addOrder(Order.asc("cat.nomeCategoria"));
                    break;
                case 2://nome
                    cons.add(Restrictions.like("nomeProduto", txtPesq + "%"));
                    cons.addOrder(Order.asc("nomeProduto"));
                    break;
            }
            lista = cons.list();
            sessao.getTransaction().commit();
            
        } catch (HibernateException e) {
            if ( sessao != null ) sessao.getTransaction().rollback();
            throw new HibernateException(e);             
        } finally {
            if ( sessao != null ) sessao.close();
            return lista;
        }
    }
    
    public List<Produto> pesquisarPorCategoria ( String cat) {
        return pesquisar(1, cat);
    }
    
     public List<Produto> pesquisarPorNome ( String nome) {
        return pesquisar(2, nome);
    }

    public void excluirProdruto(Produto prod) {
        Session sessao = null;
        try{
            sessao = DAO.HibernateConexao.getSessionFactory().openSession();
            sessao.beginTransaction();

            sessao.delete(prod);

            sessao.getTransaction().commit();
        } catch (HibernateException e){
            if (sessao != null) sessao.getTransaction().rollback();
            throw new HibernateException(e);
        } finally {
            if (sessao != null) sessao.close();
        }
    }

    public void alterarProduto(Produto prod) {
        Session sessao = null;
        try{
            sessao = DAO.HibernateConexao.getSessionFactory().openSession();
            sessao.beginTransaction();

            sessao.update(prod);

            sessao.getTransaction().commit();
        } catch (HibernateException e){
            if (sessao != null) sessao.getTransaction().rollback();
            throw new HibernateException(e);
        } finally {
            if (sessao != null) sessao.close();
        }       
    }
}
