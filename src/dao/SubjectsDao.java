/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Subjects;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.NewHibernateUtil;

/**
 *
 * @author tassy
 */
public class SubjectsDao {
    //findbyId
    public Subjects findById(int id){
        return (Subjects)NewHibernateUtil.getSessionFactory().openSession().get(Subjects.class, id);
    }
    
    //save
    public void save(Subjects subj) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(subj);
        tx1.commit();
        session.close();        
    }
    
    //update
    public void update(Subjects subj) {
            Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(subj);
        tx1.commit();
        session.close();
    }
    
    //delete?
     public void delete(Subjects subj) {
         Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(subj);
        tx1.commit();
        session.close();     
     }
     
    //findAll
     public List<Subjects> findAll() {
         List<Subjects> s = (List<Subjects>)NewHibernateUtil.getSessionFactory().openSession().createQuery("From Subjects").list();
        return s;
     
     }
    
}
