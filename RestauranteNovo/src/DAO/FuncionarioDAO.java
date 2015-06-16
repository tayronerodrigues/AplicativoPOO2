/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Funcionario;
import java.util.List;
import org.hibernate.*;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
/**
 *
 * @author Rafael
 */
public class FuncionarioDAO {

    public FuncionarioDAO() {
        
    }

    public void inserirFuncionario (Funcionario fun){
        Session sessao = null;
        try{
            sessao = DAO.HibernateConexao.getSessionFactory().openSession();
            sessao.beginTransaction();

            sessao.save(fun);

            sessao.getTransaction().commit();
        } catch (HibernateException e){
            if (sessao != null) sessao.getTransaction().rollback();
            throw new HibernateException(e);
        } finally {
            if (sessao != null) sessao.close();
        }
    }

    
    public void alterarFuncionario (Funcionario fun){
        Session sessao = null;
        try{
            sessao = DAO.HibernateConexao.getSessionFactory().openSession();
            sessao.beginTransaction();

            sessao.update(fun);

            sessao.getTransaction().commit();
        } catch (HibernateException e){
            if (sessao != null) sessao.getTransaction().rollback();
            throw new HibernateException(e);
        } finally {
            if (sessao != null) sessao.close();
        }
    }
    
    public void excluirFuncionario (Funcionario fun){
        Session sessao = null;
        try{
            sessao = DAO.HibernateConexao.getSessionFactory().openSession();
            sessao.beginTransaction();

            sessao.delete(fun);

            sessao.getTransaction().commit();
        } catch (HibernateException e){
            if (sessao != null) sessao.getTransaction().rollback();
            throw new HibernateException(e);
        } finally {
            if (sessao != null) sessao.close();
        }        
    }
  
    public List<Funcionario> pesquisar(int tipo, String txtPesq){
        Session sessao = null;
        List<Funcionario> lista = null;
        try {            
            sessao = DAO.HibernateConexao.getSessionFactory().openSession();
            sessao.beginTransaction();            
            Criteria cons = sessao.createCriteria(Funcionario.class);
            
            switch(tipo){
                case 0: break;
                case 1: 
                    cons.add(Restrictions.like("nomeFuncionario", txtPesq + "%"));
                    break;
                case 2:
                    cons.add(Restrictions.like("funcaoFuncionario", txtPesq + "%"));
                    cons.addOrder(Order.asc("funcaoFuncionario"));
                    break;
                case 3:
                    cons.add(Restrictions.like("cpfFuncionario", txtPesq + "%"));
                    cons.addOrder(Order.asc("cpfFuncionario"));
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
    
    public Funcionario logarFuncionario(String login, String senha){
        Session sessao = null;
        Funcionario fun = null;
        try {            
            sessao = DAO.HibernateConexao.getSessionFactory().openSession();
            sessao.beginTransaction();
            
            Criteria cons = sessao.createCriteria(Funcionario.class);
            cons.add(Restrictions.eq("loginFuncionario", login));
            cons.add(Restrictions.eq("senhaFuncionario", senha));
            fun = (Funcionario) cons.uniqueResult();
            
            sessao.getTransaction().commit();
        } catch (HibernateException e) {
            if ( sessao != null ) sessao.getTransaction().rollback();
            throw new HibernateException(e);             
        } finally {
            if ( sessao != null ) sessao.close();
            return fun;
        }
    }
    
    public Funcionario buscarPorLogin(String login){
        Session sessao = null;
        Funcionario fun = null;
        try {            
            sessao = DAO.HibernateConexao.getSessionFactory().openSession();
            sessao.beginTransaction();
            
            Criteria cons = sessao.createCriteria(Funcionario.class);
            cons.add(Restrictions.eq("loginFuncionario", login));
            fun = (Funcionario) cons.uniqueResult();
            
            sessao.getTransaction().commit();
        } catch (HibernateException e) {
            if ( sessao != null ) sessao.getTransaction().rollback();
            throw new HibernateException(e);             
        } finally {
            if ( sessao != null ) sessao.close();
                return fun;
        }   
    }

    public List<Funcionario> pesquisarPorNome(String txtPesq) {
        return pesquisar(1, txtPesq);
    }

    public List<Funcionario> pesquisarPorFuncao(String txtPesq) {
        return pesquisar(2, txtPesq);
    }

    public List<Funcionario> pesquisarPorCPF(String txtPesq) {
        return pesquisar(3, txtPesq);
    }
    
}