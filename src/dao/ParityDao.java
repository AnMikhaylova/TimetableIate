/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Parity;
import java.util.List;
import utils.NewHibernateUtil;

/**
 *
 * @author tassy
 */
public class ParityDao {
    //findbyId
    public Parity findById(int id){
        return (Parity)NewHibernateUtil.getSessionFactory().openSession().get(Parity.class, id);
    }
    
    //findAll
     public List<Parity> findAll() {
         List<Parity> p = (List<Parity>)NewHibernateUtil.getSessionFactory().openSession().createQuery("From Parity").list();
        return p;     
     }
    
}
