/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Mesa;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Rafael
 */
public class MesaDAO {

    public MesaDAO() {
    }
    
    public List<Mesa> listarCategoria(){
        Session sessao = null;
        List lista = null;
        try{
            
            sessao = DAO.HibernateConexao.getSessionFactory().openSession();
            sessao.beginTransaction();            
            Criteria cons = sessao.createCriteria(Mesa.class);
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

    public void inserirMesa(Mesa mesa) {
        Session sessao = null;
        try{
            sessao = DAO.HibernateConexao.getSessionFactory().openSession();
            sessao.beginTransaction();

            sessao.save(mesa);

            sessao.getTransaction().commit();
        } catch (HibernateException e){
            if (sessao != null) sessao.getTransaction().rollback();
            throw new HibernateException(e);
        } finally {
            if (sessao != null) sessao.close();
        }        
    }

    public Mesa buscarMesa(int nMesa) {
        Session sessao = null;
        Mesa mesa = null;
        try {            
            sessao = DAO.HibernateConexao.getSessionFactory().openSession();
            sessao.beginTransaction();
            
            Criteria cons = sessao.createCriteria(Mesa.class);
            cons.add(Restrictions.eq("idMesa", nMesa));
            mesa = (Mesa) cons.uniqueResult();
            
            sessao.getTransaction().commit();
        } catch (HibernateException e) {
            if ( sessao != null ) sessao.getTransaction().rollback();
            throw new HibernateException(e);             
        } finally {
            if ( sessao != null ) sessao.close();
            return mesa;
        }
    }

}
