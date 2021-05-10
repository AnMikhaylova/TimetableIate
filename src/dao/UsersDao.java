/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Users;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.NewHibernateUtil;

/**
 *
 * @author tassy
 */
public class UsersDao {
    //findbyId
    public Users findById(int id){
        return (Users)NewHibernateUtil.getSessionFactory().openSession().get(Users.class, id);
    }
    
    //save
    public void save(Users user) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(user);
        tx1.commit();
        session.close();        
    }
    
    //update
    public void update(Users user) {
            Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(user);
        tx1.commit();
        session.close();
    }
    
    //delete?
     public void delete(Users user) {
         Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(user);
        tx1.commit();
        session.close();     
     }
     
    //findAll
     public List<Users> findAll() {
         List<Users> u = (List<Users>)NewHibernateUtil.getSessionFactory().openSession().createQuery("From Users").list();
        return u;
     
     }
}
