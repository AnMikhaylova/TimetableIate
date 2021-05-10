/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Periods;
import java.util.List;
import utils.NewHibernateUtil;

/**
 *
 * @author tassy
 */
public class PeriodsDao {
    //findbyId
    public Periods findById(int id){
        return (Periods)NewHibernateUtil.getSessionFactory().openSession().get(Periods.class, id);
    }
    
    //findAll
     public List<Periods> findAll() {
         List<Periods> p = (List<Periods>)NewHibernateUtil.getSessionFactory().openSession().createQuery("From Periods").list();
        return p;
     
     }
}
