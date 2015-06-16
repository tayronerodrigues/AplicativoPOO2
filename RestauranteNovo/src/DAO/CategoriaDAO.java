/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Categoria;
import Modelo.Funcionario;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Order;

/**
 *
 * @author Rafael
 */
public class CategoriaDAO {

    public CategoriaDAO() {
    }
    
    public void InserirCategoria(Categoria cat){
        Session sessao = null;
        try{
            sessao = DAO.HibernateConexao.getSessionFactory().openSession();
            sessao.beginTransaction();

            sessao.save(cat);

            sessao.getTransaction().commit();
        } catch (HibernateException e){
            if (sessao != null) sessao.getTransaction().rollback();
            throw new HibernateException(e);
        } finally {
            if (sessao != null) sessao.close();
        }
    }
    
        public void alterarCategoria (Categoria cat){
        Session sessao = null;
        try{
            sessao = DAO.HibernateConexao.getSessionFactory().openSession();
            sessao.beginTransaction();

            sessao.update(cat);

            sessao.getTransaction().commit();
        } catch (HibernateException e){
            if (sessao != null) sessao.getTransaction().rollback();
            throw new HibernateException(e);
        } finally {
            if (sessao != null) sessao.close();
        }
    }
    
    public List<Categoria> listarCategoria(){
        Session sessao = null;
        List lista = null;
        try{
            
            sessao = DAO.HibernateConexao.getSessionFactory().openSession();
            sessao.beginTransaction();            
            Criteria cons = sessao.createCriteria(Categoria.class);
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

    public void excluirCategoria(Categoria cat) {
        Session sessao = null;
        try{
            sessao = DAO.HibernateConexao.getSessionFactory().openSession();
            sessao.beginTransaction();

            sessao.delete(cat);

            sessao.getTransaction().commit();
        } catch (HibernateException e){
            if (sessao != null) sessao.getTransaction().rollback();
            throw new HibernateException(e);
        } finally {
            if (sessao != null) sessao.close();
        } 
    }
}
