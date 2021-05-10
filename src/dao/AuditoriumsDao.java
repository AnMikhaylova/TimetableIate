/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Auditoriums;
import java.util.List;
import utils.NewHibernateUtil;

/**
 *
 * @author tassy
 */
public class AuditoriumsDao {
    
    //findbyId
    public Auditoriums findById(int id){
        return (Auditoriums)NewHibernateUtil.getSessionFactory().openSession().get(Auditoriums.class, id);
    }
    
    //findAll
    
     public List<Auditoriums> findAll() {
         List<Auditoriums> aud = (List<Auditoriums>)NewHibernateUtil.getSessionFactory().openSession().createQuery("From Auditoriums").list();
        return aud;
     
     }
    
}
