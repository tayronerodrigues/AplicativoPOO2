/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.ItemPedido;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author Rafael
 */
public class ItemPedidoDAO {

    public ItemPedidoDAO() {
    }

    public void inserirItemPedido(ItemPedido item) {
        Session sessao = null;
        try{
            sessao = DAO.HibernateConexao.getSessionFactory().openSession();
            sessao.beginTransaction();

            sessao.save(item);

            sessao.getTransaction().commit();
        } catch (HibernateException e){
            if (sessao != null) sessao.getTransaction().rollback();
            throw new HibernateException(e);
        } finally {
            if (sessao != null) sessao.close();
        }
    }
    
}
