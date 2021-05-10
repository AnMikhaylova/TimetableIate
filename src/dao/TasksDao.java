/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Tasks;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.NewHibernateUtil;

/**
 *
 * @author tassy
 */
public class TasksDao {
    //findbyId
    public Tasks findById(int id){
        return (Tasks)NewHibernateUtil.getSessionFactory().openSession().get(Tasks.class, id);
    }
    
    //save
    public void save(Tasks task) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(task);
        tx1.commit();
        session.close();        
    }
    
    //update
    public void update(Tasks task) {
            Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(task);
        tx1.commit();
        session.close();
    }
    
    //delete?
     public void delete(Tasks task) {
         Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(task);
        tx1.commit();
        session.close();     
     }
     
    //findAll
     public List<Tasks> findAll() {
         List<Tasks> t = (List<Tasks>)NewHibernateUtil.getSessionFactory().openSession().createQuery("From Tasks").list();
        return t;
     
     }
}
