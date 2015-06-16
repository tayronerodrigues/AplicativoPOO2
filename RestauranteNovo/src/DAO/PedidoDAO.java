/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Pedido;
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
public class PedidoDAO {

    public PedidoDAO() {
    }

    public Pedido buscarPedidoPorMesa(int mesa) {//retorna um pedido com o status "fechado" e o numero da mesa ou null
        Session sessao = null;
        Pedido ped = null;
        try {            
            sessao = DAO.HibernateConexao.getSessionFactory().openSession();
            sessao.beginTransaction();
            
            Criteria cons = sessao.createCriteria(Pedido.class);
            cons.setFetchMode("mesa", FetchMode.JOIN);
            cons.createAlias("mesa", "mes");
            
            cons.add(Restrictions.eq("mes.idMesa", mesa));
            cons.add(Restrictions.eq("statusPedido", "aberto"));
            ped = (Pedido) cons.uniqueResult();
            
            sessao.getTransaction().commit();
        } catch (HibernateException e) {
            if ( sessao != null ) sessao.getTransaction().rollback();
            throw new HibernateException(e);             
        } finally {
            if ( sessao != null ) sessao.close();
            return ped;
        }
    }

    public void inserirPedido(Pedido ped) {
        Session sessao = null;
        try{
            sessao = DAO.HibernateConexao.getSessionFactory().openSession();
            sessao.beginTransaction();

            sessao.save(ped);

            sessao.getTransaction().commit();
        } catch (HibernateException e){
            if (sessao != null) sessao.getTransaction().rollback();
            throw new HibernateException(e);
        } finally {
            if (sessao != null) sessao.close();
        }
    }

    public void alterarPedido(Pedido ped) {
        Session sessao = null;
        try{
            sessao = DAO.HibernateConexao.getSessionFactory().openSession();
            sessao.beginTransaction();

            sessao.update(ped);

            sessao.getTransaction().commit();
        } catch (HibernateException e){
            if (sessao != null) sessao.getTransaction().rollback();
            throw new HibernateException(e);
        } finally {
            if (sessao != null) sessao.close();
        } 
    }

    public List<Pedido> listarPedidosAbertos() {
        Session sessao = null;
        List<Pedido> lista = null;
        try {            
            sessao = DAO.HibernateConexao.getSessionFactory().openSession();
            sessao.beginTransaction();
            Criteria cons = sessao.createCriteria(Pedido.class);
            cons.setFetchMode("mesa", FetchMode.JOIN);
            cons.add(Restrictions.eq("statusPedido", "aberto"));
            
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
    
    
}
