/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Groups;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.NewHibernateUtil;

/**
 *
 * @author tassy
 */
public class GroupsDao {

    //findbyId
    public Groups findById(int id) {
        return (Groups) NewHibernateUtil.getSessionFactory().openSession().get(Groups.class, id);
    }

    //save
    public void save(Groups groups) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(groups);
        tx1.commit();
        session.close();
    }

    //update
    public void update(Groups groups) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(groups);
        tx1.commit();
        session.close();
    }

    //delete
    public void delete(Groups groups) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(groups);
        tx1.commit();
        session.close();
    }

    //findAll
    public List<Groups> findAll() {
        List<Groups> g = (List<Groups>) NewHibernateUtil.getSessionFactory().openSession().createQuery("From Groups").list();
        return g;

    }

}
