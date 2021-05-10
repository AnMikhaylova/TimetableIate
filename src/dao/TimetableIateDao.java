/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.TimetableIate;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.NewHibernateUtil;

/**
 *
 * @author tassy
 */
public class TimetableIateDao {
    //findbyId
    public TimetableIate findById(int id){
        return (TimetableIate)NewHibernateUtil.getSessionFactory().openSession().get(TimetableIate.class, id);
    }
    
    //save
    public void save(TimetableIate timetable) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(timetable);
        tx1.commit();
        session.close();        
    }
    
    //update
    public void update(TimetableIate timetable) {
            Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(timetable);
        tx1.commit();
        session.close();
    }
    
    //delete?
     public void delete(TimetableIate timetable) {
         Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(timetable);
        tx1.commit();
        session.close();     
     }
     
    //findAll
     public List<TimetableIate> findAll() {
         List<TimetableIate> t = (List<TimetableIate>)NewHibernateUtil.getSessionFactory().openSession().createQuery("From TimetableIate").list();
        return t;
     
     }
    
}
