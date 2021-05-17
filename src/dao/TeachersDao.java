/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Teachers;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.NewHibernateUtil;

/**
 *
 * @author tassy
 */
public class TeachersDao {
    //findbyId
    public Teachers findById(int id){
        return (Teachers)NewHibernateUtil.getSessionFactory().openSession().get(Teachers.class, id);
    }
    
    //findbyName
    public Teachers findByName(String name){ 
        String query = "FROM Teachers T WHERE T.teacherFio  =" + "'" + name + "'";
        return (Teachers)NewHibernateUtil.getSessionFactory().openSession().createQuery(query).uniqueResult();
       
    }
    
    //save
    public void save(Teachers teacher) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(teacher);
        tx1.commit();
        session.close();        
    }
    
    //update
    public void update(Teachers teacher) {
            Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(teacher);
        tx1.commit();
        session.close();
    }
    
    //delete?
     public void delete(Teachers teacher) {
         Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(teacher);
        tx1.commit();
        session.close();     
     }
     
    //findAll
     public List<Teachers> findAll() {
         List<Teachers> t = (List<Teachers>)NewHibernateUtil.getSessionFactory().openSession().createQuery("From Teachers").list();
        return t;
     
     }
}
