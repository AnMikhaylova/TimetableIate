/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Weekdays;
import java.util.List;
import utils.NewHibernateUtil;

/**
 *
 * @author tassy
 */
public class WeekdaysDao {
    //findbyId
    public Weekdays findById(int id){
        return (Weekdays)NewHibernateUtil.getSessionFactory().openSession().get(Weekdays.class, id);
    }
    
    //findAll
     public List<Weekdays> findAll() {
         List<Weekdays> w = (List<Weekdays>)NewHibernateUtil.getSessionFactory().openSession().createQuery("From Weekdays").list();
        return w;
     
     }
    
}
